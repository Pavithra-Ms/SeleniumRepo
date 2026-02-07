package Week2.day1Assignments;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class CreateLeads {
	public static void main(String[] args) {
		ChromeDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://leaftaps.com/opentaps/control/main");
		driver.findElement(By.id("username")).sendKeys("democsr2");
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		driver.findElement(By.className("decorativeSubmit")).click();
		driver.findElement(By.partialLinkText("CRM")).click();
		driver.findElement(By.linkText("Leads")).click();
		driver.findElement(By.linkText("Create Lead")).click();
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Pavithra");
		driver.findElement(By.id("createLeadForm_lastName")).sendKeys("Ms");
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys("Never Give up");
		driver.findElement(By.id("createLeadForm_generalProfTitle")).sendKeys("Selenium");
		driver.findElement(By.name("submitButton")).click();
		String title = driver.getTitle();
		System.out.println(title);	// to print the title of the web-site
		driver.close();//To force close the browser
	}
}
