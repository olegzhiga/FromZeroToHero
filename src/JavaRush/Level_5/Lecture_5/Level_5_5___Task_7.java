package JavaRush.Level_5.Lecture_5;

/*
Среднее арифметическое

Вводить с клавиатуры числа и вычислить среднее арифметическое.
Если пользователь ввел -1, вывести на экран среднее арифметическое всех чисел и завершить программу.
-1 не должно учитываться.

Примеры:
а) при вводе чисел
1
2
2
4
5
-1
получим вывод
2.8

б) при вводе чисел
4
3
2
1
-1
получим вывод
2.5

Подсказка: один из вариантов решения этой задачи, использовать конструкцию:

while (true) {
    int number = считываем число;
    if (проверяем, что number -1)
        break;
}
*/

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Level_5_5___Task_7 {

    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        BufferedReader bfReader = new BufferedReader(new InputStreamReader(System.in));
        double sumOfValues = 0;
        int countSteps = 0;
        while(true){
            double x = Double.parseDouble(bfReader.readLine());
            if (x == -1){
                System.out.println(sumOfValues/countSteps);
                break;
            }
            sumOfValues += x;
            countSteps++;
        }
    }
}
