package oop;
/*
Урок 6. ООП. Практика. Задача 1.
1.1 Создать класс Calculator с полями weight, cost, color и заполнить их. И
методами нахождения суммы, разности, деления, умножения двух чисел.
Метод main в этом классе не создавать!
*/

public class Calculator {
    int weight;
    int cost;
    String color;

    public int addition(int a, int b) {
        return a + b;
    }

    public int subtraction(int a, int b) {
        return a - b;
    }

    public int multiplication(int a, int b) {
        return a * b;
    }

    public int division(int a, int b) {
        return a / b;
    }
}
