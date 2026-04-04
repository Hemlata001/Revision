/* take input 5 subject's marks, drop the least one and calculate the overall 
percentage considiering only the top 4 marks, print it. */

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter first subject marks: ");
        int s1 = sc.nextInt();
        System.out.print("Enter second subject marks: ");
        int s2 = sc.nextInt();
        System.out.print("Enter third subject marks: ");
        int s3 = sc.nextInt();
        System.out.print("Enter fourth subject marks: ");
        int s4 = sc.nextInt();
        System.out.print("Enter fifth subject marks: ");
        int s5 = sc.nextInt();

        // Total sum
        int sum = s1 + s2 + s3 + s4 + s5;

        // Find minimum
        int min = Math.min(s1, Math.min(s2, Math.min(s3, Math.min(s4, s5))));
        System.out.println("Drop : " + min);

        // Drop lowest
        int newSum = sum - min;

        // Calculate percentage (out of 4 subjects)
        float percentage = newSum / 4.0f;

        System.out.println("Percentage of the student: " + percentage);
    }
}
