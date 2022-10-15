//Baekjoon Question4673

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Q4673{
    public static void main(String[] args) {
        int a = 1;
        int temp = 0;
        ArrayList<Integer> cases = new ArrayList<Integer>();
        ArrayList<Integer> nonSelfNumbers = new ArrayList<Integer>();
        for (int i = 1; i < 10000 ; i++){
            cases.add(i);
        }
        while (a <= 10000) {
            temp = (a/1000) + (a/100%10) + (a%100/10) + (a%10) + a;
            nonSelfNumbers.add(temp);
            a++;
        }
        for(Integer number : nonSelfNumbers){
            cases.remove(number);
        }
        for (Integer answers : cases) {
            System.out.println(answers);
        }

    }
}
