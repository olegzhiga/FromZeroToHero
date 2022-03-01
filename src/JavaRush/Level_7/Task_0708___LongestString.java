package JavaRush.Level_7;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

/*
Самая длинная строка

1. Создай список строк.
2. Считай с клавиатуры 5 строк и добавь в список.
3. Используя цикл, найди самую длинную строку в списке.
4. Выведи найденную строку на экран. Если таких строк несколько, выведи каждую с новой строки.

Требования:
•	В методе main инициализируй существующее поле strings класса Solution новым ArrayList<>
•	Программа должна считывать 5 строк с клавиатуры и записывать их в поле strings класса Solution.
•	Программа должна выводить самую длинную строку на экран.
•	Если есть несколько строк с длиной равной максимальной, то нужно вывести каждую из них с новой строки.
*/
public class Task_0708___LongestString {
    private static ArrayList<String> strings;

    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        strings = new ArrayList<>();

        for (int i = 1; i < 6; i++) {
            System.out.print("Enter " + i + "/5 string of list: ");
            strings.add(bf.readLine());
        }

        String mostLargestString = "";
        for (String s : strings) {
            if (s.length() > mostLargestString.length()){
                mostLargestString = s;
            }
        }

        ArrayList<String> mostLargestStrings = new ArrayList<>();
        for (int i = 0; i < strings.size(); i++) {
            if (strings.get(i).length() >= mostLargestString.length()){
                mostLargestStrings.add(strings.get(i));
            }
        }
//        System.out.println(mostLargestStrings);
        for (String s : mostLargestStrings) {
            System.out.println(s);
        }
    }
}
