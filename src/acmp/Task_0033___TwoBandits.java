package acmp;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Task_0033___TwoBandits {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        String inputText = bufferedReader.readLine();

        ArrayList<Integer> inputNumbers = new ArrayList<>(2);
        for (String s : inputText.split("\\s")) {
            inputNumbers.add(Integer.parseInt(s));
        }

        int allShots = (inputNumbers.get(0) + inputNumbers.get(1) - 1);
        int GarryShots = allShots - inputNumbers.get(0);
        int LarryShots = allShots - inputNumbers.get(1);
        System.out.println(GarryShots + " " + LarryShots);
    }
}



/*
Бандиты Гарри и Ларри отдыхали на природе.
Решив пострелять, они выставили на бревно несколько банок из-под кока-колы (не больше 10).
Гарри начал простреливать банки по порядку, начиная с самой левой, Ларри — с самой правой.
В какой-то момент получилось так, что они одновременно прострелили одну и ту же последнюю банку.

Гарри возмутился и сказал, что Ларри должен ему кучу денег за то, что тот лишил его удовольствия прострелить несколько банок.
В ответ Ларри сказал, что Гарри должен ему еще больше денег по тем же причинам.
Они стали спорить кто кому сколько должен, но никто из них не помнил сколько банок было в начале, а искать простреленные банки по всей округе было неохота.
Каждый из них помнил только, сколько банок прострелил он сам.

Определите по этим данным, сколько банок не прострелил Гарри и сколько банок не прострелил Ларри.

Входные данные
В единственной строке входного файла INPUT.TXT записано 2 числа — количество банок, простреленных Гарри и Ларри соответственно.

Выходные данные
В файл OUTPUT.TXT выведите 2 числа — количество банок, не простреленных Гарри и Ларри соответственно.

Пример
№	INPUT.TXT	    OUTPUT.TXT
1	4 7	            6 3
 */