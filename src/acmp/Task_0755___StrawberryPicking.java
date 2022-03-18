package acmp;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Task_0755___StrawberryPicking {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        String inputText = bufferedReader.readLine();

        ArrayList<Integer> inputIntegers = new ArrayList<>(3);
        for (String s : inputText.split("\\s")) {
            inputIntegers.add(Integer.parseInt(s));
        }

        if (inputIntegers.get(2) > inputIntegers.get(0) + inputIntegers.get(1)){
            System.out.println("Impossible");
        }else{
            System.out.println(inputIntegers.get(0) + inputIntegers.get(1) - inputIntegers.get(2));
        }
    }
}



/*
Маша и Миша собирали землянику. Маше удалось сорвать X ягод, а Мише – Y ягод.
Поскольку ягода была очень вкусной, то ребята могли какую-то часть ягод съесть.
По нашим подсчетам вместе они съели Z ягод.

Требуется определить: сколько ягод ребята собрали в результате,
при этом следует проверить, не ошиблись ли мы в расчетах, подсчитывая количество съеденных ягод
(их не должно было получиться больше, чем сорванных ягод).

Входные данные
Входной файл INPUT.TXT содержит три натуральных числа X, Y и Z, не превышающих 1000.
Все числа расположены в первой строке файла и разделены пробелом.

Выходные данные
В выходной файл OUTPUT.TXT выведите количество собранных ягод,
если наши подсчеты оказались правдоподобными, либо слово «Impossible» в противном случае.

Примеры
№	INPUT.TXT	    OUTPUT.TXT
1	3 2 1	        4
2	12 13 5	        20
3	2 5 9	        Impossible
 */

