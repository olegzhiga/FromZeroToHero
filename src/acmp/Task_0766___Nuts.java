package acmp;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Task_0766___Nuts {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        String inputText = bufferedReader.readLine();

        ArrayList<Integer> parsingNumbers = new ArrayList<>(3);
        for (String part : inputText.split("\\s")) {
            parsingNumbers.add(Integer.parseInt(part));
        }

        if ((parsingNumbers.get(0) * parsingNumbers.get(1)) >= parsingNumbers.get(2)){
            System.out.println("YES");
        }else{
            System.out.println("NO");
        }
    }
}



/*
Белочка собрала в лесу N шишек c орешками.
Белочка очень привередливо выбирала шишки, и брала только те, в которых ровно M орешков.
Также известно, что для пропитания зимой ей необходимо не менее K орешков.
Определите, хватит ли на зиму орешков белочке.

Входные данные
Входной файл INPUT.TXT содержит три натуральных числа: N, M и K (N, M ≤ 100, K ≤ 10 000).

Выходные данные
В выходной файл OUTPUT.TXT выведите «YES» если белочке хватит орешков и «NO» в противном случае.

Примеры
INPUT.TXT	    OUTPUT.TXT
4 5 20	        YES
4 5 21	        NO
3 2 1	        YES
 */