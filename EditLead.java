package seleniumAssignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class EditLead {
public static void main(String[] args) throws InterruptedException {
		
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver=new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps/control/main");
		driver.manage().window().maximize();
		driver.findElement(By.id("username")).sendKeys("demoSalesManager");
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		driver.findElement(By.className("decorativeSubmit")).click();
		driver.findElement(By.linkText("CRM/SFA")).click();
		driver.findElement(By.linkText("Leads")).click();
		driver.findElement(By.linkText("Create Lead")).click();
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys("TestLeaf");

		driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Anne");
		
		driver.findElement(By.id("createLeadForm_lastName")).sendKeys("Princy");

		driver.findElement(By.id("createLeadForm_firstNameLocal")).sendKeys("Ann");
		driver.findElement(By.name("departmentName")).sendKeys("IT");
		driver.findElement(By.id("createLeadForm_description")).sendKeys("To create lead");
		driver.findElement(By.id("createLeadForm_primaryEmail")).sendKeys("anne@gmail.com");
		WebElement stateId=driver.findElement(By.id("createLeadForm_generalStateProvinceGeoId"));
		Select state=new Select(stateId);
		state.selectByVisibleText("New York");
		driver.findElement(By.className("smallSubmit")).click();
		driver.findElement(By.linkText("Edit")).click();
		WebElement description=driver.findElement(By.id("updateLeadForm_description"));
		description.clear();
		driver.findElement(By.id("updateLeadForm_importantNote")).sendKeys("To update lead");
		driver.findElement(By.className("smallSubmit")).click();
		String updatePage = driver.getTitle();
		System.out.println(updatePage);
		driver.close();
}
}
