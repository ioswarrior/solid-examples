package com.practice.oop.solid.liskov;

public class Developer {
    private String langName;

    public String getLangName() {
        return langName;
    }

    public void setLangName(String langName) {
        this.langName = langName;
    }

    // Неправильно по SOLID: в зависимости от названия языка - реализуем нужный функционал
    // Если будут добавляться новые языки (расширение класса) - придется добавлять новый if
    // - а это модификация базового класа и это нарушение принципа open closed

    public void writeCode() {
        System.out.println("Default lang syntax");
    }

    public void reaction() {
        System.out.println("Default reaction");
    }
}