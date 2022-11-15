//Baekjoon Question 10952
//Resource : https://www.acmicpc.net/problem/10952
import java.util.Arrays;
import java.util.Scanner;

public class Q10952 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (true){
            String testcase = scanner.nextLine();
            int a[] = Arrays.stream(testcase.split(" ")).mapToInt(Integer::parseInt).toArray();
            if(a[0] == 0 && a[1] == 0)
                break;
            else{
                System.out.println(a[0] + a[1]);
            }
        }
    }
}
