package acmp;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;

public class Task_0081___Watermelons {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        int watermelonsCount = Integer.parseInt(bufferedReader.readLine());
        String inputText = bufferedReader.readLine();

        ArrayList<Integer> inputIntegers = new ArrayList<>(watermelonsCount);
        for (String s : inputText.split("\\s")) {
            inputIntegers.add(Integer.parseInt(s));
        }
        Collections.sort(inputIntegers);
        System.out.println(inputIntegers.get(0) + " " + inputIntegers.get(watermelonsCount-1));
    }
}



/*
Иван Васильевич пришел на рынок и решил купить два арбуза: один для себя, а другой для тещи.
Понятно, что для себя нужно выбрать арбуз потяжелей, а для тещи полегче.
Но вот незадача: арбузов слишком много и он не знает как же выбрать самый легкий и самый тяжелый арбуз?
Помогите ему!

Входные данные
В первой строке входного файла INPUT.TXT задано одно число N – количество арбузов.
Вторая строка содержит N чисел, записанных через пробел.
Здесь каждое число – это масса соответствующего арбуза.
Все числа натуральные и не превышают 30000.

Выходные данные
В выходной файл OUTPUT.TXT нужно вывести два числа через пробел: массу арбуза, который Иван Васильевич купит теще и массу арбуза, который он купит себе.

Пример
№	INPUT.TXT	OUTPUT.TXT
1	5
    5 1 6 5 9	1 9
 */