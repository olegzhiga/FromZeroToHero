package JavaRush.Level_2;
/*
Минимум трёх чисел

Написать функцию, которая вычисляет минимум из трёх чисел.

Подсказка:
Нужно написать тело существующей функции min.
*/

public class Task_02___MinimumOf3Numbers {

    public static void main(String[] args) {
        System.out.println(min(1, 2, 3));
        System.out.println(min(-1, -2, -3));
        System.out.println(min(3, 5, 3));
        System.out.println(min(5, 5, 10));
    }

    public static int min(int a, int b, int c) {
        //напишите тут ваш код
        int m;
        if (a <= b && a <= c){
            m = a;
        } else if (b <= a && b <= c) {
            m = b;
        } else {
            m = c;
        }
        return m;
    }
}

