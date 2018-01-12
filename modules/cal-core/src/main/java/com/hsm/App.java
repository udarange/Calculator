/*
 * Copyright (c) 2018. Lorem ipsum dolor sit amet, consectetur adipiscing elit.
 * Morbi non lorem porttitor neque feugiat blandit. Ut vitae ipsum eget quam lacinia accumsan.
 * Etiam sed turpis ac ipsum condimentum fringilla. Maecenas magna.
 * Proin dapibus sapien vel ante. Aliquam erat volutpat. Pellentesque sagittis ligula eget metus.
 * Vestibulum commodo. Ut rhoncus gravida arcu.
 */

package com.hsm;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        double num1;
        double num2;
        double ans;

        System.out.println("Enter your selection: \n" +
                " 1 for Addition \n" +
                " 2 for substraction \n" +
                " 3 for Multiplication \n" +
                " 4 for division");

        Scanner sc = new Scanner(System.in);
        int selection;
        selection = sc.nextInt();

        if ((selection < 5) && (selection > 0)) {
            System.out.print("Enter first number : ");
            num1 = sc.nextDouble();
            System.out.print("Enter second number : ");
            num2 = sc.nextDouble();

            Operators operators = new Operators();
            switch (selection) {
                case 1:
                    ans = operators.add(num1, num2);
                    System.out.printf("Answer : %.2f\n", ans);
                    break;
                case 2:
                    ans = operators.subtract(num1, num2);
                    System.out.printf("Answer : %.2f\n", ans);
                    break;
                case 3:
                    ans = operators.multiply(num1, num2);
                    System.out.printf("Answer : %.2f\n", ans);
                    break;
                case 4:
                    ans = operators.divide(num1, num2);
                    System.out.printf("Answer : %.2f\n", ans);
                    break;
            }
        } else {
            System.out.println("Illigal Operation");
        }
    }
}
