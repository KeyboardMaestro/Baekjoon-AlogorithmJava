//Baekjoon Question 1193
//Resource : https://www.acmicpc.net/problem/1193
import java.util.Scanner;

public class Q1193 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int input = scanner.nextInt();
        int sum = 0;
        int steps = 0;
        int son = 1, mother = 1;
        while ( input > sum){
            steps++;
            sum += steps;
        }
        for (int i = 0; i< steps - (sum - input); i++) {
            mother = 1 + i;
            son = steps - i;
        }
        if (steps % 2 == 1)
            System.out.println(son+"/"+mother);
        else
            System.out.println(mother+"/"+son);
    }
}
