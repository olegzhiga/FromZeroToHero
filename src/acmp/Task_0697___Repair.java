package acmp;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Task_0697___Repair {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        String inputText = bufferedReader.readLine();

        ArrayList<Integer> inputIntegers = new ArrayList<>(3);
        for (String s : inputText.split("\\s")) {
            inputIntegers.add(Integer.parseInt(s));
        }

        int L = inputIntegers.get(0);
        int W = inputIntegers.get(1);
        int H = inputIntegers.get(2);
        int area = (2*L*H + 2*W*H);
        if (area%16 == 0){
            System.out.println(area/16);
        }else {
            System.out.println(area/16+1);
        }
    }
}



/*
Ваш любимый дядя – директор фирмы, которая делает евроремонты в офисах.
В связи с финансово-экономическим кризисом, дядюшка решил оптимизировать свое предприятие.

Давно ходят слухи, что бригадир в дядюшкиной фирме покупает лишнее количество стройматериалов,
а остатки использует для отделки своей новой дачи. Ваш дядя заинтересовался,
сколько в действительности банок краски необходимо для покраски стен в офисе длиной L метров, шириной – W и высотой – H,
если одной банки хватает на 16м2, а размерами дверей и окон можно пренебречь?
Заказов много, поэтому дядя попросил написать программу, которая будет все это считать.

Входные данные
Входной файл INPUT.TXT содержит три натуральных числа L, W, H – длину,
ширину и высоту офиса в метрах соответственно, каждое из которых не превышает 1000.

Выходные данные
В выходной файл OUTPUT.TXT выведите одно целое число – минимальное количество банок краски,
необходимых для покраски стен в офисе.

Примеры
№	INPUT.TXT	OUTPUT.TXT
1	8 8 2	    4
2	1 1 3	    1
 */