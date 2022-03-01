package JavaRush.Level_7;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/*
Переверни массив

1. Создать массив на 10 чисел.
2. Ввести с клавиатуры 10 чисел и записать их в массив.
3. Вывести на экран элементы массива в обратном порядке, каждое значение выводить с новой строки.

Требования:
•	Программа должна создавать массив на 10 целых чисел.
•	Программа должна считывать числа для массива с клавиатуры.
•	Программа должна выводить 10 строчек, каждую с новой строки.
•	Массив должен быть выведен на экран в обратном порядке.
*/
public class Task_0704___Flip_the_array {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        int [] inputInts = new int[10];
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));

        for (int i = 0; i < inputInts.length; i++) {
            System.out.print("Enter " + i + 1 + "/" + (inputInts.length) + " element of array: ");
            inputInts[i] = Integer.parseInt(bf.readLine());
        }
        for (int i = inputInts.length-1; i > -1; i--) {
            System.out.println(inputInts[i]);
        }
    }
}
