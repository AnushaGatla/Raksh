package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebTableHandling {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","E:\\Testing Training\\Chromedriver exe file\\chromedriver.exe");
		WebDriver D = new ChromeDriver();
		D.manage().window().maximize();
		D.get("https://www.w3schools.com/html/html_tables.asp");
		//D.findElement(By.xpath("//div[@id='accept-choices']")).click();
		//D.findElement(By.xpath("//div[text()='Accept all & visit the site']")).click();
		D.findElement(By.xpath("//div[@class='sn-b-def  sn-blue']")).click();
	   // String  totaltable =	D.findElement(By.xpath("//table[@id='customers']")).getText();
	    //System.out.println(totaltable); // total table vasthundhi 
		
		String BeforeXpath = "//table[@id='customers']/tbody/tr[2]/td[" ;  
		String AfterXpath = "]";
		for(int i=1;i<=3;i++)
		{
			String ActualXpath = BeforeXpath+i+AfterXpath;
		WebElement Tabledata =	D.findElement(By.xpath(ActualXpath));
			System.out.println(Tabledata.getText());
		}

		
	/*	String BeforeXpath = "//table[@id='customers']/tbody/tr[" ;  
		String AfterXpath = "]/td[1]";
		for(int i=2;i<=7;i++)
		{
			String ActualXpath = BeforeXpath+i+AfterXpath;
		WebElement Tabledata =	D.findElement(By.xpath(ActualXpath));
			System.out.println(Tabledata.getText());
		}*/

	}

}
