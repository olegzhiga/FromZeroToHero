package JavaRush.Level_4.Lecture_4;

/*
Правило треугольника

Ввести с клавиатуры три числа а, b, c - стороны предполагаемого треугольника.
Определить возможность существования треугольника по сторонам.
Результат вывести на экран в следующем виде:
"Треугольник существует." - если треугольник с такими сторонами существует.
"Треугольник не существует." - если треугольник с такими сторонами не существует.

Подсказка:
Треугольник существует только тогда, когда сумма двух его сторон больше третьей.
Требуется сравнить каждую сторону с суммой двух других.
Если хотя бы в одном случае сторона окажется больше либо равна сумме двух других,
то треугольника с такими сторонами не существует.
*/

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Level_4_4___Task_8 {

    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        BufferedReader bfReader = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Введите первое целое число: ");
        int a = Integer.parseInt(bfReader.readLine());
        System.out.print("Введите второе целое число: ");
        int b = Integer.parseInt(bfReader.readLine());
        System.out.print("Введите третье целое число: ");
        int c = Integer.parseInt(bfReader.readLine());

        if(a >= b + c){
            System.out.println("Треугольник не существует.");
        }else if(b >= a + c){
            System.out.println("Треугольник не существует.");
        }else if(c >= a + b){
            System.out.println("Треугольник не существует.");
        }else{
            System.out.println("Треугольник существует.");
        }
    }
}
