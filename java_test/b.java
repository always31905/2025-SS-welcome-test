package java_test;
import java.util.Scanner;
public class b {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        String s = sc.next(); 
        
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == 'a' || s.charAt(i) == 'e' || s.charAt(i) == 'i' || s.charAt(i) == 'o' || s.charAt(i) == 'u') {
                System.out.println("O");
                return;
            }
        }
        System.out.println("X");
        sc.close();

    }

}
