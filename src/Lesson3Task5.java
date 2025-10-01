import java.util.Arrays;

public class Lesson3Task5 {
    public static void main(String[] args) {
     /*
     Задача *:
Имеется массив из неотрицательных чисел(любой). Представьте что массив
представляет целое число (Например массив {1,2,3} -> 123, {9,9,9} - > 999). Задача
добавить единицу к этому “числу” и на выходе получить исправленный массив.
Массив не содержит нуля в начале, кроме самого числа 0.
Пример:
Input: [1,4,0,5,6,3]
Output: [1,4,0,5,6,4]
Input: [9,9,9]
Output: [1,0,0,0]
      */
        int[] input = {1, 4, 0, 5, 6, 3}; // задаем массив
        String temp = ""; // вводим переменную в которую переложим содержимое массива
        for (int i = 0; i < input.length; i++){ // проходим по массиву и перкладываем значения в переменную temp
            temp = temp + input[i];
        }
        System.out.println("Input: " + Arrays.toString(input));
        int temp2 = Integer.parseInt(temp); // превращаем значение переменной temp в число и кладем в переменную temp2
        temp2 = temp2 + 1; // к числу прибавляем единицу
        String temp3 = temp2 +""; // преобразуем число в строку
        int range = temp3.length(); // получаем размер будущего массива
        int[] output = new int[range]; //объявляем масив output
        for (int i = output.length - 1; i >= 0; i--){ //проходимся по массиву и наполняем его числами
            output[i] = temp2 % 10; // разбиваем число на отдельные цифры. в рамках цикла полученная цифра складывается в массив
            temp2 = temp2 / 10;
        }
        System.out.println("Output: " + Arrays.toString(output));
    }
}
