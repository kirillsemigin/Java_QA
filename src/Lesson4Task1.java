import java.util.Random;
import java.util.Scanner;

public class Lesson4Task1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите размер массива");
        int range = scanner.nextInt();
        scanner.close();
        int[][] mass = new int[range][range]; // объявляем массив размером, который ввели с клавиатуры
        Random random = new Random();
        System.out.println("Задан массив:");
        for (int i = 0; i < mass.length; i++) { // наполняем массив случайными числами
            for (int j = 0; j < mass[i].length; j++) {
                mass[i][j] = random.nextInt(51);
                System.out.print(mass[i][j] + "\t");
            }
            System.out.println();
        }
        /*
        Задача 1:
        Посчитать сумму четных элементов стоящих на главной диагонали.
         */
        int sum = 0;
        for (int i = 0; i < mass.length; i++) {
            if (mass[i][i] % 2 == 0) {
                sum += mass[i][i];
            }
        }
        System.out.println("Задание 1 - Сумма четных элементов на главной диагонали = " + sum);
        /*
        Задача 2:
        Вывести нечетные элементы находящиеся под главной диагональю
        (включительно).
         */
        System.out.print("Задание 2 - Нечетные элементы под главной диагональю: ");
        for (int i = 0; i < mass.length; i++) {
            for (int j = 0; j <= i; j++) {
                if (mass[i][j] % 2 != 0) {
                    System.out.print(mass[i][j] + "\t");
                }
            }
        }
        System.out.println();
        /*
        Задача 3:
        Проверить произведение элементов какой диагонали больше.
         */
        System.out.println("Задание 3 - На какой диагонали произведение больше?");
        int main = 1;
        int second = 1;
        for (int i = 0; i < mass.length; i++) {
            main *= mass[i][i];
            second *= mass[i][mass.length - i - 1];
        }
        //    System.out.println(main);
        //    System.out.println(second);
        if (main > second) {
            System.out.println("Произведение чисел на главной диагонали больше");
        }
        if (main < second) {
            System.out.println("Произведение чисел на побочной диагонали больше");
        }
        /*
        Задача 4:
        Посчитать сумму четных элементов стоящих над побочной диагональю (не включительно)
         */
        int sum2 = 0;
        for (int i = 0; i < mass.length; i++) {
            for (int j = 0; j < mass[i].length; j++) {
                if ((i + j) < (mass.length - 1)) {
                    if (mass[i][j] % 2 == 0) {
                        sum2 = sum2 + mass[i][j];
                    }
                }
            }
        }
        System.out.println("Задание 4 - Сумма четных элементов над побочной диагональю = " + sum2);
        /*
        Задача 5
Транспонировать матрицу(1 столбец станет 1-й строкой, 2-й столбец - 2-й
строкой и т. д.)
         */
        System.out.println("Задание 5 - Транспонировать матрицу");
        int[][] mass2 = new int[range][range];
        for (int i = 0; i < mass.length; i++) {
            for (int j = 0; j < mass.length; j++) {
                mass2[i][j] = mass[j][i];
                System.out.print(mass2[i][j] + "\t");
            }
            System.out.println();
        }
    }
}
