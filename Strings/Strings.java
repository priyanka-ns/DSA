package DSA.Strings;

import java.lang.String;
import java.util.Arrays;
import java.util.Scanner;

public class Strings {

    public static void main(java.lang.String[] args) {
        String name = "Priyanka Singh";
        System.out.println(Arrays.toString(name.toCharArray()));
        System.out.println(name.toLowerCase());
        System.out.println(name.indexOf('a'));
        System.out.println("         Priyanka    ".trim());
        System.out.println(Arrays.toString(name.split(" ")));
        System.out.println("name is: "+name);
        name = "Neha";
        System.out.println("name is: "+name);

        comparison();
        alphabet();
        builder();
    }

    static void comparison(){
        //System.out.println("Enter a: ");
        //String a = new Scanner(System.in).nextLine();
        String a = "priya";
        //System.out.println("Enter b: ");
        //String b = new Scanner(System.in).nextLine();
        String b = "neha";
        System.out.println("a : "+a);
        System.out.println("b : "+b);
        System.out.println("a == b ? " + (a.equals(b)));

//        System.out.println("a == b ? "+ a == b);
    }

    static void alphabet(){
        String series = "";

        for(int i = 0; i<26; i++){
            char a = (char)('a'+i);
            series += a+" ";
        }

        System.out.println(series);

    }

    static void builder(){
        StringBuilder builder = new StringBuilder();
        for(int i = 0; i<26; i++){
            char a = (char)('a'+i);
            builder.append(a+" ");
        }

        System.out.println(builder);

    }
}
