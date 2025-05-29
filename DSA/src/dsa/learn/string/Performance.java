package dsa.learn.string;
import java.util.*;

public class Performance {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String alphabet = "";
        for(int i = 0; i < 26; i++) {
            char ch = (char)('a' + i);
            alphabet += ch;
        }
        System.out.println(alphabet);
    }
}
