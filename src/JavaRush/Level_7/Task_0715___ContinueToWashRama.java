package JavaRush.Level_7;

import java.util.ArrayList;

/*
Продолжаем мыть раму

1. Создай список из слов "мама", "мыла", "раму".
2. После каждого слова вставь в список строку, содержащую слово "именно".
3. Вывести результат на экран, каждый элемент списка с новой строки.

Требования:
•	Программа не должна считывать данные с клавиатуры.
•	Объяви переменную типа список строк и сразу проинициализируй ee.
•	Добавь в список слова: «мама», «мыла», «раму».
•	После каждого слова добавь в список строку, содержащую слово «именно».
•	Выведи элементы списка на экран, каждый с новой строки.
*/
public class Task_0715___ContinueToWashRama {
    public static void main(String[] args) {
        //напишите тут ваш код
        ArrayList<String> stringList = new ArrayList<>();
        stringList.add("мама");
        stringList.add("мыла");
        stringList.add("раму");

        for (int i = 0; i < stringList.size()+1; i++) {
            if (i % 2 != 0){
                stringList.add(i, "именно");
            }
        }
        for (String s : stringList) {
            System.out.println(s);
        }
    }
}
