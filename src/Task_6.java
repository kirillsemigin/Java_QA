public class Task_6 {
    /*
    Задача 4:
В переменной n хранится вещественное число с ненулевой дробной частью.
Создайте программу, которая округляет число n до ближайшего целого и
выводящую результат на экран.
     */
    public static void main(String[] args) {
        double n = 25.1;
        long result = Math.round(n) ;
        System.out.println(result);
    }
}
