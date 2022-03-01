package JavaRush.Level_7;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

/*
Вывести числа в обратном порядке

Ввести с клавиатуры 10 чисел и заполнить ими список.
Вывести их в обратном порядке. Каждый элемент - с новой строки.
Использовать только цикл for.

Подсказка:
Не забудь импортировать класс: java.util.ArrayList;

Требования:
•	Объяви переменную типа список целых чисел и сразу проинициализируй ee.
•	Считай 10 целых чисел с клавиатуры и добавь их в список.
•	Выведи числа в обратном порядке.
•	Используй цикл for.
*/
public class Task_0719___PrintNumbersInReverseOrder {
    public static void main(String[] args) throws IOException {
        //напишите тут ваш код
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<Integer> inputIntegerList = new ArrayList<>();

        for (int i = 0; i < 10; i++) {
            System.out.print("Enter " + (i+1) + "/10 integer of list: ");
            inputIntegerList.add(Integer.parseInt(reader.readLine()));
        }

        for (int i = inputIntegerList.size()-1; i > -1; i--) {
            System.out.println(inputIntegerList.get(i));
        }
    }
}
