package JavaRush.Level_6;
/*
Класс StringHelper

Сделать класс StringHelper, у которого будут 2 статических метода:
String multiply(String s, int count) - возвращает строку повторенную count раз.
String multiply(String s) - возвращает строку повторенную 5 раз.

Пример:
Амиго -> АмигоАмигоАмигоАмигоАмиго

Требования:
•	Программа не должна считывать данные с клавиатуры.
•	Методы класса StringHelper должны возвращать строку.
•	Методы класса StringHelper должны быть статическими.
•	Методы класса StringHelper должны быть public.
•	Метод multiply(String s, int count) должен возвращать строку повторенную count раз.
•	Метод multiply(String s) должен возвращать строку повторенную 5 раз.
*/
public class Task_0611___Class_StringHelper {

    public static String multiply(String text) {
        String result = "";
        //напишите тут ваш код
        for (int i = 0; i < 5; i++) {
            result+=text;
        }
        return result;
    }

    public static String multiply(String text, int count) {
        String result = "";
        //напишите тут ваш код
        for (int i = 0; i < count; i++) {
            result+=text;
        }
        return result;
    }

    // don't know how it work !!!
    public static String multiply2(String text) {
        //напишите тут ваш код
        return String.valueOf(text).repeat(5);
    }
    public static String multiply2(String text, int count) {
        //напишите тут ваш код
        return String.valueOf(text).repeat(Math.max(0, count - 1));
    }
    public static String multiply3(String text, int count) {
        //напишите тут ваш код
        return String.valueOf(text).repeat(count - 1);
    }

    public static void main(String[] args) {

    }
}
