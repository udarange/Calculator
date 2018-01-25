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
package com.hsm.CalculatorInterfaces;

/**
 * Basic Calculator Operators.
 */
public interface BasicOperationService {

    /**
     * Addition operation for two numbers
     */
    double add(double num1, double num2);

    /**
     * Subtraction operation for two numbers
     */
    double subtract(double num1, double num2);

    /**
     * Multiplication operation for two numbers
     */
    double multiply(double num1, double num2);

    /**
     * Division operation for two numbers
     */
    double divide (double num1, double num2) throws IllegalArgumentException;

    /**
     * Mod operation of a numbers
     */
    int mod(int number, int mode);

    /**
     * square root of a numbers
     */
    double sqrt(int number);
}