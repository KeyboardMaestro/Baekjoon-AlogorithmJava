//Baekjoon Question 10250
//Resource : https://www.acmicpc.net/problem/10250
import java.util.Scanner;

public class Q10250 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int testcase = scanner.nextInt();
        for(int i = 0; i < testcase; i++){
            int h = scanner.nextInt();
            int w = scanner.nextInt();
            int cust = scanner.nextInt();
            int floor = 1;
            int line = 1;
            int full = 0;
            while (cust != (full * h) + floor) {
                floor++;
                if (floor > h) {
                    full++;
                    floor = 1;
                    line++;
                }
            }
            if (line < 10)
                System.out.println(floor+"0"+line);
            else
                System.out.println(floor+""+line);
        }
    }
}
