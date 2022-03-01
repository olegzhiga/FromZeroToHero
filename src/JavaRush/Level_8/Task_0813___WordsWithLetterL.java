package JavaRush.Level_8;

import java.util.HashSet;
import java.util.Set;

/*
20 слов на букву «Л»

Создать множество строк (Set<String>), занести в него 20 слов на букву "Л".

Требования:
•	Не изменяй заголовок метода createSet().
•	Программа не должна выводить текст на экран.
•	Программа не должна считывать значения с клавиатуры.
•	Метод createSet() должен создавать и возвращать множество (реализация HashSet).
•	Множество из метода createSet() должно содержать 20 слов на букву «Л».
*/
public class Task_0813___WordsWithLetterL {
    public static Set<String> createSet() {
        //напишите тут ваш код
        Set<String> letterLSet = new HashSet<>();
        for (int i = 0; i < 20; i++) {
            letterLSet.add("Л");
        }
        return letterLSet;
    }

    public static void main(String[] args) {
    }
}
