package JavaRush.Level_5.Lecture_12;

/*
Совершенствуем функциональность

Текущая реализация: Программа считывает два числа с клавиатуры и выводит минимальное из них на экран.
Новая задача: Программа считывает пять чисел с клавиатуры и выводит минимальное из них на экран.
*/

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Level_5_12___Task_7 {

    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int a = Integer.parseInt(reader.readLine());
        int b = Integer.parseInt(reader.readLine());
        int c = Integer.parseInt(reader.readLine());
        int d = Integer.parseInt(reader.readLine());
        int e = Integer.parseInt(reader.readLine());

        int minimum = min(a, b, c, d, e);
        System.out.println("Minimum = " + minimum);
    }

    public static int min(int a, int b, int c, int d, int e) {
        int[] arr = {a,b,c,d,e};
        int minimum = arr[0];
        for (int num:arr) {
            if (num < minimum){
                minimum = num;
            }
        }
        return minimum;
    }
}
