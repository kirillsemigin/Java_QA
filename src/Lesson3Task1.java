import java.util.Random;

public class Lesson3Task1 {
    /*
    Задача 1:
Сгенерировать 5 случайных чисел. Каждое возвести в квадрат и вывести в
консоль.

     */
    public static void main(String[] args) {
        Random random = new Random();
        int range = 5; // размер массива = 5
        int[] numbers = new int[range]; // объявляем массив numbers размером = 5
        /*
        Наполняем массив с помощью цикла.
        Наполняем массив числами типа int, сгенерированными случайным образом
         */
        for (int i = 0; i < range; i++) {
            numbers[i] = random.nextInt(15);
        }
        /*
        Вариант 1.
        Шаг 1:
        Возводим в квадрат числа, которыми наполнили массив
         */
        for (int a = 0; a < range; a++) {
            numbers[a] = (int) Math.pow(numbers[a], 2);
        }
        /*
        Вариант 1.
        Шаг 2:
        Выводим в консоль ответ согласно заданию
         */
        for (int b = 0; b < range; b++) {
            System.out.println(numbers[b]);
        }
        /*
        Вариант 2.
        Возводим числа в квадрат и выводим в консоль в одном цикле.
        Наверно оба варианта возможны.
        Изначально я решил вторым вариантом и только затем решил попробовать разбить на несколько действий.
         */
//        for(int a = 0; a < range; a++){
//            System.out.println((int)Math.pow(numbers[a], 2));
//            }
    }
}
