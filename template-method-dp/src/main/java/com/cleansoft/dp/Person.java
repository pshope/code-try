package com.cleansoft.dp;

public abstract class Person {


    //Template method
    public final void startDay(){
        wakeup();
        sleep();
    }



    abstract void wakeup();
    abstract void work();
    abstract void sleep();
}
