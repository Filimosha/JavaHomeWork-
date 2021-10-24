package com.pb.sergeychik.hw3;

import java.util.Random;
import java.util.Scanner;

public class Bingo {

    public static void main(String[] args) {
        System.out.print("Да начнется игра! Угадай число от 0 до 100");
        System.out.print("\nДля выхода из программы введите - q.");
        Random random = new Random();
        int x = random.nextInt(101);
        System.out.print("\nrandom: " + x);

        int attempt = 0;
        String value; // - Это переменная, которая будет принимать, что ввел пользователь
        String quiteStr = "q"; // - Константа для выхода
        Scanner in = new Scanner(System.in);
        int y;

        while (true)
        {
            attempt++; // - сначала посчитали попытку
            System.out.println("\nПопытка " + attempt + ":");
            value = in.nextLine(); //- вычитали, что ввел пользователь
            System.out.print("value: " + value);

            if (value.equals(quiteStr)) {
                System.out.println("\nИгра завершена.");
                break;
            }

            y = Integer.parseInt(value); // - если не нажали q, то проверим число

            if (y > x) {
                System.out.print("\nМоё число меньше");
            } else if (y < x) {
                System.out.print("\nМоё число больше");
            }

            if (y == x) {
                System.out.print("\nБинго");

                System.out.println("\nПоздравляем, Вы угадали с " + attempt + " попытки!");
                System.out.println("\nКонец игры!");

                break;

                }

            }



        }
    }

