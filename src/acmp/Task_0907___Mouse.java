package acmp;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Task_0907___Mouse {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        String inputText = bufferedReader.readLine();

        ArrayList<Integer> inputIntegers = new ArrayList<>();
        for (String s : inputText.split("\\s")) {
            inputIntegers.add(Integer.parseInt(s));
        }

        if(2*inputIntegers.get(2) <= inputIntegers.get(0) && 2*inputIntegers.get(2) <= inputIntegers.get(1)){
            System.out.println("YES");
        }else{
            System.out.println("NO");
        }
    }
}



/*
Однажды компьютерная мышка подумала, что стоит взять про запас еще один коврик.
Чтобы никто не заметил запасного коврика, мышка решила его спрятать под свой прямоугольный коврик.
Пробравшись ночью на склад, мышка обнаружила там только круглые коврики.
Удастся ли мышке спрятать круглый коврик под прямоугольным ковриком?

Входные данные
Входной файл INPUT.TXT содержит три натуральных числа: W, H и R,
где W и H - ширина и высота прямоугольного коврика, а R – радиус запасного коврика.
Все числа не превосходят значения 109.

Выходные данные
В выходной файл OUTPUT.TXT выведите «YES», если новый коврик можно спрятать под старым,
и слово «NO», если этого сделать нельзя.

Примеры
№	INPUT.TXT	OUTPUT.TXT
1	4 7 2	    YES
2	4 7 3	    NO
 */
