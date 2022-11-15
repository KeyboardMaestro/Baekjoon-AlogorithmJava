//Baekjoon Question 2908
//Resource : https://www.acmicpc.net/problem/2908
import java.util.*;

public class Q2908 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String string = scanner.nextLine();
        String lists = "";
        int[] answer;
        for (int i = 0; i < string.length(); i++){
            lists += string.charAt(string.length()-1-i);
        }
        String[] answers = lists.split(" ");
        answer = Arrays.stream(answers).mapToInt(Integer::parseInt).toArray();
        System.out.println(Arrays.stream(answer).max().getAsInt());
    }
}
