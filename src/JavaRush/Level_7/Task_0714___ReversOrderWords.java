package JavaRush.Level_7;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

/*
Слова в обратном порядке

Введи с клавиатуры 5 слов в список строк. Удали 3 - ий элемент списка, и выведи оставшиеся элементы в обратном порядке.

Требования:
•	Объяви переменную типа ArrayList<String> (список строк) и сразу проинициализируй ee.
•	Считай 5 строк с клавиатуры и добавь их в список.
•	Удали третий элемент списка.
•	Выведи элементы на экран, каждый с новой строки.
•	Порядок вывода должен быть обратный.
*/
public class Task_0714___ReversOrderWords {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        ArrayList<String> inputStringList = new ArrayList<>();
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        for (int i = 0; i < 5; i++) {
            System.out.print("Enter " + (i+1) + "/5 string of list: ");
            inputStringList.add(bf.readLine());
        }
        inputStringList.remove(2);

        for (int i = inputStringList.size()-1; i > -1; i--) {
            System.out.println(inputStringList.get(i));
        }
    }
}
