package JavaRush.Level_4.Lecture_10___while;

/*
Гадание на долларовый счет

Вывести на экран квадрат из 10х10 букв S используя цикл while.
Буквы в каждой строке не разделять.

Пример вывода на экран:
SSSSSSSSSS
SSSSSSSSSS
SSSSSSSSSS
SSSSSSSSSS
SSSSSSSSSS
SSSSSSSSSS
SSSSSSSSSS
SSSSSSSSSS
SSSSSSSSSS
SSSSSSSSSS
*/

public class Level_4_10___Task_4 {

    public static void main(String[] args) {
        //напишите тут ваш код

        int z = 1;
        int zx = 1;
        while (z <= 10){
            while (zx <= 10){
                System.out.print("S");
                zx++;
            }
            System.out.println();
            zx = 1;
            z++;
        }
    }
}
