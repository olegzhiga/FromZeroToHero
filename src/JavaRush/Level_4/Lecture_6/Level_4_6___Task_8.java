package JavaRush.Level_4.Lecture_6;

/*
Цель установлена!

Ввести с клавиатуры два целых числа,
которые будут координатами точки, не лежащей на координатных осях OX и OY.
Вывести на экран номер координатной четверти, в которой находится данная точка.

Подсказка:
Принадлежность точки с координатами (a,b) к одной из четвертей определяется следующим образом:
для первой четверти a>0 и b>0;
для второй четверти a<0 и b>0;
для третьей четверти a<0 и b<0;
для четвертой четверти a>0 и b<0.

Пример для чисел 4 6:
1

Пример для чисел -6 -6:
3
*/

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Level_4_6___Task_8 {

    public static void main(String[] args) throws Exception {
        //напишите тут ваш код

        BufferedReader bfReader = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Введите координату OX: ");
        int coordinateOX = Integer.parseInt(bfReader.readLine());
        System.out.print("Введите координату OY: ");
        int coordinateOY = Integer.parseInt(bfReader.readLine());

        if (coordinateOX > 0 && coordinateOY > 0){
            System.out.println("1");
        }else if (coordinateOX < 0 && coordinateOY > 0) {
            System.out.println("2");
        }else if (coordinateOX < 0 && coordinateOY < 0){
            System.out.println("3");
        }else if (coordinateOX > 0 && coordinateOY < 0){
            System.out.println("4");
        }

        System.out.println();

        if (coordinateOX > 0 && coordinateOY > 0){
            System.out.println("I");
        }else if (coordinateOX < 0 && coordinateOY > 0) {
            System.out.println("II");
        }else if (coordinateOX < 0 && coordinateOY < 0){
            System.out.println("III");
        }else if (coordinateOX > 0 && coordinateOY < 0){
            System.out.println("IV");
        }
    }
}
