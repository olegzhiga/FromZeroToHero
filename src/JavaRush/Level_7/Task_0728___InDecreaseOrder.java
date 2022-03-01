package JavaRush.Level_7;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/*
В убывающем порядке

Задача: Написать программу, которая вводит с клавиатуры 20 чисел и выводит их в убывающем порядке.

Требования:
•	Программа должна считывать 20 целых чисел с клавиатуры.
•	Программа должна выводить 20 чисел.
•	В классе Solution должен быть метод public static void sort(int[] array).
•	Метод main должен вызывать метод sort.
•	Метод sort должен сортировать переданный массив по убыванию.
*/
public class Task_0728___InDecreaseOrder {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int[] array = new int[20];
        for (int i = 0; i < 20; i++) {
            array[i] = Integer.parseInt(reader.readLine());
        }

        sort(array);

        for (int x : array) {
            System.out.println(x);
        }
    }

    public static void sort(int[] array) {
        //напишите тут ваш код
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length; j++) {
                if (array[i] > array[j]){
                    int swap = array[i];
                    array[i] = array[j];
                    array[j] = swap;
                }
            }
        }
    }
}
