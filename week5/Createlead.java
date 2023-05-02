package week5;


import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Test;

public class Createlead {

		@Test
		public void runCreateLead() {
			ChromeOptions options = new ChromeOptions();
	        options.addArguments("--remote-allow-origins=*");
	        ChromeDriver driver = new ChromeDriver(options);
	        driver.get("http://leaftaps.com/opentaps");
	        driver.manage().window().maximize();
	        driver.findElement(By.id("username")).sendKeys("DemoCSR");
	        driver.findElement(By.id("password")).sendKeys("crmsfa");
	        driver.findElement(By.className("decorativeSubmit")).click();
			driver.findElement(By.linkText("CRM/SFA")).click();
			driver.findElement(By.linkText("Leads")).click();
			driver.findElement(By.linkText("Create Lead")).click();
			driver.findElement(By.id("createLeadForm_companyName")).sendKeys("Testleaf");
			driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Subraja");
			driver.findElement(By.id("createLeadForm_lastName")).sendKeys("Subi");
			driver.findElement(By.id("createLeadForm_primaryPhoneNumber")).sendKeys("99");
			driver.findElement(By.name("submitButton")).click();
			String text = driver.findElement(By.id("viewLead_companyName_sp")).getText();
			if (text.contains("Testleaf")) {
				System.out.println("Lead created successfully");
			} else {
				System.out.println("Lead is not created");
			}
		}

		
	}


