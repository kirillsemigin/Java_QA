package oop;

public class Main {
    public static void main(String[] args) {
        Calculator calculator = new Calculator(150, 12, "Red");

        int sum = calculator.addition(3, 5);
        int sub = calculator.subtraction(10, 4);
        int mult = calculator.multiplication(5, 5);
        int div = calculator.division(500, 2);

        System.out.println("Сумма: " + sum);
        System.out.println("Разность: " + sub);
        System.out.println("Произвдение: " + mult);
        System.out.println("Частное: " + div);

        System.out.println("Цвет: " + calculator.color);
        System.out.println("Цена: " + calculator.cost);
        System.out.println("Вес: " + calculator.weight);

        System.out.println("------------------------------");

        Person personEmpty = new Person();
        Person person = new Person("User", 35);

        person.talk("em govno rukami");
        person.move();

        personEmpty.talk("hello");
        personEmpty.move();

    }
}
