//Baekjoon Question2675
//Resource : https://www.acmicpc.net/problem/2675
import java.io.IOException;
import java.util.Scanner;
public class Q2675 {
    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);
        int cases = scanner.nextInt();
        scanner.nextLine();
        for (int k = 0; k < cases; k++){
        String inputdata = scanner.nextLine();
        String[] subs = inputdata.split(" ");
        int reps = Integer.parseInt(subs[0]);
        for (int i = 0; i < subs[subs.length-1].length(); i++) {
            for (int j = 0; j < reps; j++) {
                System.out.print(subs[subs.length - 1].charAt(i));
            }
        }
            System.out.println();
        }
    }
}
