import java.util.Scanner;

public class Lesson3Task3 {
    public static void main(String[] args) {
        /*
        Задача 3:
3.1 Создать пустой массив типа double с названием masDouble такого размера,
который пользователь вводит с клавиатуры.
3.2 Заполнить masDouble рандомными числами, используя Math.random() и
вывести его в консоль.
3.3 Каждый чётный элемент masDouble возвести в квадрат. Вывести массив в
прямом и обратном порядке
         */
        double[] masDouble;
        System.out.println("Какого размера будет маcсив?");
        Scanner scanner = new Scanner(System.in);
        int range = scanner.nextInt(); // пользователь указывает размер массива
        masDouble = new double[range]; // 3.1 объявляем массив типа double размером = range
        /*
        3.2 заполняем массив рандомными числами и выводим их в консоль
         */
        for (int i = 0; i < masDouble.length; i++) { //
            masDouble[i] = Math.random();
        }
        System.out.println("Выводим содержимое массива");
        for (int a = 0; a < masDouble.length; a++) { //
            System.out.println(masDouble[a]);
        }
        /*
        3.3  Каждый чётный элемент masDouble возвести в квадрат. Вывести массив в
прямом и обратном порядке
         */
        for (int c = 1; c < masDouble.length; c = c + 2) {
                masDouble[c] = Math.pow(masDouble[c], 2);
        }
        System.out.println("Выводим массив в прямом порядке:");
        for(int i = 0; i < masDouble.length; i++){ // выводим массив в прямом порядке
            System.out.print(masDouble[i] + ", ");
        }
        System.out.println();
        System.out.println("Выводим массив в обратном порядке:");
        for(int i = masDouble.length - 1; i >= 0; i--){
            System.out.print(masDouble[i] + ", ");
        }
    }
}