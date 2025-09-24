import java.util.Scanner;

public class Lesson2Task5 {
    /*
    Задача 2:
Для введенного числа t (температура на улице) вывести: Если t>–5, то вывести
«Warm».
Если –5>= t >–20, то вывести «Normal». Если –20>= t, то вывести «Cold».
     */

    public static void main(String[] args) {
        System.out.println("Введите температуру");
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();
        if (input.trim().isEmpty()) {
            System.out.println("Вы ничего не ввели");
            return;
        }
        scanner.close();

        try {
            int t = Integer.parseInt(input);
            if (t <= -20) {
                System.out.println("Cold");
            }
            else if (t <= -5) {
                System.out.println("Normal");
            }
            else {
                System.out.println("Warm");
            }
        } catch (NumberFormatException e) {
            System.out.println("Вы ввели не число");
        }
    }
}
