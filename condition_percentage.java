// take input 5 subject's marks and print the overall percentage of student
import java.util.*;
public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter first subject marks : ");
        int subject1 = sc.nextInt();
        System.out.print("Enter second subject marks : ");
        int subject2 = sc.nextInt();
        System.out.print("Enter third subject marks : ");
        int subject3 = sc.nextInt();
        System.out.print("Enter fourth subject marks : ");
        int subject4 = sc.nextInt();
        System.out.print("Enter fivth subject marks : ");
        int subject5 = sc.nextInt();
        float average = subject1 +subject2 + subject3 + subject4 + subject5;
        float percentage = average/5;
        System.out.println("Percentage of the student : "+ percentage);
    }
}
