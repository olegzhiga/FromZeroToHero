package JavaRush.Level_5.Lecture_12;

/*
Задача по алгоритмам Ӏ Java Syntax: 5 уровень, 12 лекция

Написать программу, которая:
1. считывает с консоли число N, которое должно быть больше 0
2. потом считывает N чисел с консоли
3. выводит на экран максимальное из введенных N чисел.
*/

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Level_5_12___Task_8 {

    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(reader.readLine());
        if (n <= 0){
            return;
        }

        //напишите тут ваш код
        int [] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(reader.readLine());
        }
        int maximum = arr[0];
        for (int i = 1; i < n; i++) {
            if (arr[i] > maximum){
                maximum = arr[i];
            }
        }


//        for (int i = 0; i < n; i++) {
//            int a = Integer.parseInt(reader.readLine());
//            if (a <= 0){
//                break;
//            }else if (a >= maximum){
//                maximum = a;
//            }
//        }

        System.out.println(maximum);
    }
}
/*
if (a > 0 && a >= maximum){
    maximum = a;
}
 */
