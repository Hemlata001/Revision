// take age input and print it he/she is eligible to vote or not
import java.util.*;
public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the age : ");
        int age = sc.nextInt();
        
        // condition
        if(age>=18){
            System.out.println("You are eligible for a vote");
        }else{
            System.out.println("You are not eligible for a vote");
        }
       
    }
}
