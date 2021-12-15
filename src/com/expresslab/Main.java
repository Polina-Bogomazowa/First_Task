package com.expresslab;
//Транспонированная матрица
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = 3;
        int[][] array = new int[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                array[i][j] = input.nextInt();
            }
        }


        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {

                System.out.print(array[i][j] + " ");
            }
            System.out.println();
        }
        for (int i = 0; i < n; i++) {
            for (int j = i+1; j < n; j++) {
                int temp = array[i][j];
                array[i][j] = array[j][i];
                array[j][i] = temp;
            }
        }
        System.out.println("---------------");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(array[i][j] + " ");
            }
            System.out.println();
        }
    }
}
