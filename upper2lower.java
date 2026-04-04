// take input a uppercase Character and print its lowercase version
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        char ch = sc.next().charAt(0);

        if (ch >= 'A' && ch <= 'Z') {
            ch = (char)(ch + 32); // convert to uppercase
        }

        System.out.println("Result: " + ch);
    }
}
