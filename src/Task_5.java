public class Task_5 {
    /*
    Задача 3:
В переменной n хранится трёхзначное число. Создайте программу,
вычисляющую и выводящую на экран сумму цифр n. Например: n = 126, в
результате мы должны получить 9 (1+2+6).
     */
    public static void main(String[] args) {
        int n = 126;
        int firstDigit = n / 100; // вычисляем первое число
        int secondDigit = (n % 100) / 10; // вычисляем второе число
        int thirdDigit = n % 10; // вычисляем третье число

        int result = (firstDigit + secondDigit + thirdDigit);
        System.out.println(result);


    }
}
