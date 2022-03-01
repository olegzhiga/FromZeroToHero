package JavaRush.Level_4.Lecture_13;

/*
Письмо счастья

Ввести с клавиатуры имя и используя цикл for 10 раз вывести: <имя> любит меня.

Пример вывода на экран для имени Света:
Света любит меня.
Света любит меня.
Света любит меня.
Света любит меня.
Света любит меня.
Света любит меня.
Света любит меня.
Света любит меня.
Света любит меня.
Света любит меня.
*/

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Level_4_13___Task_5 {

    public static void main(String[] args) throws Exception {
        //напишите тут ваш код

        BufferedReader bfReader = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Введите имя того, кто вас любит: ");
        String name1 = bfReader.readLine();

        for (int i = 0; i < 10; i++) {
            System.out.println(name1 + " любит меня.");
        }
    }
}
