package JavaRush.Level_4.Lecture_16;

/*
Как назвали, так назвали

Ввести с клавиатуры строку name.
Ввести с клавиатуры дату рождения (три числа): y, m, d.

Вывести на экран текст:
"Меня зовут name.
Я родился d.m.y"

Пример вывода:
Меня зовут Вася.
Я родился 15.2.1988
*/

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Level_4_16___Task_4 {

    public static void main(String[] args) throws Exception {
        //напишите тут ваш код

        BufferedReader bfReader = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Введите ваше имя: ");
        String name1 = bfReader.readLine();
        System.out.print("Введите год вашего рождения: ");
        int year = Integer.parseInt(bfReader.readLine());
        System.out.print("Введите месяц вашего рождения (цифрами): ");
        int month = Integer.parseInt(bfReader.readLine());
        System.out.print("Введите день вашего рождения: ");
        int day = Integer.parseInt(bfReader.readLine());

        System.out.println("Меня зовут " + name1 + "." + "\nЯ родился " + day + "." + month + "." + year);
    }
}
