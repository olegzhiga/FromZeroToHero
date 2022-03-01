package JavaRush.Level_5.Lecture_12;

/*
Вывести на экран сегодняшнюю дату

Вывести на экран текущую дату в аналогичном виде "21 02 2014".
*/

import java.text.SimpleDateFormat;
import java.util.Date;

public class Level_5_12___Task_4 {
    public static void main(String[] args) {
        //напишите тут ваш код
        System.out.println(new SimpleDateFormat("dd MM yyyy").format(new Date()));

        Date date = new Date();
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd MM yyyy");
        System.out.println(simpleDateFormat.format(date));


    }
}
