/// Beakjoon Question 8393
//Resource : https://www.acmicpc.net/problem/8393
import java.util.Scanner;

public class Q8393 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int loop = scanner.nextInt();
        int sum = 0;
        for( int i = 1 ; i <= loop ; i++) {
            sum += i;
        }
        System.out.println(sum);
    }
}
