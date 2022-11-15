//Baekjoon Question2292
//Resource : https://www.acmicpc.net/problem/2292
import java.util.Scanner;

public class Q2292 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        long input = scanner.nextInt();
        long rule = 1;
        long point = 1;
        if(input == 1 )
            System.out.println(1);
        else if (input <= 7)
            System.out.println(2);
        else {
            do {
                point = point + (6 * (rule));
                rule++;
            } while (point < input);
            System.out.println(rule);
        }
    }
}
