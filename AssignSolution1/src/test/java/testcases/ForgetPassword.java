package testcases;


import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ForgetPassword
{

	@Test
	public static void main(String[] args)
	{
		WebDriverManager.chromedriver().setup();
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("http://new.koode.in/#/login/0");
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		//Enter the Email id
		driver.findElement(By.xpath("//input[@placeholder='Email']")).sendKeys("mahi@gmail.com");
			
		//Click on Forget Password Link
		driver.findElement(By.xpath("//a[@class='uk-link uk-text-small']")).click();
						
		//Enter mail id for reset the password
		driver.findElement(By.xpath("//input[@id='email']")).sendKeys("mahi@gmail.com");
		
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		
		driver.findElement(By.xpath(" //div[@class='alert alert-success']")).getText();
		
		Assert.assertTrue(driver.getCurrentUrl().contains("reset"));
		
		driver.close();
				
	}

}
