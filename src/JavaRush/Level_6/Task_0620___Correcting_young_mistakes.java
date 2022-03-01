package JavaRush.Level_6;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/*
Исправляем ошибки юности

Задача: Программа вводит два числа с клавиатуры и выводит их максимум в виде "The max is 25".

Требования:
•	Программа должна считывать данные с клавиатуры.
•	Программа должна выводить результат на экран.
•	Текст выведенный на экран должен начинаться с «The max is».
•	Текст выведенный на экран должен заканчиваться максимумом из 2х введенных чисел.
*/
public class Task_0620___Correcting_young_mistakes {
    public static int max = 100;

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String max = "The max is ";
        int a = Integer.parseInt(reader.readLine());
        int b = Integer.parseInt(reader.readLine());
        Task_0620___Correcting_young_mistakes.max = a > b ? a : b;

        System.out.println(max + Task_0620___Correcting_young_mistakes.max);
    }
//    public static int max = 100;
//
//    public static void main(String[] args) throws IOException {
//        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
//
//        String s = "The max is ";
//        int a = Integer.parseInt(reader.readLine());
//        int b = Integer.parseInt(reader.readLine());
//        if (max < a || max < b){
//            System.out.println("Одно из чисел - трёхзначное!");
//        } else {
//            System.out.println(s + Math.max(a, b));
//        }
//    }
}
