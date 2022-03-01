package JavaRush.Level_6.Lecture_8;
/*
Классовый счетчик

Создать статическую переменную int catCount в классе Cat.
Создай конструктор [public Cat()], в котором увеличивай данную переменную на 1.

Требования:
•	Добавь в класс Cat конструктор.
•	Конструктор должен быть public.
•	Добавь в класс Cat поле catCount.
•	Поле catCount должно быть типа int.
•	Поле catCount должно быть статическим.
•	Конструктор класса должен на 1 увеличивать значение переменной catCount.
*/
public class Level_6_8___Task_1 {
    //напишите тут ваш код
    static int catCount;

    public Level_6_8___Task_1(){
        catCount++;
        System.out.println(catCount);
    }
    public static void main(String[] args) {

        // only for testing:
        Level_6_8___Task_1 cat1 = new Level_6_8___Task_1();
        Level_6_8___Task_1 cat2 = new Level_6_8___Task_1();

    }
}
