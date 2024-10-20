package com.ayanpractice;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("hello world");
        Scanner in = new Scanner(System.in);
        //find occ of num in int
        int n=94554678;

        int count = 0;
int  p = 0;
        while (n>0){
            int temp = 0;
            int rem = n % 10;
            n = n/10;
            temp = p*10;
           p = temp + rem;
        }

        System.out.println(p);
    }
}
