package acmp;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Task_0685___GoldenSand {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        String inputText = bufferedReader.readLine();

        ArrayList<Integer> inputIntegers = new ArrayList<>(6);
        for (String s : inputText.split("\\s")) {
            inputIntegers.add(Integer.parseInt(s));
        }

        ArrayList<Integer> A = new ArrayList<>(Arrays.asList(inputIntegers.get(0), inputIntegers.get(1), inputIntegers.get(2)));
        Collections.sort(A);
        ArrayList<Integer> B = new ArrayList<>(Arrays.asList(inputIntegers.get(3), inputIntegers.get(4), inputIntegers.get(5)));
        Collections.sort(B);

        int allGoldenSand = 0;
        for (int i = 0; i < 3; i++) {
            allGoldenSand += A.get(i) * B.get(i);
        }
        System.out.println(allGoldenSand);
    }
}



/*
Сотрудники завода по производству золотого песка из воздуха решили поправить свое финансовое положение.
Они пробрались на склад завода, где хранился золотой песок трех видов.
Один килограмм золотого песка первого вида они смогли бы продать за A1 рублей,
второго вида – за A2 рублей, а третьего вида – за A3 рублей.
Так получилось, что у сотрудников оказалось с собой только три емкости:
первая была рассчитана на B1 килограмм груза, вторая на B2 килограмм, а третья на B3 килограмм.
Им надо было заполнить полностью все емкости таким образом, чтобы получить как можно больше денег за весь песок.
При заполнении емкостей нельзя смешивать песок разных видов,
то есть, в одну емкость помещать более одного вида песка, и заполнять емкости песком так,
чтобы один вид песка находился более чем в одной емкости.

Требуется написать программу, которая определяет,
за какую сумму предприимчивые сотрудники смогут продать весь песок в случае наилучшего для себя заполнения емкостей песком.

Входные данные
В единственной строке входного файла INPUT.TXT записано 6 натуральных чисел A1, A2, A3, B1, B2, B3,
записанных в одной строке через пробел. Все числа не превосходят 100.

Выходные данные
В единственную строку выходного файла OUTPUT.TXT нужно вывести единственное целое число – сумму в рублях,
которую смогут сотрудники заработать в случае наилучшего для себя заполнения емкостей песком.

Пример
№	INPUT.TXT	    OUTPUT.TXT
1	1 2 3 3 2 1	    14
 */
