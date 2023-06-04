package week2.day1.assignments;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DuplicatetLead {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Launch URL "http://leaftaps.com/opentaps/control/login"
		ChromeDriver driver = new ChromeDriver();		
		driver.get("http://leaftaps.com/opentaps/control/login");
		driver.manage().window().maximize();
		
		//Enter UserName and Password Using Id Locator		 
		driver.findElement(By.id("username")).sendKeys("demoSalesManager");
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		
		//Click on Login Button using Class Locator
		driver.findElement(By.className("decorativeSubmit")).click();
		
		 //Click on CRM/SFA Link
		driver.findElement(By.linkText("CRM/SFA")).click();	
		
		//Click on Leads Button
		driver.findElement(By.linkText("Leads")).click();	
		
		//Click on Create Lead 
		driver.findElement(By.linkText("Create Lead")).click();
		
		//Enter CompanyName Field Using id Locator
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys("ABC");
		
		//Enter FirstName Field Using id Locator
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys("John");
		
		//Enter LastName Field Using id Locator
				driver.findElement(By.id("createLeadForm_lastName")).sendKeys("Smith");
				
				 //Enter FirstName(Local) Field Using id Locator
				driver.findElement(By.id("createLeadForm_firstNameLocal")).sendKeys("John");
				
				 //Enter Department Field Using any Locator of Your Choice
				driver.findElement(By.id("createLeadForm_departmentName")).sendKeys("Physics");
				
				 //Enter Description Field Using any Locator of your choice 
				driver.findElement(By.name("description")).sendKeys("This to create a new lead for Test Leaf");
				
				 //Enter your email in the E-mail address Field using the locator of your choice
				driver.findElement(By.id("createLeadForm_primaryEmail")).sendKeys("JohnS@gmail.com");
				
				 //Select State/Province as NewYork Using Visible Text
				WebElement dropOption=driver.findElement(By.id("createLeadForm_generalStateProvinceGeoId"));
				Select source = new Select(dropOption);
				source.selectByVisibleText("New York");
				
		//Click on Create Button
		driver.findElement(By.name("submitButton")).click();
		
		//Get the Title of Resulting Page(refer the video)  using driver.getTitle()
		String title1= driver.getTitle();
		System.out.println("Before duplicating lead: "+title1);
		
        //Click on Duplicate button
		driver.findElement(By.linkText("Duplicate Lead")).click();
		
       //Clear the CompanyName Field using .clear() And Enter new CompanyName
		WebElement companyName=driver.findElement(By.id("createLeadForm_companyName"));
		companyName.clear();
		companyName.sendKeys("Test Leaf");
		
       //Clear the FirstName Field using .clear() And Enter new FirstName
		WebElement firstName=driver.findElement(By.id("createLeadForm_firstName"));
		firstName.clear();
		firstName.sendKeys("Mary");
      
		//Click on Create Lead Button
		driver.findElement(By.className("smallSubmit")).click();
		
		//Get the Title of Resulting Page. refer the video  using driver.getTitle()
		String title= driver.getTitle();
		System.out.println("After duplicating lead: "+title);

	}

}
