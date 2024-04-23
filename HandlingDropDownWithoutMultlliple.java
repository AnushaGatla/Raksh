package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class HandlingDropDownWithoutMultlliple {

	public static void main(String[] args) {
			System.setProperty("webdriver.chrome.driver","E:\\Testing Training\\Chromedriver exe file\\chromedriver.exe");
			WebDriver D = new ChromeDriver();
			D.manage().window().maximize();
		    D.get("https://selenium08.blogspot.com/2019/11/dropdown.html");
		    WebElement DDWM = D.findElement(By.name("country"));
		    if(DDWM.isEnabled() && DDWM.isDisplayed())
		    {
		    	System.out.println("dropdown is enabled and displayed");
		    }
		    else
		    {
		    	System.out.println("dropdown does not enabled and displayed");
		    }
		    Select sel = new Select(DDWM);
		  if(sel.isMultiple())
		  {
			  System.out.println("Dropdown is support mupltiple options selected");
		  }
		  else
		  {
			  System.out.println("Dropdown does not support multiple ooptions selected");
		  }
		  DDWM.findElement(By.xpath("//a[text()='Got it']")).click();
		  
		  int allcounty = sel.getOptions().size();
		  System.out.println("All countries are: " + allcounty);
		  sel.selectByVisibleText("India");
		 String countryname = sel.getFirstSelectedOption().getText();
		 System.out.println("Choosen Country name is " +countryname);
		  
		  sel.selectByValue("GB");
		  String Countryname1 = sel.getFirstSelectedOption().getText();
		  System.out.println("choosen 2nd country name is " + Countryname1 );
		  sel.selectByIndex(5);
	}

}
