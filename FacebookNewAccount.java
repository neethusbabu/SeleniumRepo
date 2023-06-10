package week2.day2.assignments;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class FacebookNewAccount {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// Step 1: Download and set the path 
		// Step 2: Launch the chromebrowser
		ChromeDriver driver=new ChromeDriver();
		// Step 3: Load the URL https://en-gb.facebook.com/
		driver.get("https://en-gb.facebook.com/");
		
		// Step 4: Maximise the window
		driver.manage().window().maximize();
		// Step 5: Add implicit wait
		//driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);;
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		
		// Step 6: Click on Create New Account button
		driver.findElement(By.xpath("//form[@class='_9vtf']//div[5]/a")).click();
		
		// Step 7: Enter the first name
		driver.findElement(By.xpath("//form[@id='reg']/div/div/div/div/div/input")).sendKeys("Neethu");
		
		// Step 8: Enter the last name
		driver.findElement(By.xpath("//form[@id='reg']/div/div/div/div[2]/div/div/input")).sendKeys("S");
		
		// Step 9: Enter the mobile number
		driver.findElement(By.xpath("//form[@id='reg']/div/div[2]/div/div/input")).sendKeys("566541");
		
		// Step 10: Enter the password
		driver.findElement(By.xpath("//form[@id='reg']/div/div[4]/div/div/input")).sendKeys("123456");
		
		// Step 11: Handle all the three drop downs
		driver.findElement(By.xpath("//select[@id='day']")).sendKeys("6");
		driver.findElement(By.xpath("//select[@id='month']")).sendKeys("Jun");
		driver.findElement(By.xpath("//select[@id='year']")).sendKeys("2006");
		
		WebElement dropOption1=driver.findElement(By.xpath("//select[@id='day']"));
		Select source = new Select(dropOption1);
		source.selectByVisibleText("6");
		
		WebElement dropOption2=driver.findElement(By.xpath("//select[@id='month']"));
		Select source1= new Select(dropOption2);
		source1.selectByVisibleText("Jun");
		
		WebElement dropOption3=driver.findElement(By.xpath("//select[@id='year']"));
		Select source2 = new Select(dropOption3);
		source2.selectByVisibleText("2006");
		
		


		// Step 12: Select the radio button "Female" 
		driver.findElement(By.xpath("//input[@type='radio'][1]")).click();
		
		         //   ( A normal click will do for this step) 
		
		driver.close();


	}

}
