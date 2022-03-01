package JavaRush.Level_3;

/*
Большая и чистая

Ввести с клавиатуры три имени, вывести на экран надпись:
name1 + name2 + name3 = Чистая любовь, да-да!

Пример:
Вася + Ева + Анжелика = Чистая любовь, да-да!
*/

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Level_3_8___Task_4 {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код

        BufferedReader bf1 = new BufferedReader(new InputStreamReader(System.in));

        System.out.print("Введите первое имя: ");
        String name1 = bf1.readLine();

        System.out.print("Введите второе имя: ");
        String name2 = bf1.readLine();

        System.out.print("Введите третье имя: ");
        String name3 = bf1.readLine();

        System.out.println(name1 + " + " + name2 + " + " + name3 + " = Чистая любовь, да-да!");
    }
}
