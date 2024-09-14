package DSA.pattern;

/*
        A
        B B
        C C C
*/

public class Pattern9 {

    static void pattern9(int n){
        for(int i = 1; i <= n; i++) {
            for(int j = 1; j <= i; j++) {
                System.out.print((char)('A' + i-1) + " ");
            }
            System.out.println(" ");
        }
    }

    public static void main(String[] args) {
        pattern9(5);
    }
}
