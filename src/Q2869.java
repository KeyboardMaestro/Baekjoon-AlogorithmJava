//Baekjoon Question 2869
//Resource : https://www.acmicpc.net/problem/2869
import java.io.*;

public class Q2869 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String[] numbers = reader.readLine().split(" ");
        long a = Integer.parseInt(numbers[0]);
        long b = Integer.parseInt(numbers[1]);
        long v = Integer.parseInt(numbers[2]);
        double days;
        days = (double) (v-b) / (double) (a-b);
        days = Math.ceil(days);
        System.out.println((long)days);
    }
}
