package JavaRush.Level_8;

import java.util.HashMap;
import java.util.Map;

/*
Перепись населения

Создать словарь (Map<String, String>) занести в него десять записей по принципу "Фамилия" - "Имя".
Проверить сколько людей имеют совпадающие с заданным именем или фамилией.

Требования:
•	Программа не должна выводить текст на экран.
•	Программа не должна считывать значения с клавиатуры.
•	Метод createMap() должен создавать и возвращать словарь Map с типом элементов String, String состоящих из 10 записей по принципу «Фамилия» - «Имя».
•	Метод getCountTheSameFirstName() должен возвращать число людей у которых совпадает имя.
•	Метод getCountTheSameLastName() должен возвращать число людей у которых совпадает фамилия.
*/
public class Task_0815___PapulationCensus {
    public static Map<String, String> createMap() {
        //напишите тут ваш код
        Map<String, String> stringMap = new HashMap<>();
        stringMap.put("Amsterdam", "Amigo");
        stringMap.put("Balashiha", "Bart");
        stringMap.put("Copenhagen", "Carat");
        stringMap.put("Dubai", "Daun");
        stringMap.put("Erevan", "Elf");
        stringMap.put("Filadelfia", "Florenco");
        stringMap.put("GonKong", "G");
        stringMap.put("Huston", "Haval");
        stringMap.put("Ierusalim", "Indigo");
        stringMap.put("Jassad", "Jackson");
        return stringMap;
    }

    public static int getCountTheSameFirstName(Map<String, String> map, String name) {
        //напишите тут ваш код
        int countSameValues = 0;
        for (Map.Entry <String,String> s : map.entrySet()) {
            if(name.equals(s.getValue())); countSameValues++;
        }
        return countSameValues;
    }

    public static int getCountTheSameLastName(Map<String, String> map, String lastName) {
        //напишите тут ваш код
        int countSameKeys = 0;
        for (Map.Entry <String,String> s : map.entrySet()) {
            if(lastName.equals(s.getValue())); countSameKeys++;
        }
        return countSameKeys;
    }

    public static void main(String[] args) {

    }
}
