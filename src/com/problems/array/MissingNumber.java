package com.problems.array;

public class MissingNumber {
    public int findMissingNumber(int[] arr){
        int n= arr.length+1;
        int total = n*(n+1)/2;
        int sum = 0;
        for (int i=0;i<arr.length; i++){
            sum+=arr[i];
        }
        return total-sum;
    }
    public static void main(String[] args) {
        MissingNumber num = new MissingNumber();
        int[] arr = {1,2,4,5,6,7,8};
        System.out.println("Missing Number = "+num.findMissingNumber(arr));
    }
}
