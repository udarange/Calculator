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

import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Junit test cases for calculator
 * Created by archana on 1/12/18.
 */
public class BasicOperationImplTest {
    BasicOperationImpl operation = new BasicOperationImpl();

/*
    @BeforeClass
    public static void onceExecutedBeforeAll() {
        System.out.println("@BeforeClass: onceExecutedBeforeAll");
    }

    @AfterClass
    public static void onceExecutedAfterAll() {
        System.out.println("@AfterClass: onceExecutedAfterAll");
    }
*/


    @Test
    public void squre() {
        /**
         * Test squre root
         */
        double sqrt = operation.sqrt(9);
        assertEquals(3.0d, sqrt, 0.01);

        /*sqrt by negative number exception*/
//        operation.sqrt(-9); // expect an AssertionError
    }

    @Test(expected = ArithmeticException.class)
    public void mod() {

        /**
         * Test mod operator
         */
        int mod = operation.mod(5, 2);
        assertEquals(1, mod);

        /*mod by zero exception*/
        operation.mod(5, 0); // expect an ArithmeticException
    }

    @Test
    public void add() {
        /**
         * Test additon
         */
        double actualValue = operation.add(10.1, 11.2);
        assertEquals(21.3, actualValue, 0.01);
    }

    /**
     * Test subtraction
     */
    @Test
    public void subtract() {
        double actualValue = operation.subtract(20.1, 10.1);
        assertEquals(10.0d, actualValue, 0.01);
    }

    /**
     * Test multiply
     */
    @Test
    public void multiply() {
        double actualValue = operation.multiply(10.0d, 2.0d);
        assertEquals(20.0d, actualValue, 0.01);
    }

    /**
     * Test divide
     */
    @Test(expected = IllegalArgumentException.class)
    public void divide() throws Exception {
        double actualValue = operation.divide(10.0d, 4.0d);
        assertEquals(2.5, actualValue, 0.01);

        /*division by zero exception*/
        operation.divide(9.0d, 0.0d); // expect an IllegalArgumentException
    }


/*
    @Before
    public void executedBeforeEach() {
        testList = new ArrayList();
        System.out.println("@Before: executedBeforeEach");
    }

    @After
    public void executedAfterEach() {
        testList = new ArrayList();
        System.out.println("@After: executedAfterEach");
    }
*/

}