//Baekjoon Question 1110
//Resource : https://www.acmicpc.net/problem/1110
import java.util.*;

public class Q1110 {
    public static void main(String[] args) {
        int inputNumber;
        Scanner scanner = new Scanner(System.in);
        inputNumber = scanner.nextInt();
        int counter = 0;
        int temp = 0;
        int step = 0;
        int nextstep = 0;
                temp = inputNumber;
                do {
                    step = (temp/10) + (temp%10);
                    nextstep = (temp%10 * 10) + step%10;
                    temp = nextstep;
                    counter++;
                } while (temp != inputNumber);
                System.out.println(counter);
    }
}
