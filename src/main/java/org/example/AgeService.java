package org.example;

public class AgeService {
    public String getCategory(int age) {
        if (age < 0) return "Ошибка: возраст не может быть отрицательным";
        if (age < 18) return "ребенок";
        if (age < 65) return "взрослый";
        return "пенсионер";
    }
}