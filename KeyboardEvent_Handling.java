package YT_Programs;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class KeyboardEvent_Handling 
{
	public static void main(String args[]) throws InterruptedException
	{
		//Chrome Driver Setup
		System.setProperty("webdriver.chrome.driver", "D:\\Program Files\\Selenium\\chromedriver.exe");
		
		//Driver Initialization
		WebDriver w=new ChromeDriver();
		
		//Navigate To WebSite
		w.get("https://demoqa.com/text-box");
		Thread.sleep(200);
		
		//For full screen of Window
		w.manage().window().maximize();
		Thread.sleep(200);
		
		//Action class object
		Actions a=new Actions(w);

		//Enter Details
		WebElement fName=w.findElement(By.id("userName"));
		fName.sendKeys("Mr.Kiran Patil"); 
		
		WebElement Email=w.findElement(By.id("userEmail"));
		Email.sendKeys("KiranPatil45@gmail.com");
		
		WebElement Cadd= w.findElement(By.id("currentAddress"));
		Cadd.sendKeys("Near Bailbazar, M.N.ROAD, KURLA(W), MUMBAI-70.");
		
		
		//For select all details from Current add.
		a.keyDown(Keys.CONTROL);
		a.sendKeys("a");
		a.keyUp(Keys.CONTROL);
		a.build().perform();
		Thread.sleep(300);
		
		//For Copy all data
		a.keyDown(Keys.CONTROL);
		a.sendKeys("c");
		a.keyUp(Keys.CONTROL);
		a.build().perform();
		
		//For Scroll the Page
		a.sendKeys(Keys.PAGE_DOWN);
		Thread.sleep(200);
		
		//Press TAB for go to next textfield.
		a.sendKeys(Keys.TAB);
		a.build().perform();
		Thread.sleep(200);
		
		//For Paste the data
		a.keyDown(Keys.CONTROL);
		a.sendKeys("v");
		a.keyUp(Keys.CONTROL);
		a.build().perform();
		Thread.sleep(200);
		
		//Click on submit button
		w.findElement(By.id("submit")).click();
		Thread.sleep(3000);
		
		//Print the result
		WebElement result=w.findElement(By.id("output"));
		System.out.println(result.getText());
		
		//Close The Driver
		w.close();
		
	}
}