package DSA.pattern;

/*
        1
        2 1
        3 2 1
        4 3 2 1
        5 4 3 2 1
*/

public class Pattern8 {

    static void pattern8(int n){
        int x = 1;
        for(int i = 1; i <= n; i++) {
            for(int j = 1; j <= i; j++) {
                System.out.print(x + " ");
                x--;
            }
            x = i+1;
            System.out.println(" ");
        }
    }

    public static void main(String[] args) {
        pattern8(5);
    }
}
