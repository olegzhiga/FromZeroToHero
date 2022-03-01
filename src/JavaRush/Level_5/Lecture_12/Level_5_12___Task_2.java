package JavaRush.Level_5.Lecture_12;

/*
Мужчина и женщина

1. Внутри класса Solution создай public static классы Man и Woman.
2. У классов должны быть поля: name (String), age (int), address (String).
3. Создай конструкторы, в которые передаются все возможные параметры.
4. Создай по два объекта каждого класса со всеми данными используя конструктор.
5. Объекты выведи на экран в таком формате: name + " " + age + " " + address
*/

public class Level_5_12___Task_2 {

    public static void main(String[] args) {
        //напишите тут ваш код
        Man man1 = new Man("Maga", 27, "Makachkala");
        Man man2 = new Man("Islam", 21, "Grozny");
        Woman woman1 = new Woman("Tamara", 20, "Dombai");
        Woman woman2 = new Woman("Aisha", 19, "Vladikavkaz");
        System.out.println(man1.name + " " + man1.age + " " + man1.address);
        System.out.println(man2.name + " " + man2.age + " " + man2.address);
        System.out.println(woman1.name + " " + woman1.age + " " + woman1.address);
        System.out.println(woman2.name + " " + woman2.age + " " + woman2.address);
    }

    //напишите тут ваш код
    public static class Man{
        String name;
        int age;
        String address;

        public Man(String name){
            this.name = name;
        }
        public Man(String name, int age){
            this.name = name;
            this.age = age;
        }
        public Man(String name, int age, String address){
            this.name = name;
            this.age = age;
            this.address = address;
        }
    }

    public static class Woman {
        String name;
        int age;
        String address;

        public Woman(String name) {
            this.name = name;
        }
        public Woman(String name, int age) {
            this.name = name;
            this.age = age;
        }
        public Woman(String name, int age, String address) {
            this.name = name;
            this.age = age;
            this.address = address;
        }
    }
}
/*
ВОТ ТАК НАДОБЫЛО СДЕЛАТЬ ЧТОБЫ ЛЕГКО ВЫВОДИТЬ ДАННЫЕ ЧЕРЕЗ sout

public String toString() {
            return (name + " " + age + " " + address);
        }

 */