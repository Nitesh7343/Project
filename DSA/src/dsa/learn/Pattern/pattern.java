package dsa.learn.Pattern;
import java.util.*;

public class pattern {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int n = sc.nextInt();
        pattern2(n);
        
    }

    static void pattern1(int n) {
        for(int row = 1; row <= n; row++) {
            //for every row , run the column
            for(int col = 1; col <= row;col++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    static void pattern2(int n) {
        for(int row = 1; row <= n; row++) {
            //for every row , run the column
            for(int col = 1; col <= n;col++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
