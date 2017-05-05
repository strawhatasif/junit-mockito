package com.fun.training;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by rab4154 on 4/19/2017.
 */
public class GreetingImplTest extends GreetingImpl {

    private Greeting greeting;

    @Before
    public void setUp()
    {
        System.out.println("Setup");
        greeting = new GreetingImpl();
    }
    @Test
    public void greetShouldReturnAValidOutput()
    {
        System.out.println("greetShouldReturnAValidOutput");
        String result = greeting.greet("Katherine");

        assertNotNull(result);
        assertEquals("Hello Katherine!", result);
    }

    @Test(expected = IllegalArgumentException.class)
    public void greetShouldThrowIllegalArgumentException_forNullName()
    {
        System.out.println("greetShouldThrowIllegalArgumentException_forNullName");
        greeting.greet(null);
    }

    @Test(expected = IllegalArgumentException.class)
    public void greetShouldThrowIllegalArgumentException_forBlankName()
    {
        System.out.println("greetShouldThrowIllegalArgumentException_forBlankName");
        greeting.greet("");
    }

    @After
    public void tearDown()
    {
        System.out.println("tearDown");
        greeting = null;
    }
}