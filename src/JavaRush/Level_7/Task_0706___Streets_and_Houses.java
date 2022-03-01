package JavaRush.Level_7;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/*
Улицы и дома

1. Создать массив на 15 целых чисел.
2. Ввести в него значения с клавиатуры.
3. Пускай индекс элемента массива является номером дома, а значение - числом жителей, проживающих в доме.
Дома с нечетными номерами расположены на одной стороне улицы, с четными - на другой. Выяснить, на какой стороне улицы проживает больше жителей.
4. Вывести на экран сообщение: "В домах с нечетными номерами проживает больше жителей." или "В домах с четными номерами проживает больше жителей."

Примечание:
дом с порядковым номером 0 считать четным.

Требования:
•	Программа должна создавать массив на 15 целых чисел.
•	Программа должна считывать числа для массива с клавиатуры.
•	Программа должна вывести сообщение "В домах с нечетными номерами проживает больше жителей.", если сумма нечетных элементов массива больше суммы четных.
•	Программа должна вывести сообщение "В домах с четными номерами проживает больше жителей.", если сумма четных элементов массива больше суммы нечетных.
•	Программа не должна выводить текст в консоль, если количество жителей на каждой стороне - одинаковое.
*/
public class Task_0706___Streets_and_Houses {
    public static void main(String[] args) throws IOException {
        //напишите тут ваш код
        int [] intArray = new int[15];
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        for (int i = 0; i < intArray.length; i++) {
            System.out.print("Enter " + i + "/" + (intArray.length-1) + " element of array: ");
            intArray[i] = Integer.parseInt(bf.readLine());
        }
        int evenHouses = 0;
        int oddHouses = 0;

        for (int i = 0; i < intArray.length; i++) {
            if (i % 2 == 0){
                evenHouses+=intArray[i];
            }
        }
        System.out.println(evenHouses);

        for (int i = 0; i < intArray.length; i++) {
            if (i % 2 != 0){
                oddHouses+=intArray[i];
            }
        }
        System.out.println(oddHouses);

        if (evenHouses > oddHouses){
            System.out.println("В домах с четными номерами проживает больше жителей.");
        }else if (evenHouses < oddHouses){
            System.out.println("В домах с нечетными номерами проживает больше жителей.");
        }
    }
}
