package com.ayanpractice;

import java.util.Arrays;
import java.util.Scanner;

public class twoDarray {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int[][] arr = new int[3][3];
        for(int row =0;row <arr.length;row++){
for(int col = 0; col < arr[row].length;col++){
arr[row][col]=in.nextInt();
}
        }

        for (int[] ints : arr) {
//            for (int col = 0;col<arr[row].length;col++){
//                System.out.print(arr[row][col] + " ");
//            }
//            System.out.println(" ");
            System.out.println(Arrays.toString(ints));
        }

    }
}
