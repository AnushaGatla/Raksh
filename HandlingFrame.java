package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class HandlingFrame {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","E:\\Testing Training\\Chromedriver exe file\\chromedriver.exe");
		WebDriver D = new ChromeDriver();
		D.manage().window().maximize();
		D.get("https://selenium08.blogspot.com/2019/11/selenium-iframe.html");
		WebElement frame1 = D.findElement(By.xpath("//iframe[@name='iframe_a']")); //it is used for D.switchTo().frame(frame1);
		D.findElement(By.xpath("//a[text()='Got it']")).click();
		//1st Way -- by Using String datatype
		D.switchTo().frame(frame1);
		//2nd Way-- by using int datatype
		//D.switchTo().frame(0);
		//3rd Way --- by Using WebElement
		//D.switchTo().frame("iframe_a");
		Thread.sleep(1000);
	    D.findElement(By.xpath("//input[@itemprop='query-input']")).sendKeys("Selenium Jobs");
		D.findElement(By.xpath("//button[@class='wpb_button wpb_btn-inverse btn']")).click();
		//  for mouse clicks create action class
		Actions act = new Actions(D);
		act.contextClick(frame1).perform();
		

	}

}
