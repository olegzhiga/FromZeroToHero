package JavaRush.Level_6.Lecture_5;
/*
По 50 000 объектов Cat и Dog

Создать в цикле по 50 000 объектов Cat и Dog.
(Java-машина должна начать уничтожать неиспользуемые, и метод finalize хоть раз да вызовется).

Требования:
•	В классе Cat должен быть void метод finalize.
•	В классе Dog должен быть void метод finalize.
•	Метод finalize класса Cat должен выводить на экран "A Cat was destroyed".
•	Метод finalize класса Dog должен выводить на экран "A Dog was destroyed".
•	Метод main должен создавать 50000 объектов типа Cat и 50000 объектов типа Dog.
*/
public class Level_6_5___Task_3 {
    public static void main(String[] args) {
        // напишите тут ваш код
        for (int i = 0; i < 50000; i++) {
            Cat2 cat = new Cat2();
            Dog2 dog = new Dog2();
        }
    }
}
class Cat2 {
    @Override
    protected void finalize() throws Throwable {
        super.finalize();
        System.out.println("A Cat was destroyed");
    }
}

class Dog2 {
    @Override
    protected void finalize() throws Throwable {
        super.finalize();
        System.out.println("A Dog was destroyed");
    }
}
