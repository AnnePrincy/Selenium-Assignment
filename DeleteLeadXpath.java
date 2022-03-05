package seleniumAssignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DeleteLeadXpath {
	
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
		    driver.findElement(By.xpath("//span[contains(text(),'Phone')]")).click();
		    driver.findElement(By.xpath("//input[@name='phoneNumber']")).sendKeys("9956321486");
		    driver.findElement(By.xpath("//button[contains(text(),'Find Leads')]")).click();
    		Thread.sleep(3000);
		    WebElement leadid = driver.findElement(By.xpath("//div[contains(@class,'x-grid3-cell-inner x-grid3-col-partyId')]/a[1]"));
			String leadidVal = leadid.getText();
		    System.out.println("Captured Leadid: "+leadidVal);			
			leadid.click();
			driver.findElement(By.xpath("//a[contains(text(),'Delete')]	")).click();
			driver.findElement(By.xpath("//a[contains(text(),'Find Leads')]	")).click();
		    driver.findElement(By.xpath("//input[@name='id']")).sendKeys(leadidVal);
		    driver.findElement(By.xpath("//button[contains(text(),'Find Leads')]")).click();
		    driver.close();
	}

}
