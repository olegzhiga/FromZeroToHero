package acmp;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Task_0940___Orthography {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        String inputText = bufferedReader.readLine();

        // ищу в строке число
        int numOfLetter = Integer.parseInt(String.valueOf(inputText.replaceAll("[^0-9]", "")));

        // удаляю из строки всё кроме букв
        String word = inputText.replaceAll("[^a-zA-Z]", "");

        // тк незнаю как удалить символ из строки, зато знаю как собрать строку от 0 символа до n символа и от n+1 символа до конца
        String s = word.substring(0, numOfLetter-1) + word.substring(numOfLetter);
        System.out.println(s);
    }
}



/*
У студента-филолога Васи есть замечательный друг Петя.
И Петя никак не может выучить английский язык.
Английский текст Петя еще кое-как читает, но пишет с ужасными ошибками, причем чаще всего он вставляет в слова лишние буквы.

Вася решил помочь Пете. Теперь каждый день Вася диктует Пете слова, а Петя их записывает.
После семестра занятий Петя стал писать много лучше и теперь делает в словах только по одной ошибке.
Чтобы автоматизировать процесс исправления ошибок, Вася просит Вас написать программу,
которая удаляет из слова одну лишнюю букву и показывает Пете правильное слово.

Входные данные
Входной файл INPUT.TXT содержит целое число K - номер лишней буквы,
а затем через один или несколько пробелов записано слово S, состоящее из английских букв верхнего регистра.
Гарантируется, что номер буквы не превышает длину слова. Длина слова не более 80 символов.

Выходные данные
В выходной файл OUTPUT.TXT выведите исправленное слово.

Примеры
№	INPUT.TXT	    OUTPUT.TXT
1	4 MISTSPELL	    MISSPELL
2	2       ABC	    AC
 */