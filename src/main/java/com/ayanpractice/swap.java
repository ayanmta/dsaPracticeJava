package com.ayanpractice;

import java.util.Arrays;

public class swap {
    public static void main(String[] args) {
      int[][] arr ={
              {1,2,3},
              {4,5,55},
              {7,8,34}
      };
      int target = 344;
      search2d(arr,target);

    }
    static boolean search2d(int[][] arr,int target){
        boolean reach = false;
       for (int i = 0;i<arr.length;i++ ){
           for(int c : arr[i]){
               if(c ==target){reach = true;
               }
           }
       }
        System.out.println(reach);
       return reach;
    }
}
