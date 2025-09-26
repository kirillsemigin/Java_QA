import java.util.Scanner;

public class Lesson3Task4 {
    public static void main(String[] args) {
        System.out.println("Введите размер массива");
        Scanner scanner = new Scanner(System.in);
        int range = scanner.nextInt();
        double[] numbers = new double[range];
        scanner.close();

        for(int i = 0; i < range; i++){
            numbers[i] = Math.random();
        }
        /*
        Задача 1:
Пройти по массиву, вывести все элементы в прямом и в обратном порядке
         */
        System.out.println("Вывод в консоль массива в прямом порядке");
        for(int i = 0; i < range; i++){
            System.out.println(numbers[i]);
        }
        System.out.println("Вывод в консоль массива в обратном порядке");
        for(int i = range -1; i >= 0; i--){
            System.out.println(numbers[i]);
        }
        /*
        Задача 2:
Найти минимальный - максимальный элементы и вывести в консоль.
         */
        double min = numbers[0];
        for (int i = 0; i < range; i++){
            if (numbers[i] < min) {
                min = numbers[i];
            }
        }
        System.out.println("Наименьшее число в массиве = " + min);

        double max = numbers[0];
        for (int i = 0; i < range; i++){
            if (numbers[i] > max){
                max = numbers[i];
            }
        }
        System.out.println("Наибольшее число в массиве = " + max);
        /*
        Задача 3:
Найти индексы минимального и максимального элементов и вывести в консоль.
         */

    }
}
