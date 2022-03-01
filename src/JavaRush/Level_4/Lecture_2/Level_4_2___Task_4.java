package JavaRush.Level_4.Lecture_2;

/*
Программа учета имен

Допишите код метода setName,
чтобы с его помощью установить значение private String fullName
равное значению локальной переменной String fullName.
*/

public class Level_4_2___Task_4 {

    private String fullName;

    public void setName(String firstName, String lastName) {
        String fullName = firstName + " " + lastName;
        //напишите тут ваш код
        this.fullName = fullName;
    }

    public static void main(String[] args) {

    }
}
