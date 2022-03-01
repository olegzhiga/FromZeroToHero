package JavaRush.Level_7;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

/*
Проверка на упорядоченность

1. Введи с клавиатуры 10 слов в список строк.
2. Определить, является ли список упорядоченным по возрастанию длины строки.
3. В случае отрицательного ответа вывести на экран индекс первого элемента, нарушающего такую упорядоченность.

Требования:
•	Объяви переменную типа список строк и сразу проинициализируй ee.
•	Считай 10 строк с клавиатуры и добавь их в список.
•	Если список упорядочен по возрастанию длины строки, то ничего выводить не нужно.
•	Если список не упорядочен по возрастанию длины строки, то нужно вывести на экран индекс первого элемента, нарушающего такую упорядоченность.
*/
public class Task_0718___OrderCheking {
    public static void main(String[] args) throws IOException {
        //напишите тут ваш код
        ArrayList<String> inputStringList = new ArrayList<>();
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        for (int i = 0; i < 10; i++) {
            System.out.print("Enter " + (i+1) + "/10 string of list: ");
            inputStringList.add(bf.readLine());
        }

        for (int i = 0; i < inputStringList.size()-1; i++) {
            if (inputStringList.get(i).length() > inputStringList.get(i+1).length()){
                System.out.println(i+1);
                break;
            }
        }
    }
}
