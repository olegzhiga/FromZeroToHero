package JavaRush.Level_7;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/*
Минимаксы в массивах
Создать массив на 20 чисел.
Заполнить его числами с клавиатуры.
Найти максимальное и минимальное числа в массиве.
Вывести на экран максимальное и минимальное числа через пробел.

Требования:
•	В классе Solution создай статический публичный метод int[] getInts().
•	Метод getInts() должен возвращать массив целых чисел размерностью 20 элементов, заполненный с клавиатуры.
•	В методе main создай и проинициализируй массив с помощью метода getInts(), найди и выведи через пробел максимальный и минимальный элемент массива.
•	Используй цикл for.
*/
public class Task_0721___MinimaxInArrays {
    public static void main(String[] args) throws IOException {
        int maximum;
        int minimum;
        //напишите тут ваш код
        maximum = Integer.MIN_VALUE;
        minimum = Integer.MAX_VALUE;

        int[] array = getInts();

        for (int i : array) {
            if (maximum < i){
                maximum = i;
            }
        }

        for (int i : array) {
            if (minimum > i){
                minimum = i;
            }
        }

        System.out.print(maximum + " " + minimum);
    }

    //напишите тут ваш код
    public static int[] getInts() throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int[] array = new int[20];
        for (int i = 0; i < array.length; i++) {
//            System.out.print("Enter " + (i+1) + "/20 integer of list: ");
            array[i] = Integer.parseInt(reader.readLine());
        }
        return array;
    }
}
