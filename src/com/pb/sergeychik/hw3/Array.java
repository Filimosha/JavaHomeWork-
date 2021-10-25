package com.pb.sergeychik.hw3;

import java.util.Arrays;
import java.util.Scanner;

public class Array<isSorted> {
    public static void main(String[] args) {
        System.out.println("Введите массив");
        int[] array = new int[10];
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < array.length; i++) {
            array[i] = scanner.nextInt();
        }
        int sum = 0;
        for (int q : array) {
            sum = sum + q;
        }
        System.out.println("Сума массива:" + (sum));

        int count = 0;
        for (int j : array) {
            if (j > 0) {
                count++;
            }
        }
        System.out.println("В массиве " + Arrays.toString(array));
        System.out.println(count + " положительных элементов");

        boolean isSorted = false;
        int buf;
        while(!isSorted) {
            isSorted = true;
            for (int i = 0; i < array.length - 1; i++) {
                if (array[i] > array[i + 1]) {
                    isSorted = false;

                    buf = array[i];
                    array[i] = array[i + 1];
                    array[i + 1] = buf;
                }
            }
            System.out.println("Сортировка пузырьком"+ Arrays.toString( array));
        }
    }
}
