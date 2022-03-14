package acmp;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
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
public class Task_766___Nuts {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(bufferedReader.readLine());
        int M = Integer.parseInt(bufferedReader.readLine());
        int K = Integer.parseInt(bufferedReader.readLine());

        if ((N * M) >= K){
            System.out.println("YES");
        }else{
            System.out.println("NO");
        }
    }
}
