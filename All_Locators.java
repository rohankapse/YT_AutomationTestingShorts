package YT_Programs;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class All_Locators 
{
	public static void main(String args[]) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", "D:\\Program Files\\Selenium\\chromedriver.exe");
		
		WebDriver w=new ChromeDriver();
		w.get("https://demoqa.com/books");
		w.manage().window().maximize();
		Thread.sleep(1000);
		
		System.out.println(w.findElement(By.className("main-header")).getText());
		w.findElement(By.id("login")).click();
		
		System.out.println(w.findElement(By.cssSelector("#app > div > div > div.pattern-backgound.playgound-header > div")).getText());
		
		System.out.println(w.findElement(By.xpath("//*[@id=\"userForm\"]/div[1]/h2")));
		
	
		Thread.sleep(2000);
		
		w.findElement(By.id("login")).click();
	
	}
}