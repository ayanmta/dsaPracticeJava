package com.ayanpractice;

import java.util.Arrays;

public class BinarySrch {
    public static void main(String[] args) {
        //should always be a sorted array
        int[] nums = {333};
        int target = 5;
        System.out.println(search(nums,target));

    }
    static int search(int[] nums, int target) {
        int pivot = findPivot(nums);
        if (pivot == -1) {
            return binarySearch(nums, 0, nums.length - 1, target);
        } else if (nums[pivot] == target) {
            return pivot;
        } else if (nums[0] < target) {
            return binarySearch(nums, 0, pivot - 1, target);
        } else {
            return binarySearch(nums, pivot + 1, nums.length - 1, target);
        }
    }
    static int findPivot(int[] arr) {
        int s = 0;
        int e = arr.length - 1;
        while (s <= e) {
            int mi = s + (e - s) / 2;

            if (mi < e && arr[mi] > arr[mi + 1]) {
                return mi;
            }
            if (mi > s && arr[mi] < arr[mi - 1]) {
                return mi - 1;
            }
            if (mi > s && arr[s] > arr[mi]) {
                e = mi - 1;
            }
            if (mi < e && arr[s] <= arr[mi]) {
                s = mi + 1;
            }

        }
        return -1;

    }

    static int binarySearch(int[] arr, int s, int e, int tar) {

        while (s <= e) {
            int mi = s + (e - s) / 2;
            if (tar > arr[mi]) {
                s = mi + 1;
            } else if (tar < arr[mi]) {
                e = mi - 1;
            } else if(tar == arr[mi]){
                return mi;
            }
        }
        return -1;
    }
}
