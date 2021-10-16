package com.pb.sergeychik.hw2;

import java.util.Scanner;

public class Interval {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int x;
        System.out.println("Введите пожалуйста число в диапозоне 0 - 100");
        x = scan.nextInt();
        if (x>=0 & x<=100)
        {
            if (x<=14)
            {
                System.out.println("Диапазон [0-14]");
            }
            else if (x>=15 & x<=35)
            {
                System.out.println("Диапазон [15-35]");
            }
            else if (x>=36 & x<=50)
            {
                System.out.println("Диапазон [36-50]");
            }
            else
            {
                System.out.println("Диапазон [51-100]");
            }
        }
        else
        {
            System.out.println("Число не входит в диапазон [0-100]");
        }
    }
}

