package com.hsm;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        double num1 = 0;
        double num2 = 0;
        double ans = 0;
        System.out.println("Enter your selection: \n 1 for Addition \n 2 for substraction \n 3 for Multiplication \n 4 for division");
        Scanner sc = new Scanner(System.in);
        int selection;
        selection = sc.nextInt();

        if (selection < 5) {
            System.out.println("Enter first number :");
            num1 = sc.nextDouble();
            System.out.println("Enter second number :");
            num2 = sc.nextDouble();
            System.out.print("Ans : ");
        }

        switch (selection) {
            case 1:
                ans = num1 + num2;
                System.out.printf("%.2f\n", ans);
                break;
            case 2:
                ans = num1 - num2;
                System.out.printf("%.2f\n", ans);
                break;
            case 3:
                ans = num1 * num2;
                System.out.printf("%.2f\n", ans);
                break;
            case 4:
                ans = num1 / num2;
                System.out.printf("%.2f\n", ans);
                break;
            default:
                System.out.println("Illigal Operation");
        }
    }
}
