/// Beakjoon Question 15552
import java.io.*;


public class Q15552 {
    public static void main(String[] args) throws IOException{
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter out = new BufferedWriter(new OutputStreamWriter(System.out));
        String[] numbersInString;
        int sum = 0;
        int num[] = new int[2];
        int testcases = Integer.parseInt(reader.readLine());
        for (int i = 0 ; i < testcases ; i++){
            sum = 0;
            numbersInString = reader.readLine().split(" ");
            for (int j = 0 ; j< numbersInString.length; j++){
                num[j] = Integer.parseInt((numbersInString[j]));
                sum += num[j];
            }
            out.write(String.valueOf(sum)+"\n");
        }
        out.flush();
    }
}
