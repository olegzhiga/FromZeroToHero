package JavaRush.Level_5.Lecture_7;

/*
Программист создает человека

Создать class Person. У человека должно быть имя String name, возраст int age.
Добавь метод initialize(String name, int age), в котором проинициализируй переменные name и age.
В методе main создай объект Person, занеси его ссылку в переменную person.
Вызови метод initialize с любыми значениями.
*/

public class Man {

    public static void main(String[] args) {
        //напишите тут ваш код
        Person person = new Person();
        person.initialize("Vazgen", 21);
    }

    static class Person {
        //напишите тут ваш код
        String name;
        int age;

        public void initialize (String name, int age){
            this.name = name;
            this.age = age;
        }
    }

}
