//Baekjoon Question 1316
import java.util.Scanner;

public class Q1316 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int cases = scanner.nextInt();
        scanner.reset();
        boolean key = true;
        String[] strings = new String[cases];
        int count = 0;
        for (int i = 0; i < cases ; i++){
            strings[i] = scanner.next();
        }
        for(String str : strings){
            key = true;
            for(int i = 0; i < str.length()-1; i++){
                if(str.charAt(i) != str.charAt(i+1)){
                    for(int j=i+1; j <str.length(); j++){
                        if (str.charAt(i) == str.charAt(j)) {
                            key = false;
                            break;
                        }
                    }
                    if (!key){
                        break;
                    }
                }
            }
            if (key)
                count++;
        }
        System.out.println(count);
    }
}
