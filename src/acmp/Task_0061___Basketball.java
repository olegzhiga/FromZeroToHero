package acmp;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Task_0061___Basketball {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        String[] string1 = bufferedReader.readLine().split("\\s");
        String[] string2 = bufferedReader.readLine().split("\\s");
        String[] string3 = bufferedReader.readLine().split("\\s");
        String[] string4 = bufferedReader.readLine().split("\\s");

        int command1 = Integer.parseInt(string1[0]) + Integer.parseInt(string2[0]) + Integer.parseInt(string3[0]) + Integer.parseInt(string4[0]);
        int command2 = Integer.parseInt(string1[1]) + Integer.parseInt(string2[1]) + Integer.parseInt(string3[1]) + Integer.parseInt(string4[1]);

        if(command1 > command2){
            System.out.println(1);
        }else if(command1 < command2){
            System.out.println(2);
        }else{
            System.out.println("DRAW");
        }
    }
}



/*
Известны результаты каждой из 4х четвертей баскетбольной встречи.
Нужно определить победителя матча. Побеждает команда, набравшая больше очков в течение всего матча.

Входные данные
Входной файл INPUT.TXT содержит 4 строки,
в каждой строке находится два целых числа a и b – итоговый счет в соответствующей четверти.
а – количество набранных очков за четверть первой командой,
b – количество очков, набранных за четверть второй командой. (0 ≤ a,b ≤ 100).

Выходные данные
В выходной файл OUTPUT.TXT выведите номер выигравшей команды, в случае ничьей следует вывести «DRAW».

Примеры
№	INPUT.TXT	    OUTPUT.TXT
1	26 17           1
    13 15
    19 11
    14 16

2	14 15           2
    17 18
    20 20
    15 17

3	15 16           DRAW
    18 17
    10 12
    14 12
 */
