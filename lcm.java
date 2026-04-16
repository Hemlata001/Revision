public class Main {
    public static void main(String[] args) {
        int a = 12;
        int b = 18;

        int x = a;
        int y = b;

        while (y != 0) {
            int temp = y;
            y = x % y;
            x = temp;
        }

        int gcd = x;
        int lcm = (a * b) / gcd;

        System.out.println("LCM = " + lcm);
    }
}
