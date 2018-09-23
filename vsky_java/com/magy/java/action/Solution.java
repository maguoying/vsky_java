package com.magy.java.action;

public class Solution {
	
	
	public static void main(String[] args) {
		int m = 1999;
		int n = 2299;
		int a = countBitDiff(m ,n);
		System.out.println(a);
	}
    /**
     * 获得两个整形二进制表达位数不同的数量
     * 
     * @param m 整数m
     * @param n 整数n
     * @return 整型
     */
    public static int countBitDiff(int m, int n) {
    	return Integer.bitCount(m^n);
    }
}
