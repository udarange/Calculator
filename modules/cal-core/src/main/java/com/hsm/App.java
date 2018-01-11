package com.hsm;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        while (true) {
            double num1;
            double num2;
            double ans;

            System.out.println("Enter your selection: \n 1 for Addition \n 2 for substraction \n 3 for Multiplication \n 4 for division\n 0 for EXIT");
            Scanner sc = new Scanner(System.in);
            int selection;
            selection = sc.nextInt();

            if (selection < 5 && selection > 0) {
                System.out.println("Enter first number :");
                num1 = sc.nextDouble();
                System.out.println("Enter second number :");
                num2 = sc.nextDouble();
                System.out.print("Answer : ");

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
                }
                break;
            } else if (selection == 0) {
                break;
            } else {
                System.out.println("Illigal Operation. Try again or press 0 for exit");
            }
        }
    }
}
