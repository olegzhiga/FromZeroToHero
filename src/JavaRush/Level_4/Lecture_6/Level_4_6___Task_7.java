package JavaRush.Level_4.Lecture_6;

/*
Три числа

Ввести с клавиатуры три целых числа.
Одно из чисел отлично от двух других, равных между собой.
Вывести на экран порядковый номер числа, отличного от остальных.

Пример для чисел 4 6 6:
1

Пример для чисел 6 6 3:
3
*/

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Level_4_6___Task_7 {

    public static void main(String[] args) throws Exception {
        //напишите тут ваш код

        BufferedReader bfReader = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Введите первое число: ");
        int num1 = Integer.parseInt(bfReader.readLine());
        System.out.print("Введите второе число: ");
        int num2 = Integer.parseInt(bfReader.readLine());
        System.out.print("Введите третье число: ");
        int num3 = Integer.parseInt(bfReader.readLine());

        if (num1 == num2){
            System.out.println("3");
        }else if(num1 == num3){
            System.out.println("2");
        }else if (num2 == num3){
            System.out.println("1");
        }
    }
}
