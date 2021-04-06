package com.company;

import java.util.Arrays;


public class Main {

    public static void main(String[] args) {
        // write your code here
        double sum = 0.0;
        int count = 0;
        boolean isNegative = false;

        double[] array = {34.2, 54.5, -56.3, 43.6, 76.7, 86.7};
        for (double sort : array) {
            if (sort < 0) {
                isNegative = true;
            } else if (isNegative) {
                sum += sort;
                count++;
            }
        }
        System.out.println(" " + " " + sum / count);

        int[] array2 = {4,5,11,7,3,10,8};
        Arrays.sort(array2);
        System.out.println(Arrays.toString(array2));
    }
}
