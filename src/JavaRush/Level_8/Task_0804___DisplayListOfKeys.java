package JavaRush.Level_8;

import java.util.HashMap;
import java.util.Map;

/*
Вывести на экран список ключей

Есть коллекция Map<String, String> (реализация HashMap), туда занесли 10 различных строк.
Вывести на экран список ключей, каждый элемент с новой строки.

Требования:
•	Программа должна создавать переменную коллекции Map с типом элементов String, String. Переменная должна быть сразу проинициализирована.
•	Программа не должна считывать значения с клавиатуры.
•	Программа должна добавлять в коллекцию 10 различных строк, согласно условию.
•	Метод printKeys() должен выводить на экран список ключей коллекции, каждый элемент с новой строки.
*/
public class Task_0804___DisplayListOfKeys {
    public static void main(String[] args) {
        Map<String, String> map = new HashMap<>();
        map.put("Sim", "Sim");
        map.put("Tom", "Tom");
        map.put("Arbus", "Arbus");
        map.put("Baby", "Baby");
        map.put("Cat", "Cat");
        map.put("Dog", "Dog");
        map.put("Eat", "Eat");
        map.put("Food", "Food");
        map.put("Gevey", "Gevey");
        map.put("Hugs", "Hugs");

        printKeys(map);
    }

    public static void printKeys(Map<String, String> map) {
        //напишите тут ваш код
        for (Map.Entry<String, String> mapKeys : map.entrySet()) {
            System.out.println(mapKeys.getKey());
        }
    }
}
