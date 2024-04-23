package Selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TextPresent {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","E:\\Testing Training\\Chromedriver exe file\\chromedriver.exe");
		WebDriver drivert = new ChromeDriver();
		drivert.get("https://www.cricbuzz.com");
		String pagesr =drivert.getPageSource();
		System.out.println(pagesr);
		//System.out.println(pagesr.contains("cricket"));
		boolean iscontain = pagesr.contains("cricket");		
		System.out.println("Is Cricket is present?  " +  iscontain );
		/*drivert.findElement(By.xpath("//button[text()='OK']")).click();
		drivert.findElement(By.xpath("//p[text()='Consent']")).click();
		List<WebElement> Links = drivert.findElements(By.tagName("a"));
		System.out.println("Total Links is : " +Links.size());*/
		

	}

}
