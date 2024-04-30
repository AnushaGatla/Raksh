package Selenium;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ContextclickOnDiffBrowsers {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","E:\\Testing Training\\Chromedriver exe file\\chromedriver.exe");
		WebDriver D = new ChromeDriver();
		D.manage().window().maximize();
		D.get("https://www.google.com");
		D.findElement(By.xpath("//div[text()='Accept all']")).click();
		WebElement CD = D.findElement(By.name("q"));
		Actions act = new Actions(D);
		act.contextClick(CD).perform();
		CD.sendKeys("selenium interview questions");
		D.findElement(By.name("btnK")).click();
	
		
	}

}
