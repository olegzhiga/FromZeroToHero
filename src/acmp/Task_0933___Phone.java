package acmp;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Task_0933___Phone {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        String inputText = bufferedReader.readLine();

        ArrayList<Integer> inputIntegers = new ArrayList<>(4);
        for (String s : inputText.split("\\s")) {
            inputIntegers.add(Integer.parseInt(s));
        }
        // минут в тарифе
        int a = inputIntegers.get(0);
        // стоимость минут пока тариф не израсходован
        int b = inputIntegers.get(1);
        // стоимость минут, когда тариф израсходован, на ту часть, которая превысила тариф
        int c = inputIntegers.get(2);
        // минут наговорили мы
        int t = inputIntegers.get(3);

        if (t > a){
            System.out.println(((t - a) * c) + (a * b));
        }else if (t <= a){
            System.out.println(t * b);
        }
    }
}



/*
Услуги телефонной сети оплачиваются по следующему правилу:
за разговоры до А минут в месяц – В рублей за минуту,
а разговоры сверх установленной нормы оплачиваются из расчета С рублей за минуту.
Требуется написать программу, вычисляющую плату за пользование телефоном для разговоров продолжительностью Т минут в месяц.

Входные данные
Входной файл INPUT.TXT содержит натуральные числа A, B, C и T, не превышающие 1000.
Числа располагаются в одной строке и разделены пробелами.

Выходные данные
В выходной файл OUTPUT.TXT выведите единственное целое число – месячную плату за пользование телефоном.

Примеры
№	INPUT.TXT	OUTPUT.TXT
1	30 2 3 30	60
2	20 1 3 30	50
 */