package JavaRush.Level_4.Lecture_7;

/*
Описываем числа

Ввести с клавиатуры целое число в диапазоне 1 - 999. Вывести его строку-описание следующего вида:
"четное однозначное число" - если число четное и имеет одну цифру,
"нечетное однозначное число" - если число нечетное и имеет одну цифру,
"четное двузначное число" - если число четное и имеет две цифры,
"нечетное двузначное число" - если число нечетное и имеет две цифры,
"четное трехзначное число" - если число четное и имеет три цифры,
"нечетное трехзначное число" - если число нечетное и имеет три цифры.
Если введенное число не попадает в диапазон 1 - 999, в таком случае ничего не выводить на экран.

Пример для числа 100:
четное трехзначное число

Пример для числа 51:
нечетное двузначное число
*/

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Level_4_7___Task_3 {

    public static void main(String[] args) throws Exception {
        //напишите тут ваш код

        BufferedReader bfReader = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Введите число от 1 до 999: ");
        int value1 = Integer.parseInt(bfReader.readLine());

        // тут я перевожу int в строку для того чтобы воспользоваться методом .length();
        // для подсчёта колличества символов в числе.
        String value1String = Integer.toString(value1);
        int countOfDigits = value1String.length();

        // тут я просто сократил сравнение для чётных и нечётных чисел.
        // потому что ими приходится часто пользоваться.
        boolean even = value1 % 2 == 0;
        boolean uneven = value1 % 2 != 0;

        // тут я просто сократил сколько в строке чисел.
        // потому что ими приходится часто пользоваться.
        boolean singleDigitNumber = countOfDigits == 1;
        boolean twoDigitNumber = countOfDigits == 2;
        boolean threeDigitNumber = countOfDigits == 3;

        if (value1 > 0 && value1 < 1000){
            if (singleDigitNumber && even){
                System.out.println("четное однозначное число");
            }else if (singleDigitNumber && uneven){
                System.out.println("нечетное однозначное число");
            }else if (twoDigitNumber && even){
                System.out.println("четное двузначное число");
            }else if (twoDigitNumber && uneven){
                System.out.println("нечетное двузначное число");
            }else if (threeDigitNumber && even){
                System.out.println("четное трехзначное число");
            }else if (threeDigitNumber && uneven){
                System.out.println("нечетное трехзначное число");
            }
        }

        System.out.println();

        if (value1 > 0 && value1 < 1000){
            if (countOfDigits == 1 && value1 % 2 == 0){
                System.out.println("четное однозначное число");
            }else if (countOfDigits == 1 && value1 % 2 != 0){
                System.out.println("нечетное однозначное число");
            }else if (countOfDigits == 2 && value1 % 2 == 0){
                System.out.println("четное двузначное число");
            }else if (countOfDigits == 2 && value1 % 2 != 0){
                System.out.println("нечетное двузначное число");
            }else if (countOfDigits == 3 && value1 % 2 == 0){
                System.out.println("четное трехзначное число");
            }else if (countOfDigits == 3 && value1 % 2 != 0){
                System.out.println("нечетное трехзначное число");
            }
        }

    }
}
