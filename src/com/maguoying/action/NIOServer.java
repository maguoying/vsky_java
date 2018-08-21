package com.maguoying.action;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.net.ServerSocket;
import java.net.Socket;
import java.net.UnknownHostException;
import java.nio.channels.SelectionKey;
import java.nio.channels.Selector;
import java.nio.channels.ServerSocketChannel;
import java.nio.channels.SocketChannel;
import java.nio.charset.Charset;
import java.util.Iterator;
import java.util.Set;
/**
 * @author maguoying@188.com
 * NIO多路复用案例
 * 杨晓峰《Java核心技术36讲》第11讲
 */
public class NIOServer extends Thread {
	public static void main(String[] args) throws UnknownHostException, IOException {
		NIOServer server = new NIOServer();
		server.start();
		try (Socket client = new Socket(InetAddress.getLocalHost(), 8888)){
			BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(client.getInputStream()));
			bufferedReader.lines().forEach(s -> System.out.println(s));
		}
	}
	public void run() {
		try (Selector selector = Selector.open();
				ServerSocketChannel serverSocket = ServerSocketChannel.open();){//创建Selector和Channel
			serverSocket.bind(new InetSocketAddress(InetAddress.getLocalHost(),8888));
			serverSocket.configureBlocking(false);
			//注册到Selector，并说明关注点
			serverSocket.register(selector, SelectionKey.OP_ACCEPT);
			while(true) {
				selector.select();//阻塞等待就绪的Channel，这是关键之一
				Set<SelectionKey> selectedKeys = selector.selectedKeys();
				Iterator<SelectionKey> iter = selectedKeys.iterator();
				while (iter.hasNext()) {
					SelectionKey key = iter.next();
					//生产系统中一般会额外进行就绪状态的检查
					sayHelloWorld((ServerSocketChannel)key.channel());
					iter.remove();
				}
			}
		} catch(IOException e) {
			e.printStackTrace() ;
		}

	}
	
	public void sayHelloWorld(ServerSocketChannel server) throws IOException {
		try (SocketChannel client = server.accept();){
			client.write(Charset.defaultCharset().encode("Hello,天宇！"));
		}
	}
}
