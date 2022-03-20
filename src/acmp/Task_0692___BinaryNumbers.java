package acmp;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Task_0692___BinaryNumbers {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(bufferedReader.readLine());
        int K = 1;

        while (K < N) {
            K *= 2;
            //System.out.println(K);
        }
        if (N > 10000){
            System.out.println("NO");
        }else if (K == N){
            System.out.println("YES");
        }else{
            System.out.println("NO");
        }
    }
}



/*
Говорят, что плохой программист – это тот, кто считает, что в одном килобайте 1000 байт,
а хороший программист – это тот, кто полагает, что в одном километре 1024 метра.

Многим эта шутка понятна, так как все знают, что в процессах,
связанных с информатикой и компьютерной техникой, фигурирует множество значений,
выражаемых степенью двойки, то есть чисел вида 2K, где K – некоторое неотрицательное целое число.
Назовем такие числа бинарными. Это такие числа как 2, 4, 8, 16, 32 и т.д.
Действительно, когда речь идет о размере памяти или о разрешении экрана монитора,
то мы часто наталкиваемся на бинарные числа. Все это связано с принципом хранения информации в памяти ЭВМ.

Задано целое число N. Требуется определить, является ли оно бинарным.

Входные данные
Входной файл INPUT.TXT содержит единственное целое число N, не превосходящее 10000 по абсолютной величине.

Выходные данные
В выходной файл OUTPUT.TXT выведите YES, если заданное число является бинарным, и NO в противном случае.

Примеры
№	INPUT.TXT	OUTPUT.TXT
1	1024	    YES
2	23	        NO
 */
