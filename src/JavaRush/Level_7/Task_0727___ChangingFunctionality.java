package JavaRush.Level_7;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

/*
Меняем функциональность

Задача: Программа вводит строки, пока пользователь не введёт пустую строку (нажав enter). Потом она конвертирует строки в верхний регистр (Мама превращается в МАМА) и выводит их на экран.

Новая задача: Программа вводит строки, пока пользователь не введёт пустую строку (нажав enter).
Потом программа строит новый список. Если в строке чётное число букв, строка удваивается, если нечётное - утраивается.
Программа выводит содержимое нового списка на экран.

Пример ввода:
Кот
Коты
Я

Пример вывода:
Кот Кот Кот
Коты Коты
Я Я Я

Требования:
•	Программа должна считывать данные с клавиатуры.
•	Программа должна вывести столько же строк, сколько было введено.
•	Если в строке было четное число букв, то необходимо удвоить строку (как в примере).
•	Если в строке было нечетное число букв, то необходимо утроить строку (как в примере).
•	Программа должна прекращать считывать данные с клавиатуры как только пользователь введет пустую строку и нажмет Enter.
*/
public class Task_0727___ChangingFunctionality {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

// 1. Моё первое решение сразу проверяя входные данные и сразу формируя Лист:
//        ArrayList<String> strings = new ArrayList<String>();
//        while (true) {
//            String string = reader.readLine();
//            if (string == null || string.isEmpty()){
//                break;
//            } else  if (string.length() % 2 == 0){
//                strings.add(string);
//                strings.add(string);
//            } else if (string.length() % 2 != 0){
//                strings.add(string);
//                strings.add(string);
//                strings.add(string);
//            }
//        }
//        for (String s : strings) {
//            System.out.println(s);
//        }

// 2. Моё второе решение, когда сначала формируем Лист входных строк, а потом создаём новый Лист и формируем его согласно условиям:
        ArrayList<String> strings = new ArrayList<String>();
        while (true) {
            String string = reader.readLine();
            if (string == null || string.isEmpty()) break;
            strings.add(string);
        }

        ArrayList<String> resultStringsList = new ArrayList<>(strings.size()*3);
        for (int i = 0; i < strings.size(); i++) {
            if (strings.get(i).length() % 2 == 0){
                resultStringsList.add(strings.get(i));
                resultStringsList.add(strings.get(i));
            } else if (strings.get(i).length() % 2 != 0){
                resultStringsList.add(strings.get(i));
                resultStringsList.add(strings.get(i));
                resultStringsList.add(strings.get(i));
            }
        }
        for (String s : resultStringsList) {
            System.out.println(s);
        }

//        ArrayList<String> resultStrings = new ArrayList<String>();
//        for (int i = 0; i < strings.size(); i++) {
//            String string = strings.get(i);
//            resultStrings.add(string.toUpperCase());
//        }
//
//        for (int i = 0; i < resultStrings.size(); i++) {
//            System.out.println(resultStrings.get(i));
//        }
    }
}
