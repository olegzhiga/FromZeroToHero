package JavaRush.Level_7;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

/*
Перестановочка подоспела

Ввести с клавиатуры 2 числа N и M.
Ввести N строк и заполнить ими список.
Переставить M первых строк в конец списка.
Вывести список на экран, каждое значение с новой строки.

Примечание: запрещено создавать больше одного списка.

Требования:
•	Объяви переменную типа список строк и сразу проинициализируй ee.
•	Считай c клавиатуры числа N и M, считай N строк и добавь их в список.
•	Переставить M первых строк в конец списка.
•	Выведи список на экран, каждое значение с новой строки.
*/
public class Task_0720___SwapHasArrived {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        //напишите тут ваш код
        System.out.print("Enter \"N\" number: ");
        int n = Integer.parseInt(reader.readLine());
        System.out.print("Enter \"M\" number: ");
        int m = Integer.parseInt(reader.readLine());
        ArrayList<String> inputStringList = new ArrayList<>(n);

        for (int i = 0; i < n; i++) {
            System.out.print("Enter " + (i+1) + "/" + n + " string of list: ");
            inputStringList.add(reader.readLine());
        }

        for (int i = 0; i < m; i++) {
            inputStringList.add(inputStringList.get(0));
            inputStringList.remove(0);
        }

        for (String s : inputStringList) {
            System.out.println(s);
        }
    }
}
