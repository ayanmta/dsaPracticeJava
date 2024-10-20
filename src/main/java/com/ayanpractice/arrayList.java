package com.ayanpractice;

import java.util.ArrayList;

public class arrayList {
    public static void main(String[] args) {
        // 1d list
        ArrayList<Integer> list = new ArrayList<>(10);
        list.add(1);
        list.add(1);
        list.add(1);
        list.add(1);
    //    System.out.println(list);

    //2d list
        ArrayList<ArrayList<Integer>> list2= new ArrayList<>();
        for(int i = 0; i<5;i++){
           list2.add(  new ArrayList<>());

        }

        for(int i=0;i<5;i++){
            for (int j=0;j<3;j++){
                list2.get(i).add(j);

            }
        }
        System.out.println(list2);


    }
}
