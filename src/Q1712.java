//Baekjoon Question 1712
//Resource : https://www.acmicpc.net/problem/1712
import java.util.Scanner;

public class Q1712 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();
        long sell = 0;
        if (c <= b){
            sell = -1;
        }
        else {
            sell = a / (c-b) + 1;
        }

        System.out.println(sell);
    }
}
