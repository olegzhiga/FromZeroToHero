package acmp;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Task_0773___Gulliver {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        String inputText = bufferedReader.readLine();

        ArrayList<Integer> parsingNumbers = new ArrayList<>(2);
        for (String s : inputText.split("\\s")) {
            parsingNumbers.add(Integer.parseInt(s));
        }

        System.out.println(parsingNumbers.get(0) * parsingNumbers.get(0) * parsingNumbers.get(1));
    }
}



/*
Из книги Джонатана Свифта мы знаем, что тот Гулливер посетил страну «Лилипутию», где живут лилипуты, окруженные вещами, животными и заводами небольшого размера. Сначала лилипуты боялись Гулливера, но позже они поняли, что такое соседство приносит им большую выгоду, и они стали помогать ему. Например, лилипуты делали кровать для Гулливера из своих маленьких матрацев, сшитых вместе. Лилипутам были известны размеры Гулливера. Довольно быстро они смогли просчитать количество матрацев, необходимых для шитья большого матраца. Но у них постоянно возникали сложности с их небольшим ростом и стеля постель, они иногда не могли сшить достаточно толстый матрац.

Входные данные
Входной файл INPUT.TXT содержит два целых числа, которые разделены пробелом: K – коэффициент, отражающий во сколько раз Гулливер больше лилипутов, и M – количество слоев матрацев (2 ≤ K, M ≤ 100).

Выходные данные
В выходной файл OUTPUT.TXT выведите количество матрацев лилипутов, необходимых для построения матраца для Гулливера.

Примеры
№	INPUT.TXT	    OUTPUT.TXT
1	2 2	            8
2	12 4	        576
 */