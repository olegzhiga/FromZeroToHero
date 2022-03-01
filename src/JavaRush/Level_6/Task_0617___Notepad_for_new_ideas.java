package JavaRush.Level_6;
/*
Блокнот для новых идей

1. В классе Solution создать public static класс Idea.
2. В классе Idea создать метод public String getDescription(), который будет возвращать любую строку.
3. В классе Solution создай статический метод public void printIdea(Idea idea), который будет выводить на экран описание идеи - это то, что возвращает метод getDescription().

Требования:
•	В классе Solution создать public static класс Idea.
•	В классе Idea создать метод public String getDescription().
•	Метод getDescription должен возвращать любую строку.
•	В классе Solution создай метод public static void printIdea(Idea idea).
•	Метод printIdea должен выводить описание идеи на экран.
*/
public class Task_0617___Notepad_for_new_ideas {

    public static void main(String[] args) {
        printIdea(new Idea());
    }

    //напишите тут ваш код
    public static class Idea{
        public String getDescription (){
            return "";
        }
    }
    public static void printIdea (Idea idea){
        System.out.println(idea.getDescription());
    }
}
