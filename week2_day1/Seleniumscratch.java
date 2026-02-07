package week2_day1;

import org.openqa.selenium.chrome.ChromeDriver;

public class Seleniumscratch {

	public static void main(String[] args) {
		ChromeDriver driver=new ChromeDriver(); 
		driver.manage().window().maximize()	;
		driver.get("http://facebook.com"); 
		driver.close();
		}

}
