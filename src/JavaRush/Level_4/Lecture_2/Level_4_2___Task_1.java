package JavaRush.Level_4.Lecture_2;

/*
Как зовут кота?

Помогите коту обрести имя с помощью метода setName.
*/

public class Level_4_2___Task_1 {

    private String name = "безымянный кот";

    public void setName(String name) {
        //напишите тут ваш код
        this.name = name;
    }

    public static void main(String[] args) {
        Level_4_2___Task_1 cat = new Level_4_2___Task_1();
        // ттут вместо Level_4_2___Task_1 должно было быть название класса Cat, так было на сайте,
        // я просто сделал своё название для удобства навигации
        cat.setName("Жужик");
        System.out.println(cat.name);
    }
}
