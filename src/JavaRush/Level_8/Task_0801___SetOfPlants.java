package JavaRush.Level_8;

import java.util.HashSet;
import java.util.Set;

/*
Set из растений

Создать коллекцию Set (реализация HashSet) с типом элементов String.
Добавить в неё следующие строки:
арбуз
банан
вишня
груша
дыня
ежевика
женьшень
земляника
ирис
картофель

Вывести содержимое коллекции на экран, каждый элемент с новой строки.
Посмотреть, как изменился порядок добавленных элементов.

Требования:
•	Объяви переменную коллекции Set с типом элементов String и сразу проинициализируй ee.
•	Программа не должна считывать строки с клавиатуры.
•	Программа должна добавлять в коллекцию 10 строк, согласно условию.
•	Программа должна выводить 10 строк из коллекции на экран, каждую с новой строки.
*/
public class Task_0801___SetOfPlants {
    public static void main(String[] args) {
        //напишите тут ваш код
        Set<String> stringsSet = new HashSet<String>();
        stringsSet.add("арбуз");
        stringsSet.add("банан");
        stringsSet.add("вишня");
        stringsSet.add("груша");
        stringsSet.add("дыня");
        stringsSet.add("ежевика");
        stringsSet.add("женьшень");
        stringsSet.add("земляника");
        stringsSet.add("ирис");
        stringsSet.add("картофель");

        for (String s : stringsSet) {
            System.out.println(s);
        }
    }
}
