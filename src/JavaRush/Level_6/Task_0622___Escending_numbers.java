package JavaRush.Level_6;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;

/*
Числа по возрастанию

Задача: Написать программу, которая вводит с клавиатуры 5 чисел и выводит их в возрастающем порядке.

Пример ввода:
3
2
15
6
17

Пример вывода:
2
3
6
15
17

Требования:
•	Программа должна считывать 5 чисел с клавиатуры.
•	Программа должна выводить 5 чисел, каждое с новой строки.
•	Выведенные числа должны быть отсортированы по возрастанию.
•	Вывод должен содержать те же числа, что и были введены (порядок не важен).
*/
public class Task_0622___Escending_numbers {

    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        //напишите тут ваш код
        int [] inputArray = new int[5];
        System.out.print("Enter first number: ");
        inputArray [0] = Integer.parseInt(reader.readLine());
        System.out.print("Enter second number: ");
        inputArray [1] = Integer.parseInt(reader.readLine());
        System.out.print("Enter third number: ");
        inputArray [2] = Integer.parseInt(reader.readLine());
        System.out.print("Enter fourth number: ");
        inputArray [3] = Integer.parseInt(reader.readLine());
        System.out.print("Enter fifth number: ");
        inputArray [4] = Integer.parseInt(reader.readLine());

        System.out.println(Arrays.toString(inputArray));
        bubleSort(inputArray);
    }

    private static void bubleSort(int[] array) {
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length; j++) {
                if (array [i] < array [j]){
                    int swap = array[i];
                    array [i] = array [j];
                    array [j] = swap;
                }
            }
        }
        System.out.println(Arrays.toString(array));
        for (int i : array) {
            System.out.println(i);
        }
    }


}
