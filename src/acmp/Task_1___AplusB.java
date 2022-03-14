package acmp;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

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
public class Task_1___AplusB {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        int a = Integer.parseInt(bufferedReader.readLine());
        int b = Integer.parseInt(bufferedReader.readLine());
        System.out.println(a+b);
    }
}
