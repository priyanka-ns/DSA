package DSA.Strings;

import java.util.Arrays;

public class Palindrome {

    public static void main(String[] args) {
        String word = "ababa";
        System.out.println(word + " is " + (palindrome(word) ? "" : "not ") + "a palindrome.");
    }

    static boolean palindrome(String word){
        StringBuilder st = new StringBuilder(word);
        String ts = st.reverse().toString();
        return word.equals(ts);
    }
}
