package JavaRush.Level_7;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

/*
Играем в Jолушку

1. Введи с клавиатуры 20 чисел, сохрани их в список и рассортируй по трём другим спискам:
Число нацело делится на 3 (x%3==0), нацело делится на 2 (x%2==0) и все остальные.
Числа, которые делятся на 3 и на 2 одновременно, например 6, попадают в оба списка.
Порядок объявления списков очень важен.
2. Метод printList должен выводить на экран все элементы списка с новой строки.
3. Используя метод printList выведи эти три списка на экран. Сначала тот, который для x%3, потом тот, который для x%2, потом последний.

Требования:
•	Объяви и сразу проинициализируй 4 переменных типа ArrayList<Integer> (список целых чисел). Первый список будет главным, а остальные - дополнительными.
•	Считать 20 чисел с клавиатуры и добавить их в главный список.
•	Добавить в первый дополнительный список все числа из главного, которые нацело делятся на 3.
•	Добавить во второй дополнительный список все числа из главного, которые нацело делятся на 2.
•	Добавить в третий дополнительный список все остальные числа из главного.
•	Метод printList должен выводить на экран все элементы переданного списка, каждый с новой строки.
•	Программа должна вывести три дополнительных списка, используя метод printList.
*/
public class Task_0713___PlayingJolushka {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        ArrayList<Integer> inputIntegerList = new ArrayList<>(20);
        ArrayList<Integer> divide3 = new ArrayList<>();
        ArrayList<Integer> divide2 = new ArrayList<>();
        ArrayList<Integer> divideOther = new ArrayList<>();

        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        for (int i = 0; i < 20; i++) {
            System.out.println("Enter " + (i+1) + "/20 integer of list: ");
            inputIntegerList.add(Integer.parseInt(bf.readLine()));
        }

        //
        for (Integer i : inputIntegerList) {
            if (i % 3 == 0 && i % 2 == 0) {
                divide3.add(i);
                divide2.add(i);
            } else if (i % 3 == 0) {
                divide3.add(i);
            } else if (i % 2 == 0) {
                divide2.add(i);
            } else {
                divideOther.add(i);
            }
        }

        printList(divide3);
        printList(divide2);
        printList(divideOther);
    }

    public static void printList(ArrayList<Integer> list) {
        //напишите тут ваш код
        for (Integer integer : list) {
            System.out.println(integer);
        }
    }
}
