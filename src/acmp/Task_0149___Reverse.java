package acmp;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Task_0149___Reverse {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        int allNumbers = Integer.parseInt(bufferedReader.readLine());
        String inputText = bufferedReader.readLine();

        ArrayList<Integer> inputIntegers = new ArrayList<>(allNumbers);
        for (String s : inputText.split("\\s")) {
            inputIntegers.add(Integer.parseInt(s));
        }

        for (int i = inputIntegers.size()-1; i >= 0; i--) {
            System.out.print(inputIntegers.get(i) + " ");
        }
    }
}



/*
Дано натуральное число N и последовательность из N элементов.
Требуется вывести эту последовательность в обратном порядке.

Входные данные
В первой строке входного файла INPUT.TXT записано натуральное число N (N ≤ 103).
Во второй строке через пробел идут N целых чисел, по модулю не превосходящих 103 - элементы последовательности.

Выходные данные
В выходной файл OUTPUT.TXT выведите заданную последовательность в обратном порядке.

Пример
№	INPUT.TXT	    OUTPUT.TXT
1	3               3 2 1
    1 2 3
 */
