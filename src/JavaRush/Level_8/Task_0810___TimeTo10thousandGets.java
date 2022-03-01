package JavaRush.Level_8;

import java.util.ArrayList;
import java.util.Date;
import java.util.LinkedList;
import java.util.List;

/*
Время для 10 тысяч вызовов get

Измерить, сколько времени занимает 10 тысяч вызовов get для каждого списка.
Метод getGetTimeInMs должен вернуть время своего исполнения в миллисекундах.

Требования:
•	Программа должна выводить числа на экран.
•	Метод main должен вызывать метод getGetTimeInMs только два раза.
•	Метод main должен вызывать метод fill только два раза.
•	Метод fill(List list) должен вставлять 10 тысяч элементов в список.
•	Метод get10000(List list) должен производить 10 тысяч вызовов get для списка.
•	Метод getGetTimeInMs должен вызывать метод get10000(List list) только один раз.
•	Метод getGetTimeInMs должен вернуть время в миллисекундах, которое занимает 10 тысяч вызовов get для списка.
*/
public class Task_0810___TimeTo10thousandGets {
    public static void main(String[] args) {
        System.out.println(getGetTimeInMs(fill(new ArrayList())));
        System.out.println(getGetTimeInMs(fill(new LinkedList())));
    }

    public static List fill(List list) {
        for (int i = 0; i < 10000; i++) {
            list.add(new Object());
        }
        return list;
    }

    public static long getGetTimeInMs(List list) {
        // напишите тут ваш код
        Date currentTime = new Date();
        get10000(list);
        Date timeAfterGets = new Date();
        // напишите тут ваш код
        return (timeAfterGets.getTime() - currentTime.getTime());
    }

    public static void get10000(List list) {
        if (list.isEmpty()) {
            return;
        }
        int x = list.size() / 2;

        for (int i = 0; i < 10000; i++) {
            list.get(x);
        }
    }
}
