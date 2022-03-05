package seleniumAssignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CreateContact {

	public static void main(String[] args) {
    WebDriverManager.chromedriver().setup();
    ChromeDriver driver=new ChromeDriver();
    driver.get("http://leaftaps.com/opentaps/control/login");
    driver.manage().window().maximize();
    driver.findElement(By.xpath("//input[@id='username']")).sendKeys("demoSalesManager");
    driver.findElement(By.xpath("//input[@id='password']")).sendKeys("crmsfa");
    driver.findElement(By.xpath("//input[@class='decorativeSubmit']")).click();
    driver.findElement(By.xpath("//a[contains(text(),'CRM')]")).click();
    driver.findElement(By.xpath("//a[contains(text(),'Contacts')]")).click();
    driver.findElement(By.xpath("//a[contains(text(),'Create Contact')]")).click();
    driver.findElement(By.xpath("//input[@id='firstNameField']")).sendKeys("Anne");
	driver.findElement(By.xpath("//input[@id='lastNameField']")).sendKeys("Princy");
	driver.findElement(By.xpath("//input[@id='createContactForm_firstNameLocal']")).sendKeys("Ann");
	driver.findElement(By.xpath("//input[@id='createContactForm_firstNameLocal']")).sendKeys("Louis");
	driver.findElement(By.xpath("//input[@name='departmentName']")).sendKeys("IT");
	driver.findElement(By.xpath("//textarea[@id='createContactForm_description']")).sendKeys("To create contact");
	driver.findElement(By.xpath("//input[@id='createContactForm_primaryEmail']")).sendKeys("anne@gmail.com");
	WebElement stateId=driver.findElement(By.xpath("//select[@id='createContactForm_generalStateProvinceGeoId']"));
	Select state=new Select(stateId);
	state.selectByVisibleText("New York");
	driver.findElement(By.xpath("//input[@class='smallSubmit']")).click();
	driver.findElement(By.xpath("//a[contains(text(),'Edit')]")).click();
	WebElement description=driver.findElement(By.xpath("//textarea[@id='updateContactForm_description']"));
	description.clear();
	driver.findElement(By.xpath("//textarea[@id='updateContactForm_importantNote']")).sendKeys("To update contact");
	driver.findElement(By.xpath("//input[@name='submitButton']")).click();
	String updatePage = driver.getTitle();
	System.out.println(updatePage);
 
	}

}
