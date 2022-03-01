package JavaRush.Level_7;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

/*
Выражаемся покороче

1. Создай список строк.
2. Считай с клавиатуры 5 строк и добавь в список.
3. Используя цикл, найди самую короткую строку в списке.
4. Выведи найденную строку на экран.
5. Если таких строк несколько, выведи каждую с новой строки.

Требования:
•	Объяви переменную типа список строк и сразу проинициализируй ee.
•	Программа должна считывать 5 строк с клавиатуры и записывать их в список.
•	Программа должна выводить самую короткую строку на экран.
•	Если есть несколько строк с длиной равной минимальной, то нужно вывести каждую из них с новой строки.
*/
public class Task_0709___BriefTalk {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        ArrayList<String> stringList = new ArrayList<>();
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        for (int i = 0; i < 5; i++) {
            System.out.print("Enter " + (i+1) + "/5 string of array: ");
            stringList.add(bf.readLine());
        }

        // finding shortest string:
        String shortestString = "000000000000000000000000000000";
        for (String s : stringList) {
            if (s.length() < shortestString.length()){
                shortestString = s;
            }
        }

        // check the same length strings:
        ArrayList<String> shortestStrings = new ArrayList<>();
        for (String s : stringList) {
            if (s.length() == shortestString.length()) {
                shortestStrings.add(s);
            }
        }

        // print result:
        for (String s : shortestStrings) {
            System.out.println(s);
        }
    }
}
