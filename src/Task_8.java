public class Task_8 {
    /*
    Задача * :
Написать программу которая будет менять местами значение целочисленных
переменных.
Пример:
int a = 1;
int b = 2;
//код (ваше решение)
sout(a); //выведет 2
sout(b); //выведет 1
     */
    public static void main(String[] args) {
        int a = 1;
        int b = 2;

        int temporaryVariable = b;
        b = a;
        a = temporaryVariable;


        System.out.println(a);
        System.out.println(b);

    }
}
