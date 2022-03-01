package JavaRush.Level_7;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

/*
Удалить и вставить

1. Создай список строк.
2. Добавь в него 5 строк с клавиатуры.
3. Выполни 13 раз: удалить последнюю строку и вставить её в начало.
4. Используя цикл выведи содержимое результирующего списка на экран, каждое значение с новой строки.

Требования:
•	Объяви переменную типа список строк и сразу проинициализируй ee.
•	Программа должна считывать 5 строк с клавиатуры.
•	Удали последнюю строку и вставь её в начало. Повторить 13 раз.
•	Программа должна выводить список на экран, каждое значение с новой строки.
*/
public class Task_0711___DeleteAndPaste {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        ArrayList<String > stringList = new ArrayList<>();
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        for (int i = 0; i < 5; i++) {
            System.out.print("Enter " + (i+1) + "/5 string of list: ");
            stringList.add(bf.readLine());
        }

        // 13 times remove last string and insert it to the top of the list:
        for (int i = 0; i < 13; i++) {
            String tempString = stringList.get(stringList.size()-1);
            stringList.remove(stringList.size()-1);
            stringList.add(0, tempString);
        }

        // print result:
        for (String s : stringList) {
            System.out.println(s);
        }
    }
}
