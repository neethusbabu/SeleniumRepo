package week2.day2.assignments;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class CreateContact {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		
		 //Pseudo Code
		  
		  //1. Launch URL "http://leaftaps.com/opentaps/control/login"
		
		ChromeDriver driver=new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps/control/login");
		driver.manage().window().maximize();
		
		//2. Enter UserName and Password Using Id Locator
		
		driver.findElement(By.id("username")).sendKeys("demoSalesManager");
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		
		// * 3. Click on Login Button using Class Locator
		
		driver.findElement(By.className("decorativeSubmit")).click();
		
		//Click on CRM/SFA Link
		driver.findElement(By.linkText("CRM/SFA")).click();	
		
		//	 * 5. Click on contacts Button
		
		driver.findElement(By.linkText("Create Contact")).click();
		//7. Enter FirstName Field Using id Locator
		driver.findElement(By.id("firstNameField")).sendKeys("Albert");
		 
		// 8. Enter LastName Field Using id Locator
		driver.findElement(By.id("lastNameField")).sendKeys("Thomas");
		
		// Enter FirstName(Local) Field Using id Locator
		driver.findElement(By.id("createContactForm_firstNameLocal")).sendKeys("Alb");
		
		//Enter LastName(Local) Field Using id Locator
		driver.findElement(By.id("createContactForm_lastNameLocal")).sendKeys("Tom");
		
		//Enter Department Field Using any Locator of Your Choice
		driver.findElement(By.id("createContactForm_departmentName")).sendKeys("Test");
		
	  //Enter Description Field Using any Locator of your choice 
		driver.findElement(By.id("createContactForm_description")).sendKeys("This is to create a contact for Albert");
		
		//Enter your email in the E-mail address Field using the locator of your choice
		driver.findElement(By.id("createContactForm_primaryEmail")).sendKeys("Aln@gmail.com");
		
		//14. Select State/Province as NewYork Using Visible Text
		
		WebElement dropOption=driver.findElement(By.id("createContactForm_generalStateProvinceGeoId"));
		Select source = new Select(dropOption);
		source.selectByVisibleText("New York");
		
		
		 
		//Click on Create Button
				driver.findElement(By.name("submitButton")).click();
				
		        //Click on edit button
				driver.findElement(By.linkText("Edit")).click();
				
		        //Clear the Description Field using .clear()
				driver.findElement(By.id("updateContactForm_description")).clear();
				
				//Fill ImportantNote Field with Any text
				driver.findElement(By.id("updateContactForm_importantNote")).sendKeys("Editing details for contact");
				
				//Click on update button 
				driver.findElement(By.name("submitButton")).click();
				
				//Get the Title of Resulting Page. refer the video  using driver.getTitle()
				String title= driver.getTitle();
				System.out.println(title);
		  
		/*/
		 * 
		 * 6. Click on Create Contact
		 *  
		 * 7. Enter FirstName Field Using id Locator
		 * 
		 * 8. Enter LastName Field Using id Locator
		 * 
		 * 9. Enter FirstName(Local) Field Using id Locator
		 * 
		 * 10. Enter LastName(Local) Field Using id Locator
		 * 
		 * 11. Enter Department Field Using any Locator of Your Choice
		 * 
		 * 12. Enter Description Field Using any Locator of your choice 
		 * 
		 * 13. Enter your email in the E-mail address Field using the locator of your choice
		 * 
		 * 14. Select State/Province as NewYork Using Visible Text
		 * 
		 * 15. Click on Create Contact
		 * 
		 * 16. Click on edit button 
		 * 
		 * 17. Clear the Description Field using .clear
		 * 
		 * 18. Fill ImportantNote Field with Any text
		 * 
		 * 19. Click on update button using Xpath locator
		 * 
		 * 20. Get the Title of Resulting Page.

         */

	}

}
