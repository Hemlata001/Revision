import java.util.*;
class Student{
    int roll;
    String name;
    double per;
}
public class useStudent
{
	public static void main(String[] args) {
	    Student s = new Student();
	    
	    s.roll = 10;
	    s.name = "Himanshi";
	    s.per = 87.5;
	    
		System.out.println("Student Rollno = "+ s.roll);
		System.out.println("Student Name = "+s.name);
		System.out.println("Student Percentage = "+s.per);
	}
}
