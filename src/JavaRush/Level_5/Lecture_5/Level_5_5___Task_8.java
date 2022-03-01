package JavaRush.Level_5.Lecture_5;

/*
Геттеры и сеттеры для класса Person

Создать class Person. У человека должно быть имя String name, возраст int age, пол char sex.
Создай геттеры и сеттеры для всех переменных класса Person.
*/

public class Level_5_5___Task_8 {

    //напишите тут ваш код
    String name;
    int age;
    char sex;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public char getSex() {
        return sex;
    }

    public void setSex(char sex) {
        this.sex = sex;
    }

    public static void main(String[] args) {

    }
}
