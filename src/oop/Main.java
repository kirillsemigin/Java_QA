package oop;

public class Main {
    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        calculator.color = "Red";
        calculator.cost = 12;
        calculator.weight = 150;

        int sum = calculator.addition(3, 5);
        int sub = calculator.subtraction(10, 4);
        int mult = calculator.multiplication(5, 5);
        int div = calculator.division(500, 2);

        System.out.println("Сумма: " + sum);
        System.out.println("Разность: " + sub);
        System.out.println("Произвдение: " + mult);
        System.out.println("Частное: " + div);

    }
}
