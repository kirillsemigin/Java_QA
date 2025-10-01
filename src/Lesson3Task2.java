public class Lesson3Task2 {
    public static void main(String[] args) {
        String[] fruits = new String[4]; // объявляем массив fruits размером = 4
        /*
        2.1
        Заполняем массив 4 произвольными фруктами
         */
        fruits[0] = "apple";
        fruits[1] = "orange";
        fruits[2] = "banana";
        fruits[3] = "pear";
        /*
        2.2
        Выводим в консоль второй и четвертый
         */
        System.out.println(fruits[1]);
        System.out.println(fruits[3]);
        /*
        2.3
        Вывести в консоль длину массива
         */
        System.out.println("Длина массива = " + fruits.length);
        /*
        2.4 и 2.5
        Третий фрукт заменить на иной и вывести в консоль
         */
        fruits[2] = "plum";
        System.out.println(fruits[2]);
        /*
        или выведем весь массив что бы убедиться, что поменяли только одно значение
         */
        System.out.println("Массив состоит из:");
        for(int i = 0; i < fruits.length; i++){
            System.out.print(fruits[i] + " ");
        }
    }
}