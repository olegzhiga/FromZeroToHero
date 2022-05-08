package acmp;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Task_0777___Alarm {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        String inputText = bufferedReader.readLine();

        ArrayList<Integer> inputIntegers = new ArrayList<>(2);
        for (String s : inputText.split("\\s")) {
            inputIntegers.add(Integer.parseInt(s));
        }

        System.out.println(inputIntegers.get(1) - inputIntegers.get(0));
    }
}



/*
Известный исследователь Чарльз Ф. Мантц, устав от долгого путешествия через джунгли,
лег спать в 10 часов вечера, но предварительно он завел будильник на 12 часов следующего дня.
Но проспать 14 часов ему не удалось – будильник зазвонил через 2 часа.
Исследователь забыл, что на будильнике, имеющем 12-тичасовой циферблат,
можно задать время до звонка только менее 12 часов.

Напишите программу, которая определяет, сколько часов успеет проспать исследователь,
прежде чем будильник его разбудит.

Входные данные
В единственной строке входного файла INPUT.TXT записаны два целых числа S и T (1 ≤ S, T ≤ 12; S ≠ T),
разделенные одним пробелом - час, когда исследователь лег спать, и час, на который он установил будильник.

Выходные данные
В единственную строку выходного файла OUTPUT.TXT нужно вывести одно целое число – через сколько часов зазвонит будильник.

Пример
№	INPUT.TXT	OUTPUT.TXT
1	10 12	    2
 */