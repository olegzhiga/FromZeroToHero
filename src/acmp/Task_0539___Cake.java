package acmp;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Task_0539___Cake {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(bufferedReader.readLine());

        if (N == 1){
            System.out.println(0);
        }else if (N % 2 == 0){
            System.out.println(N/2);
        } else {
            System.out.println(N);
        }
    }
}



/*
На свой день рождения Петя купил красивый и вкусный торт, который имел идеально круглую форму.
Петя не знал, сколько гостей придет на его день рождения,
поэтому вынужден был разработать алгоритм, согласно которому он сможет быстро разрезать торт на N равных частей.
Следует учесть, что разрезы торта можно производить как по радиусу, так и по диаметру.

Помогите Пете решить эту задачу, определив наименьшее число разрезов торта по заданному числу гостей.

Входные данные
Входной файл INPUT.TXT содержит натуральное число N – число гостей, включая самого виновника торжества (N ≤ 1000).

Выходные данные
В выходной файл OUTPUT.TXT выведите минимально возможное число разрезов торта.

Примеры
№	INPUT.TXT	OUTPUT.TXT
1	2	        1
2	3	        3
 */
