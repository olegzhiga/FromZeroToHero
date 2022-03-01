package JavaRush.Level_7;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/*
Массивный максимум

1. В методе initializeArray():
1.1. Создай массив на 20 чисел
1.2. Считай с консоли 20 чисел и заполни ими массив
2. Метод max(int[] array) должен находить максимальное число из элементов массива

Требования:
•	Метод initializeArray должен создавать массив из 20 целых чисел.
•	Метод initializeArray должен считать 20 чисел и вернуть их в виде массива.
•	Метод max должен возвращать максимальный элемент из переданного массива.
•	Метод main изменять нельзя.
*/
public class Task_0701___Array_maximum {
    public static void main(String[] args) throws Exception {
        int[] array = initializeArray();
        int max = max(array);
        System.out.println(max);
    }

    public static int[] initializeArray() throws IOException {
        // создай и заполни массив
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        int [] inputArray = new int[20];
        for (int i = 0; i < inputArray.length; i++) {
            System.out.print("Enter " + i + "/" + (inputArray.length-1) + " element of array: ");
            inputArray[i] = Integer.parseInt(bf.readLine());
        }
        return inputArray;
    }

    public static int max(int[] array) {
        // найди максимальное значение
        int maxInt = array[0];
        for (int j : array) {
            if (j > maxInt) {
                maxInt = j;
            }
        }
        return maxInt;
    }
}
