package com.grtsinry43.debug_;

import java.util.Arrays;

public class Debug03 {
    public static void main(String[] args) {
        int[] arr = {-1,345,3,5,234365};
        Arrays.sort(arr);
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + "\t");
        }
    }
}
