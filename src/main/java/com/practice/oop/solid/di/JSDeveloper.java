package com.practice.oop.solid.di;

public class JSDeveloper implements IDeveloper {
    @Override
    public void writeCode() {
        System.out.println("Use JS syntax");
    }

    @Override
    public void eat() {
        System.out.println("JS eat");
    }
}