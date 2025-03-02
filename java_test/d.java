package java_test;
import java.util.Scanner;
public class d {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        double a;
        
        while (true) {
            a = sc.nextDouble(); 
            if (a == (int) a && a > 0) break;
        }

        int ans = (int) (a * (a + 1) / 2);
        System.out.println(ans);
        sc.close();
    }

}
