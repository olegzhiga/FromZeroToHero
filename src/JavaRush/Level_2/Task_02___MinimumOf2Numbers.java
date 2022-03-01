package JavaRush.Level_2;
/*
Минимум двух чисел

Написать функцию, которая возвращает минимум из двух чисел.

Подсказка:
Нужно написать тело существующей функции min.
*/
public class Task_02___MinimumOf2Numbers {

    public static void main(String[] args) {
        System.out.println(min(12, 33));
        System.out.println(min(-20, 0));
        System.out.println(min(-10, -20));
        System.out.println();
        System.out.println(min2(12, 33));
        System.out.println(min2(-20, 0));
        System.out.println(min2(-10, -20));
    }

    public static int min(int a, int b) {
        //напишите тут ваш код
        int m;

        if (a < b) {
            m = a;
        }else {
            m = b;
        }
        return m;
    }
    public static int min2(int a, int b) {
        //напишите тут ваш код
        return Math.min(a, b);
    }
}
