package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class newFBLogin {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","E:\\Testing Training\\Chromedriver exe file\\chromedriver.exe");
		WebDriver driver1 = new ChromeDriver();
		driver1.manage().window().maximize();
		driver1.get("https:\\www.fb.com");
		Thread.sleep(1000);
		driver1.findElement(By.xpath("//button[@data-cookiebanner='accept_button']")).click();
		driver1.findElement(By.xpath("//button[@title='Allow all cookies']")).click();
		//driver1.findElement(By.xpath("//button[@id='u_0_k_Q5']")).click(); // but id is changing when page is refreshing
		//driver1.findElement(By.linkText("Create a Page")).click();
		//driver1.findElement(By.xpath("//button[@data-cookiebanner='accept_button']")).click(); 
		driver1.findElement(By.name("email")).sendKeys("7776616972");
		driver1.findElement(By.xpath("//input[@name='pass']")).sendKeys("santhu1!");
		driver1.findElement(By.xpath("//button[@name='login']")).click();
		driver1.close();
		
	}

}
