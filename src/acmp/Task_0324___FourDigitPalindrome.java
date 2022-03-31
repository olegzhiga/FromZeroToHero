package acmp;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Task_0324___FourDigitPalindrome {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        String inputText = bufferedReader.readLine();
        String reverseInputText = new StringBuilder(inputText.replaceAll("\\W","")).reverse().toString();
        if (inputText.replaceAll("\\W","").equals(reverseInputText)){
            System.out.println("YES");
        }else{
            System.out.println("NO");
        }
    }
}



/*
Требуется написать программу, определяющую, является ли четырехзначное натуральное число N палиндромом,
т.е. числом, которое одинаково читается слева направо и справа налево.

Входные данные
Входной файл INPUT.TXT содержит натуральное число N (1000 ≤ N ≤ 9999).

Выходные данные
В выходной файл OUTPUT.TXT следует вывести слово «YES», если число N является палиндромом,
или «NO» – если нет.

Примеры
№	INPUT.TXT	OUTPUT.TXT
1	6116	    YES
2	1231	    NO
 */
