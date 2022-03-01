package JavaRush.Level_4.Lecture_16;

/*
Как-то средненько

Ввести с клавиатуры три числа, вывести на экран среднее из них.
Т.е. не самое большое и не самое маленькое.
Если все числа равны, вывести любое из них.
*/

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Level_4_16___Task_2 {

    public static void main(String[] args) throws IOException {
        //напишите тут ваш код
        BufferedReader bfReader = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Введите первое число: ");
        int value1 = Integer.parseInt(bfReader.readLine());
        System.out.print("Введите второе число: ");
        int value2 = Integer.parseInt(bfReader.readLine());
        System.out.print("Введите третье число: ");
        int value3 = Integer.parseInt(bfReader.readLine());

        int [] arrValues = {value1, value2, value3};
        System.out.println(Arrays.toString(arrValues));

        Level_4_16___Task_2 lv = new Level_4_16___Task_2();
        lv.averageNumberOfThreeByBubbleSort(arrValues);
        lv.averageNumberOfThreeByArraysSort(arrValues);

    }
    // Finding average number of 3 input numbers: (почему-то работает в обратную сторону от большего к меньшему)
    public void averageNumberOfThreeByBubbleSort (int [] arrValues) {
        for (int i = 0; i < arrValues.length; i++) {
            for (int j = 0; j < arrValues.length-1; j++) {
                if (arrValues[i] > arrValues[j]){
                    int temp = arrValues[i];
                    arrValues[i] = arrValues[j];
                    arrValues[j] = temp;
                }
            }
        }
        System.out.println(Arrays.toString(arrValues));
        System.out.println("Median value is: " + arrValues[1]);
    }

    public void averageNumberOfThreeByArraysSort (int [] arrayValues){
        Arrays.sort(arrayValues);
        System.out.println(Arrays.toString(arrayValues));
        System.out.println("Median value is: " + arrayValues[1]);
    }
}
