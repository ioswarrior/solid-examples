package com.practice.oop.solid.di;

// Менеджер проектов
public interface IManager {
    // Менеджер сможет разговаривать с любым разработчиком
    void speak(IDeveloper developer);
}