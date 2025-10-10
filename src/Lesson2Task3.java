public class Lesson2Task3 {
    /*
    Задача 3:
Используя for вывести каждое четное число от 2 до 20 включительно и больше 10
     */
    public static void main(String[] args) {
        for (int n = 2; n < 21; n++) {
            if (n % 2 == 0 && n > 10)
                System.out.println(n);

        }
    }
}
