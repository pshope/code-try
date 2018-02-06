package com.cleansoft.dp;

public class Mother extends Person{
    @Override
    public void wakeup() {
        System.out.println("Mother wakeup at 9.00 AM");
    }

    @Override
    void sleep() {
        System.out.println("Mother sleep at 12.00 PM");
    }
}
