package JavaRush.Level_7;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/*
Массив из строчек в обратном порядке

1. Создать массив на 10 строк.
2. Ввести с клавиатуры 8 строк и сохранить их в массив.
3. Вывести содержимое всего массива (10 элементов) на экран в обратном порядке. Каждый элемент - с новой строки.

Требования:
•	Программа должна создавать массив на 10 строк.
•	Программа должна считывать 8 строк для массива с клавиатуры.
•	Программа должна выводить на экран 10 строк, каждую с новой строки.
•	Программа должна выводить на экран массив (10 элементов) в обратном порядке.
*/
public class Task_0702___String_array {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        String[] stringArray = new String[10];
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));

        for (int i = 0; i < stringArray.length-2; i++) {
            System.out.print("Enter " + i + "/" + (stringArray.length-2) + " element of array: ");
            stringArray[i] = bf.readLine();
        }
        for (int i = stringArray.length-1; i > -1 ; i--) {
            System.out.println(stringArray[i]);
        }
    }
}
