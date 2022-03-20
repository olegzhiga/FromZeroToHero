package acmp;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Test {

    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        String inputText = bufferedReader.readLine();

        ArrayList<Integer> inputIntegers = new ArrayList<>();
        for (String s : inputText.split("\\s")) {
            inputIntegers.add(Integer.parseInt(s));
        }

        System.out.println();
    }
}



/*

 */