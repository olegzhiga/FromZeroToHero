package JavaRush.Level_4.Lecture_1;

/*
Мне не подходит этот возраст…

Подумайте, что делает программа.
Исправь ошибку в программе чтобы переменная age объекта person изменила свое значение.

Подсказка:
тщательно просмотрите метод adjustAge
*/

public class Level_4_1___Task_1 {

    public static void main(String[] args) {
        Person person = new Person();
        System.out.println("Age is: " + person.age);
        person.adjustAge(person.age);
        System.out.println("Adjusted age is: " + person.age);
    }

    public static class Person {
        public int age = 20;

        public void adjustAge(int age) {
            // добавил this.
            this.age = age + 20;
            System.out.println("Age in adjustAge() is: " + age);
        }
    }
}
