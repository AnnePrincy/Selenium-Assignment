package seleniumAssignment;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FaceBook {

	public static void main(String[] args) {
	
		WebDriverManager.chromedriver().setup();
	    ChromeDriver driver=new ChromeDriver();
	    driver.get("https://en-gb.facebook.com/");
	    driver.manage().window().maximize();
	    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.findElement(By.xpath("//a[contains(text(),'Create New Account')]")).click();
		driver.findElement(By.xpath("//input[@name='firstname']")).sendKeys("Anne");
		driver.findElement(By.xpath("//input[@name='lastname']")).sendKeys("Princy");
		driver.findElement(By.xpath("//input[@name='reg_email__']")).sendKeys("9963124568");
		driver.findElement(By.xpath("//input[@name='reg_passwd__']")).sendKeys("applebees");
		WebElement bdate=driver.findElement(By.xpath("//select[@name='birthday_day']"));
		Select objbdate=new Select(bdate);
		objbdate.selectByValue("15");
		WebElement bmonth=driver.findElement(By.xpath("//select[@name='birthday_month']"));
		Select objbmonth=new Select(bmonth);
		objbmonth.selectByVisibleText("Apr");
		WebElement byear=driver.findElement(By.xpath("//select[@name='birthday_year']"));
		Select objbyear=new Select(byear);
		objbyear.selectByIndex(25);
		driver.findElement(By.xpath("//input[@name='sex'][1]")).click();
		driver.findElement(By.xpath("//button[@name='websubmit']")).click();
			
	}

}