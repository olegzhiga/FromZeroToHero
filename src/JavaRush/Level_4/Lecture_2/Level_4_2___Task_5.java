package JavaRush.Level_4.Lecture_2;

/*
Кошки во Вселенной

Написать код, чтобы правильно считалось количество созданных котов (count)
и на экран выдавалось правильное их количество.
*/

public class Level_4_2___Task_5 {

    public static void main(String[] args) {
        Cat cat1 = new Cat();
        //напишите тут ваш код
        //Cat.count += 1;

        Cat cat2 = new Cat();
        //напишите тут ваш код
        //Cat.count += 1;

        System.out.println("The cat count is " + Cat.count);
    }

    public static class Cat {
        public static int count = 0;
        // 3) В классе Cat создать конструктор без параметров,
        // который будет увеличивать переменную count на 1 при создании нового объекта класса Cat
        // значит то, что написал я Cat.count += 1; МОЖНО УПРОСТИТЬ !!!
        public Cat(){
            count++;
        }
    }
}
