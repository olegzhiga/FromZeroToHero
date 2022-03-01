package JavaRush.Level_7;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

/*
Самые-самые

1. Создай список строк.
2. Добавь в него 10 строчек с клавиатуры.
3. Узнай, какая строка в списке встретится раньше: самая короткая или самая длинная.
Если таких строк несколько, то должны быть учтены самые первые из них.
4. Выведи на экран строку из п.3. Должна быть выведена одна строка.

Требования:
•	Объяви переменную типа список строк и сразу проинициализируй ee.
•	Программа должна считывать 10 строк с клавиатуры и добавлять их в список.
•	Программа должна выводить на экран самую короткую строку, если она была раньше самой длинной.
•	Программа должна выводить на экран самую длинную строку, если она была раньше самой короткой.
•	Должна быть выведена только одна строка.
*/
public class Task_0712___MostMost {
    public static void main(String[] args) throws IOException {
        //напишите тут ваш код
        ArrayList<String> inputStringList = new ArrayList<>();
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        for (int i = 0; i < 10; i++) {
            System.out.print("Enter " + (i+1) + "/10 string of list: ");
            inputStringList.add(bf.readLine());
        }

        // Finding most largest string:
        String mostLargestString = "";
        int numOfMostLargestString = 0;
        for (int i = 0; i < inputStringList.size(); i++) {
            if (inputStringList.get(i).length() > mostLargestString.length()) {
                mostLargestString = inputStringList.get(i);
                numOfMostLargestString = i;
            }
        }
        System.out.println(mostLargestString);
        System.out.println(numOfMostLargestString);

        //Finding most shortest string:
        String mostShortestString = "000000000000000000000000000000";
        int numOfMostShortestString = 0;
        for (int i = 0; i < inputStringList.size(); i++) {
            if (inputStringList.get(i).length() < mostShortestString.length()) {
                mostShortestString = inputStringList.get(i);
                numOfMostShortestString = i;
            }
        }
        System.out.println(mostShortestString);
        System.out.println(numOfMostShortestString);

        // Finding which was the first:
        if (numOfMostLargestString > numOfMostShortestString){
            System.out.println(inputStringList.get(numOfMostShortestString));
        }else{
            System.out.println(inputStringList.get(numOfMostLargestString));
        }
    }
}
