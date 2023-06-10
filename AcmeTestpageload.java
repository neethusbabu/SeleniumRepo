package week2.day2.assignments;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class AcmeTestpageload {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// Load url "https://acme-test.uipath.com/login"
		
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://acme-test.uipath.com/login");
		driver.manage().window().maximize();
		
	//Enter email as "kumar.testleaf@gmail.com"
	// Enter Password as "leaf@12"
		//
		
		driver.findElement(By.id("email")).sendKeys("kumar.testleaf@gmail.com");
		driver.findElement(By.id("password")).sendKeys("leaf@12");
		
		
	//Click login button
		
		driver.findElement(By.xpath("//button[contains(@type,'submit')]")).click();
		
	//Get the title of the page and print
		String title= driver.getTitle();
		System.out.println(title);
  
		
	//Click on Log Out
		
		driver.findElement(By.xpath("//form[@id='logout-form']/input/following::a")).click();
		
	//Close the browser (use -driver.close())
		//driver.close();

	}

}
