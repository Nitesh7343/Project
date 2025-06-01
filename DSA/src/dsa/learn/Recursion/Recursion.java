package dsa.learn.Recursion;
import java.util.*;

public class Recursion {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        message();
        sc.close();
    }

    static void message(){
        System.out.println("Hello Wrold");
        message1();
    }

    static void message1(){
        System.out.println("Hello Wrold");
        message2();
    }

    static void message2(){
        System.out.println("Hello Wrold");
        message3();
    }

    static void message3(){
        System.out.println("Hello Wrold");
    }

}
