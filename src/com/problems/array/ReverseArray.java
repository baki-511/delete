package com.problems.array;

public class ReverseArray {
	public void reverseArray(int[] arr) {
		int n = arr.length;
		for(int i=n-1;i>=0;i--) {
			System.out.print(arr[i]+" ");
		}
	}
	public static void main(String[] args) {
		int[] arr = {2,6,8,1,5,43};
		ReverseArray r = new ReverseArray();
		r.reverseArray(arr);
	}
}
