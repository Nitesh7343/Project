package dsa.learn.string;

import java.util.Arrays;

public class Methods {
    public static void main(String[] args) {
        String name = "Pikashu Dora";
        System.out.println(Arrays.toString(name.toCharArray()));  // convert the string name to character array.
        System.out.println(name.toLowerCase());  //new object will be created.
        System.out.println(name); //original will not be change.
        System.out.println(name.toUpperCase()); //again new object.
        System.out.println(name.indexOf('D')); //will print index of 'D' i.e. 8
        System.out.println("    Mental    ".strip()); // white spaces will be removed.
        System.out.println(Arrays.toString(name.split(" ")));//split the string from sapces (" ") and return a string array.
        
    }
}
