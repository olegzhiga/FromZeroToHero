package acmp;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Task_0970___SomethingChanges {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        String inputText = bufferedReader.readLine();

        ArrayList<Integer> inputIntegers = new ArrayList<>();
        for (String s : inputText.split("\\s")) {
            inputIntegers.add(Integer.parseInt(s));
        }

        if( inputIntegers.get(0) + inputIntegers.get(1) == inputIntegers.get(2) ||
            inputIntegers.get(0) + inputIntegers.get(2) == inputIntegers.get(1) ||
            inputIntegers.get(1) + inputIntegers.get(2) == inputIntegers.get(0)){
            System.out.println("YES");
        }else{
            System.out.println("NO");
        }
    }
}



/*
Всем известно, что «от перестановки слагаемых сумма не изменяется».
Однако, случается и так, что перестановка двух чисел приводит к более интересным последствиям.

Пусть, например, заданы три числа: a1, a2, a3. Рассмотрим равенство a1+ a2= a3.
Оно может быть неверным (например, если a1= 1, a2= 4, a3= 3),
однако может стать верным, если поменять некоторые числа местами
(например, если поменять местами a2 и a3, оно обратится в равенство 1 + 3 = 4).

Ваша задача – по заданным трем числам определить: можно ли их переставить так,
чтобы сумма первых двух равнялась третьему.

Входные данные
Входной файл INPUT.TXT содержит три целых числа: a1, a2, a3 (−108 ≤ a1, a2, a3 ≤ 108).

Выходные данные
В выходной файл OUTPUT.TXT выведите слово «YES», если заданные числа можно переставить так,
чтобы сумма первых двух равнялась третьему. В противном случае выведите в выходной файл слово «NO».

Примеры
№	INPUT.TXT	OUTPUT.TXT
1	3 5 2	    YES
2	2 2 5	    NO
3	2 2 4	    YES
 */
