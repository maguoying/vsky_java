package com.maguoying.service;

public class UsbDisk implements Disk {

	@Override
	public void read() {
		System.out.println("U盘读");
	}

	@Override
	public void write(String data) {
		System.out.println("U盘写：" + data);
	}

}
