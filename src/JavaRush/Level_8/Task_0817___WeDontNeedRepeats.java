package JavaRush.Level_8;

import java.util.HashMap;
import java.util.Map;

/*
Нам повторы не нужны

Создать словарь (Map<String, String>) занести в него десять записей по принципу "фамилия" - "имя".
Удалить людей, имеющих одинаковые имена.

Требования:
•	Программа не должна выводить текст на экран.
•	Программа не должна считывать значения с клавиатуры.
•	Метод createMap() должен создавать и возвращать словарь Map с типом элементов String, String состоящих из 10 записей.
•	Метод removeTheFirstNameDuplicates() должен удалять из словаря всех людей, имеющие одинаковые имена.
•	Метод removeTheFirstNameDuplicates() должен вызывать метод removeItemFromMapByValue().
*/
public class Task_0817___WeDontNeedRepeats {
    public static Map<String, String> createMap() {
        //напишите тут ваш код
        Map<String, String> userMap = new HashMap<>();
        userMap.put("lastName1", "firstName1");
        userMap.put("lastName2", "firstName1");
        userMap.put("lastName3", "firstName1");
        userMap.put("lastName4", "firstName4");
        userMap.put("lastName5", "firstName5");
        userMap.put("lastName6", "firstName6");
        userMap.put("lastName7", "firstName7");
        userMap.put("lastName8", "firstName8");
        userMap.put("lastName9", "firstName9");
        userMap.put("lastName10", "firstName10");
        return userMap;
    }

//    public static void removeTheFirstNameDuplicates(Map<String, String> map) {
//        //напишите тут ваш код
//        for (Map.Entry<String, String> pair : map.entrySet()) {
//            if (pair.getValue().equals()){
//
//            }
//        }
//
//    }

    public static void removeItemFromMapByValue(Map<String, String> map, String value) {
        Map<String, String> copy = new HashMap<>(map);
        for (Map.Entry<String, String> pair : copy.entrySet()) {
            if (pair.getValue().equals(value)) {
                map.remove(pair.getKey());
            }
        }
    }

    public static void main(String[] args) {

    }
}
