package JavaRush.Level_2;
/*
Минимум четырех чисел

Написать функцию, которая вычисляет минимум из четырёх чисел.
Функция min(a,b,c,d) должна использовать (вызывать) функцию min(a,b)

Подсказка:
Нужно написать тело двух существующих функций min.
*/
public class Task_02___MinimumOf4Numbers {

    public static int min(int a, int b, int c, int d) {
        //напишите тут ваш код
        int m;
        if (min(a,b) <= c && min(a,b) <= d){
            m = min(a,b);
        } else if (c <= min(a,b) && c <= d) {
            m = c;
        } else {
            m = d;
        }
        return m;
    }

    public static int min(int a, int b) {
        //напишите тут ваш код
        return Math.min(a, b);
    }

    public static void main(String[] args) throws Exception {
        System.out.println(min(-20, -10));
        System.out.println(min(-40, -10, -30, 40));
        System.out.println(min(-20, -40, -30, 40));
        System.out.println(min(-20, -10, -40, 40));
        System.out.println(min(-20, -10, -30, -40));
    }
}
