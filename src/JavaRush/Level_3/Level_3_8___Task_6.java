package JavaRush.Level_3;

/*
Полнометражная картина

Реализуй метод getMetreFromCentimetre(int centimetre).
Метод на вход принимает количество сантиметров.
ужно сделать так, чтобы метод возвращал число полных метров в centimetre. (1 метр = 100 см).

Пример:
Метод getMetreFromCentimetre вызывается с параметром 243.

Пример вывода:
2
*/

public class Level_3_8___Task_6 {
    public static void main(String[] args) {
        System.out.println(getMetreFromCentimetre(243));
    }

    public static int getMetreFromCentimetre(int centimetre) {
        //напишите тут ваш код
        return centimetre/100;
    }
}
