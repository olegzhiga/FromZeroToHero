package JavaRush.Level_3;

/*
Скромность украшает программиста

Ввести с клавиатуры имя и вывести надпись:
name зарабатывает $5,000. Ха-ха-ха!

Пример:
Тимур зарабатывает $5,000. Ха-ха-ха!
*/

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Level_3_8___Task_3 {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код

        BufferedReader bf1 = new BufferedReader(new InputStreamReader(System.in));

        System.out.print("Введите ваше имя: ");
        String name1 = bf1.readLine();

        System.out.println(name1 + " зарабатывает $5,000. Ха-ха-ха!");
    }
}
