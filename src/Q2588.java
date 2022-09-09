import java.util.Scanner;

public class Q2588 {
    public static void main(String[] args) {
        int a,b,c,d,e;
        Scanner scanner = new Scanner(System.in);
        a = scanner.nextInt();
        b = scanner.nextInt();
        c = a * (b%10);
        d = a * ((b/10)%10);
        e = a * (b/100);
        System.out.println(c);
        System.out.println(d);
        System.out.println(e);
        System.out.println(a*b);
    }
}
