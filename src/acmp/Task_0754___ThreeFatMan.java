package acmp;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;

public class Task_0754___ThreeFatMan {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        String inputText = bufferedReader.readLine();

        ArrayList<Integer> inputIntegers = new ArrayList<>(3);
        for (String s : inputText.split("\\s")) {
            inputIntegers.add(Integer.parseInt(s));
        }

        Collections.sort(inputIntegers);
        if (inputIntegers.get(0) < 94 || inputIntegers.get(2) > 727){
            System.out.println("Error");
        }else {
            System.out.println(inputIntegers.get(2));
        }
    }
}



/*
Три толстяка решили поспорить: кто из них самый тяжелый.
После взвешивания оказалось, что их масса соответственно M1, M2 и M3 килограмм.
Считается, что масса толстяка должна быть не менее 94 и не более 727 килограмм.

Помогите определить массу самого тяжелого из них, либо выяснить, что была допущена ошибка при взвешивании.

Входные данные
Входной файл INPUT.TXT содержит три целых числа M1, M2 и M3, разделенные пробелом.
Все числа целые и не превосходят 10 000 по абсолютной величине.

Выходные данные
В выходной файл OUTPUT.TXT выведите массу самого тяжелого толстяка в случае корректного взвешивания,
либо слово «Error» в противном случае.

Примеры
№	INPUT.TXT	    OUTPUT.TXT
1	98 106 214	    214
2	100 100 100	    100
3	93 500 1000	    Error
 */
