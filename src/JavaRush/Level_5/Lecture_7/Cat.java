package JavaRush.Level_5.Lecture_7;

/*
Кошкоинициация

Создать класс Cat (кот) с пятью инициализаторами:
- Имя,
- Имя, вес, возраст
- Имя, возраст (вес стандартный)
- вес, цвет (имя, адрес и возраст неизвестны, это бездомный кот)
- вес, цвет, адрес (чужой домашний кот)

Задача инициализатора - сделать объект валидным.
Например, если вес неизвестен, то нужно указать какой-нибудь средний вес.
Кот не может ничего не весить.
То же касается возраста и цвета.
А вот имени может и не быть (null).
То же касается адреса: null.
*/

public class Cat {
    //напишите тут ваш код
    String name;
    String address;
    String color = "Black";
    int age = 1;
    int weight = 1;

    public void initialize (String name){
        this.name = name;
    }
    public void initialize (String name, int weight, int age){
        this.name = name;
        this.age = age;
        this.weight = weight;
    }
    public void initialize (String name, int age){
        this.name = name;
        this.age = age;
    }
    public void initialize (int weight, String color){
        this.color = color;
        this.weight = weight;
    }
    public void initialize (int weight, String color, String address){
        this.address = address;
        this.color = color;
        this.weight = weight;
    }
}
