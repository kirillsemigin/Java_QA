import java.util.Scanner;

public class Lesson2Task1 {
    /*
    Задача 1:
Ввести с консоли любое число от 1 до 12. В зависимости от введённого числа
вывести в консоль соответствующую пору года по номеру месяца. При решении
использовать switch.
     */
    public static void main(String[] args) {
        System.out.println("Введите число месяца");
        Scanner scanner = new Scanner(System.in);
/* Добавим проверку на ввод пустого значения.
 */
        String input = scanner.nextLine(); // Считываем строку с квавиатуры
        if(input.trim().isEmpty()) { // функцией trim() убираем пробелы в начале и в конце. isEmpty проверяет на пустоту
            System.out.println("Вы ничего не ввели"); // если условие верно, возвращаем сообщение что ничего не было введено и прерываем работу
            return;
        }


        try {

            int n = Integer.parseInt(input); // кладем полученное значение из input в переменную n и пробуем преобразовать в число

            switch (n) {
                case 1:
                    System.out.println("January");
                    break;
                case 2:
                    System.out.println("February");
                    break;
                case 3:
                    System.out.println("March");
                    break;
                case 4:
                    System.out.println("April");
                    break;
                case 5:
                    System.out.println("May");
                    break;
                case 6:
                    System.out.println("June");
                    break;
                case 7:
                    System.out.println("July");
                    break;
                case 8:
                    System.out.println("August");
                    break;
                case 9:
                    System.out.println("September");
                    break;
                case 10:
                    System.out.println("October");
                    break;
                case 11:
                    System.out.println("November");
                    break;
                case 12:
                    System.out.println("December");
                    break;
                default:
                    System.out.println("Такого месяца не существует"); // Если введенное число находится вне диапозона выводим сообщение, что такого месяца не существует
            }
        } catch (NumberFormatException e) {
            System.out.println("Вы ввели не число");
        }
    }
}
