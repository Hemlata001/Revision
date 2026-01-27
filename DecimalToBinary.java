import java.util.*;

public class Main {

    static String decimalToBinary(int n) {
        if (n == 0) return "0";

        String b = "";
        while (n >= 1) {
            int x = n % 2;
            n = n / 2;
            b = x + b;
        }
        return b;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        System.out.println("The decimal number is :" + n);
        System.out.println("The binary number is :" + decimalToBinary(n));
    }
}
