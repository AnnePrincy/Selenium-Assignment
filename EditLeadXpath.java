package seleniumAssignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class EditLeadXpath {
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
		    driver.findElement(By.xpath("(//input[@name='firstName'])[3]")).sendKeys("Anne");
		    driver.findElement(By.xpath("//button[contains(text(),'Find Leads')]")).click();
	        Thread.sleep(3000);
	        WebElement leadid = driver.findElement(By.xpath("//a[contains(text(),'10229')]"));
	        leadid.click();
	        String title = driver.getTitle();
	        System.out.println(title);
	        driver.findElement(By.xpath("//a[contains(text(),'Edit')]")).click();
	    	WebElement companyName=driver.findElement(By.xpath("//input[@id='updateLeadForm_companyName']"));
			companyName.clear();
		    driver.findElement(By.xpath("//input[@id='updateLeadForm_companyName']")).sendKeys("Grow with Leaf");
		    driver.findElement(By.xpath("(//input[@class='smallSubmit'])[1]")).click();
		    WebElement compName = driver.findElement(By.xpath("//span[@id='viewLead_companyName_sp']"));
		    String updatedCompName=compName.getText();
		   System.out.println("The updated company name is: " +updatedCompName);
		   driver.close();
	}

}
