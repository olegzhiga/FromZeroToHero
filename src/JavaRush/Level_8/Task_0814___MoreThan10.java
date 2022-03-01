package JavaRush.Level_8;

import java.util.HashSet;
import java.util.Set;

/*
Больше 10? Вы нам не подходите

Создать множество чисел(Set<Integer>), занести туда 20 различных чисел.
Удалить из множества все числа больше 10.

Требования:
•	Программа не должна выводить текст на экран.
•	Программа не должна считывать значения с клавиатуры.
•	Класс Solution должен содержать только три метода.
•	Метод createSet() должен создавать и возвращать множество Set состоящих из 20 различных чисел.
•	Метод removeAllNumbersGreaterThan10() должен удалять из множества все числа больше 10.
*/
public class Task_0814___MoreThan10 {
    public static Set<Integer> createSet() {
        // напишите тут ваш код
        Set<Integer> integerSet = new HashSet<>();
        for (int i = 0; i < 20; i++) {
            integerSet.add((int) Math.ceil(Math.random() * 100));
        }
        return integerSet;
    }

    public static Set<Integer> removeAllNumbersGreaterThan10(Set<Integer> set) {
        // напишите тут ваш код
//        for (Integer i : set) {
//            if (i > 10){
//                set.remove(i);
//            }
//        }
        set.removeIf(i -> i > 10);
        return set;
    }

    public static void main(String[] args) {

    }
}
