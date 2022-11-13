//Baekjoon Question 1152
import java.util.Scanner;

public class Q1152 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String string = scanner.nextLine();
        string = string.strip();
        if (string.length() == 0){
            System.out.println(string.length());
        }
        else
        System.out.println(string.split(" ").length);
    }
}
