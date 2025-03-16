package YT_Programs;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Select_DropDown 
{

	public static void main(String[] args) throws InterruptedException 
	{
				//Step 1- Chrome Driver Setup
				System.setProperty("webdriver.chrome.driver", "D:\\Program Files\\Selenium\\chromedriver.exe");
				
				//Step 2- Driver Initialization
				//WebDriver driver=new ChromeDriver();

				WebDriverManager.chromedriver().setup();
				
			    WebDriver driver = new ChromeDriver();
		        
			    //Step 3- Launching URL
		        driver.get("https://demoqa.com/select-menu");
		        
		        // Maximize the window
		        driver.manage().window().maximize();
		        Thread.sleep(200);
		      
		        //Step 4- Select the dropdown element by id
		        Select select = new Select(driver.findElement(By.id("oldSelectMenu")));
		        
		        //Step 5- Selecting an option by its value
		        System.out.println("Select the Option by value 6");
		        select.selectByValue("4");
		        System.out.println("Select value is: " + select.getFirstSelectedOption().getText());
		        Thread.sleep(500);
		        
		        //Step 6- Selecting the option as 'Purple'-- selectByIndex
		        System.out.println("Select the Option by Index 5");
		        select.selectByIndex(5);
		        Thread.sleep(200);
		        
		        //Step 7- Selecting the option as 'Magenta'-- selectByVisibleText
		        System.out.println("Select the Option by Text Indigo");
		        select.selectByVisibleText("Indigo");
		        System.out.println("Select value is: " + select.getFirstSelectedOption().getText());
		        Thread.sleep(200);
		        
		        //Step 8- Quit the driver
		        driver.quit();
		        
		    }


}



