/*
 * -Week3-Day1Assignment 5 on Abstraction
===========
Interface :Language
     Methods   :Java()
     Interface :TestTool
     Methods   :Selenium()
     AbstractClass :MultipleLangauge
     Methods   :python() and un implemented method as ruby()
  Execution class: Automation 
Implement all the methods of interface and abstract class in Automation class
 */


package week3.day1.assignments;

public class Automation extends MultipleLanguage implements Language,TestTool {

	public void Java() {
		
		System.out.println("Java");
		
	}
	
	public void Selenium() {
		System.out.println("Selenium");
		
	}
	public void Ruby() {
		
		System.out.println("Ruby");
		
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Automation auto1=new Automation();
		System.out.println("For automation lets learn below languages");
		auto1.Python();
		auto1.Java();
		auto1.Selenium();
		auto1.Ruby();
	}



}
