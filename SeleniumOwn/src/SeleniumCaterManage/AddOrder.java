package SeleniumCaterManage;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class AddOrder {

	public static void main(String[] args) throws InterruptedException {
		
		//Invoke browser
				System.setProperty("webdriver.chrome.driver", "H:\\SeleniumHq\\chromedriver.exe");
				
				WebDriver driver = new ChromeDriver();
				
				//Url Invoke
				
				driver.get("http://www.catermanage.co.uk/");
				
				driver.manage().window().maximize();
				
				driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
				
				//Enter Credentials
				
				driver.findElement(By.className("md-input")).sendKeys("cater@gmail.com",Keys.TAB,"admin@123",Keys.ENTER);
				
				
				
				//Locate Order
				driver.findElement(By.xpath("//span[text()='Order']")).click();
				
				
				
				Thread.sleep(2000);
				
				
		
				
				//Click on Add order
				 driver.findElement(By.xpath("//*[@id='menu_top']/li[3]/a/span")).click();
				 Actions a = new Actions(driver);
				 WebElement e = driver.findElement(By.linkText("Add Order"));
				 a.moveToElement(e).click().build().perform();
				/* //Move t the manage order
				 WebElement e1 = driver.findElement(By.linkText("Manage Orders"));
				 a.moveToElement(e1).click().build().perform();*/
				 
			
			
				
//////////////////////////////////////////////Step 1///////////////////////////////////////////////////////////////////////////////////////////////////	
				
				 driver.findElement(By.xpath("(//input[@type='text'])[3]")).click();
				 driver.findElement(By.xpath("//*[@class='day']")).click();
				 driver.findElement(By.xpath("(//input[@type='text'])[4]")).click();
				 driver.findElement(By.xpath("//*[@class='day']")).click();
				 driver.findElement(By.name("note")).sendKeys("Sir i want to order some things on your website for party");
				 
				 //Select the customer from dropdownss
				Select customer_name = new Select(driver.findElement(By.name("seller_company_name")));
				customer_name.selectByValue("93");
				
				driver.findElement(By.xpath("//*[@name='event_venue']")).sendKeys("61 street manhattan");
				
				//select time 
				WebElement event_time = driver.findElement(By.name("event_time"));
				Actions eve_time = new Actions(driver);
				eve_time.moveToElement(event_time).click().build().perform();
				
				//move to the time 
				WebElement select_time = driver.findElement(By.xpath("(//*[@class='uk-nav uk-nav-autocomplete uk-autocomplete-results'])[2]/descendant::*/following-sibling::*[5]"));
				eve_time.click(select_time).build().perform();
				
				//Enter number of guest
				
				driver.findElement(By.xpath("(//input[@type='text'])[7]")).sendKeys("10");
				
				Select Utensils_dropdown = new Select(driver.findElement(By.xpath("itemName[]")));
				Utensils_dropdown.selectByValue("Napkin");	
				
				driver.findElement(By.id("price_1")).sendKeys("20");
				driver.findElement(By.id("quantity_1"));
				
				
				
			
				 
			
				
				
				
				

	}

}
