package acmp;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Task_0001___AplusB {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        String inputText = bufferedReader.readLine();

        ArrayList<Integer> parsingNumbers = new ArrayList<>(2);
        for (String part : inputText.split("\\s")) {
            parsingNumbers.add(Integer.parseInt(part));
        }
        System.out.println(parsingNumbers.get(0) + parsingNumbers.get(1));
    }
}



/*
Требуется сложить два целых числа А и В.

Входные данные
В единственной строке входного файла INPUT.TXT записаны два натуральных числа через пробел. Значения чисел не превышают 109.

Выходные данные
В единственную строку выходного файла OUTPUT.TXT нужно вывести одно целое число — сумму чисел А и В.

Пример
INPUT.TXT - 2 3
OUTPUT.TXT - 5
 */
