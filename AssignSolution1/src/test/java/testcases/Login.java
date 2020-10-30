package testcases;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Login {

	public static void main(String[] args) throws InterruptedException 
	{
		//Launching the Web Page
			System.setProperty("webdriver.chrome.driver", "Z:\\Software\\Selenium SW\\chromedriver85.exe");
			WebDriver driver = new ChromeDriver();
			driver.get("http://new.koode.in/#/login/0");
			driver.manage().window().maximize();
			System.out.println("Page Title is :-" +driver.getTitle());
			System.out.println("Page URL is :-" +driver.getCurrentUrl());
			Thread.sleep(2000);
				
		//Login Process
			//Enter Email id
			driver.findElement(By.xpath("//*[@id=\"app\"]/div/section/div[2]/div/div/div[2]/div[1]/form/fieldset/div[1]/input")).sendKeys("mahi@gmail.com");
			Thread.sleep(2000);
			//Enter the Password
			driver.findElement(By.xpath("//*[@id=\"app\"]/div/section/div[2]/div/div/div[2]/div[1]/form/fieldset/div[2]/input")).sendKeys("Abcd123");
			Thread.sleep(2000);
			//Click the Checkbox
			driver.findElement(By.xpath("//*[@id=\"app\"]/div/section/div[2]/div/div/div[2]/div[1]/form/fieldset/div[3]/label/input")).click();
			Thread.sleep(2000);
				
			//Click on Sing in button
			driver.findElement(By.xpath("//*[@id=\"app\"]/div/section/div[2]/div/div/div[2]/div[1]/form/fieldset/div[4]/button")).click();
			Thread.sleep(5000);
			
			//Close the browser
			driver.close();
				
	}

}
