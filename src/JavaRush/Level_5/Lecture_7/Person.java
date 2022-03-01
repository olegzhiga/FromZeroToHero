package JavaRush.Level_5.Lecture_7;

/*
Инициализация объектов

Изучи внимательно класс Person.
Исправь класс так, чтобы только один метод initialize инициализировал все переменные класса Person.
*/

public class Person {
    String name;
    char sex;
    int money;
    int weight;
    double size;

//    public void initialize(String name) {
//        this.name = name;
//    }
//
//    public void initialize(String name, char sex) {
//        this.name = name;
//        this.sex = sex;
//    }

    public void initialize(String name, int money, char sex, int weight, double size) {
        this.name = name;
        this.money = money;
        this.sex = sex;
        this.weight = weight;
        this.size = size;
    }

    public static void main(String[] args) {

    }
}
// просто закомментировал первые два метода и в последнем добавил недостающие параметры и переменные.