package DSA.pattern;

import java.util.Scanner;

/*
        * * * *
        * * *
        * *
        *
*/
public class Pattern10 {

    public static void main(String[] args) throws InterruptedException {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number to print pattern: ");
        int n = sc.nextInt();

        for(int i = 1; i <= n; ++i) {
            for(int j = n; j >= i; --j) {
                System.out.print("* ");
            }
            System.out.println(" ");
        }

        System.out.println();
        Thread.sleep(500);

        for(int i = 1; i <= n; i++) {
            for(int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println(" ");
        }

        System.out.println();
        Thread.sleep(500);

        for(int i = 1; i <= n; i++) {
            for(int j = 1; j <= n; j++) {
                System.out.print("* ");
            }
            System.out.println(" ");
        }

        System.out.println();
        Thread.sleep(500);

        for(int i = 1; i <= n; i++) {
            for(int j = 1; j <= i; j++) {
                System.out.print(j+" ");
            }
            System.out.println(" ");
        }

        System.out.println();
        Thread.sleep(500);

        for(int i = 0; i < 2*n; i++) {
            int c = i > n ? 2 * n - i : i;
            for(int j = 0; j < c; j++) {
                System.out.print("* ");
            }
            System.out.println(" ");
        }

        System.out.println();
        Thread.sleep(500);

        for(int i = 1; i <= n; i++) {
            for(int j = 1; j <= n; j++) {
                if(j>n-i)
                    System.out.print("* ");
                else
                    System.out.print("  ");
            }
            System.out.println(" ");
        }

        System.out.println();
        Thread.sleep(500);

        for(int i = 0; i < n; i++) {
            for(int j = 0; j < n; j++) {
                if(j >= i)
                    System.out.print("* ");
                else
                    System.out.print("  ");
            }
            System.out.println(" ");
        }


        System.out.println();
        Thread.sleep(500);

        for(int i = 0; i < 2 * n; i++) {
            int col = i > n ? 2 * n - i : i;
            int space = n - col;
            for(int s = 0; s < space; s++) {
                System.out.print(" ");
            }
            for(int j = 0; j < col; j++) {
                System.out.print("* ");
            }
            System.out.println(" ");
        }

        System.out.println();
        Thread.sleep(500);

        for(int i = 1; i <= n; i++) {
            for(int s = 0; s < n - i; s++) {
                System.out.print("  ");
            }
            for(int j = i; j >= 1; j--) {
                System.out.print(j+" ");
            }
            for(int j = 2; j <= i; j++) {
                System.out.print(j+" ");
            }
            System.out.println();
        }
    }
}
