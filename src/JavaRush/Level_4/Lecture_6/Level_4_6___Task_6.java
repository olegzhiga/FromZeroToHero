package JavaRush.Level_4.Lecture_6;

/*
Фейс-контроль

Ввести с клавиатуры имя и возраст. Если возраст больше 20 вывести надпись "И 18-ти достаточно".
*/

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Level_4_6___Task_6 {

    public static void main(String[] args) throws Exception {
        //напишите тут ваш код

        BufferedReader bfReader = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Введите ваше имя: ");
        String name1 = bfReader.readLine();
        System.out.print("Введите ваш возраст: ");
        int age1 = Integer.parseInt(bfReader.readLine());

        System.out.println(age1 > 20 ? "И 18-ти достаточно" : "");

        if (age1 > 20){
            System.out.println("И 18-ти достаточно");
        }
    }
}
