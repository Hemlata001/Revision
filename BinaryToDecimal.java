import java.util.*;

public class Main {
    static int binaryToDecimal(String b) {
        int result = 0;
        int powOf2 = 1;

        for (int i = b.length() - 1; i >= 0; i--) {
            if (b.charAt(i) == '1') {
                result = result + powOf2;
            }
            powOf2 = powOf2 * 2;
        }
        return result;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String b = scan.next(); // binary input
        System.out.println("The binary number is : "+ b);
        int decimal = binaryToDecimal(b);

        System.out.println("The Decimal number is :"+ decimal);
    }
}
