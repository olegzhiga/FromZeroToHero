package acmp;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Task_0066___Keyboard {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        String inputLetter = bufferedReader.readLine();
        String[] alphabet = new String[]{"q", "w", "e", "r", "t", "y", "u", "i", "o", "p",
                                          "a", "s", "d", "f", "g", "h", "j", "k", "l",
                                            "z", "x", "c", "v", "b", "n", "m", "q"};

        for (int i = 0; i < alphabet.length-1; i++) {
            if (alphabet[i].equals(inputLetter)){
                System.out.println(alphabet[i+1]);
            }
        }
    }
}



/*
Для данной буквы английского алфавита нужно вывести справа стоящую букву на стандартной клавиатуре.
При этом клавиатура замкнута, т.е. справа от буквы «p» стоит буква «a», от буквы «l» стоит буква «z»,
а от буквы «m» — буква «q».

Входные данные
Первая строка входного файла INPUT.TXT содержит один символ — маленькую букву английского алфавита.

Выходные данные
В выходной файл OUTPUT.TXT следует вывести букву стоящую справа от заданной буквы,
с учетом замкнутости клавиатуры.

Примеры
№	INPUT.TXT	OUTPUT.TXT
1	q	        w
2	t	        y
3	p	        a
4	l	        z
5	m	        q
 */
