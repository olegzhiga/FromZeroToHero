package acmp;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Task_0106___Coins {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        int allCoins = Integer.parseInt(bufferedReader.readLine());
        int countReshka = 0;
        int countOrel = 0;
        for (int i = 0; i < allCoins; i++) {
            int x = Integer.parseInt(bufferedReader.readLine());
            if (x == 1){
                countReshka++;
            }else if (x == 0){
                countOrel++;
            }
        }
        System.out.println(Math.min(countReshka, countOrel));
    }
}



/*
На столе лежат n монеток. Некоторые из них лежат вверх решкой, а некоторые – гербом.
Определите минимальное число монеток, которые нужно перевернуть,
чтобы все монетки были повернуты вверх одной и той же стороной.

Монетки
Входные данные
В первой строке входного файла INPUT.TXT записано натуральное число N (1 ≤ N ≤ 100) – число монеток.
В каждой из последующих N строк содержится одно целое число – 1 если монетка лежит решкой вверх и 0 если вверх гербом.

Выходные данные
В выходной файл OUTPUT.TXT выведите минимальное количество монет, которые нужно перевернуть.

Пример
№	INPUT.TXT	    OUTPUT.TXT
1	5               2
    1
    0
    1
    1
    0
 */
