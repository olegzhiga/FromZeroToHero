package JavaRush.Level_6;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/*
Контролируем массу тела

Программа должна считывать введенные пользователем вес в килограммах и рост в метрах и
выводить на экран сообщение об индексе массы тела.
Реализуй статический метод класса Body.
Метод должен определить индекс массы тела, и вывести на экран сообщение:
"Недовес: меньше чем 18.5" - если индекс массы тела меньше 18.5 (не включая),
"Нормальный: между 18.5 и 25" - если индекс массы тела между 18.5 и 25 (не включая),
"Избыточный вес: между 25 и 30" - если индекс массы тела между 25 и 30 (не включая),
"Ожирение: 30 или больше" - если индекс массы тела 30 или больше.

Подсказка:
Индекс массы тела = вес в кг / (рост в метрах * рост в метрах)

Пример вывода для 68.4 и 1.77:
Нормальный: между 18.5 и 25

Требования:
•	Метод calculateMassIndex должен выводить текст на экран.
•	Метод calculateMassIndex должен выводить "Недовес: меньше чем 18.5" на экран, если индекс массы тела меньше 18.5 (не включая).
•	Метод calculateMassIndex должен выводить "Нормальный: между 18.5 и 25" на экран, если индекс массы тела между 18.5 и 25 (не включая).
•	Метод calculateMassIndex должен выводить "Избыточный вес: между 25 и 30" на экран, если индекс массы тела между 25 и 30 (не включая).
•	Метод calculateMassIndex должен выводить "Ожирение: 30 или больше" на экран, если индекс массы тела 30 или больше.
*/
public class Task_0605___Control_body_weight {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Enter your weight in kilograms: ");
        double weight = Double.parseDouble(bf.readLine());
        System.out.print("Enter your height in meters: ");
        double height = Double.parseDouble(bf.readLine());

        Body.calculateMassIndex(weight, height);
    }

    public static class Body{
        public static void calculateMassIndex(double weight, double height){
            // напишите тут ваш код
            double massIndex = weight/(height*height);
            System.out.println("Your mass index is: " + massIndex);
            if (massIndex < 18.5){
                System.out.println("Недовес: меньше чем 18.5");
            } else if (massIndex > 18.5 && massIndex < 25){
                System.out.println("Нормальный: между 18.5 и 25");
            } else if (massIndex > 25 && massIndex < 30){
                System.out.println("Избыточный вес: между 25 и 30");
            } else if (massIndex > 30){
                System.out.println("Ожирение: 30 или больше");
            }
        }
    }
}
