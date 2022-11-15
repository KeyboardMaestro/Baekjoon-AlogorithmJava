//Baekjoon Question 11720
//Resource : https://www.acmicpc.net/problem/11720
import java.io.IOException;
import java.util.Scanner;

public class Q11720 {
    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);
        int trial = scanner.nextInt();
        scanner.nextLine();
        int sum = 0;
        String data = scanner.nextLine();
        for (int i = 0 ; i < trial ; i++){
            sum += ((int) data.charAt(i) -'0');
        }
        System.out.println(sum);
    }
}
