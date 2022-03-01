package JavaRush.Level_4.Lecture_6;

/*
Настя или Настя?

Ввести с клавиатуры два имени, и если имена одинаковые вывести сообщение "Имена идентичны".
Если имена разные, но их длины равны - вывести сообщение - "Длины имен равны".
Если имена и длины имен разные - ничего не выводить.
*/

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Level_4_6___Task_4 {

    public static void main(String[] args) throws Exception {
        //напишите тут ваш код

        BufferedReader bfReader = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Введите первое имя: ");
        String name1 = bfReader.readLine();
        System.out.print("Введите второе имя: ");
        String name2 = bfReader.readLine();

        if (name1.equals(name2)){
            System.out.println("Имена идентичны");
        }else if(name1.length() == name2.length()){
            System.out.println("Длины имен равны");
        }
    }
}
