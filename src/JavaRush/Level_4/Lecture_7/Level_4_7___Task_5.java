package JavaRush.Level_4.Lecture_7;

/*
Положительные и отрицательные числа

Ввести с клавиатуры три целых числа.
Вывести на экран количество положительных и количество отрицательных чисел в исходном наборе,
в следующем виде:
"количество отрицательных чисел: а", "количество положительных чисел: б",
где а, б - искомые значения.

Пример:
а) при вводе чисел
2
5
6
получим вывод
количество отрицательных чисел: 0
количество положительных чисел: 3

Пример:
б) при вводе чисел
-2
-5
6
получим вывод
количество отрицательных чисел: 2
количество положительных чисел: 1
*/

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Level_4_7___Task_5 {

    public static void main(String[] args) throws Exception {
        //напишите тут ваш код

        BufferedReader bfReader = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Введите первое целое число: ");
        int value1 = Integer.parseInt(bfReader.readLine());
        System.out.print("Введите второе целое число: ");
        int value2 = Integer.parseInt(bfReader.readLine());
        System.out.print("Введите третье целое число: ");
        int value3 = Integer.parseInt(bfReader.readLine());

        int[] arr = {value1, value2, value3};
        int positiveValue = 0;
        int zeroValue = 0;
        int negativeNumber = 0;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > 0 ){
                positiveValue++;
            }else if (arr[i] < 0){
                negativeNumber++;
            }else{
                zeroValue++;
            }
        }
        System.out.println("количество отрицательных чисел: " + negativeNumber);
        System.out.println("количество положительных чисел: " + positiveValue);

        System.out.println();

        for (int i : arr) {
            if (i > 0) {
                positiveValue++;
            } else if (i < 0) {
                negativeNumber++;
            } else {
                zeroValue++;
            }
        }
        System.out.println("количество отрицательных чисел: " + negativeNumber);
        System.out.println("количество положительных чисел: " + positiveValue);
    }
}
