package JavaRush.Level_8;

import java.util.HashMap;
import java.util.Map;

/*
Map из 10 пар

Создать коллекцию Map<String, String> (реализация HashMap), занести туда 10 пар строк:
арбуз - ягода,
банан - трава,
вишня - ягода,
груша - фрукт,
дыня - овощ,
ежевика - куст,
жень-шень - корень,
земляника - ягода,
ирис - цветок,
картофель - клубень.
Вывести содержимое коллекции на экран, каждый элемент с новой строки.

Пример вывода (тут показана только одна строка):
картофель - клубень

Требования:
•	Объяви переменную коллекции Map с типом элементов String, String и сразу проинициализируй ee.
•	Программа не должна считывать значения с клавиатуры.
•	Программа должна добавлять в коллекцию 10 пар строк, согласно условию.
•	Программа должна выводить содержимое коллекции на экран, каждую пару с новой строки.
*/
public class Task_0802___MapOf10Pairs {
    public static void main(String[] args) {
        //напишите тут ваш код
        Map<String, String> stringMap = new HashMap<String, String>();
        stringMap.put("арбуз", "ягода");
        stringMap.put("банан", "трава");
        stringMap.put("вишня", "ягода");
        stringMap.put("груша", "фрукт");
        stringMap.put("дыня", "овощ");
        stringMap.put("ежевика", "куст");
        stringMap.put("жень-шень", "корень");
        stringMap.put("земляника", "ягода");
        stringMap.put("ирис", "цветок");
        stringMap.put("картофель", "клубень");

        for (Map.Entry<String, String> pair : stringMap.entrySet()) {
            String key = pair.getKey();
            String value = pair.getValue();
            System.out.println(key + " - " +  value);
        }

    }
}
