//Baekjoon Question1065
//Resource : https://www.acmicpc.net/problem/1065
import java.util.ArrayList;
import java.util.Scanner;

public class Q1065 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int input = scanner.nextInt();
        int count = 0;
        for (int i = 1; i <= input ; i++){
            if(i < 100)
                count++;
            else{
            int digit1 = (i/100)-(i%100)/10;
            int digit2 = (i%100)/10 - (i%10);
            if(digit2 == digit1){
                count++;}
            }
        }
        System.out.println(count);
    }
}
