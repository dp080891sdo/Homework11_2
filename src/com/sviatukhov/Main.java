package com.sviatukhov;

/*
2*. Написать класс для работы с матрицами (2-мерными массивами), методы:
print(int[][] matrix) - печатает матрицу
swapColumns(int[][] matrix, i, j) - меняет 2 столбца местами
swapRows(int[][] matrix, i, j) - меняет 2 рядка местами
mul(int[][] matrix, int value) - умножает матрицу на число
toArray(int[][] matrix) - превращает матрицу в массив. Например если была матрица на 3x4 то вернуть массив из 12 элементов
max(int[][] matrix) - возвращает максимальный элемент матрицы
 */

public class Main {
    public static void main(String[] args) {
        int matrix[][] = {{5, 7, 3, 17}, {7, 0, 1, 12}, {8, 1, 2, 3}};
        System.out.println("print matrix");
        Matrix.print(matrix);
        System.out.println("swapColumns 2/3");
        Matrix.swapColumns(matrix, 2, 3);
        System.out.println("swapRows 1/2");
        Matrix.swapRows(matrix, 1, 2);
        System.out.println("mul * 9");
        Matrix.mul(matrix, 9);
        System.out.println("toArray");
        Matrix.toArray(matrix);
        System.out.println("max");
        Matrix.max(matrix);

    }
}