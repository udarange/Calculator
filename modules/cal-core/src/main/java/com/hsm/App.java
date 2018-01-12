/*
 * (C) Copyright 2010-2018 hSenid Mobile Solutions (Pvt) Limited.
 * All Rights Reserved.
 *
 * These materials are unpublished, proprietary, confidential source code of
 * hSenid Mobile Solutions (Pvt) Limited and constitute a TRADE SECRET
 * of hSenid Mobile Solutions (Pvt) Limited.
 *
 * hSenid Mobile Solutions (Pvt) Limited retains all title to and intellectual
 * property rights in these materials.
 */

package com.hsm;

import com.hsm.CalculatorInterfaces.BasicOperation;
import com.hsm.CalculatorInterfaces.impl.BasicOperationImpl;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        double num1;
        double num2;
        double ans;

        System.out.println("Enter your selection: \n"
                + " + for Addition \n"
                + " - for substraction \n"
                + " * for Multiplication \n"
                + " / for division");

        Scanner sc = new Scanner(System.in);
        String selection;
        selection = sc.nextLine();


        BasicOperation operation = null;
        if (selection.equals("+")) {
            operation = BasicOperation.ADD;
        } else if (selection.equals("-")) {
            operation = BasicOperation.SUBTRACT;
        } else if (selection.equals("*")) {
            operation = BasicOperation.MULTIPLICATION;
        } else if (selection.equals("/")){
            operation = BasicOperation.DIVISION;
        }else {
            System.out.println("Illigal Operation");
        }

        System.out.print("Enter first number : ");
        num1 = sc.nextDouble();
        System.out.print("Enter second number : ");
        num2 = sc.nextDouble();

        BasicOperationImpl basicOperation = new BasicOperationImpl();
        switch (operation) {
            case ADD:
                ans = basicOperation.add(num1, num2);
                System.out.printf("Answer : %.2f\n", ans);
                break;
            case SUBTRACT:
                ans = basicOperation.subtract(num1, num2);
                System.out.printf("Answer : %.2f\n", ans);
                break;
            case MULTIPLICATION:
                ans = basicOperation.multiply(num1, num2);
                System.out.printf("Answer : %.2f\n", ans);
                break;
            case DIVISION:
                ans = basicOperation.divide(num1, num2);
                System.out.printf("Answer : %.2f\n", ans);
                break;
            default:
                // do nothing
                break;
        }
    }
}
