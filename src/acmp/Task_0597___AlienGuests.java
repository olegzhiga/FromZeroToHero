package acmp;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Task_0597___AlienGuests {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        String inputText = bufferedReader.readLine();

        ArrayList<Integer> inputIntegers = new ArrayList<>();
        for (String s : inputText.split("\\s")) {
            inputIntegers.add(Integer.parseInt(s));
        }
        System.out.println(inputIntegers.get(0) >= inputIntegers.get(1) + inputIntegers.get(2) ? "YES" : "NO");
    }
}



/*
Недавно на поле фермера Джона были обнаружены следы приземления летающих тарелок.
Об этом даже писала газета Mew Yorc Courier.

Поле фермера Джона имеет форму круга радиусом r1.
По сообщениям журналистов были обнаружены два следа от летающих тарелок, имевшие форму кругов.
Один из них имел радиус r2, второй - радиус r3.
Также сообщается, что они находились внутри поля фермера Джона и не пересекались, ни один из них не лежал внутри другого.
При этом, они, возможно, касались друг друга и/или границы поля.

Поскольку журналисты часто склонны преувеличивать масштабы событий, необходимо написать программу,
которая будет проверять, могли ли иметь место события, описанные в газете.

Входные данные
Входной файл INPUT.TXT содержит три целых положительных числа - r1, r2, r3 (1 ≤ r1, r2, r3 ≤ 109).

Выходные данные
В выходной файл OUTPUT.TXT выведите слово YES, если информация, опубликованная в газете, может соответствовать правде,
и слово NO - иначе.

Примеры
№	INPUT.TXT	OUTPUT.TXT
1	10 10 10	NO
2	10 3 4	    YES
 */
