package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class HandlingDropdownWithMultiple {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","E:\\Testing Training\\Chromedriver exe file\\chromedriver.exe");
		WebDriver D = new ChromeDriver();
		D.manage().window().maximize();
	    D.get("https://selenium08.blogspot.com/2019/11/dropdown.html");
	    WebElement DD1 = D.findElement(By.xpath("//select[@name='Month']"));
	    if(DD1.isEnabled() && DD1.isDisplayed())
	    {
	    	System.out.println("Dropdown is enabled and displayed");
	    }
	    else
	    {
	    	System.out.println("dropdoen is not enabled and displayed");
	    }

	    Select sel = new Select(DD1);
	    if(sel.isMultiple())
	    {
	    	System.out.println("DropDown does support the multiple");
	    }
	    else
	    {
	    	System.out.println("Drop Down does not support the multiple");
	    }
	    sel.selectByIndex(9);
	    Thread.sleep(2000);
	    sel.selectByValue("Ap");
	    Thread.sleep(2000);
	    sel.selectByVisibleText("May");
	    Thread.sleep(2000);
	    sel.selectByIndex(8);
	    
	   if(sel.getAllSelectedOptions().size()==4)
	   {
		   System.out.println("4 options are selected");
	   }
	   else
	   {
		   System.out.println("4 options are not selected");
	   }
	    
	   Thread.sleep(2000);
	  sel.deselectByIndex(4);
	   
	}
}