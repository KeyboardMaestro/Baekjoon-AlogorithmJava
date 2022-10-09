///Baekjoon Question2438
import java.util.Scanner;

public class Q2438 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numbers = scanner.nextInt();
        for (int j = 0; j < numbers; j++) {
            for (int i = 0; i <= j; i++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
