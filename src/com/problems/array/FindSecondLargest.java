package com.problems.array;

public class FindSecondLargest {
	public int findSecondLargestElement(int[] arr) {
		int n = arr.length;
		int max1 = arr[0];
		int max2 = arr[0];
		for(int i=0; i<n; i++) {
			if(arr[i]>max1) {
				max1 = arr[i];
			}
		}
		if(max1 == max2) {
			max2 = arr[1];
		}

		for(int j=0; j<n; j++) {
			if(arr[j]>max2 && arr[j]!=max1) {
				max2 = arr[j];
			}
		}
		return max2;
	}

	public int findSeconHighest(int[] arr) {
		int max1 = arr[0];
		int max2 = arr[0];
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] > max1) {
				max2 = max1;
				max1 = arr[i];
			}
		}
		if (max1 == max2) {
			max2 = arr[1];
			for (int j = 0; j < arr.length; j++) {
				if (arr[j] > max2 && arr[j] != max1) {
					max2 = arr[j];
				}
			}
		}
		return max2;
	}
	
	public static void main(String[] args) {
		FindSecondLargest fs = new FindSecondLargest();
		int[] arr = {20, 4, 2, 5, 15, 4, 7, 8, 25, 5};
		System.out.println("Second Largest element = "+fs.findSecondLargestElement(arr));
		System.out.println("Second Highest Element = "+fs.findSeconHighest(arr));
	}

}
