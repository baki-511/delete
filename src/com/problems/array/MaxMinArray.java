package com.problems.array;

public class MaxMinArray {
	public void maxNum(int[] arr) {
		int n = arr.length;
		int max=arr[0];
		for(int i=0;i<n;i++) {
			if(max<arr[i]) {
				max=arr[i];
			}
		}
		System.out.println("Max Number in array = "+max);
	}

	public void minNum(int[] arr) {
		int n = arr.length;
		int min=arr[0];
		for(int i=0;i<n;i++) {
			if(min>arr[i]) {
				min=arr[i];
			}
		}
		System.out.println("Max Number in array = "+min);
	}
	public static void main(String[] args) {
		MaxMinArray m = new MaxMinArray();
		int[] arr = {2,6,8,1,5,43};
		m.maxNum(arr);
		m.minNum(arr);
	}
}
