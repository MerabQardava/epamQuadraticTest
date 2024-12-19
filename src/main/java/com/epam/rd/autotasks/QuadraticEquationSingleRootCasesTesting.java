package com.epam.rd.autotasks;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;

import java.util.Arrays;
import java.util.Collection;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

@RunWith(Parameterized.class)
public class QuadraticEquationSingleRootCasesTesting {
    protected QuadraticEquation quadraticEquation = new QuadraticEquation();

    private double a;
    private double b;
    private double c;
    private double expected;

    public QuadraticEquationSingleRootCasesTesting(double a, double b, double c,double expected) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.expected=expected;
    }

    @Parameters
    public static Collection<Object[]> data(){
        return Arrays.asList(new Object[][]{
            {1,-4,4,2},
            {1,10,25,-5},
            {1,-2,1,1},
            {1,6,9,-3}
        });
    }

    @Test
    public void testSignleRootCase(){
        System.out.println(quadraticEquation.solve(a, b, c));
        assertEquals(expected, quadraticEquation.solve(a, b, c));
    }


}