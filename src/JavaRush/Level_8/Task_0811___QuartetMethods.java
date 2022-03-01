package JavaRush.Level_8;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/*
Квартет «Методы»

Реализовать 4 метода.
Каждый из них должен возвращать список, который лучше всего подходит для выполнения данных операций (быстрее всего справится с большим количеством операций).
Ничего измерять не нужно.

Требования:
•	Программа не должна выводить текст на экран.
•	Класс Solution должен содержать только 5 методов.
•	Метод getListForGet должен возвращать список, который лучше всего подходит для операции взятия элемента.
•	Метод getListForSet должен возвращать список, который лучше всего подходит для установки значения элемента.
•	Метод getListForAddOrInsert должен возвращать список, который лучше всего подходит для операций добавления или вставки элемента.
•	Метод getListForRemove должен возвращать список, который лучше всего подходит для операции удаления элемента.
*/
public class Task_0811___QuartetMethods {
    public static List getListForGet() {
        //напишите тут ваш код
        ArrayList<Object> arrayList = new ArrayList();
        return arrayList;
    }

    public static List getListForSet() {
        //напишите тут ваш код
        ArrayList<Object> arrayList = new ArrayList();
        return arrayList;
    }

    public static List getListForAddOrInsert() {
        //напишите тут ваш код
        LinkedList<Object> linkedList = new LinkedList<>();
        return linkedList;
    }

    public static List getListForRemove() {
        //напишите тут ваш код
        LinkedList<Object> linkedList = new LinkedList<>();
        return linkedList;
    }

    public static void main(String[] args) {

    }
}
