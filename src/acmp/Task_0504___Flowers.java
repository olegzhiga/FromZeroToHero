package acmp;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Task_0504___Flowers {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        int days = Integer.parseInt(bufferedReader.readLine());

        ArrayList<String> flowerList = new ArrayList<String>(4);
        flowerList.add("G");
        flowerList.add("C");
        flowerList.add("V");


        for (int i = 0; i < days; i++) {
            flowerList.add(0, flowerList.get(2));
            flowerList.remove(3);
        }
        System.out.println(flowerList.get(0) + flowerList.get(1) + flowerList.get(2));
    }
}



/*
В рождественский вечер на окошке стояло три цветочка, слева направо: герань, крокус и фиалка.
Каждое утро Маша вытирала окошко и меняла местами стоящий справа цветок с центральным цветком.
А Таня каждый вечер поливала цветочки и меняла местами левый и центральный цветок.
Требуется определить порядок цветов ночью по прошествии K дней.

Входные данные
Во входном файле INPUT.TXT содержится натуральное число K – число дней (K ≤ 1000).

Выходные данные
В выходной файл OUTPUT.TXT требуется вывести три английских буквы:
«G», «C» и «V» (заглавные буквы без пробелов), описывающие порядок цветов на окошке по истечении K дней (слева направо).
Обозначения: G – герань, C – крокус, V – фиалка.

Примеры
№	INPUT.TXT	OUTPUT.TXT
1	1	        VGC
2	5	        CVG
 */