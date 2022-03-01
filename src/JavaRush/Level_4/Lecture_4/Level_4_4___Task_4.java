package JavaRush.Level_4.Lecture_4;

/*
Время года

Напиши метод checkSeason.
По номеру месяца, метод должен определить время года (зима, весна, лето, осень) и вывести на экран.

Пример для номера месяца 2:
зима

Пример для номера месяца 5:
весна
*/

public class Level_4_4___Task_4 {

    public static void main(String[] args) {
        checkSeason(12);
        checkSeason(4);
        checkSeason(7);
        checkSeason(10);

        //мои тесты:
        System.out.println();
        checkSeason(1);
        checkSeason(2);
        checkSeason(3);
        checkSeason(4);
        checkSeason(5);
        checkSeason(6);
        checkSeason(7);
        checkSeason(8);
        checkSeason(9);
        checkSeason(10);
        checkSeason(11);
        checkSeason(12);
        checkSeason(13);
        checkSeason(0);
    }

    public static void checkSeason(int month) {
        //напишите тут ваш код
        if (month == 1 || month == 2 || month == 12){
            System.out.println("Зима");
        }else if (month > 2 && month < 6){
            System.out.println("Весна");
        }else if (month > 5 && month < 9){
            System.out.println("Лето");
        }else if (month > 8 && month < 12){
            System.out.println("Осень");
        }else{
            System.out.println("Нет такого месяца дядя!");
        }
    }
}
