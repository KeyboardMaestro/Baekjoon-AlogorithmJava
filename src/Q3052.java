//Baekjoon Question 3052
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Q3052 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] numbers = new int[10];
        int[] leftovers = new int[10];
        Set counter = new HashSet();
        for (int i=0; i<numbers.length; i++){
            numbers[i] = scanner.nextInt();
        }
        for (int i = 0; i < numbers.length ; i++){
            leftovers[i] = (numbers[i] % 42);
            counter.add(leftovers[i]);
        }

        System.out.println(counter.size());
    }
}
