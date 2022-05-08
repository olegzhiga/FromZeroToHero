package acmp;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Task_0550___ProgrammerDay {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        int year = Integer.parseInt(bufferedReader.readLine());

        String day;
        String yearString;

        if ((year % 400 == 0) || (year % 4 == 0 && year % 100 != 0)){
            day = "12/09/";
        }else {
            day = "13/09/";
        }

        if (year < 10){
            yearString = "000" + year;
        }else if(year < 100){
            yearString = "00" + year;
        }else if(year < 1000){
            yearString = "0" + year;
        }else{
            yearString = "" + year;
        }

        System.out.println(day + yearString);
    }
}

// Это я написал первое что в голову пришло, написал правильно,
// но чертов сайт оказалось требует, что типа если год 5 то запись должна быть 0005 ... вот сука статистику только попортил себе (((
//        if (year % 100 == 0){
//            if (year % 400 == 0){
//                System.out.println("12/09/" + year);
//            }else {
//                System.out.println("13/09/" + year);
//            }
//        }else if (year % 4 == 0){
//            System.out.println("12/09/" + year);
//        }else{
//            System.out.println("13/09/" + year);
//        }


/*
День программиста отмечается в 255-й день года (при этом 1 января считается нулевым днем).
Требуется написать программу, которая определит дату (месяц и число григорианского календаря),
на которую приходится День программиста в заданном году.

В григорианском календаре високосным является:

год, номер которого делится нацело на 400
год, номер которого делится на 4, но не делится на 100
Входные данные
В единственной строке входного файла INPUT.TXT записано целое число от 1 до 9999 включительно,
которое обозначает номер года нашей эры.

Выходные данные
В единственную строку выходного файла OUTPUT.TXT нужно вывести дату Дня программиста в формате DD/MM/YYYY,
где DD — число, MM — номер месяца (01 — январь, 02 — февраль, ..., 12 — декабрь), YYYY — год в десятичной записи.

Примеры
№	INPUT.TXT	OUTPUT.TXT
1	2000	    12/09/2000
2	2009	    13/09/2009
 */