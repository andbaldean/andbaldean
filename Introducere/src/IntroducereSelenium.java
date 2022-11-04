import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class IntroducereSelenium {

	public static void main(String[] args) {
		// Call Browser
		//chromedriver.exe --> Chrome browser
		System.setProperty("webdriver.chrome.driver" , "C:\\Users\\andre\\Downloads\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		
		driver.get("https://www.olx.ro/");
		System.out.println(driver.getCurrentUrl());
		//driver.close();
		driver.findElement(By.xpath("//*[@id=\"onetrust-accept-btn-handler\"]")).click();
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("//*[@id=\"topLoginLink\"]")).click();
		
		driver.findElement(By.name("username")).sendKeys("test@yahoo.com");
		
		driver.findElement(By.name("password")).sendKeys("12345678");
		
		driver.findElement(By.xpath("//*[@id=\"__next\"]/div/div/div/div/main/div/div[2]/div/form/button[2]")).click();
		
		
		
		
		
		
		

	}

}
