import java.util.Scanner;

public class Lesson2Task8 {
    /*
    Задача *:
Напишите программу, где пользователь вводит любое целое положительное
число.
А программа суммирует все числа от 1 до введенного пользователем числа. Для
ввода числа воспользуйтесь классом Scanner. Сделать проверку, чтобы
пользователь не мог ввести некорректные данные
     */
    public static void main(String[] args) {
        System.out.println("Введите любое целое положительное число");
        Scanner scanner = new Scanner(System.in);
        int result = 0;

        String input = scanner.nextLine();
        if(input.trim().isEmpty()){ // проверяем на пустой ввод
            System.out.print("Вы ничего не ввели");
            return;
        }

        try { // проверяем что введено число типа int
            int n = Integer.parseInt(input);
            if(n < 0){ // проверяем что введено положительное число
                System.out.println("Вы ввели отрицательное число");
                return;
            }
                for(int a = 1; a <= n; a++){
                    result = result + a;
            }
                System.out.print(result);
        } catch (NumberFormatException e) {
            System.out.println("Некорректный формат данных");
        }
    }
}
