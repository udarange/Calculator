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

package com.hsm.CalculatorInterfaces.impl;

import com.hsm.CalculatorInterfaces.BasicOperationService;

/**
 * Basic Calculator Operation Implementation.
 */
public class BasicOperationImpl implements BasicOperationService {
    @Override
    public double add(double num1, double num2) {
        return num1 + num2;
    }

    @Override
    public double subtract(double num1, double num2) {
        return num1 - num2;
    }

    @Override
    public double multiply(double num1, double num2) {
        return num1 * num2;
    }

    @Override
    public double divide(double num1, double num2) {
        return num1 / num2;
    }

    @Override
    public int mod(int number, int mode) {
        return number % mode;
    }

    @Override
    public double sqrt(int number) {
        return Math.sqrt(number);
    }
}
