package DSA.pattern;

/*
        4 3 2 1
        4 3 2 1
        4 3 2 1
        4 3 2 1
*/

public class Pattern4 {

    static void pattern4(int n){
        for(int i = 1; i <= n; ++i) {
            for(int j = n; j > 0; j--) {
                System.out.print(j + " ");
            }
            System.out.println(" ");
        }
    }

    public static void main(String[] args) {
        pattern4(4);
    }
}
