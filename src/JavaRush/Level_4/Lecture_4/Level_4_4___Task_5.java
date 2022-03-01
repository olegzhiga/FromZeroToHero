package JavaRush.Level_4.Lecture_4;

/*
Положительное и отрицательное число

Ввести с клавиатуры число.
Если число положительное, то увеличить его в два раза.
Если число отрицательное, то прибавить единицу.
Если введенное число равно нулю, необходимо вывести ноль.
Вывести результат на экран.
*/

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Level_4_4___Task_5 {

    public static void main(String[] args) throws Exception {
        //напишите тут ваш код

        BufferedReader bfReader = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Введите любое целое число: ");
        int z = Integer.parseInt(bfReader.readLine());
        if (z > 0){
            System.out.println(z*2);
        }else if (z < 0){
            System.out.println(z+1);
        }else {
            System.out.println(z);
        }
    }
}
