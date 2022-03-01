package JavaRush.Level_6.Lecture_8;
/*
Статические методы для кошек

Добавить к классу Cat два статических метода: int getCatCount() и setCatCount(int),
с помощью которых можно получить/изменить количество котов (переменную catCount).

Требования:
•	Добавь в класс метод getCatCount.
•	Метод getCatCount должен возвращать int.
•	Метод getCatCount должен возвращать значение переменной catCount.
•	Добавь в класс метод setCatCount, принимающий int.
•	Метод setCatCount ничего не должен возвращать.
•	Метод setCatCount должен присваивать переменной catCount переданное значение.
*/
public class Level_6_8___Task_2 {

    private static int catCount= 0;

    public Level_6_8___Task_2(){
        catCount++;
    }

    public static int getCatCount() {
        return catCount;
    }

    public static void setCatCount(int catCount) {
        Level_6_8___Task_2.catCount = catCount;
    }

    public static void main(String[] args) {

    }
}
