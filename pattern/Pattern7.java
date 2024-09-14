package DSA.pattern;

/*
        1
        2 3
        3 4 5
        4 5 6 7
        5 6 7 8 9
*/

public class Pattern7 {

    static void pattern7(int n){
        int x = 1;
        for(int i = 1; i <= n; i++) {
            for(int j = 1; j <= i; j++) {
                System.out.print(x + " ");
                x++;
            }
            x = i+1;
            System.out.println(" ");
        }
    }

    public static void main(String[] args) {
        pattern7(5);
    }
}
