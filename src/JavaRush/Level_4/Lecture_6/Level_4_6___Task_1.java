package JavaRush.Level_4.Lecture_6;

/*
Минимум двух чисел Ӏ Java Syntax: 4 уровень, 6 лекция

Ввести с клавиатуры два целых числа, и вывести на экран минимальное из них.
Если два числа равны между собой, необходимо вывести любое.
*/

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Level_4_6___Task_1 {

    public static void main(String[] args) throws Exception {
        //напишите тут ваш код

        BufferedReader bfReader = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Введите первое число: ");
        int a = Integer.parseInt(bfReader.readLine());
        System.out.print("Введите второе число: ");
        int b = Integer.parseInt(bfReader.readLine());

        // два одинаковых вывода минимального числа:
        System.out.println(a <= b ? a : b);
        System.out.println(Math.min(a, b));

        // два одинаковых вывода максимального числа:
        System.out.println(a >= b ? a : b);
        System.out.println(Math.max(a, b));
    }
}
