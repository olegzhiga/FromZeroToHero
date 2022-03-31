package acmp;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Task_0819___RectangularParallelepiped {

    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        String inputText = bufferedReader.readLine();

        ArrayList<Integer> inputIntegers = new ArrayList<>(3);
        for (String s : inputText.split("\\s")) {
            inputIntegers.add(Integer.parseInt(s));
        }

        long S = 2 * (((long) inputIntegers.get(0) * inputIntegers.get(1)) + ((long) inputIntegers.get(0) * inputIntegers.get(2)) + ((long) inputIntegers.get(1) * inputIntegers.get(2)));
        long V = (long) inputIntegers.get(0) * inputIntegers.get(1) * inputIntegers.get(2);

        System.out.println(S + " " + V);
    }
}



/*
Прямоугольный параллелепипед - это объемная фигура, у которой шесть граней, и каждая из них является прямоугольником.
Моделями прямоугольного параллелепипеда служат классная комната, кирпич, спичечная коробка.
Длины трех ребер прямоугольного параллелепипеда, имеющих общий конец, называют его измерениями.
На приведенном рисунке измерения представлены ребрами AB, BC и BF с общим концом в точке B,
а значения измерений равны их длинам a, b и c соответственно.

По заданным измерениям прямоугольного параллелепипеда Вам необходимо определить площадь его поверхности и объем.

Входные данные
Единственная строка входного файла INPUT.TXT содержит разделенные пробелом три натуральных числа
a, b и c – измерения параллелепипеда, каждое из измерений не превышает 106.

Выходные данные
В выходной файл OUTPUT.TXT выведите через пробел два целых числа:
площадь поверхности и объем заданного параллелепипеда.

Примеры
№	INPUT.TXT	    OUTPUT.TXT
1	1 1 1	        6 1
2	2 3 4	        52 24
 */
