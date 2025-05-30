package dsa.learn.string;

public class StringPalindrome {
    public static void main(String[] args) {
        String s = "";
        boolean check = isPalindrome(s);
        if(check) System.out.println("String is Palindrome");
        else System.out.println("String is not Palindrome");
    }

    public static boolean isPalindrome(String s) {
        int start = 0;
        int end = s.length()-1;
        for(int i = 0 ; i < s.length()/2; i++) {
            if(s.charAt(start) != s.charAt(end)) return false;
            start++;
            end--;
        }
        return true;
        
    }
}
