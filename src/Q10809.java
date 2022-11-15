//Baekjoon Question10809
//Resource : https://www.acmicpc.net/problem/10809
import java.util.Scanner;

public class Q10809 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String inputdata = scanner.nextLine();
        for (char i = 'a'; i<= 'z'; i++ ){
            if (inputdata.indexOf(i) == -1){
                System.out.print(inputdata.indexOf(i)+" ");
            }else
                System.out.print(inputdata.indexOf(i)+" ");
        }
    }
}
