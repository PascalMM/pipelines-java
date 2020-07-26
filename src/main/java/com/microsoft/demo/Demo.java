package com.microsoft.demo;

public class Demo {
    public void DoSomething(boolean flag){
        if(flag){
            System.out.println("I am covered");
            return;
        }

        System.out.println("ERROR: Felix muss auch mal ne Azure Pipeline aufsetzen ... ");
        assertFalse(false);
    }
}
