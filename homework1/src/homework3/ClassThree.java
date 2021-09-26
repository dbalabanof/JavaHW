package homework3;

import java.util.Arrays;

public class ClassThree {

    public static void main(String[] args) {

        //1. Задать целочисленный массив, состоящий из элементов 0 и 1. Например: [ 1, 1, 0, 0, 1, 0, 1, 1, 0, 0 ]. С помощью цикла и условия заменить 0 на 1, 1 на 0;
        int [] arr1 = {0,1,1,1,0,0,1,0,1};
        for (int i = 0; i < arr1.length; i++) {
            if (arr1[i] == 0) {
                arr1[i] = 1;
            } else if (arr1[i] == 1) {
                arr1[i] = 0;
            } else {
                System.out.println("В массиве должны быть только 0 и 1");
            }
        }
        System.out.println("Массив 1:");
        System.out.println(Arrays.toString(arr1));
        System.out.println();


        //2. Задать пустой целочисленный массив длиной 100. С помощью цикла заполнить его значениями 1 2 3 4 5 6 7 8 … 100;
        int [] arr2 = new int[100];
        for (int i = 0; i < 100; i++) {
            arr2[i] = i + 1;
        }
        System.out.println("Массив 2:");
        System.out.println(Arrays.toString(arr2));
        System.out.println();


        //3. Задать массив [ 1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1 ] пройти по нему циклом, и числа меньшие 6 умножить на 2;
        System.out.println("Задание 3:");
        System.out.println("Исходный массив:");
        int [] arr3 = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
        System.out.println(Arrays.toString(arr3));
        for (int i = 0; i < arr3.length; i++) {
            if (arr3[i] < 6) {
                arr3[i] *= 2;
            }
        }
        System.out.println("Итоговый массив:");
        System.out.println(Arrays.toString(arr3));
        System.out.println();


        //4. Создать квадратный двумерный целочисленный массив (количество строк и столбцов одинаковое),
        // и с помощью цикла(-ов) заполнить его диагональные элементы единицами (можно только одну из диагоналей, если обе сложно).
        // Определить элементы одной из диагоналей можно по следующему принципу: индексы таких элементов равны, то есть [0][0], [1][1], [2][2], …, [n][n];
        System.out.println("Массив 4:");
        int [][] arr4 = new int[4][4];
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                if (i == j) {
                    arr4[i][j] = 1;
                    System.out.print(arr4[i][j]+ " ");
                } else {
                    System.out.print("0 "); //для наглядности заполним остальные элементы массива нулями
                }
            }
            System.out.println();
        }
        System.out.println();


        //вызов и печать метода из задания № 5:
        System.out.println("Массив 5:");
        System.out.println(Arrays.toString(returnArr(5,10)));

    }

        //5. Написать метод, принимающий на вход два аргумента: len и initialValue,
        // и возвращающий одномерный массив типа int длиной len,
        // каждая ячейка которого равна initialValue;
        public static int[] returnArr(int len, int initialValue) {
        int[] arr5 = new int [len];
        for (int i = 0; i < len; i++) {
            arr5[i] = initialValue;
        }
        return arr5;
    }
}