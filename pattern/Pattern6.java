package DSA.pattern;

/*
        1
        2 3
        4 5 6
        7 8 9 10
        11 12 13 14 15
*/

public class Pattern6 {

    static void pattern4(int n){
        int x = 1;
        for(int i = 1; i <= n; i++) {
            int j = 1;
            while(j <= i){
                System.out.print(x + " ");
                j++;
                x++;
            }
            System.out.println(" ");
        }
    }

/*    static void pattern4(int n){
        int x = 1;
        for(int i = 1; i <= n; i++) {
            for(int j = 1; j <= i; j++) {
                System.out.print(x + " ");
                x++;
            }
            System.out.println(" ");
        }
    }*/

    public static void main(String[] args) {
        pattern4(5);
    }
}
