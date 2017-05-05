package com.fun.training;

/**
 * Created by rab4154 on 4/19/2017.
 */
public class GreetingImpl implements Greeting
{
    @Override
    public String greet(String name)
    {
        if (name == null || name.length() == 0)
        {
            throw new IllegalArgumentException();
        }
        return "Hello " + name + "!";
    }
}
