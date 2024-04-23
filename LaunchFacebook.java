package Selenium;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
public class LaunchFacebook {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","E:\\Testing Training\\Chromedriver exe file\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		/*Thread.sleep(2000);    //temporarily cease execution for the specified number of milliseconds
		driver.manage().window().maximize();    //Returns the interface for managing the current window.
		Thread.sleep(2000);                     //Maximizes the current window if it is not already maximized
		//driver.close();      //close current window  
		//driver.get("https:\\www.google.com"); // company website estham
		driver.get("https:\\www.facebook.com");
		//Thread.sleep(2000);
		//driver.findElement(By.name("email")).sendKeys("santosh@ramagiri.com");
		driver.findElement(By.id("email")).sendKeys("anusha@gatla.com");
		//Thread.sleep(1000);
		driver.findElement(By.xpath("//button[@name='login']")).click();
		//driver.findElement(By.linkText("Allow all cookies")).click();
		//Thread.sleep(1000);
		driver.findElement(By.linkText("Create a Page")).click(); // create a page */

	}

}
