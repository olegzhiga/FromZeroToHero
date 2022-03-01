package JavaRush.Level_7;

/*
Семейная перепись

Создай класс Human с полями имя(String), пол(boolean), возраст(int), отец(Human), мать(Human). Создай объекты и заполни их так, чтобы получилось: Два дедушки, две бабушки, отец, мать, трое детей. Вывести объекты на экран.

Примечание:
Если написать свой метод String toString() в классе Human, то именно он будет использоваться при выводе объекта на экран.

Пример вывода:
Имя: Аня, пол: женский, возраст: 21, отец: Павел, мать: Катя
Имя: Катя, пол: женский, возраст: 55
Имя: Игорь, пол: мужской, возраст: 2, отец: Михаил, мать: Аня
...

Требования:
•	Программа не должна считывать данные с клавиатуры.
•	Добавить в класс Human поля: имя(String), пол(boolean), возраст(int), отец(Human), мать(Human).
•	Добавить в класс конструктор public Human(String name, boolean sex, int age).
•	Добавить в класс конструктор public Human(String name, boolean sex, int age, Human father, Human mother).
•	Создай 9 разных объектов типа Human (4 объекта без отца и матери и 5 объектов с ними)).
•	Выведи созданные объекты на экран.
*/
public class Task_0724___FamilyCensus {
    public static void main(String[] args) {
        // напишите тут ваш код
        Human grandFa1 = new Human("grandFa1", true, 80);
        Human grandFa2 = new Human("grandFa2", true, 80);
        Human grandMo1 = new Human("grandMo1", false, 60);
        Human grandMo2 = new Human("grandMo2", false, 60);
        Human father = new Human("father", true, 40, grandFa1, grandMo1);
        Human mother = new Human("mother", false, 20, grandFa2, grandMo2);
        Human son = new Human("son", true, 10, father, mother);
        Human daughter = new Human("daughter", false, 5, father, mother);
        Human daughter2 = new Human("daughter2", false, 1, father, mother);

        System.out.println(grandFa1.toString());
        System.out.println(grandMo1.toString());
        System.out.println(grandFa2.toString());
        System.out.println(grandMo2.toString());
        System.out.println(father.toString());
        System.out.println(mother.toString());
        System.out.println(son.toString());
        System.out.println(daughter.toString());
        System.out.println(daughter2.toString());
    }

    public static class Human {
        // напишите тут ваш код
        String name;
        Boolean sex;
        int age;
        Human father;
        Human mother;

        public Human(String name, Boolean sex, int age){
            this.name = name;
            this.sex = sex;
            this.age = age;
        }
        public Human(String name, Boolean sex, int age, Human father, Human mother){
            this.name = name;
            this.sex = sex;
            this.age = age;
            this.father = father;
            this.mother = mother;
        }

        @Override
        public String toString() {
            String text = "";
            text += "Имя: " + this.name;
            text += ", пол: " + (this.sex ? "мужской" : "женский");
            text += ", возраст: " + this.age;

            if (this.father != null) {
                text += ", отец: " + this.father.name;
            }

            if (this.mother != null) {
                text += ", мать: " + this.mother.name;
            }

            return text;
        }
    }
}
