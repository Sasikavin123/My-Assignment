package Week2.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;

public class Createlead {

	public static void main(String[] args) {
		
		// TODO Auto-generated method stub
			ChromeOptions options = new ChromeOptions();
	        options.addArguments("--remote-allow-origins=*");
	        ChromeDriver driver = new ChromeDriver(options);
	       // ChromeDriver driver = new ChromeDriver();
	        driver.get("http://leaftaps.com/opentaps");
	        driver.manage().window().maximize();
	        driver.findElement(By.id("username")).sendKeys("DemoCSR");
	        driver.findElement(By.id("password")).sendKeys("crmsfa");
	        driver.findElement(By.className("decorativeSubmit")).click();
	        driver.findElement(By.partialLinkText("CRM/SFA")).click();
	        driver.findElement(By.linkText("Leads")).click();
	        driver.findElement(By.linkText("Create Leads")).click();
	        driver.findElement(By.id("createLeadForm_companyName")).sendKeys("Testleaf");
	        driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Sasi");
	        driver.findElement(By.id("createLeadForm_lastName")).sendKeys("S");
	        driver.findElement(By.name("submitButton")).click();;


		   driver.findElement(By.id("createLeadForm_departmentName")).sendKeys("Testing");


		driver.findElement(By.id("createLeadForm_description")).sendKeys("Create the Lead Form");


		driver.findElement(By.id("createLeadForm_primaryEmail")).sendKeys("testing@gmail.com");


		WebElement state = driver.findElement(By.id("createLeadForm_generalStateProvinceGeoId"));
		Select selState = new Select(state);
		selState.selectByVisibleText("Chennai");


		driver.findElement(By.name("submitButton")).click();


		System.out.println(driver.getTitle());
	}


	}


