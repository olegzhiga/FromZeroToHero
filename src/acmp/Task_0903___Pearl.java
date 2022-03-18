package acmp;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/*
В шкатулке хранится разноцветный бисер (или бусины). Все бусины имеют одинаковую форму, размер и вес.
Бусины могут быть одного из N различных цветов. В шкатулке много бусин каждого цвета.

Требуется определить минимальное число бусин, которые можно не глядя вытащить из шкатулки так,
чтобы среди них гарантированно были две бусины одного цвета.

Входные данные
Входной файл INPUT.TXT содержит одно натуральное число N - количество цветов бусин (1 ≤ N ≤ 109).

Выходные данные
В выходной файл OUTPUT.TXT выведите ответ на поставленную задачу.

Пример
INPUT.TXT	    OUTPUT.TXT
3	            4
 */
public class Task_0903___Pearl {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        int i = Integer.parseInt(bufferedReader.readLine());
        System.out.println(i+1);
    }
}
