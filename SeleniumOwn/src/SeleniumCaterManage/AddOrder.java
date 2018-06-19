package SeleniumCaterManage;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class AddOrder {

	public static void main(String[] args) throws InterruptedException {
		
		//Invoke browser
				System.setProperty("webdriver.chrome.driver", "H:\\SeleniumHq\\chromedriver.exe");
				
				WebDriver driver = new ChromeDriver();
				
				//Url Invoke
				
				driver.get("http://www.catermanage.co.uk/");
				Thread.sleep(1000);
				driver.manage().window().maximize();
				
				//Enter Credentials
				
				driver.findElement(By.className("md-input")).sendKeys("cater@gmail.com",Keys.TAB,"admin@123",Keys.ENTER);
				
				
				Thread.sleep(5000);
				//Locate Order
				driver.findElement(By.xpath("//span[text()='Order']")).click();
				
				Thread.sleep(2000);
				
				
				
				
		
				
				//Click on Add order
				driver.findElement(By.linkText("Add Order")).click();
				Thread.sleep(1000);
				
//////////////////////////////////////////////Step 1///////////////////////////////////////////////////////////////////////////////////////////////////	
				
				
				//click on order date
				driver.findElement(By.xpath("//*[@id='datepicker1']")).click();
				Thread.sleep(1000);
				driver.findElement(By.id("datepicker1")).click();
				
				
				/*driver.findElement(By.name("note")).sendKeys("Hello I want to book order for 20 Guests . Thank You ");
				Thread.sleep(1000);
				
				//select customer
				Select stp1a = new Select(driver.findElement(By.id("select_demo_5")));
				stp1a.selectByValue("93");
				Thread.sleep(3000);
				//Select event venue and give address
				driver.findElement(By.name("event_venue")).sendKeys("A 20, laxman puri ,vipin garden , near dwarka mor metro station , new delhi 110059 ");
				Thread.sleep(2000);
				
				//select time 
				driver.findElement(By.xpath("//input[@id = 'uk_tp_1']")).click();
				Thread.sleep(1000);
				//select no of guest
				driver.findElement(By.name("num_guest")).sendKeys("20");
				Thread.sleep(1000);*/
				
				
				
				
				
				

	}

}
