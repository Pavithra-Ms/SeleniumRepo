package Week2.day1Assignments;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class CreateAccount {
			public static void main(String[] args) {
				ChromeDriver driver= new ChromeDriver();
				driver.manage().window().maximize();
				driver.get("http://leaftaps.com/opentaps/control/main");
				driver.findElement(By.id("username")).sendKeys("democsr2");
				driver.findElement(By.id("password")).sendKeys("crmsfa");
				driver.findElement(By.className("decorativeSubmit")).click();
				driver.findElement(By.partialLinkText("CRM")).click();
				driver.findElement(By.linkText("Accounts")).click();//Navigate to the accounts tab
				driver.findElement(By.linkText("Create Account")).click();//To navigate the create account
				driver.findElement(By.id("accountName")).sendKeys("Dora");//Account name
				driver.findElement(By.name("description")).sendKeys("Selenium Automation Tester");//To description
				driver.findElement(By.id("numberEmployees")).sendKeys("1750305");//Employee number
				driver.findElement(By.id("officeSiteName")).sendKeys("LeafTaps");//Site name 
				driver.findElement(By.className("smallSubmit")).click();
				String title = driver.getTitle();
				System.out.println(title);	// to print the title of the web-site
				driver.close();//To force close the browser
				
			}
			
}

