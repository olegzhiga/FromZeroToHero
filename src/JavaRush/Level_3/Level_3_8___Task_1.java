package JavaRush.Level_3;

/*
План по захвату мира

Ввести с клавиатуры число и имя, вывести на экран строку:
"имя" захватит мир через "число" лет. Му-ха-ха!

Пример:
Вася захватит мир через 8 лет. Му-ха-ха!

Последовательность вводимых данных имеет большое значение.
*/

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Level_3_8___Task_1 {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код

        BufferedReader bf1 = new BufferedReader(new InputStreamReader(System.in));

        System.out.print("Введите ваше имя: ");
        String name = bf1.readLine();

        System.out.print("Введите число лет, через которое вы захватите мир: ");
        int yearConquerWorld = Integer.parseInt(bf1.readLine());

        System.out.println("" + name + " захватит мир через " + yearConquerWorld + " лет. Му-ха-ха!");
    }
}
