package JavaRush.Level_8;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

/*
Добрая Зинаида и летние каникулы

Создать словарь (Map<String, Date>) и занести в него десять записей по принципу: "фамилия" - "дата рождения".
Удалить из словаря всех людей, родившихся летом.

Требования:
•	Программа не должна выводить текст на экран.
•	Программа не должна считывать значения с клавиатуры.
•	Метод createMap() должен создавать и возвращать словарь HashMap с типом элементов String, Date состоящий из 10 записей.
•	Метод removeAllSummerPeople() должен удалять из словаря всех людей, родившихся летом.
*/
public class Task_0816___KindZinaida {
    public static Map<String, Date> createMap() throws ParseException {
        DateFormat dateFormat = new SimpleDateFormat("MMMMM d yyyy", Locale.ENGLISH);
        Map<String, Date> map = new HashMap<>();
        map.put("Андреев", dateFormat.parse("MAY 1 2012"));
        map.put("Балаш", dateFormat.parse("JUNE 1 2012"));
        map.put("Виноградов", dateFormat.parse("JULY 1 2012"));
        map.put("Гудермес", dateFormat.parse("AUGUST 1 2012"));
        map.put("Дирипаска", dateFormat.parse("SEPTEMBER 1 2012"));
        map.put("Ершов", dateFormat.parse("OCTOBER 1 2012"));
        map.put("Жигалов", dateFormat.parse("NOVEMBER 1 2012"));
        map.put("Зюганов", dateFormat.parse("DECEMBER 1 2012"));
        map.put("Ибрагимов", dateFormat.parse("JANUARY 1 2012"));
        map.put("Калашников", dateFormat.parse("FEBRUARY 1 2012"));
        //напишите тут ваш код
        return map;
    }

    public static void removeAllSummerPeople(Map<String, Date> map) {
        //напишите тут ваш код
        Calendar calendar = Calendar.getInstance();
        for (Map.Entry <String, Date> pair : map.entrySet()) {
            calendar.setTime(pair.getValue());
            if (calendar.get(Calendar.MONTH) > Calendar.MAY && calendar.get(Calendar.MONTH) < Calendar.SEPTEMBER){
                map.remove(pair.getKey());
            }
        }
    }

    public static void main(String[] args) {

    }
}
