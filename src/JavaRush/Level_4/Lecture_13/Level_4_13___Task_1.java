package JavaRush.Level_4.Lecture_13;

/*
Четные числа

Используя цикл for вывести на экран чётные числа от 1 до 100 включительно.
Каждое значение вывести с новой строки.
*/

public class Level_4_13___Task_1 {

    public static void main(String[] args) {
        //напишите тут ваш код

        for (int i = 1; i <= 100; i++) {
            if (i % 2 == 0){
                System.out.println(i);
            }
        }
    }
}
