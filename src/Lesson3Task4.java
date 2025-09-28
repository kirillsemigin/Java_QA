import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Lesson3Task4 {
    public static void main(String[] args) {
        System.out.println("Введите размер массива");
        Scanner scanner = new Scanner(System.in);
        int range = scanner.nextInt();
        int[] numbers = new int[range];
        scanner.close();
        Random random = new Random();

        for (int i = 0; i < range; i++) {
            numbers[i] = random.nextInt(10);
        }
        /*
        Задача 1:
Пройти по массиву, вывести все элементы в прямом и в обратном порядке
         */
        System.out.println("Вывод массива в прямом порядке:");
        for (int i = 0; i < range; i++) {
            System.out.print(numbers[i] + " ");
        }
        System.out.println();
        System.out.println("Вывод массива в обратном порядке:");
        for (int i = range - 1; i >= 0; i--) {
            System.out.print(numbers[i] + " ");
        }
        System.out.println(" ");
        /*
        Задача 2:
Найти минимальный - максимальный элементы и вывести в консоль.
         */
        int min = numbers[0];
        int posMin = 0;
        for (int i = 0; i < range; i++) {
            if (numbers[i] < min) {
                min = numbers[i];
                posMin = i;
            }
        }
        System.out.println("Наименьшее число в массиве = " + min);

        int max = numbers[0];
        int posMax = 0;
        for (int i = 0; i < range; i++) {
            if (numbers[i] > max) {
                max = numbers[i];
                posMax = i;
            }
        }
        System.out.println("Наибольшее число в массиве = " + max);
        /*
        Задача 3:
Найти индексы минимального и максимального элементов и вывести в консоль.
         */
        System.out.println("Индекс минимального элемента массива = " + posMin);
        System.out.println("Индекс максимального элемента массива = " + posMax);
        /*
        Задача 4:
Найти и вывести количество нулевых элементов. Если нулевых элементов нет -
вывести сообщение, что их нет.
         */
        int counter = 0; // счетчик нулевых элементов
        for (int i = 0; i < numbers.length; i++) { // перебираем массив
            if (numbers[i] == 0) { //если находим элемент = 0 - увеличиваем счетчик
                counter++;
            }
        }
        if (counter == 0) { // если нулевых элементов нет и счетчик = 0 - выводим сообщение
            System.out.println("Нулевых элементов нет");
        } else { // если счетчик > 0 - выводим значение счетчика
            System.out.println("Количество нулевых элементов = " + counter);
        }
        /*
        Задача 5:
Пройти по массиву и поменять местами элементы первый и последний, второй
и предпоследний и т.д.
         */
        int[] numbersNew = Arrays.copyOf(numbers, numbers.length);
        // меняем местами первый и последний элемент местами
        int temp1 = numbersNew[0];
        numbersNew[0] = numbersNew[range - 1];
        numbersNew[range - 1] = temp1;
        // меняем местами второй и предпоследний элемент местами
        int temp2 = numbersNew[1];
        numbersNew[1] = numbersNew[range - 2];
        numbersNew[range - 2] = temp2;
        // выводим на экран новое состояние массива
        System.out.println(Arrays.toString(numbersNew));
        /*
        Задача 6:
Проверить, является ли массив возрастающей последовательностью (каждое
следующее число больше предыдущего).
         */
        boolean isSequence = true;
        for (int i = 1; i < numbers.length; i++) {
            if (numbers[i] < numbers[i -1]) {
                isSequence = false;
                break;
            }
        }
        if (isSequence == true){
            System.out.println("Массив является возрастающей последовательностью");
        } else {
            System.out.println("Массив не является возрастающей последовательностью");
        }
    }
}
