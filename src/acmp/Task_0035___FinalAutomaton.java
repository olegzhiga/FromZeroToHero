package acmp;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Task_0035___FinalAutomaton {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        int k = Integer.parseInt(bufferedReader.readLine());
        ArrayList<Integer> finalArr = new ArrayList<>(k);

        for (int i = 0; i < k; i++) {
            String inputText = bufferedReader.readLine();
            ArrayList<Integer> inputIntegers = new ArrayList<>(2);

            for (String s : inputText.split("\\s")) {
                inputIntegers.add(Integer.parseInt(s));
            }
            finalArr.add((19*inputIntegers.get(1)) + ((inputIntegers.get(0)+239)*(inputIntegers.get(0)+366)/2));
        }
        for (int a : finalArr) {
            System.out.println(a);
        }
    }
}



/*
Однажды известный профессор обнаружил описания k конечных автоматов.
По его мнению, нетривиальность конечного автомата, имеющего n состояний и m переходов,
можно описать целым числом d = 19m + (n + 239)*(n + 366) / 2 .
Чем больше d, тем больший интерес для науки представляет изучение его свойств.

Помогите профессору вычислить нетривиальность имеющихся у него автоматов.

Входные данные
Первая строка входного файла INPUT.TXT содержит целое число k (1 ≤ k ≤ 10000) – количество конечных автоматов.
Следующие k строк содержат по два целых числа ni (0 ≤ ni ≤ 1000) и mi (0 ≤ mi ≤ 26ni2) – число состояний и переходов i-го автомата.

Выходные данные
Выходной файл OUTPUT.TXT должен состоять из k строк.
На i-й строке выходного файла выведите одно число – нетривиальность i-го автомата.

Примеры
№	INPUT.TXT	    OUTPUT.TXT
1	4               44344
    2 0             48134
    13 20           45699
    5 23            49458
    18 6

2	2               48767
    15 20           1340237
    1000 26000
 */
