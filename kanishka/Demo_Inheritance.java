import java.util.*;

class college{
	String name;
	String Address;
	
	college()//Constructor
	{
		Scanner scr = new Scanner(System.in);
		System.out.println("Enter Name and Address");
		name = scr.next();
		Address = scr.next();
	}
}
class Exam extends college
{
	double exam_fee;
	
	void get_exam_fee()
	{
		Scanner scr = new Scanner(System.in);
		System.out.println("Enter Fees");
		exam_fee = scr.nextDouble();
	}
}
class Student extends Exam
{
	String branch;
	
	void get_branch_info()
	{
		Scanner scr = new Scanner(System.in);
		System.out.println("Enter Branch");
		branch = scr.next();
		
	}
}
class Demo_inheritance
{
	public static void main(String args[])
	{
		Student Student1 = new Student();
		Student1.get_branch_info();
		Student1.get_exam_fee();
	}
		
}

	
		
	





