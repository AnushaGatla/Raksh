package Selenium;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class MultipleWndwos {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","E:\\Testing Training\\Chromedriver exe file\\chromedriver.exe");
		WebDriver D = new ChromeDriver();
		D.manage().window().maximize(); 
		D.get(" https://omayo.blogspot.com");
		D.findElement(By.xpath("//a[text()='Got it']")).click();
		D.findElement(By.linkText("Open a popup window")).click();
	//	D.findElement(By.xpath("//button[text()='Button2']"));
		String parentWindow = D.getWindowHandle();
		System.out.println("ParentWindow: " +parentWindow); // unique id :280F66F4799024466AB8468A5DDA7D3D always not same
		Set<String> Allwindows = D.getWindowHandles();
		Iterator<String> itr = Allwindows.iterator();

		itr.next();

		String ChildWindow = itr.next();
		System.out.println("ChildWindow: " +ChildWindow); // unique id :C053F4CA13B4BC9F7E46D8ACE5EB26CC
		
		D.switchTo().window(ChildWindow);
		String chwtext = D.findElement(By.xpath("//h3[text()='New Window']")).getText();
		System.out.println("Text in the Child Window is : " + chwtext);
		//D.close();  // Only Child window will close
		
		D.switchTo().window(parentWindow);
	String btext= D.findElement(By.xpath("//button[text()='Button2']")).getText();
	System.out.println(btext);
	
		D.close();   //only parent window will close
		//D.quit();   //both parent and child windows close
		
	}

}
