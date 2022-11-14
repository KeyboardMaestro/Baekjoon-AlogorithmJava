import java.io.IOException;
import java.util.Scanner;

//Baekjoon Question 5622
public class Q5622 {
    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        int answer = 0;
        for (int i = 0; i < input.length(); i++) {
            switch (input.charAt(i)) {
                case 'A' -> answer += 3;
                case 'B' -> answer += 3;
                case 'C' -> answer += 3;
                case 'D' -> answer += 4;
                case 'E' -> answer += 4;
                case 'F' -> answer += 4;
                case 'G' -> answer += 5;
                case 'H' -> answer += 5;
                case 'I' -> answer += 5;
                case 'J' -> answer += 6;
                case 'K' -> answer += 6;
                case 'L' -> answer += 6;
                case 'M' -> answer += 7;
                case 'N' -> answer += 7;
                case 'O' -> answer += 7;
                case 'P' -> answer += 8;
                case 'Q' -> answer += 8;
                case 'R' -> answer += 8;
                case 'S' -> answer += 8;
                case 'T' -> answer += 9;
                case 'U' -> answer += 9;
                case 'V' -> answer += 9;
                case 'W' -> answer += 10;
                case 'X' -> answer += 10;
                case 'Y' -> answer += 10;
                case 'Z' -> answer += 10;
            }
        }
        System.out.println(answer);
    }
}