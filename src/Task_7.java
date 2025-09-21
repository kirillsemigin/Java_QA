public class Task_7 {
    /*
    Задача 5:
В переменных q и w хранятся два натуральных числа. Создайте программу,
выводящую на экран результат деления q на w с остатком. Пример вывода
программы (для случая, когда в q хранится 21, а в w хранится 8):
21 / 8 = 2 и 5 в остатке.
     */
    public static void main(String[] args) {
        int q, w;
        q = 21;
        w = 8;
        int result1 = q / w;
        int result2 = q % w;
        System.out.println(q + " / " + w + " = " + result1 + " и " + result2 + " в остатке");
    }
}
