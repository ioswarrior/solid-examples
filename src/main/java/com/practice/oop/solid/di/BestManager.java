package com.practice.oop.solid.di;

public class BestManager implements IManager {
    @Override
    public void speak(IDeveloper developer) {
        System.out.println("Speak manager with developer");
        developer.writeCode();
    }
}