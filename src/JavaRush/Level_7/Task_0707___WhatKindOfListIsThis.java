package JavaRush.Level_7;

import java.util.ArrayList;

/*
Что за список такой?
1. Создай список строк.
2. Добавь в него 5 различных строк.
3. Выведи его размер на экран.
4. Используя цикл выведи его содержимое на экран, каждое значение с новой строки.

Требования:
•	Программа не должна ничего считывать с клавиатуры.
•	Объяви переменную типа ArrayList<String> (список строк) и сразу проинициализируй ee.
•	Программа должна добавить 5 любых строк в список.
•	Программа должна вывести размер списка на экран.
•	Программа должна вывести содержимое списка на экран, каждое значение с новой строки.
*/
public class Task_0707___WhatKindOfListIsThis {
    public static void main(String[] args) {
        //напишите тут ваш код
        ArrayList<String> tempList = new ArrayList<>();
        tempList.add("one");
        tempList.add("two");
        tempList.add("three");
        tempList.add("four");
        tempList.add("five");

        System.out.println(tempList.size());
        for (String s : tempList) {
            System.out.println(s);
        }
    }
}
