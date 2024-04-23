package Selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CountLinksInWebsite {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","E:\\Testing Training\\Chromedriver exe file\\chromedriver.exe");
		WebDriver D = new ChromeDriver();
		D.manage().window().maximize();
		D.get("https://www.rediff.com");
		D.findElement(By.xpath("//p[text()='Consent']")).click();
	    List< WebElement> Alllinks =  D.findElements(By.tagName("a"));
	    System.out.println("total links : " + Alllinks.size());
	    for(WebElement w : Alllinks)
	    {
	    	System.out.println(w.getText());
	    }
	}

}
