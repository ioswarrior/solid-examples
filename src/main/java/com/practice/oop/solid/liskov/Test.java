package com.practice.oop.solid.liskov;

import java.util.ArrayList;
import java.util.List;

public class Test {
    public static void main(String[] args) {
        Developer dev1 = new JavaDeveloper();
        dev1.setLangName("Java");

        Developer dev2 = new JSDeveloper();
        dev2.setLangName("JS");

        List<Developer> devList = new ArrayList<>();
        devList.add(dev1);
        devList.add(dev2);

        showReaction(devList);
    }

    // Верный подход SOLID - универсальный метод (функция), который умеет работать с любыми типами и подтипами Developer
    public static void showReaction(List<Developer> devList) {
        for (Developer developer: devList) {
            developer.reaction(); // Будет вызываться нужная реализация объекта
        }
    }
}