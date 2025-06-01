package dsa.learn.Recursion;

public class PirntNos {
    public static void main(String[] args) {
        print(1);

    }

    static void print(int n) {
        if(n == 5){
            System.out.println(5);
            return;
        }
        System.out.println(n);
        print(n+1);
    }
    // static void print2(int n) {
    //     System.out.println(2);
    //     print3(3);
    // }
    // static void print3(int n) {
    //     System.out.println(3);
    //     print4(4);
    // }
    // static void print4(int n) {
    //     System.out.println(4);
    //     print5(5);
    // }
    // static void print5(int n) {
    //     System.out.println(5);
    // }
}

