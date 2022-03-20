package acmp;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Task_0092___Cranes {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        int S = Integer.parseInt(bufferedReader.readLine());

        System.out.println(S/6 + " " + 2*S/3 + " " + S/6);
    }
}



/*
Петя, Катя и Сережа делают из бумаги журавликов.
Вместе они сделали S журавликов.
Сколько журавликов сделал каждый ребенок,
если известно, что Петя и Сережа сделали одинаковое количество журавликов,
а Катя сделала в два раза больше журавликов, чем Петя и Сережа вместе?

Входные данные
В единственной строке входного файла INPUT.TXT записано одно натуральное число S – общее количество сделанных журавликов (S < 106).

Выходные данные
В единственную строку выходного файла OUTPUT.TXT нужно вывести три числа, разделенных пробелами – количество журавликов, которые сделал каждый ребенок (Петя, Катя и Сережа).

Примеры
№	INPUT.TXT	OUTPUT.TXT
1	6	        1 4 1
2	24	        4 16 4
3	60	        10 40 10
 */
