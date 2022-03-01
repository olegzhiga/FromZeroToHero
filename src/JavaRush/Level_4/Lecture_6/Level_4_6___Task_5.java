package JavaRush.Level_4.Lecture_6;

/*
18+

Ввести с клавиатуры имя и возраст. Если возраст меньше 18 вывести надпись "Подрасти еще".
*/

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Level_4_6___Task_5 {

    public static void main(String[] args) throws Exception {
        //напишите тут ваш код

        BufferedReader bfReader = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Введите ваше имя: ");
        String name1 = bfReader.readLine();
        System.out.print("Введите ваш возраст: ");
        int age1 = Integer.parseInt(bfReader.readLine());

        System.out.println(age1 >= 18 ? "" : "Подрасти еще");
        System.out.println(age1 < 18 ? "Подрасти еще" : "");

        if (age1 < 18){
            System.out.println("Подрасти ещё");
        }
    }
}
