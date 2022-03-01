package JavaRush.Level_4.Lecture_6;

/*
Максимум четырех чисел

Ввести с клавиатуры четыре числа, и вывести максимальное из них.
Если числа равны между собой, необходимо вывести любое.
*/

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Level_4_6___Task_2 {

    public static void main(String[] args) throws Exception {
        //напишите тут ваш код

        BufferedReader bfReader = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Введите первое число: ");
        int num1 = Integer.parseInt(bfReader.readLine());
        System.out.print("Введите второе число: ");
        int num2 = Integer.parseInt(bfReader.readLine());
        System.out.print("Введите третье число: ");
        int num3 = Integer.parseInt(bfReader.readLine());
        System.out.print("Введите четвёртое число: ");
        int num4 = Integer.parseInt(bfReader.readLine());

        // для вывода минимального числа:
        if (num1 <= num2 && num1 <= num3 && num1 <= num4) {
            System.out.println(num1);
        } else if (num2 <= num1 && num2 <= num3 && num2 <= num4) {
            System.out.println(num2);
        } else if (num3 <= num1 && num3 <= num2 && num3 <= num4) {
            System.out.println(num3);
        }else{
            System.out.println(num4);
        }

        // для вывода максимального числа:
        if (num1 >= num2 && num1 >= num3 && num1 >= num4) {
            System.out.println(num1);
        } else if (num2 >= num1 && num2 >= num3 && num2 >= num4) {
            System.out.println(num2);
        } else if (num3 >= num1 && num3 >= num2 && num3 >= num4) {
            System.out.println(num3);
        }else{
            System.out.println(num4);
        }
    }
}
