/* Week3-Day1-Assignment2
=============
     Package   :org.college
     Class     :College
     Methods   :collegeName(),collegeCode(),collegeRank()

     Package   :org.department
     Class        :Department
     Methods   :deptName()
 
     Package   :org.student
     Class        :Student
     Methods   :studentName(),studentDept(),studentId()
  
Description:
create above 3 class and call all your class methods into the Student using multilevel inheritance.

*/


package org.student;
import org.department.*;


public class Student extends Department{
	
	public void StudentName(String S) {
		System.out.println("Name of the student is: "+S);
	}
	
	public void StudentDept(String X) {
		System.out.println("Department of the student is: "+X);
	}
	
	public void StudentId(int a) {
		System.out.println("Student  ID : "+a);
	}
	
	public static void main(String[] args) {
		
		Student s1 =new Student();
		s1.CollegeName("ABC College");
		s1.CollegeCode(122);
		s1.CollegeRank(12);
		s1.DepartmentName("Science");
		s1.StudentName("Neethu");
		s1.StudentDept("Physics");
		s1.StudentId(9911);
		
		
		
		
	}

	

}
