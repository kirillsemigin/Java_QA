import java.util.Scanner;

public class Lesson2Task4 {
    /*
    Задача 1:
Напишите программу, которая будет принимать на вход число из консоли и на
выход будет выводить сообщение четное число или нет.
     */
    public static void main(String[] args) {
        System.out.println("Введите число");
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();
        if(input.trim().isEmpty()) {  // проверям что ввобще что либо введено
            System.out.println("Вы ничего не ввели");
            return;
        }
        try {
            int n = Integer.parseInt(input);
            if(n % 2 == 0)
                System.out.println("Число четное");
            else
                System.out.println("Число нечетное");
        } catch (NumberFormatException e) {  // обертка для ошибки в случае если ввели не число
            System.out.println("Вы ввели не число");
        }
        scanner.close();
    }
}
