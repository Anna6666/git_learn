package com.github.anna6666.learn.test;

import com.github.anna6666.learn.HelloWorld;
import junit.framework.TestCase;
import org.junit.Test;

/**

 */
public class TestHelloWorld extends TestCase {

    @Test
    public void testMain() {
        HelloWorld.main(null);
    }

    @Test
    public void test1() {
        assertEquals(1, 2);
    }


}
