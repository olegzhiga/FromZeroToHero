package JavaRush.Level_6.Lecture_5;
/*
Пустые кошки, пустые псы

В каждом классе Cat и Dog написать метод finalize,
который выводит на экран текст о том, что такой-то объект уничтожен.

Требования:
•	В классе Cat должен быть void метод finalize.
•	В классе Dog должен быть void метод finalize.
•	В классах Cat и Dog не должно быть конструкторов или должны быть конструкторы без параметров.
•	Метод finalize класса Cat должен выводить на экран "A Cat was destroyed".
•	Метод finalize класса Dog должен выводить на экран "A Dog was destroyed".
*/
public class Level_6_5___Task_2 {
    public static void main(String[] args) throws Throwable {
    // для проверки выполнения условий:
    Level_6_5___Task_2 cat = new Level_6_5___Task_2();
    Dog dog = new Dog();
    cat.finalize();
    dog.finalize();
    }
    //напишите тут ваш код
    public void finalize () throws Throwable{
        System.out.println("A Cat was destroyed");
    }
}

class Dog{
    //напишите тут ваш код
    public void finalize () throws Throwable{
        System.out.println("A Dog was destroyed");
    }
}