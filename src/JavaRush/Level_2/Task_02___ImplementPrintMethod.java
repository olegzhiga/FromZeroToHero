package JavaRush.Level_2;
/*
Реализуем метод print

Допиши код в методе print,
чтобы он выводил на экран каждую переданную в него строку 4 раза.
Каждый раз с новой строки.

На экран должно быть выведено:
Java is easy to learn!
Java is easy to learn!
Java is easy to learn!
Java is easy to learn!
Java is object-oriented!
Java is object-oriented!
Java is object-oriented!
Java is object-oriented!
Java is platform-independent!
Java is platform-independent!
Java is platform-independent!
Java is platform-independent!

public class Solution {

    public static void main(String[] args) {
        print("Java is easy to learn!");
        print("Java is object-oriented!");
        print("Java is platform-independent!");
    }

    public static void print(String text) {
        //напишите тут ваш код
    }
}
*/
public class Task_02___ImplementPrintMethod {

    public static void main(String[] args) {
        print("Java is easy to learn!");
        print("Java is object-oriented!");
        print("Java is platform-independent!");
    }

    public static void print(String text) {
        //напишите тут ваш код
        for (int i = 0; i < 4; i++) {
            System.out.println(text);
        }
    }


}
