package JavaRush.Level_2;
/*
Наш первый конвертер!

Метод convertCelsiusToFahrenheit(int celsius) принимает значение в градусах Цельсия.
Метод должен переводить температуру и возвращать значение в градусах Фаренгейта.
Температура по Цельсию TC и температура по Фаренгейту TF связаны следующим соотношением:
TF = (9 / 5) * TC + 32

Пример:
В метод convertCelsiusToFahrenheit на вход подается значение 41.

Пример вывода:
105.8
*/
public class Task_02___OurFirstConverter {

    public static void main(String[] args) {
        System.out.println(convertCelsiusToFahrenheit(41));
    }

    public static double convertCelsiusToFahrenheit(int celsius) {
        //напишите тут ваш код

        //double TF = (9 / 5) * celsius + 32;
        //return TF;

        return (9.0 / 5.0) * celsius + 32;
    }

}
