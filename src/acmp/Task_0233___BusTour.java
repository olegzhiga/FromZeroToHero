package acmp;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Task_0233___BusTour {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        int bridgeHeight = 437;
        int bridgeCount = Integer.parseInt(bufferedReader.readLine());
        String inputValue = bufferedReader.readLine();

        ArrayList<Integer> inputIntegers = new ArrayList<>(bridgeCount);
        for (String s : inputValue.split("\\s")) {
            inputIntegers.add(Integer.parseInt(s));
        }

        for (int i = 1; i < inputIntegers.size()+1; i++) {
            if (inputIntegers.get(i-1) < bridgeHeight){
                System.out.println("Crash " + i);
                break;
            }else if (i == inputIntegers.size()){
                System.out.println("No crash");
            }
        }
    }
}



/*
Оргкомитет Московской городской олимпиады решил организовать обзорную экскурсию по Москве для участников олимпиады.
Для этого был заказан двухэтажный автобус (участников олимпиады достаточно много и в обычный они не умещаются) высотой 437 сантиметров.
На экскурсионном маршруте встречаются N мостов.
Жюри и оргкомитет олимпиады очень обеспокоены тем, что высокий двухэтажный автобус может не проехать под одним из них.
Им удалось выяснить точную высоту каждого из мостов.
Автобус может проехать под мостом тогда и только тогда, когда высота моста превосходит высоту автобуса.

Помогите организаторам узнать, закончится ли экскурсия благополучно, а если нет, то установить, где произойдет авария.

Входные данные
Во входном файле INPUT.TXT сначала содержится число N (1 ≤ N ≤ 1000).
Далее идут N натуральных чисел, не превосходящих 10000 - высоты мостов в сантиметрах в том порядке, в котором они встречаются на пути автобуса.

Выходные данные
В единственную строку выходного файла OUTPUT.TXT нужно вывести фразу "No crash", если экскурсия закончится благополучно.
Если же произойдет авария, то нужно вывести сообщение "Crash k", где k - номер моста, где произойдет авария.
Фразы выводить без кавычек ровно с одним пробелом внутри.

Примеры:
№	INPUT.TXT	    OUTPUT.TXT
1	1
    763	            No crash
2	3
    763 245 113	    Crash 2
3	1
    437	            Crash 1
 */
