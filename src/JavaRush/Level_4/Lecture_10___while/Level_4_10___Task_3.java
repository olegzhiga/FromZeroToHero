package JavaRush.Level_4.Lecture_10___while;

/*
Хорошего много не бывает

Ввести с клавиатуры строку и число N больше 0.
Вывести на экран строку N раз используя цикл while.
Каждое значение с новой строки.

Пример ввода:
абв
2

Пример вывода:
абв
абв
*/

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Level_4_10___Task_3 {

    public static void main(String[] args) throws Exception {
        //напишите тут ваш код

        BufferedReader bfReader = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Введите любую строку: ");
        String inputString1 = bfReader.readLine();
        System.out.print("Введите число, сколько раз вывести строку на экран: ");
        int value1 = Integer.parseInt(bfReader.readLine());

        int z = 1;
        while (z <= value1){
            System.out.println(inputString1);
            z++;
        }


    }
}
