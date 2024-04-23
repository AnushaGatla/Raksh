package Selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GoogleLaunch {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","E:\\Testing Training\\Chromedriver exe file\\chromedriver.exe");
		WebDriver driverg = new ChromeDriver();
		driverg.manage().window().maximize();
		driverg.get("https:\\www.google.com");
		driverg.findElement(By.xpath("//div[text()='Accept all']")).click();
		driverg.findElement(By.name("q")).sendKeys("selenium interview questions");
		driverg.findElement(By.name("btnK")).click();
		//driverg.close();
		driverg.findElement(By.xpath("//h3[text()='91 Selenium Interview Questions and Answers for 2024']")).click();
		driverg.switchTo().alert().accept();
		//driverg.findElement(By.xpath("//button[text()='OK']")).click();
		//List< WebElement> Alllinks =  driverg.findElements(By.tagName("script"));
	    //System.out.println("total links : " + Alllinks.size());
				
	}

}

