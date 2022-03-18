package acmp;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Task_0025___MoreLess {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        int a = Integer.parseInt(bufferedReader.readLine());
        int b = Integer.parseInt(bufferedReader.readLine());

        if (a > b){
            System.out.println(">");
        }else if (a < b){
            System.out.println("<");
        }else{
            System.out.println("=");
        }
    }
}



/*
Одна из основных операций с числами – их сравнение.
Мы подозреваем, что вы в совершенстве владеете этой операцией и можете сравнивать любые числа,
в том числе и целые. В данной задаче необходимо сравнить два целых числа.

Входные данные
В двух строчках входного файла INPUT.TXT записаны числа A и B,
не превосходящие по абсолютной величине 2×109.

Выходные данные
Запишите в выходной файл OUTPUT.TXT один символ "<", если A < B, ">", если A > B и "=", если A=B.

Примеры
INPUT.TXT	    OUTPUT.TXT
5
7	            <

-7
-12	            >

13
13	            =
 */