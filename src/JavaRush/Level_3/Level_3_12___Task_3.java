package JavaRush.Level_3;

/*
Сумма цифр трехзначного числа

Пример:
Метод sumDigitsInNumber вызывается с параметром 546.

Пример вывода:
15
*/

public class Level_3_12___Task_3 {
    public static void main(String[] args) {
        System.out.println(sumDigitsInNumber(546));
    }

    public static int sumDigitsInNumber(int number) {
        //напишите тут ваш код

// МОЖНО УПРОСТИТЬ !!!
//        int x = number;
//        int a = 0;
//        while (x != 0){
//            a += x%10; ==
////            a = a + x%10;
//            x /= 10; ==
////            x = x / 10;
//        }
// УПРОСТИЛ !!!
// НО МОЖНО УПРОСТИТЬ ЕЩË !!!
        int z = 0;
        while (number != 0){
            z += number%10;
            number /= 10;
        }
        return z;
// УПРОСТИЛ ЕЩË !!!
//        return number%10 + sumDigitsInNumber(number/10);
    }
}
