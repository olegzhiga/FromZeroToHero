package JavaRush.Level_8;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

/*
Cамая длинная последовательность

1. Создай список чисел.
2. Добавь в список 10 чисел с клавиатуры.
3. Вывести на экран длину самой длинной последовательности повторяющихся чисел в списке.

Пример для списка 2, 4, 4, 4, 8, 8, 4, 12, 12, 14:
3

Искомое значение равно 3, т.к. самая длинная последовательность повторяющихся чисел состоит из трех четверок.

Требования:
•	Программа должна выводить число на экран.
•	Программа должна считывать значения с клавиатуры.
•	В методе main объяви переменную типа List с типом элементов Integer и сразу проинициализируй ee.
•	Программа должна добавлять в коллекцию 10 чисел, согласно условию.
•	Программа должна выводить на экран длину самой длинной последовательности повторяющихся чисел в списке.
*/
public class Task_0812___LongestSequence {
    public static void main(String[] args) throws IOException {
        //напишите тут ваш код
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<Integer> inputIntegerList = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            inputIntegerList.add(Integer.parseInt(reader.readLine()));
        }

        // первый способ
        // в этом блоке нахожу колличество вообще повторяющихся чисел:
        List<Integer> integerList = new ArrayList<>();
        int longestSequence = 1;
        for (int i = 0; i < inputIntegerList.size()-1; i++) {
            if (inputIntegerList.get(i).equals(inputIntegerList.get(i + 1))) {
                longestSequence++;
                integerList.add(longestSequence);
            }else {
                integerList.add(longestSequence);
                longestSequence = 1;
            }
        }
        // в этом блоке нахожу колличество самого повторяющегося числа:
        int mostUsed = 0;
        for (Integer i : integerList) {
            if(mostUsed < i){
                mostUsed = i;
            }
        }
        System.out.println(mostUsed);



        // вариант по проще:
        int count = 1;
        int max = 1;
        for (int i=0; i<inputIntegerList.size()-1;i++)
        {
            if (inputIntegerList.get(i).equals(inputIntegerList.get(i + 1)))
            {
                count++;
                if (max < count)
                    max = count;
            }
            else
                count=1;
        }
        System.out.println(max);
    }
}
