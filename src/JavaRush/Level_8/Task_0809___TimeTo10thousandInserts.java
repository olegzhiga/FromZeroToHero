package JavaRush.Level_8;

import java.util.ArrayList;
import java.util.Date;
import java.util.LinkedList;
import java.util.List;

/*
Время для 10 тысяч вставок

Измерить, сколько времени занимает 10 тысяч вставок для каждого списка.
Метод getInsertTimeInMs должен вернуть время своего исполнения в миллисекундах.

Требования:
•	Программа должна выводить числа на экран.
•	Метод main должен вызывать метод getInsertTimeInMs только два раза.
•	Метод insert10000(List list) должен вставлять 10 тысяч элементов в список.
•	Метод getInsertTimeInMs должен вызывать метод insert10000 только один раз.
•	Метод getInsertTimeInMs должен вернуть время в миллисекундах, которое занимает 10 тысяч вставок в список.
*/
public class Task_0809___TimeTo10thousandInserts {
    public static void main(String[] args) {
        System.out.println(getInsertTimeInMs(new ArrayList()));
        System.out.println(getInsertTimeInMs(new LinkedList()));
    }

    public static long getInsertTimeInMs(List list) {
        // напишите тут ваш код
        Date curentTime = new Date();
        insert10000(list);
        Date timeAfterInsert = new Date();
        // напишите тут ваш код
        return (timeAfterInsert.getTime() - curentTime.getTime());
    }

    public static void insert10000(List list) {
        for (int i = 0; i < 10000; i++) {
            list.add(0, new Object());
        }
    }
}
