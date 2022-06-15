package com.practice.oop.solid.openclosed;

public class JavaDeveloper extends Developer{
    // Реализуем метод по-своему
    @Override
    public void writeCode() {
        System.out.println("Use Java syntax");
    }
}