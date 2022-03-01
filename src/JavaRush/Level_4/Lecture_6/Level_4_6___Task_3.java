package JavaRush.Level_4.Lecture_6;

/*
Сортировка трех чисел

Ввести с клавиатуры три числа, и вывести их в порядке убывания.
Выведенные числа должны быть разделены пробелом.
*/

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Level_4_6___Task_3 {

    public static void main(String[] args) throws Exception {

        //напишите тут ваш код
        BufferedReader bfReader = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Введите первое число: ");
        int num1 = Integer.parseInt(bfReader.readLine());
        System.out.print("Введите второе число: ");
        int num2 = Integer.parseInt(bfReader.readLine());
        System.out.print("Введите третье число: ");
        int num3 = Integer.parseInt(bfReader.readLine());

        // СОРТИРОВКА ИФАМИ по убыванию:
        // громоздко и не красиво и не понятно, полюбому можно упростить !!!
        System.out.println();
        System.out.print("Сортировка ифами: ");
        if (num1 > num2 && num2 > num3)      System.out.println(num1 + " " + num2 + " " + num3);
        else if (num1 > num3 && num3 > num2) System.out.println(num1 + " " + num3 + " " + num2);
        else if (num2 > num1 && num1 > num3) System.out.println(num2 + " " + num1 + " " + num3);
        else if (num2 > num3 && num3 > num1) System.out.println(num2 + " " + num3 + " " + num1);
        else if (num3 > num2 && num2 > num1) System.out.println(num3 + " " + num2 + " " + num1);
        else if (num3 > num1 && num1 > num2) System.out.println(num3 + " " + num1 + " " + num2);
        System.out.println();

        // УПРОСТИЛ !!!
        // Занёс все переменные в массив:
        int [] nums123 = {num1, num2, num3};

        // Соритровка пузырьком по возрастанию:
        bubbleSortIncrease(nums123);

        // Сортировка пузырьком по убыванию:
        bubbleSortDecrease(nums123);
        // Вывожу отсортированный массив в строчку через пробел:
        arrayToLine(nums123);

        //Какой-то способ нормально так и не понял как он работает ...
        int [] arrTest = {9,3,6,11,0,2,7,4,8,5,1,10};
        Arrays.sort(arrTest);
        System.out.println(Arrays.toString(arrTest));
        System.out.println();


    }
    // СОРТИРОВКА ПУЗЫРЬКОМ по возрастанию:
    public static void bubbleSortIncrease(int[] array){
        for (int i = array.length-1; i >=0 ; i--) {
            for (int j = 0; j < i; j++) {
                if (array[j] > array[j+1]){
                     int swap = array[j];
                     array[j] = array[j+1];
                     array[j+1] = swap;
                }
            }
        }
        System.out.print("Сортировка пузырьком по возрастанию: " + Arrays.toString(array));
        System.out.println();
    }
    // СОРТИРОВКА ПУЗЫРЬКОМ по убыванию:
    public static void bubbleSortDecrease(int[] array){
        for (int i = 0 ; i < array.length-1; i++) {
            for (int j = i+1; j < array.length; j++) {
                if (array[i] < array[j]){
                    int swap = array[i];
                    array[i] = array[j];
                    array[j] = swap;
                }
            }
        }
        System.out.print("Сортировка пузырьком по убыванию: " + Arrays.toString(array));
        System.out.println();
        for (int i : array) {
            System.out.print(i + " ");
        }
    }
    
    // Выведение массива через пробел в строчку:
    public static void arrayToLine (int [] array){
        for (int i : array) {
            System.out.print(i + " ");
        }
    }
}
