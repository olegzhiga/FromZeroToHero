package JavaRush.Level_6;
/*
Три статические переменные name

Добавь 3 public статических переменных: String Solution.name, String Cat.name, String Dog.name.

Требования:
•	В класс Solution добавь public статическую переменную name типа String.
•	В класс Cat добавь public статическую переменную name типа String.
•	В класс Dog добавь public статическую переменную name типа String.
•	В каждом классе должна быть своя переменная name.
*/
public class Task_0619___Three_static_variable_name {
    public static String name = "Solution";

    public static class Cat {
        public static String name = "Cat";
    }

    public static class Dog {
        public static String name = "Dog";
    }

    public static void main(String[] args) {
        System.out.println(Task_0619___Three_static_variable_name.name);
        System.out.println(Cat.name);
        System.out.println(Dog.name);
    }
}
