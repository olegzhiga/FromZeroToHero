package JavaRush.Level_8;

import java.util.HashMap;
import java.util.Map;

/*
Только для богачей

Создать словарь (Map<String, Integer>) и занести в него десять записей по принципу: "фамилия" - "зарплата".
Удалить из словаря всех людей, у которых зарплата ниже 500.

Требования:
•	Программа не должна выводить текст на экран.
•	Программа не должна считывать значения с клавиатуры.
•	Метод createMap() должен создавать и возвращать словарь Map с типом элементов String, Integer состоящих из 10 записей по принципу «фамилия» - «зарплата».
•	Метод removeItemFromMap() должен удалять из словаря всех людей, у которых зарплата ниже 500.
*/
public class Task_0818___OnlyForTheRich {
    public static Map<String, Integer> createMap() {
        //напишите тут ваш код
        Map<String, Integer> salaryMap = new HashMap<>();
        salaryMap.put("person1", 250);
        salaryMap.put("person2", 350);
        salaryMap.put("person3", 450);
        salaryMap.put("person4", 550);
        salaryMap.put("person5", 650);
        salaryMap.put("person6", 750);
        salaryMap.put("person7", 850);
        salaryMap.put("person8", 950);
        salaryMap.put("person9", 1050);
        salaryMap.put("person10", 1150);
        return salaryMap;
    }

    public static void removeItemFromMap(Map<String, Integer> map) {
        //напишите тут ваш код
        for (Map.Entry<String, Integer> pair : map.entrySet()) {
            if (pair.getValue() < 500) {
                map.remove(pair.getKey());
            }
        }
    }

    public static void main(String[] args) {

    }
}
