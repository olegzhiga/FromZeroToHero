package JavaRush.Level_7;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

/*
Это конец

Создать список строк.
Ввести строки с клавиатуры и добавить их в список.
Вводить с клавиатуры строки, пока пользователь не введет строку "end". Саму строку "end" не учитывать.
Вывести строки на экран, каждую с новой строки.

Требования:
•	Объяви переменную типа список строк и сразу проинициализируй ee.
•	Считывай строки с клавиатуры и добавляй их в список, пока пользователь не введет строку "end".
•	Саму строку "end" не нужно добавлять в список.
•	Выведи список на экран, каждое значение с новой строки.
•	Используй цикл for.
*/
public class Task_0722___ThisIsTheEnd {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        //напишите тут ваш код
        ArrayList<String> inputStringsList = new ArrayList<>(20);
        for (int i = 0; i < Integer.MAX_VALUE; i++) {
            String swap = reader.readLine();
            if (swap.equals("end")){
                break;
            }else{
                inputStringsList.add(swap);
            }
        }

        for (String s : inputStringsList) {
            System.out.println(s);
        }
    }
}
