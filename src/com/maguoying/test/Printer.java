package com.maguoying.test;

import java.util.*;

public class Printer {
	public static void main(String[] args) {
		int[][] mat = {{1,2,3},{4,5,6},{7,8,9},{10,11,12}};
		int[] end = printMatrix(mat,3,3);
		
		for(int a:end) {
		    System.out.print(a);
		    System.out.print(" ");
		}
	}
	
    public static int[] printMatrix(int[][] mat, int n, int m) {
        int[] result = new int[m*n];
        for(int i=0; i<n; i++) {
            for(int j=0; j<m;j++) {
                if(i%2==0) {
                    result[i*m+j] = mat[i][j];
                } else {
                    result[i*m+j] = mat[i][m-j-1];
                }
            }
        }
        return result;
    }
}