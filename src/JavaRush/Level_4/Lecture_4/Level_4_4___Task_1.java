package JavaRush.Level_4.Lecture_4;

/*
Хорошо или плохо?

Написать метод compare(int number), чтобы он:
- выводил на экран строку "Число меньше 5", если параметр метода меньше 5,
- выводил строку "Число больше 5", если параметр метода больше 5,
- выводил строку "Число равно 5", если параметр метода равен 5.
*/

public class Level_4_4___Task_1 {

    public static void main(String[] args) {
        compare(3);
        compare(6);
        compare(5);
    }

    public static void compare(int number) {
        //напишите тут ваш код
        // решение с помощью условного оперотора if else:
        if (number < 5){
            System.out.println("Число меньше 5");
        }else if (number > 5){
            System.out.println("Число больше 5");
        }else{
            System.out.println("Число равно 5");
        }
        // решение с помощью тернанрного оператора (прокатит только если ответа два а услови дофига):
        System.out.println(number < 5 ? "Число меньше 5" : "Число больше 5");
        // а вот так делается тернарный оператор, который может работать и с тремя и с четырмя переменными:
        System.out.println(number == 5 ? "Число равно 5" : (number < 5 ? "Число меньше 5" : "Число больше 5"));
    }
}
