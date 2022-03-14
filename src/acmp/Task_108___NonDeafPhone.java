package acmp;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/*
Вам необходимо исключить какие-либо внешние факторы, которые могут исказить исходную информацию и
Вы должны реализовать программу «неглухой телефон», которая сможет безошибочно доставлять исходные данные.

Входные данные
В единственной строке входного файла INPUT.TXT записано натуральное число от 1 до 100.

Выходные данные
В выходной файл OUTPUT.TXT нужно вывести в точности то же число, которое задано во входном файле.

Пример
INPUT.TXT - 5
OUTPUT.TXT - 5
 */
public class Task_108___NonDeafPhone {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        int i = Integer.parseInt(bufferedReader.readLine());
        System.out.println(i);
    }
}
