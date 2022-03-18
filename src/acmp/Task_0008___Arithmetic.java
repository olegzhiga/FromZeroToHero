package acmp;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Task_0008___Arithmetic {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        String inputText = bufferedReader.readLine();

        ArrayList<Integer> inputIntegers = new ArrayList<>(3);
        for (String s : inputText.split("\\s")) {
            inputIntegers.add(Integer.parseInt(s));
        }

        if (inputIntegers.get(0) * inputIntegers.get(1) == inputIntegers.get(2)){
            System.out.println("YES");
        }else{
            System.out.println("NO");
        }
    }
}



/*
Но теперь Вася изучает таблицу умножения чисел от 1 до 100 в десятичной системе счисления,
а поскольку запомнить такую таблицу очень сложно, то Васе придется очень долго ее зубрить.
Составьте для Васи программу, которая поможет ему проверять свои знания.

Входные данные
Во входном файле INPUT.TXT записаны три натуральных числа A, B и C через пробел.
Числа A и B ≤ 102, а C ≤ 106.

Выходные данные
В выходной файл нужно вывести YES в том случае, если A*B=C и вывести NO в противном случае.

Примеры
№	INPUT.TXT	    OUTPUT.TXT
1	8 54 432	    YES
2	16 19 777	    NO
 */