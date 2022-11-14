import java.util.Scanner;

//Baekjoon Question 2941
public class Q2941 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String string = scanner.nextLine();
        string = string.replaceAll("c=","1");
        string = string.replaceAll("c-","1");
        string = string.replaceAll("dz=","1");
        string = string.replaceAll("d-","1");
        string = string.replaceAll("lj","1");
        string = string.replaceAll("nj","1");
        string = string.replaceAll("s=","1");
        string = string.replaceAll("z=","1");
        System.out.println(string.length());

    }
}


/* public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String string = scanner.nextLine();
        int count = 0;
        for(int i = 0; i < string.length(); i++){
            if(string.length() - i >= 3)
            switch (string.charAt(i)){
                case 'c':
                    if ((string.charAt(i+1) == '=' || string.charAt(i+1) == '-')){
                        i++;
                        count++;
                        break;
                    }
                    else{
                        count++;
                        break;
                    }
                case 'd':
                    if (string.charAt(i+1) == 'z'){
                        if (string.charAt(i+2)=='=')
                        i += 2;
                        count++;
                        break;
                    }
                    else if (string.charAt(i+1) == '-'){
                        i++;
                        count++;
                        break;
                    }
                case 'l':
                case 'n':
                    if(string.charAt(i+1) == 'j'){
                        i++;
                        count++;
                        break;
                    }
                    else {
                        count++;
                        break;
                    }
                case 's':
                case 'z':
                    if(string.charAt(i+1) == '='){
                        i++;
                        count++;
                        break;
                    }
                default:
                    count++;
                    break;
            }
            else if (string.length() - i == 2){
                switch (string.charAt(i)){
                    case 'c':
                        if ((string.charAt(i+1) == '=' || string.charAt(i+1) == '-')){
                            i++;
                            count++;
                            break;
                        }
                        else{
                            count++;
                            break;
                        }
                        case 'd' :
                        if(string.charAt(i+1) == '-'){
                            i++;
                            count++;
                            break;
                        }
                        else{
                            count++;
                            break;}
                    case 'l':
                    case 'n':
                        if(string.charAt(i+1) == 'j'){
                            i++;
                            count++;
                            break;
                        }
                        else {
                            count++;
                            break;
                        }
                    case 's':
                    case 'z':
                        if(string.charAt(i+1) == '=') {
                            i++;
                            count++;
                            break;
                        }
                    default:
                        count++;
                        break;
                }
            }
            else
                count++;
        }
        System.out.println(count);
    }
*/