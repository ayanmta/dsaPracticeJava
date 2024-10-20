package com.ayanpractice;

import java.util.Arrays;

public class overLoading {
    public static void main(String[] args) {
    //function overloading happens at compile time
        func(5,67,67,767,67,67,67,67,67,56,56,345,345,345,34534,5);
    }


    static void func(int ...v){
        System.out.println(Arrays.toString(v));
    }
}
