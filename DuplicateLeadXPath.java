package seleniumAssignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DuplicateLeadXPath {

	public static void main(String[] args) throws InterruptedException {
		 WebDriverManager.chromedriver().setup();
		    ChromeDriver driver=new ChromeDriver();
		    driver.get("http://leaftaps.com/opentaps/control/login");
		    driver.manage().window().maximize();
		    driver.findElement(By.xpath("//input[@id='username']")).sendKeys("demoSalesManager");
		    driver.findElement(By.xpath("//input[@id='password']")).sendKeys("crmsfa");
		    driver.findElement(By.xpath("//input[@class='decorativeSubmit']")).click();
		    driver.findElement(By.xpath("//a[contains(text(),'CRM')]")).click();
		    driver.findElement(By.xpath("//a[contains(text(),'Leads')]")).click();
		    driver.findElement(By.xpath("//a[contains(text(),'Find Leads')]	")).click();
		    driver.findElement(By.xpath("//span[contains(text(),'Email')]")).click();
		    driver.findElement(By.xpath("//input[@name='emailAddress']")).sendKeys("anne@gmail.com");
		    driver.findElement(By.xpath("//button[contains(text(),'Find Leads')]")).click();
	        Thread.sleep(3000);
		    WebElement capturedName = driver.findElement((By.xpath("(//div[@class=\"x-grid3-cell-inner x-grid3-col-firstName\"]/a)[1]")));
			System.out.println("Captured Name: "+capturedName);
			String firstName = capturedName.getText();
			System.out.println("First name: "+firstName);
			capturedName.click();
			driver.findElement(By.xpath("//a[contains(text(),'Duplicate Lead')]")).click();
			String title = driver.getTitle();
			System.out.println(title);
			driver.findElement(By.xpath("//input[@class='smallSubmit']")).click();
	WebElement dupValue = driver.findElement(By.xpath("//span[@id='viewLead_firstName_sp']"));
	String duplicateValue=dupValue.getText();
	System.out.println("Duplicate Value: " +duplicateValue);
	if(duplicateValue.equals(firstName))
		System.out.println("Captured name is same as Duplicate Name");
		else
			System.out.println("Captured name is not the same as Duplicate Name");
	 driver.close();
	}
			
         
	}

