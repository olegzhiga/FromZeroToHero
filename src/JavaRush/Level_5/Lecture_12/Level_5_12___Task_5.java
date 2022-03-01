package JavaRush.Level_5.Lecture_12;

/*
Консоль-копилка

Вводить с клавиатуры числа и считать их сумму, пока пользователь не введет слово "сумма".
Вывести на экран полученную сумму.

Подсказка: реализовать считывание с клавиатуры, пока не будет введена определенная строка,
например "exit", можно с помощью следующей конструкции:

BufferedReader buffer = new BufferedReader(new InputStreamReader(System.in));
while (true)
{
	String s = buffer.readLine();
	if (s.equals("exit"))
		break;
}

*/

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Level_5_12___Task_5 {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код

        BufferedReader bfReader = new BufferedReader(new InputStreamReader(System.in));
        int count = 0;
        while (true){
            String stopWord = bfReader.readLine();
                if (stopWord.equals("сумма")){
                    System.out.println(count);
                    break;
                }
            count += Integer.parseInt(stopWord);
        }
    }
}
