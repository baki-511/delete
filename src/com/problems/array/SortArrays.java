package com.problems.array;

public class SortArrays {

    public void bubbleSort(int[] arr) {
        int n = arr.length;
        for(int i=0; i<n-1; i++) {
            for(int j=0; j<n-i-1; j++ ){
                if(arr[j]>arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
    }
    public void printArray(int[] arr){
        int n= arr.length;
        for (int i=0; i<arr.length; i++){
            System.out.print(arr[i]+", ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
//        int[] arr = {2,4,2,5,4,7,8,5};
        int arr[] = { 5, 1, 4, 2, 8,10,23 };
        System.out.println("Before Sorted ...");
        SortArrays sortArrays = new SortArrays();
        sortArrays.printArray(arr);
        sortArrays.bubbleSort(arr);
        System.out.println("After sorting ... ");
        sortArrays.printArray(arr);
    }

}