package JavaRush.Level_3;

/*
Предсказание на будущее

Ввести с клавиатуры отдельно Имя, число1, число2.
Вывести надпись:
"Имя" получает "число1" через "число2" лет.

Пример:
Коля получает 3000 через 5 лет.
*/


import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Level_3_8___Task_2 {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код

        BufferedReader bf1 = new BufferedReader(new InputStreamReader(System.in));

        System.out.print("Введите ваше имя: ");
        String name1 = bf1.readLine();

        System.out.print("Введите ЗП, которую вы точно будете получать: ");
        int salary1 = Integer.parseInt(bf1.readLine());

        System.out.print("Введите число лет, через которое вы точно будете получать " + salary1 + ": ");
        int year1 = Integer.parseInt(bf1.readLine());

        System.out.println(name1 + " получает " + salary1 + " через " + year1 + " лет.");

    }
}
