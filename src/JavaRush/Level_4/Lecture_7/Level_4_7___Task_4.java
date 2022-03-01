package JavaRush.Level_4.Lecture_7;

/*
Положительное число

Ввести с клавиатуры три целых числа. Вывести на экран количество положительных чисел среди этих трех.

Примеры:
а) при вводе чисел
-4
6
6
получим вывод
2

б) при вводе чисел
-6
-6
-3
получим вывод
0

в) при вводе чисел
0
1
2
получим вывод
2
*/

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Level_4_7___Task_4 {

    public static void main(String[] args) throws Exception {
        //напишите тут ваш код

        BufferedReader bfReader = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Введите первое целое число: ");
        int value1 = Integer.parseInt(bfReader.readLine());
        System.out.print("Введите второе целое число: ");
        int value2 = Integer.parseInt(bfReader.readLine());
        System.out.print("Введите третье целое число: ");
        int value3 = Integer.parseInt(bfReader.readLine());

        int [] arrValues = {value1, value2, value3};
        int positiveNumber = 0;
        for (int arrValue : arrValues) {
            if (arrValue > 0) {
                positiveNumber++;
            }
        }
        System.out.println(positiveNumber);

//        // полюбому можно как-то упростить !
//        if (value1 > 0 && value2 > 0 && value3 > 0){
//            System.out.println(3);
//        }else if ((value1 > 0 && value2 > 0 && value3 < 0) || (value1 > 0 && value2 < 0 && value3 > 0) || (value1 < 0 && value2 > 0 && value3 > 0)){
//            System.out.println(2);
//        }else if ((value1 > 0 && value2 < 0 && value3 < 0) || (value1 < 0 && value2 > 0 && value3 < 0) || (value1 < 0 && value2 < 0 && value3 > 0)){
//            System.out.println(1);
//        }else if ((value1 < 0 && value2 < 0 && value3 < 0)){
//            System.out.println(0);
//        }
    }
}
