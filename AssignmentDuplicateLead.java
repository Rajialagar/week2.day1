package week2.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AssignmentDuplicateLead {

	public static void main(String[] args) {

		//Launch URL "http://leaftaps.com/opentaps/control/login"

		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps/control/login");

		//Maximize the browser
		driver.manage().window().maximize();
		// Find element of UserName field and enter the value
		driver.findElement(By.id("username")).sendKeys("demosalesmanager");

		//Find element of Password filed and enter the value
		driver.findElement(By.id("password")).sendKeys("crmsfa");

		//Click the login button
		driver.findElement(By.className("decorativeSubmit")).click();

		//Clicking CRM/SFA link
		driver.findElement(By.linkText("CRM/SFA")).click();

		//Clicking Lead link
		driver.findElement(By.linkText("Leads")).click();

		//Clicking Create Lead link
		driver.findElement(By.linkText("Create Lead")).click();

		//Enter CompanyName Field
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys("TestLeaf");

		//Enter FirstName Field
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Rajalakshmi");

		//Enter LastName Field
		driver.findElement(By.id("createLeadForm_lastName")).sendKeys("Alagarsamy");

		//Enter FirstNameLocal Field
		driver.findElement(By.id("createLeadForm_firstNameLocal")).sendKeys("Raji");

		//Enter DepartmentName Field
		driver.findElement(By.id("createLeadForm_departmentName")).sendKeys("Selenium Automation");

		//Enter Description Field
		driver.findElement(By.id("createLeadForm_description")).sendKeys("Lead for Selenium Automation and joined on Jan 2022");

		//Enter EmailAddress Field
		driver.findElement(By.id("createLeadForm_primaryEmail")).sendKeys("rajialagar@gmail.com");

		/*Select State/Province as NewYork - its 3 step process
				1. Find Webelement - Dropdown
				2. Convert as Select class
				3. Then select by using selectVisibleText method*/

		WebElement dropdown = driver.findElement(By.id("createLeadForm_generalStateProvinceGeoId"));
		Select select = new Select(dropdown);
		select.selectByVisibleText("New York");

		//Click on the CreateLead button
		driver.findElement(By.className("smallSubmit")).click();

		//Get the Title of Resulting Page
		System.out.println(driver.getTitle());	

		//Click on Duplicate button
		driver.findElement(By.linkText("Duplicate Lead")).click();

		//Clear the CompanyName Field and Enter New Company name
		driver.findElement(By.id("createLeadForm_companyName")).clear();
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys("LeafLap");

		//Clear the FirstName Field and Enter new FirstName
		driver.findElement(By.id("createLeadForm_firstName")).clear();
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Jagavi");

		//Click on the CreateLead button
		driver.findElement(By.className("smallSubmit")).click();

		//Get the Title of Resulting Page
		System.out.println(driver.getTitle());	
	}

}
