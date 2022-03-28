package com.syntax.class16;

public class StringDemo2 {

    static int[][]reduce10(int[][] a){
        int[][]newArr=new int[0][0];
        for (int j=0;j<a.length;j++){
            for (int i=0;i<a[i].length;i++){
                newArr[j][i]-=10;
            }
        }return newArr;
    }
    public static void main(String[] args) {

        int[][] a = {
                {1,2,3,4},
                {4,5,6,7},
                {1,3,5,7}
        };
        reduce10(a);
        System.out.println(reduce10(a));

    }
}


