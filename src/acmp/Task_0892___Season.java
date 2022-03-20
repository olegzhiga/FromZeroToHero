package acmp;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Task_0892___Season {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        int seasonNumber = Integer.parseInt(bufferedReader.readLine());
        if (seasonNumber == 12 || seasonNumber == 1 || seasonNumber == 2){
            System.out.println("Winter");
        }else if(seasonNumber == 3 || seasonNumber == 4 || seasonNumber == 5){
            System.out.println("Spring");
        }else if(seasonNumber == 6 || seasonNumber == 7 || seasonNumber == 8){
            System.out.println("Summer");
        }else if(seasonNumber == 9 || seasonNumber == 10 || seasonNumber == 11){
            System.out.println("Autumn");
        }else{
            System.out.println("Error");
        }
    }
}



/*
По заданному номеру месяца в году требуется определить время года.

Входные данные
Входной файл INPUT.TXT содержит натуральное число N (N≤100) – номер месяца.

Выходные данные
В выходной файл OUTPUT.TXT выведите для летних месяцев значение «Summer»,
для зимних – «Winter», для весенних – «Spring», для осенних – «Autumn».
Если число не соответствует возможному значению месяца, то в этом случае следует вывести «Error».

Примеры
№	INPUT.TXT	OUTPUT.TXT
1	3	Spring
2	15	Error
 */
