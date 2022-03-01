package JavaRush.Level_5.Lecture_5;

/*
Трикотаж

Пару задач назад студенты секретного центра JavaRush создавали класс Cat.
Теперь пришла пора реализовать котов во плоти, разумеется по образу и подобию класса Cat,
а точнее - основываясь на нём, как на шаблоне.
Их - котов - должно быть трое. Наполните этих троих жизнью, то есть, конкретными данными.
*/

public class Level_5_5___Task_4 {

    public static void main(String[] args) {
        //напишите тут ваш код
        Cat cat1 = new Cat("Vaska", 2, 1, 3);
        Cat cat2 = new Cat("Kivi" ,2,1,3);
        Cat cat3 = new Cat("Tayson", 1,1,2);
    }

    public static class Cat {
        private String name;
        private int age;
        private int weight;
        private int strength;

        public Cat(String name, int age, int weight, int strength) {
            this.name = name;
            this.age = age;
            this.weight = weight;
            this.strength = strength;
        }
    }
}
