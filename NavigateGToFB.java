package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class NavigateGToFB {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","E:\\Testing Training\\Chromedriver exe file\\chromedriver.exe");
		WebDriver driverg = new ChromeDriver();
		driverg.manage().window().maximize();
		driverg.get("https:\\www.google.com");
		driverg.findElement(By.xpath("//div[text()='Accept all']")).click();
		driverg.findElement(By.name("q")).sendKeys("selenium interview questions");
		driverg.findElement(By.name("btnK")).click();
		driverg.navigate().to("https:\\www.facebook.com");
		driverg.findElement(By.xpath("//button[@title='Allow all cookies']")).click();
		driverg.findElement(By.name("email")).sendKeys("7776616972");
		driverg.findElement(By.xpath("//input[@name='pass']")).sendKeys("santhu1!");
		driverg.findElement(By.xpath("//button[@name='login']")).click();
		driverg.navigate().refresh();
		driverg.navigate().back();
		driverg.navigate().back();
		driverg.navigate().forward();
		driverg.findElement(By.xpath("//button[@title='Allow all cookies']")).click();
		driverg.close();
	}

}
