package com.ayanpractice;

import java.util.Arrays;

public class SearchTwoD {
    public static void main(String[] args) {

        int[][] mat = {
                {1,2,3,4},
                {5,6,7,8},
                {9,10,11,12}
        };
 int[] res = search(mat,8);
        System.out.println(Arrays.toString(res));
    }

    static int[] binarySearch(int[][] matrix,int row,int cs,int ce,int target){

        while (cs<ce){
            int cmid = cs + (ce-cs)/2;
            if(matrix[row][cmid] == target){
                return new int[]{cs,ce};
            }
            if(matrix[row][cmid]<target){
                cs = cmid+1;
            }else{
                ce = cmid -1;
            }
        }
        return new int[]{-1,-1};
    }


    static int[] search(int[][] matrix,int target){
        int rows = matrix.length;
        int cols = matrix[0].length;
        if(rows == 1){
            return binarySearch(matrix,0,0,cols-1,target);
        }
        int rs = 0;
        int re = rows -1;
        int cmid = (cols-1)/2;
        while(rs<(re-1)){
            int rmid = rs + (re-rs)/2;
            if(matrix[rmid][cmid] == target){
                return new int[]{rmid,cmid};
            }
            if(matrix[rmid][cmid]<=target){
                rs = rmid + 1;
            }else {
                re = rmid -1;
            }
        }
        //case where in mid c of 2 rows
        if(matrix[rs][cmid]==target){
            return new int[]{rs,cmid};
        }

        if(rs + 1 < rows&&matrix[rs+1][cmid]==target){
            return new int[]{rs+1,cmid};
        }
        if(matrix[rs][cmid-1]>=target){
            return binarySearch(matrix,rs,0,cmid-1,target);
        }
        if(matrix[rs][cmid+1]<=target){
            return binarySearch(matrix,rs,cmid+1,cols-1,target);
        }
        if(rs + 1 < rows && matrix[rs+1][cmid+1]<=target){
            return binarySearch(matrix,rs+1,cmid+1,cols-1,target);
        }else{
            return binarySearch(matrix,rs+1,0,cmid-1,target);
        }
    }
}
