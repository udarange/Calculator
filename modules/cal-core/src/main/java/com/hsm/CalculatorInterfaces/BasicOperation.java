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
 * enum for basic operation
 * Created by archana on 1/12/18.
 */
public enum BasicOperation {
    ADD("+"),

    SUBTRACT("-"),

    MULTIPLICATION("*"),

    DIVISION("/");

    //todo : select operation name from sign

    private String sign;

    BasicOperation(String sign) {
        this.sign = sign;
    }
}
