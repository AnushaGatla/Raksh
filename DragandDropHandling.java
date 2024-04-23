package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragandDropHandling {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","E:\\Testing Training\\Chromedriver exe file\\chromedriver.exe");
		WebDriver D = new ChromeDriver();
		D.manage().window().maximize();
		D.get("https://jqueryui.com/droppable/");
		/*WebElement Select = D.findElement(By.xpath("//a[text()='Selectable']"));
		Actions Act = new Actions(D);
		Act.click(Select).perform(); //above 3 lines casuall ga rasa ~*/
		D.findElement(By.xpath("//a[text()='Droppable']")).click();
		WebElement frame1 = D.findElement(By.xpath("//iframe[@class='demo-frame']"));
		D.switchTo().frame(frame1);
		WebElement Drag = D.findElement(By.id("draggable"));
		WebElement Drop = D.findElement(By.id("droppable"));
		Actions Act = new Actions(D);
		Thread.sleep(1000);
		Act.dragAndDrop(Drag, Drop).perform();
		Thread.sleep(1000);
	    Act.contextClick(Drop).build().perform();
	    //Act.doubleClick().contextClick(Drop).build().perform();
		
        
		
		
	}

}
