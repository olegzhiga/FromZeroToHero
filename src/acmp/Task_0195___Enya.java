package acmp;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Task_0195___Enya {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        String inputText = bufferedReader.readLine();

        ArrayList<Integer> parsingNumbers = new ArrayList<>(3);
        for (String s : inputText.split("\\s")) {
            parsingNumbers.add(Integer.parseInt(s));
        }

        System.out.println((parsingNumbers.get(0) * parsingNumbers.get(1) * parsingNumbers.get(2)) * 2);
    }
}



/*
И вот в этой суматохе обнаруживается,
что термозащитные панели корвета вновь требуют срочной обработки сульфидом тория.
Известно, что на обработку одного квадратного метра панели требуется 1 нанограмм сульфида.
Всего необходимо обработать N прямоугольных панелей размером A на B метров.
Вам необходимо как можно скорее подсчитать, сколько всего сульфида необходимо на обработку всех панелей “Энии”.
И не забудьте, что панели требуют обработки с обеих сторон.

Входные данные
Во входном файле INPUT.TXT содержатся 3 целых положительных числа N (N ≤ 100), A (A ≤ 100), B (B ≤ 100)

Выходные данные
В выходной файл OUTPUT.TXT нужно вывести единственное число – вес необходимого для обработки сульфида тория в нанограммах.

Примеры
№	INPUT.TXT	    OUTPUT.TXT
1	5 2 3	        60
2	14 23 5	        3220
 */