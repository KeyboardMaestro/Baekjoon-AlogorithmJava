//Baekjoon Question1546
import java.util.Arrays;
import java.util.Scanner;

public class Q1546 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int subject = scanner.nextInt();
        double[] scores = new double[subject];
        for (int i = 0; i < subject; i++){
            scores[i] = scanner.nextInt();
        }
        double max = Arrays.stream(scores).max().getAsDouble();
        for (int i = 0; i < subject ; i++){
                scores[i] = (scores[i]/max)*100;
        }
        System.out.println(Arrays.stream(scores).average().getAsDouble());
    }
}
