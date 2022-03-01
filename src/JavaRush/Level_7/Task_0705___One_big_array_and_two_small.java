package JavaRush.Level_7;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/*
Один большой массив и два маленьких

1. Создать массив на 20 чисел.
2. Ввести в него значения с клавиатуры.
3. Создать два массива на 10 чисел каждый.
4. Скопировать большой массив в два маленьких: половину чисел в первый маленький, вторую половину во второй маленький.
5. Вывести второй маленький массив на экран, каждое значение выводить с новой строки.

Требования:
•	Программа должна создавать большой массив на 20 целых чисел.
•	Программа должна считывать с клавиатуры 20 чисел для большого массива.
•	Программа должна создавать два маленьких массива на 10 чисел каждый.
•	Программа должна скопировать одну половину большого массива в первый маленький, а вторую - во второй и вывести второй маленький массив на экран.
*/
public class Task_0705___One_big_array_and_two_small {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        int [] bigArray = new int[20];
        int [] smallArray1 = new int[10];
        int [] smallArray2 = new int[10];
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));

        for (int i = 0; i < bigArray.length; i++) {
            System.out.print("Enter " + i + "/" + (bigArray.length-1) + " element of array: ");
            bigArray[i] = Integer.parseInt(bf.readLine());
        }
// Первое что пришло в голову:
//        for (int i = 0; i < smallArray1.length; i++) {
//            smallArray1[i] = bigArray[i];
//        }
//        for (int i = 0; i < smallArray2.length; i++) {
//            smallArray2[i] = bigArray[i+10];
//        }


// Метод System.arraycopy() принимает несколько параметров:
//Первый параметр - массив-источник.
//Второй параметр - позиция начала нового массива.
//Третий параметр - массив-назначения.
//Четвертый параметр - начальным положением целевого массива.
//Пятый параметр - количество элементов, которые будут скопированы.
        System.arraycopy(bigArray, 0, smallArray1, 0, 10);
        System.arraycopy(bigArray, 10, smallArray2, 0, 10);

        for (int i : smallArray2) {
            System.out.println(i);
        }
    }
}
