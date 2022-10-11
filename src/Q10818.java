//Baekjoon Question 10818

import java.util.Arrays;
import java.util.Scanner;

public class Q10818 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int cases = scanner.nextInt();
        int[] numbers = new int [cases];
        for (int i = 0; i < cases; i++)
            numbers[i] = scanner.nextInt();
        System.out.print(Arrays.stream(numbers).min().getAsInt()+" "+ Arrays.stream(numbers).max().getAsInt());
    }
}
