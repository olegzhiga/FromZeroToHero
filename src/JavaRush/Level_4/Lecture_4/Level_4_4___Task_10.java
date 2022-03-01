package JavaRush.Level_4.Lecture_4;

/*
Существует ли пара?

Ввести с клавиатуры три целых числа.
Определить, имеется ли среди них хотя бы одна пара равных между собой чисел.
Если такая пара существует, вывести на экран числа через пробел.
Если все три числа равны между собой, то вывести все три.

Примеры:
а) при вводе чисел
1
2
2
получим вывод
2 2

б) при вводе чисел
2
2
2
получим вывод
2 2 2
*/

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Level_4_4___Task_10 {

    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        BufferedReader bfReader = new BufferedReader(new InputStreamReader(System.in));

        System.out.print("Введите первое целое число: ");
        int a = Integer.parseInt(bfReader.readLine());
        System.out.print("Введите второе целое число: ");
        int b = Integer.parseInt(bfReader.readLine());
        System.out.print("Введите третье целое число: ");
        int c = Integer.parseInt(bfReader.readLine());

        if (a == b && a == c){
            System.out.println(a + " " + b + " " + c);
        }else if (a == b){
            System.out.println(a + " " + b);
        }else if (a == c){
            System.out.println(a + " " + c);
        }else if (b == c){
            System.out.println(b + " " + c);
        }else{
            System.out.println("Введёные числа не равны!");
        }

    }
}
