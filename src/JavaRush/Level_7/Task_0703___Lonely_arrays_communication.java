package JavaRush.Level_7;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/*
Общение одиноких массивов

1. Создать массив на 10 строк.
2. Создать массив на 10 чисел.
3. Ввести с клавиатуры 10 строк, заполнить ими массив строк.
4. В каждую ячейку массива чисел записать длину строки из массива строк, индекс/номер ячейки которой совпадает с текущим индексом из массива чисел.

Вывести содержимое массива чисел на экран, каждое значение выводить с новой строки.

Требования:
•	Программа должна создавать массив на 10 строк.
•	Программа должна создавать массив на 10 целых чисел.
•	Программа должна считывать строки для массива с клавиатуры.
•	Программа должна в массив чисел записать длины строк из массива строк, а затем их вывести на экран.
*/
public class Task_0703___Lonely_arrays_communication {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        int [] lengthArray = new int[10];
        String [] wordsArray = new String[10];
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));

        for (int i = 0; i < wordsArray.length; i++) {
            System.out.print("Enter " + i + "/" + (wordsArray.length-1) + " element of array: ");
            wordsArray[i] = bf.readLine();
        }
        for (int i = 0; i < lengthArray.length; i++) {
            lengthArray[i] = wordsArray[i].length();
        }
        for (int i : lengthArray) {
            System.out.println(i);
        }
    }
}
