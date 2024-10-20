package com.ayanpractice;

public class findeven {
    public static void main(String[] args) {
        int[] arr = new int[]{12,12,45,56,67,78,78,3,423,434,556,567,567};
        System.out.println(digits(2355));
    }
//    public int findNumbers(int[] nums) {
//
//    }
    static int digits(int num){
        int count = 0;
        while(num>0){
            count++;
            num = num/10;
        };
    return count;
    };

}
