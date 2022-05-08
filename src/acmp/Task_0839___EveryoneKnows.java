package acmp;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Task_0839___EveryoneKnows {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        String inputText = bufferedReader.readLine();

        ArrayList<Integer> inputIntegers = new ArrayList<>();
        for (String s : inputText.split("(?!^)")) {
            inputIntegers.add(Integer.parseInt(s));
        }

        for (int i = 0; i < inputIntegers.size(); i++) {
            if (inputIntegers.get(i) == 0) {
                System.out.println("NO");
                break;
            }else if (inputIntegers.get(i) == inputIntegers.size()-1 && inputIntegers.get(i) != 0){
                System.out.println("YES");
            }
        }

        System.out.println("YES");
    }
}



/*
Всем известно, что многие олимпиадные задачи начинаются со слов «Всем известно».
Но мало кто знает, что начинающему программисту Паше такие задачи меньше всего нравятся.
Потому что обычно после слов «всем известно» описывается такой факт, о котором он даже не догадывался.
После очередной подобной задачи Паша решил проверить, а действительно ли всем известно, что сумма первых N нечетных чисел равняется N2:


Для этого Паша провел опрос всех людей, попавшихся ему под руку в известной социальной сети.
Результаты опроса он записал в текстовый файл.
Он ставил цифру один, если человеку был действительно известен данный факт, в противном случае в файл записывался нуль.
Все было хорошо, пока Паша не открыл файл и не ужаснулся, увидев длинную последовательность из единичек.
Как же он теперь будет искать среди них нули?

Уже всем известно, что Паша – начинающий программист, поэтому для обработки результатов исследования он обратился к вам за помощью.

Входные данные
Входной файл INPUT.TXT содержит непустую последовательность из нулей и единиц.
Длина последовательности не превышает 104.

Выходные данные
В выходной файл OUTPUT.TXT выведите слово «YES», если факт был известен всем опрошенным людям, и слово "NO" в противном случае.

Примеры
№	INPUT.TXT	OUTPUT.TXT
1	11111101010011	NO
2	11	YES
 */