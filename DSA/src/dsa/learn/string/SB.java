/*as we see using string when we have to modify a string takes a O(n^2) conplexity so to overcome that problem
we use StringBuilder as it allows us to midify the same string without creating a new object*/




package dsa.learn.string;
import java.util.*;
public class SB {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        StringBuilder sb = new StringBuilder(); 
        for(int i = 0; i < 26;i++) {
            char ch = (char)('a' + i);
            sb.append(ch);
        }
        System.out.println(sb);
    }
}


//now it has O(n) complexity. 