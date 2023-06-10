/*Assignment 4
==============

      Class: Students
      Methods: getStudentInfo()

Description: 
Create multiple getStudentInfo() method by passing id argument alone, by id & name, by email & phoneNumber

*/


package week3.day1.assignments;

public class Students {
	
	public void getStudentInfo(int a)
	{
	System.out.println("Student ID: "+a);	
	}
	
	
	public void getStudentInfo(int a, String b)
	{
		System.out.println("Name of student with ID "+a+" is: "+b);		
	}
	
	public void getStudentInfo(String a, long b)
	{
		{
			System.out.println("Email id : "+a);
			System.out.println("Phone Number : "+b);
			
		}	
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Students S1=new Students();
		S1.getStudentInfo(12);
		S1.getStudentInfo(12, "Maya");
		S1.getStudentInfo("mayab@gmail.com", 6754666);

	}

}
