package ru.vsu.cs.maslovaei;

public class ArrayWithoutMinAndMaxElements {

    public static int[][] createdNewArray(int[][] array) {
        int max = searchForMaxElement(array);
        int min = searchForMinElement(array);

        boolean[] rowArray = deleteRows(array, max, min);
        boolean[] columnArray = deleteColumns(array, max, min);

        return fillResultArray(array, rowArray, columnArray);
    }

    private static int searchForMaxElement(int[][] array) {
        int max = 0;

        for (int[] numbers : array) {
            for (int numInt : numbers) {
                if (numInt > max) {
                    max = numInt;
                }
            }
        }
        return max;
    }

    private static int searchForMinElement(int[][] array) {
        int min = 9000000;

        for (int[] numbers : array) {
            for (int numInt : numbers) {
                if (numInt < min) {
                    min = numInt;
                }
            }
        }
        return min;
    }

    private static boolean[] deleteRows(int[][] array, int maxElement, int minElement) {
        boolean[] rowArray = new boolean[array.length];

        for (int row = 0; row < array.length; row++) {
            for (int column = 0; column < array[row].length; column++) {
                rowArray[row] = array[row][column] == maxElement || array[row][column] == minElement;
            }
        }
        return rowArray;
    }

    private static boolean[] deleteColumns(int[][] array, int maxElement, int minElement) {
        boolean[] columnArray = new boolean[array[0].length];

        for (int[] numbers : array) {
            for (int column = 0; column < numbers.length; column++) {
                if (numbers[column] == maxElement || numbers[column] == minElement) {
                    columnArray[column] = true;
                }
            }
        }
        return columnArray;
    }

    private static int[][] fillResultArray(int[][] array, boolean[] rowArray, boolean[] columnArray) {
        int[][] resultArray = new int[countLengthInResultArray(rowArray)][countLengthInResultArray(columnArray)];
        int row2 = 0;
        int column2;

        for (int row = 0; row < array.length; row++) {
            column2 = 0;
            if (!rowArray[row]) {
                for (int column = 0; column < array[row].length; column++) {
                    if (!columnArray[column]) {
                        resultArray[row2][column2] = array[row][column];
                        column2++;
                    }
                }
                row2++;
            }
        }
        return resultArray;
    }

    private static int countLengthInResultArray(boolean[] array) {
        int k = 0;

        for (boolean arr : array) {
            if (!arr) {
                k++;
            }
        }
        return k;
    }
}
