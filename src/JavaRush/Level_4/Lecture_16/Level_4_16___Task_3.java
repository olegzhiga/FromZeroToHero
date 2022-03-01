package JavaRush.Level_4.Lecture_16;

/*
Суммирование

Вводить с клавиатуры числа.
Если пользователь ввел -1, вывести на экран сумму всех введенных чисел и завершить программу.
-1 должно учитываться в сумме.

Подсказка: один из вариантов решения этой задачи, использовать конструкцию:

while (true) {
    int number = считываем число;
    if (проверяем, что number -1)
        break;
}
*/

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Level_4_16___Task_3 {

    public static void main(String[] args) throws Exception {
        //напишите тут ваш код

        BufferedReader bfReader = new BufferedReader(new InputStreamReader(System.in));
        int sum = 0;
        while (true){
            System.out.print("Введите любое целое число: ");
            int value = Integer.parseInt(bfReader.readLine());
            sum += value;
            if (value == -1){
                System.out.println(sum);
                break;
            }
        }
    }
}
