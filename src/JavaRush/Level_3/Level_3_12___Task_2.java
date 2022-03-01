package JavaRush.Level_3;

/*
Финансовые ожидания

Ввести с клавиатуры число n.
Вывести на экран надпись "Я буду зарабатывать $n в час".

Пример:
Я буду зарабатывать $50 в час
*/

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Level_3_12___Task_2 {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код

        BufferedReader bf1= new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Введите ваш заработок в час через 3 года: ");
        int mySalaryAfter3Years = Integer.parseInt(bf1.readLine());

        System.out.println("Я буду зарабатывать $" + mySalaryAfter3Years + " в час");
    }
}
