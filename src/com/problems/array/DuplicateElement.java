package com.problems.array;

public class DuplicateElement {
	public void duplicateElements(int[] arr) {
		int n=arr.length;
//		int[] temp = new int[n/2];
//		int k=0;
		for(int j=0;j<n-1;j++) {
			for(int l=j+1;l<n;l++) {
				if(arr[j]==arr[l] && arr[l]!=-1) {
//					temp[k]=arr[j];
					System.out.print(arr[j]+" ");
					arr[l]=-1;
//					k++;
				}
			}
		}
//		printArr(temp);
	}
	public void printArr(int arr[]) {
		int n=arr.length;
		for(int i=0;i<n;i++) {
			System.out.print(arr[i]+" ");
		}
		System.out.println();
	}
	public static void main(String[] args) {
		int[] arr = {2,4,2,5,4,7,8,5};
		DuplicateElement d = new DuplicateElement();
		System.out.println("Array ");
		d.printArr(arr);
		System.out.println("Duplicates elements ");
		d.duplicateElements(arr);
	}
}
