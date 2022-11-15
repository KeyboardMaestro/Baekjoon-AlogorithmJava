//Baekjoon Question 2562
//Resource : https://www.acmicpc.net/problem/2562
import java.util.Arrays;
import java.util.Scanner;

public class Q2562 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] numbers = new int[9];
        for (int i=0; i<numbers.length; i++){
            numbers[i] = scanner.nextInt();
        }
        int max = numbers[0];
        int index = 0;
        for (int i = 0; i < 9 ; i++){
            if(max <= numbers[i]){
                max = numbers[i];
                index = i;
            }
        }
        System.out.println(Arrays.stream(numbers).max().getAsInt());
        System.out.print(index+1);
    }
}
