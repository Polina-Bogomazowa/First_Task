package com.expresslab;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] arrayNumb = {888, 33, 33, 1, 9,99};

        boolean isSorted = true;
        int temp;
        while (isSorted) {
            isSorted = false;
            for (int i = 0; i < arrayNumb.length - 1; i++) {
                if (arrayNumb[i] > arrayNumb[i + 1]) {
                    isSorted = true;

                    temp = arrayNumb[i];
                    arrayNumb[i] = arrayNumb[i + 1];
                    arrayNumb[i + 1] = temp;
                }
            }
        }
        System.out.println(Arrays.toString(arrayNumb));
    }

}





