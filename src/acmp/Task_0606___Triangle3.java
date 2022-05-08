package acmp;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Task_0606___Triangle3 {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        String inputText = bufferedReader.readLine();

        ArrayList<Integer> inputIntegers = new ArrayList<>(3);
        for (String s : inputText.split("\\s")) {
            inputIntegers.add(Integer.parseInt(s));
        }
        int x = inputIntegers.get(0);
        int y = inputIntegers.get(1);
        int z = inputIntegers.get(2);

        if (x+y>z && x+z>y && y+z>x){
            System.out.println("YES");
        }else{
            System.out.println("NO");
        }
    }
}



/*
Даны длины трех отрезков.
Требуется проверить: могут ли они являться сторонами невырожденного треугольника.

Входные данные
Входной файл INPUT.TXT содержит 3 натуральных числа X Y Z – длины заданных отрезков.
Длины отрезков записаны в одной строке через пробел и не превышают 1000.

Выходные данные
В выходной файл OUTPUT.TXT выведите YES, если отрезки могут быть сторонами треугольника и NO в противном случае.

Примеры
№	INPUT.TXT	OUTPUT.TXT
1	3 4 5	    YES
2	1 1 5	    NO
 */