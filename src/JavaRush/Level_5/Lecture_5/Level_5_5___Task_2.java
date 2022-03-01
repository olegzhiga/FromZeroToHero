package JavaRush.Level_5.Lecture_5;

/*
Реализовать метод fight

Реализуй метод boolean fight(Cat anotherCat):
продумай механизм драки котов в зависимости от их веса, возраста и силы.
Сравни каждый критерий по отдельности, чтобы победителем был тот,
у кого были лучшие показатели по большинству критериев.
Метод должен определять, выиграли ли мы (this) бой или нет,
т.е. возвращать true, если выиграли и false - если проиграли.
Если ничья и никто не выиграл, возвращаем false.
*/

public class Level_5_5___Task_2 {

    public int age;
    public int weight;
    public int strength;

    public Level_5_5___Task_2() {
    }

    public boolean fight(Level_5_5___Task_2 anotherCat) {
        //напишите тут ваш код

//        boolean a = false;
//        if (this.age > anotherCat.age && this.weight > anotherCat.weight){
//            a = true;
//        }else if (this.weight > anotherCat.weight && this.strength > anotherCat.strength){
//            a = true;
//        }else if (this.age > anotherCat.age && this.strength > anotherCat.strength){
//            a = true;
//        }
//        boolean a = this.age > anotherCat.age && this.weight > anotherCat.weight;
//        boolean b = this.weight > anotherCat.weight && this.strength > anotherCat.strength;
//        boolean c = this.age > anotherCat.age && this.strength > anotherCat.strength;
        int ageScore = Integer.compare(this.age, anotherCat.age);
        int weightScore = Integer.compare(this.weight, anotherCat.weight);
        int strengthScore = Integer.compare(this.strength, anotherCat.strength);

        int totalScore = ageScore + weightScore + strengthScore;

        return totalScore > 0 ;
    }

    public static void main(String[] args) {

    }
}
