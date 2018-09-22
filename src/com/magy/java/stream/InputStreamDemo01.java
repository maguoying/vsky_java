package com.magy.java.stream;

import java.io.File ;
import java.io.InputStream ;
import java.io.FileInputStream ;
/**
 * @author maguoying@188.com
 * inputstreamDemo训练
 */

public class InputStreamDemo01{
    public static void main(String args[]) throws Exception{    // 异常抛出，不处理
        // 第1步、使用File类找到一个文件
        File f= new File("src/com/maguoying/stream/log.txt") ;    // 声明File对象
        // 第2步、通过子类实例化父类对象
        InputStream input = null ;    // 准备好一个输入的对象
        input = new FileInputStream(f)  ;    // 通过对象多态性，进行实例化
        // 第3步、进行读操作
        byte b[] = new byte[1024] ;        // 所有的内容都读到此数组之中
        input.read(b) ;        // 读取内容   网络编程中 read 方法会阻塞
        // 第4步、关闭输出流
        input.close() ;                        // 关闭输出流
        System.out.println("内容为：" + new String(b)) ;    // 把byte数组变为字符串输出
    }
}