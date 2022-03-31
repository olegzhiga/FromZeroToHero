package acmp;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Task_0756___FishingNet {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        String inputText = bufferedReader.readLine();

        ArrayList<Integer> inputIntegers = new ArrayList<>(2);
        for (String s : inputText.split("\\s")) {
            inputIntegers.add(Integer.parseInt(s));
        }

        System.out.println((inputIntegers.get(0) - 1) * (inputIntegers.get(1) - 1));
    }
}



/*
Браконьер Петрович использует распространенный незаконный способ рыбалки с использованием рыболовной сети.
Но проблема в том, что крупная рыба часто рвет сеть и приходится ее восстанавливать.
Однажды Петрович задумался: какое максимальное количество повреждений может быть в рыболовной сети,
таких, что сеть не будет разорвана на части? Вам предстоит помочь ему в вычислениях.

Сеть имеет прямоугольную форму размером M×N узлов, все смежные узлы соединены леской.
Под разрывом будем понимать только единичный обрыв лески между двумя смежными узлами сети.

Например, если сеть имеет размер 2х2, то внешний вид сети будет напоминать квадрат,
где допустим только один разрыв в одном из четырех возможных соединений,
т.к. любые 2 разрыва приведут к разделению сети на 2 части.

Входные данные
Входной файл INPUT.TXT содержит два целых числа M и N – размеры рыболовной сети (1 ≤ M, N ≤ 10 000).

Выходные данные
В выходной файл OUTPUT.TXT выведите максимальное число разрывов заданной сети,
которые не приведут к распадению рыболовной снасти Петровича.

Примеры
№	INPUT.TXT	OUTPUT.TXT
1	2 2	        1
2	2 3	        2
 */
