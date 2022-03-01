package JavaRush.Level_4.Lecture_13;

/*
Рисуем прямоугольник

Ввести с клавиатуры два числа m и n.
Используя цикл for вывести на экран прямоугольник размером m на n из восьмёрок.

Пример: m=2, n=4
8888
8888
*/

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Level_4_13___Task_2 {

    public static void main(String[] args) throws Exception {
        //напишите тут ваш код

        BufferedReader bfReader = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Введите первое целое и положительное число: ");
        int m = Integer.parseInt(bfReader.readLine());
        System.out.print("Введите второе целое и положительное число: ");
        int n = Integer.parseInt(bfReader.readLine());

        for (int i = 1; i <= m; i++) {
            for (int j = 1; j <= n; j++) {
                System.out.print(8);
            }
            System.out.println();
        }
    }
}
