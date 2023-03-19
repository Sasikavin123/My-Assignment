package Week2.day2;



	import java.time.Duration;

	import org.openqa.selenium.By;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.chrome.ChromeDriver;
	import org.openqa.selenium.chrome.ChromeOptions;

	public class Deletelead {

		public static void main(String[] args) {


			ChromeOptions option = new ChromeOptions();
			option.addArguments("--remote-allow-origins=*");
			ChromeDriver driver = new ChromeDriver(option);
			driver.get("http://leaftaps.com/opentaps/control/main");
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));


			driver.findElement(By.id("username")).sendKeys("DemoCSR");
			driver.findElement(By.id("password")).sendKeys("crmsfa");


			driver.findElement(By.className("decorativeSubmit")).click();


			driver.findElement(By.partialLinkText("CRM/SFA")).click();


			driver.findElement(By.linkText("Leads")).click();


			driver.findElement(By.xpath("//a[contains(text(), 'Find')]")).click();	


			driver.findElement(By.xpath("//span[text()='Phone']")).click();


			driver.findElement(By.name("phoneNumber")).sendKeys("99");


			driver.findElement(By.xpath("//button[contains(text(),'Find')]")).click();


			WebElement element = driver.findElement(By.xpath("//div[contains(text(),'99')]/preceding::a[4]"));
			String leadId = element.getText();
			System.out.println(leadId);


			element.click();


			driver.findElement(By.linkText("Delete")).click();


			driver.findElement(By.xpath("//a[contains(text(), 'Find')]")).click();


			driver.findElement(By.xpath("//input[@name = 'id']")).sendKeys(leadId);


			driver.findElement(By.xpath("//button[contains(text(),'Find')]")).click();


			if(driver.findElement(By.xpath("//div[contains(text(), 'No records')]")).getText().equals("No records to display"))
				System.out.println("Sucess");
			else
				System.out.println("Unsucess");


			driver.close();
		}

	}


