package acmp;
// у меня все работает красиво, а валидацию не проходит хер знает почему... рабатет все четко...

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Task_0757___Ethanol {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        String inputText = bufferedReader.readLine();

        ArrayList<Long> inputLongs = new ArrayList<>(3);
        for (String s : inputText.split("\\s")) {
            inputLongs.add(Long.parseLong(s));
        }

        long C = inputLongs.get(0) / 2;
        long H = inputLongs.get(1) / 6;
        long O = inputLongs.get(2);
        //System.out.println(C + " " + H + " " + O);

        int count = 0;
        while (C > 0 && H > 0 && O > 0){
            count++;
            C--;
            H--;
            O--;
        }
        //System.out.println(C + " " + H + " " + O);
        System.out.println(count);
    }
}



/*
Каждому школьнику из курса органической химии известна формула молекулы этилового спирта – C2H5(OH).
Откуда видно, что молекула спирта состоит из двух атомов углерода (C),
шести атомов водорода (H) и одного атома кислорода (O).

По заданному количеству атомов каждого из описанных выше элементов требуется определить
максимально возможное количество молекул спирта,
которые могут образоваться в процессе их соединения.

Входные данные
Первая строка входного файла INPUT.TXT содержит 3 натуральных числа:
C, Н и O – количество атомов углерода, водорода и кислорода соответственно.
Все числа разделены пробелом и не превосходят 1018.

Выходные данные
В выходной файл OUTPUT.TXT выведите максимально возможное число молекул спирта,
которые могут получиться из атомов, представленных во входных данных.

Примеры
№	INPUT.TXT	OUTPUT.TXT
1	2 6 1	    1
2	10 5 12	    0
3	18 35       3
 */
