// take input a lowercase Character and print its uppercase version
import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Write the character : ");
        char ch = sc.next().charAt(0); 
        
        // Uppercase = lowercase - 32
        char upper = (char)(ch - 32);
        
        System.out.println("Uppercase version: " + upper);
    }
}
