package com.maguoying.service;

public class MoveDisk implements Disk {

	@Override
	public void read() {
		System.out.println("移动硬盘读");
	}

	@Override
	public void write(String data) {
		System.out.println("移动硬盘写：" + data);
	}

}
