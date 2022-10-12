//Baekjoon Questipn4344
import java.util.Arrays;
import java.util.Scanner;
public class Q4344 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int testCases = scanner.nextInt();
        for (int i = 0; i < testCases ; i++){
            int students = scanner.nextInt();
            double studentD = students;
            int overAvg = 0;
            double[] scores = new double[students];
            for (int j = 0 ; j < students; j++){
                scores[j] = scanner.nextDouble();
            }
            for (double score : scores){
                if (score > Arrays.stream(scores).average().getAsDouble())
                    overAvg++;
                else
                    continue;
            }
            System.out.println(String.format("%.3f" ,overAvg/studentD*100) + "%");
        }
}
}
