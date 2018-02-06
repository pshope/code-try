package com.cleansoft.dp;

public class Worker extends Person{
    @Override
    public void wakeup() {
        System.out.println("Worker wakeup at 7.00 AM");
    }

    @Override
    void sleep() {
        System.out.println("Worker sleep at 10.00 PM");
    }
}
