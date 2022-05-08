package acmp;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Task_0854___AirCooler {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        String inputValues = bufferedReader.readLine();
        ArrayList<Integer> values = new ArrayList<>();
        for (String s : inputValues.split("\\s")) {
            values.add(Integer.parseInt(s));
        }
        String mode = bufferedReader.readLine();

        switch (mode){
            case "freeze":
                System.out.println(values.get(1) > values.get(0) ? values.get(0) : values.get(1));
                break;
            case "heat":
                System.out.println(values.get(1) > values.get(0) ? values.get(1) : values.get(0));
                break;
            case "auto":
                System.out.println(values.get(1));
                break;
            case "fan":
                System.out.println(values.get(0));
                break;
            default:
                System.out.println();
                break;
        }
    }
}



/*
В офисе, где работает программист Петр, установили кондиционер нового типа.
Этот кондиционер отличается особой простотой в управлении.
У кондиционера есть всего лишь два управляемых параметра: желаемая температура и режим работы.

Кондиционер может работать в следующих четырех режимах:

«freeze» — охлаждение. В этом режиме кондиционер может только уменьшать температуру.
Если температура в комнате и так не больше желаемой, то он выключается.
«heat» — нагрев. В этом режиме кондиционер может только увеличивать температуру.
Если температура в комнате и так не меньше желаемой, то он выключается.
«auto» — автоматический режим. В этом режиме кондиционер может как увеличивать, так и уменьшать температуру в комнате до желаемой.
«fan» — вентиляция. В этом режиме кондиционер осуществляет только вентиляцию воздуха и не изменяет температуру в комнате.

Кондиционер достаточно мощный, поэтому при настройке на правильный режим работы он за час доводит температуру в комнате до желаемой.

Требуется написать программу, которая по заданной температуре в комнате troom, установленным на кондиционере желаемой температуре tcond и режиму работы определяет температуру, которая установится в комнате через час.

Входные данные
Первая строка входного файла INPUT.TXT содержит два целых числа troom и tcond,
разделенных ровно одним пробелом (–50 ≤ troom ≤ 50, –50 ≤ tcond ≤ 50).

Вторая строка содержит одно слово, записанное строчными буквами английского алфавита — режим работы кондиционера, как указано выше.

Выходные данные
Выходной файл OUTPUT.TXT должен содержать одно целое число — температуру, которая установится в комнате через час.

Примеры
№	INPUT.TXT	OUTPUT.TXT
1	10 20
    heat	    20
2	10 20
    freeze	    10
 */