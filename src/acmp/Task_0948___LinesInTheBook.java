package acmp;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Task_0948___LinesInTheBook {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        String inputText = bufferedReader.readLine();

        ArrayList<Integer> inputIntegers = new ArrayList<>();
        for (String s : inputText.split("\\s")) {
            inputIntegers.add(Integer.parseInt(s));
        }

        System.out.println(inputIntegers.get(1)/inputIntegers.get(0)+1 + " " + inputIntegers.get(1)%inputIntegers.get(0));
    }
}



/*
В книге на одной странице помещается K строк.
Таким образом, на 1-й странице печатаются строки с 1-й по K-ю, на второй — с (K+1)-й по (2∙K)-ю и т.д.
Напишите программу, которая по номеру строки в тексте определяет номер страницы,
на которой будет напечатана эта строка, и порядковый номер этой строки на странице.

Входные данные
Входной файл INPUT.TXT содержит число K – количество строк,
которое печатается на странице, и число N – номер строки (1 ≤ K ≤ 200, 1 ≤ N ≤ 20000).

Выходные данные
В выходной файл OUTPUT.TXT выведите два числа – номер страницы,
на которой будет напечатана эта строка и номер строки на странице.

Примеры
№	INPUT.TXT	OUTPUT.TXT
1	50 1	    1 1
2	20 25	    2 5
3	15 43	    3 13
 */
