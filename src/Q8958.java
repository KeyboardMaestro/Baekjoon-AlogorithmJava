//Baekjoon Question8958
import java.util.Scanner;

public class Q8958 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int cases = scanner.nextInt();
        String[] answer = new String[cases];
        for (int i = 0; i < cases; i++){
            answer[i] = scanner.next();
        }
        for (int i = 0; i < cases; i++){
            System.out.println(scorecounter(answer[i]));
        }
    }
    static int scorecounter (String string){
        int sum = 0;
        int score = 0;
        for (int i = 0; i < string.length(); i++){
            if(string.charAt(i) == 'O'){
                score ++;
                sum += score;
            }
        else{
            score = 0;
        }
    }
        return sum;
}
}
