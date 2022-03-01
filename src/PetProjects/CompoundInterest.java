package PetProjects;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class CompoundInterest {

    public static void main(String[] args) throws IOException {
        BufferedReader bfReader = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Введите процент, который вы получаете каждый день: ");
        double persent = Double.parseDouble(bfReader.readLine());
        System.out.print("Введите сумму которую вы вложили: ");
        double sum = Double.parseDouble(bfReader.readLine());
        int countDays = 1;
        for (int i = 0; i < 365; i++) {
            sum = sum + ((sum*persent)/100);
            System.out.println(countDays + ": " + sum);
            countDays++;
        }
        System.out.println("Благодаря сложному проценту вы заработаете за год: " + sum);
    }
}
