package testcases;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ForgetPassword {

	public static void main(String[] args)
	{
		WebDriverManager.chromedriver().setup();
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("http://new.koode.in/#/login/0");
		
		driver.manage().window().maximize();
		
		//Enter the Email id
		driver.findElement(By.xpath("//input[@placeholder='Email']")).sendKeys("mahi@gmail.com");
			
		//Click on Forget Password Link
		driver.findElement(By.xpath("//a[@class='uk-link uk-text-small']")).click();
						
		//Enter mail id for reset the password
		driver.findElement(By.xpath("//input[@id='email']")).sendKeys("mahi@gmail.com");
		
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		
		System.out.println("Message is: " +driver.findElement(By.xpath("//div[@role='alert']")));
		
		driver.close();
				
	}

}
