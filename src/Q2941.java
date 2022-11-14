import java.util.Scanner;

//Baekjoon Question 2941
public class Q2941 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String string = scanner.nextLine();
        int count = 0;
        for(int i = 0; i < string.length(); i++){
            switch (string.charAt(i)){
                case 'c':
                    if (string.charAt(i+1) == '=' || string.charAt(i+1) == '-') {
                        count++;
                        i++;
                        break;
                    }
                    else
                        count++;
                    break;
                case 'd':
                    if (string.charAt(i+1) == 'z' && string.charAt(i+2) == '='){
                        i += 2;
                        count ++;
                        break;
                    }
                    else
                        count++;
                    break;
                case 'l':
                case 'n':
                    if(string.charAt(i+1) == 'j'){
                        count++;
                        i++;
                        break;
                    }
                    else
                        count++;
                    break;
                case 's':
                case 'z':
                    if(string.charAt(i+1) == '='){
                        count++;
                        i++;
                        break;
                    }
                    else
                        count++;
                    break;

                default:
                    count++;
                    break;
            }
        }
        System.out.println(count);
    }
}
