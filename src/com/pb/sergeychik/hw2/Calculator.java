package com.pb.sergeychik.hw2;

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int x; //-1ая переменная
        int y; //-2ая переменная
        char op; //-переменная для знака

        System.out.print("Enter operand1: ");
        x = scan.nextInt(); //- вычитали 1ую переменную
        System.out.print("Enter operand2: ");
        y = scan.nextInt(); //- вычитали 2ую переменную

        System.out.print("\nEnter an operator (+, -, *, /) : ");
        op = scan.next().charAt(0);//- вычитали знак

        System.out.print("\nResult: ");
        switch(op) { //- здесь анализируем знак
            case '+': System.out.println(+ (x+y));//- знак сравниваем с символом и его нужно указывать в одинарных ' кавычках, т.е. НЕ "+"
                break;
            case '-': System.out.println(+ (x-y));
                break;
            case '*': System.out.println(+ (x*y));
                break;
            case '/':
                if (y==0) { //- здесь проверка на ноль
                    System.out.print("\nError! Division by zero!");
                    break;
                }
                System.out.println(+ (x/y));
                break;
            default: System.out.printf("Error! Enter correct operator");
                break;
        }
    }
}
