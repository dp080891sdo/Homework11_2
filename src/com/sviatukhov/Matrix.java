package com.sviatukhov;

import java.util.Arrays;

public class Matrix {

    public static void print(int[][] matrix) {
        for (int k = 0; k < matrix.length; k++) {
            for (int g = 0; g < matrix[k].length; g++) {
                System.out.print(matrix[k][g] + "\t");
            }
            System.out.println();
        }
    }

    public static int[][] swapColumns(int[][] matrix, int n, int m) {
//        int i1 = scanner.nextInt();
//        int i2 = scanner.nextInt();

        for (int i = 0; i < matrix.length; i++) {
            int tmp = matrix[i][n];
            matrix[i][n] = matrix[i][m];
            matrix[i][m] = tmp;
        }

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j] + "\t");
            }
            System.out.println();
        }
        return matrix;
    }

    public static void swapRows(int[][] matrix, int n, int m) {
        for (int i = 0; i < matrix.length; i++) {
            int[] tmp = matrix[n];
            matrix[n] = matrix[m];
            matrix[m] = tmp;
        }
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j] + "\t");
            }
            System.out.println();
        }
    }

    public static void mul(int[][] matrix, int n) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                matrix[i][j] *= n;
                System.out.print(matrix[i][j] + "\t");
            }
            System.out.println();
        }
    }

    public static void toArray(int[][] matrix) {
        int[] array = new int[matrix.length * matrix[0].length];
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                array[i * (matrix.length + 1) + j] = matrix[i][j];
            }
        }
        System.out.println(Arrays.toString(array));
    }

    public static int max(int[][] matrix) {
        int max = matrix[0][0];
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix.length; j++) {
                if (matrix[i][j] > max) {
                    max = matrix[i][j];
                }
            }
        }
        System.out.println(max);
        return max;
    }
}