package acmp;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;

public class Task_0021___Salary {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        String inputText = bufferedReader.readLine();

        ArrayList<Integer> inputNumbers = new ArrayList<>(3);
        for (String s : inputText.split("\\s")) {
            inputNumbers.add(Integer.parseInt(s));
        }

        Collections.sort(inputNumbers);
        System.out.println(inputNumbers.get(2) - inputNumbers.get(0));
    }
}



/*
В отделе работают 3 сотрудника, которые получают заработную плату в рублях. Требуется определить: на сколько зарплата самого высокооплачиваемого из них отличается от самого низкооплачиваемого.

Входные данные
В единственной строке входного файла INPUT.TXT записаны размеры зарплат всех сотрудников через пробел. Каждая заработная плата – это натуральное число, не превышающее 105.

Выходные данные
В выходной файл OUTPUT.TXT необходимо вывести одно целое число — разницу между максимальной и минимальной зарплатой.

Примеры
№	INPUT.TXT	        OUTPUT.TXT
1	100 500 1000	    900
2	36 11 20	        25
 */