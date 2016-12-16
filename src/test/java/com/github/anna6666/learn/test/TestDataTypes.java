package com.github.anna6666.learn.test;

import com.github.anna6666.learn.HelloWorld;
import junit.framework.TestCase;
import org.junit.Test;


/**

 */
public class TestDataTypes extends TestCase {


    public void testMain() {
        HelloWorld.main(null);
    }

    public void test1() {
        assertEquals(1, 2);
    }

    public void testPrint() {
        String hi = "Hi2";
        System.out.print(hi);
    }

    public void testIntSimple() {
        int a = 10;
        int b = 7;
        int sum = a + b;
        System.out.print(sum);
    }

    public void testBoolSimple() {
        boolean a = true;
        boolean f = false;

        if (f) {
            System.out.println("a is True");
        } else {
            System.out.println("a is not True");
        }
    }

    public void testChar() {
        char c = 'x';
        System.out.println(c);
    }

    public void testFloat() {
    }

    public void testLong() {
        long x;
        long y;

        x = 28522;

        y = x * x;

        System.out.println("y contains " + y);
    }
}