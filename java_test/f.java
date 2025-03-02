package java_test;

import java.util.Scanner;
public class f {
    public static void main(String[] args) {

Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();  

        for (int i = 0; i < a; i++) {
            for (int j = 0; j < a - i - 1; j++) {
                System.out.print(" ");
            }
            for (int j = 0; j < (i + 1) * 2 - 1; j++) {
                System.out.print("*");
            }
            for (int j = 0; j < a - i - 1; j++) {
                System.out.print(" ");
            }
            System.out.println();
        }

        for (int i = a - 2; i >= 0; i--) {
            for (int j = 0; j < a - i - 1; j++) {
                System.out.print(" ");
            }
            for (int j = 0; j < (i + 1) * 2 - 1; j++) {
                System.out.print("*");
            }
            for (int j = 0; j < a - i - 1; j++) {
                System.out.print(" ");
            }
            System.out.println();
        }

        sc.close();
    }

}
