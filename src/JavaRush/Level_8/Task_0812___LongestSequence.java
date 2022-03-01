package JavaRush.Level_8;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

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
        int longestSequence = 1;
        int longestSequence2 = 1;
        for (int i = 0; i < 10; i++) {
            inputIntegerList.add(Integer.parseInt(reader.readLine()));
        }

        for (int i = 0; i < inputIntegerList.size()-1; i++) {
            if (inputIntegerList.get(i).equals(inputIntegerList.get(i + 1))){
                longestSequence++;
            }else {
                if(longestSequence2 < longestSequence){
                    longestSequence2 = longestSequence;
                    longestSequence = 0;
                }
            }
        }

        System.out.println(Math.max(longestSequence, longestSequence2));
    }
}
