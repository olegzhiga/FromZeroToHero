package JavaRush.Level_6;

import java.util.ArrayList;

/*
Статические коты

1. В классе Cat добавь публичную статическую переменную cats (ArrayList<Cat>).
2. Пусть при каждом создании кота (нового объекта Cat) в переменную cats добавляется этот новый кот. Создать 10 объектов Cat.
3. Метод printCats должен выводить всех котов на экран. Нужно использовать переменную cats.

Требования:
•	Добавь в класс Cat публичную статическую переменную cats (ArrayList<Cat>).
•	Переменная cats должна быть проинициализирована.
•	Метод main должен создавать 10 объектов Cat (используй конструктор Cat()).
•	Метод main должен добавить всех созданных котов в переменную cats.
•	Метод printCats должен выводить всех котов из переменной cats на экран. Каждого с новой строки.
*/
public class Task_0614___Static_cats {

    //напишите тут ваш код
    public static ArrayList<Task_0614___Static_cats> cats = new ArrayList<>();

    public Task_0614___Static_cats() {
    }

    public static void main(String[] args) {
        //напишите тут ваш код
        for (int i = 0; i < 10; i++) {
            Task_0614___Static_cats cat = new Task_0614___Static_cats();
            cats.add(cat);
        }
        printCats();
    }

    public static void printCats() {
        //напишите тут ваш код
        for (Task_0614___Static_cats s : cats) {
            System.out.println(s);
        }
        System.out.println();
        for (int i = 0; i < cats.size(); i++) {
            System.out.println(cats.get(i));
        }
    }
}
