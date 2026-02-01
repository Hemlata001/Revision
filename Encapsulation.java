import java.util.*;
class Student
{
    private int roll;
    private String name;
    private double per;
    
    // Setter
    public void setStudent(int r, String n, double p){
        roll = r;
        name = n;
        per = p;
    }
    
    // Show
    public void showStudent(){
        System.out.println("Roll : " + roll);
        System.out.println("Name : " + name);
        System.out.println("Percentage : " + per);
    }
}
public class useStudent{
    public static void main(String[] args){
        Student s1 = new Student();
        s1.setStudent(101,"Himanshi",95.1);
        s1.showStudent();
        Student s2 = new Student();
        s2.setStudent(102,"Hemlata",95.5);
        s2.showStudent();
        
    }
}
