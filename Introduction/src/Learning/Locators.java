package Learning;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locators {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		//Setting system property for chromedriver
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\test\\Desktop\\Ranjith\\Personal\\Selenium\\chromedriver\\chromedriver.exe");
		//Invoke browser
		WebDriver driver = new ChromeDriver();
		//Implicit wait for 5 seconds (waits a maximum of 5 seconds for each steps
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
		//Open URL
		driver.get("https://rahulshettyacademy.com/locatorspractice");
		//Enter Username by locator 'ID'
		driver.findElement(By.id("inputUsername")).sendKeys("Ranjith");
		//Enter Password by locator 'name'
		driver.findElement(By.name("inputPassword")).sendKeys("hajEpun");
		//Clicking Reset Button by locator 'className'
		driver.findElement(By.className("signInBtn")).click();
		/*Css Selectors syntax
		 * 1. tagname.classname
		 * 2. tagname#id
		 * 3. Tagname[attribute='value']
		 * 4. Tagname[attribute*='value'] --- Partial value of the attribute is matched 
		 */
		System.out.println(driver.findElement(By.cssSelector(".error")).getText());
		//Clicking the forgot password link using locator "linkText"
		driver.findElement(By.linkText("Forgot your password?")).click();
		/* Xpath Syntax
		 * 1. //Tagname[@attribute='Value']
		 */
		driver.findElement(By.xpath("//input[@placeholder='Name']")).sendKeys("Ranjith");
		//example for general syntax "Tagname[attribute='value']"
		//driver.findElement(By.cssSelector("input[placeholder='Name']")).clear();
		// Xpath with index
		driver.findElement(By.xpath("//input[@type='text'][2]")).sendKeys("Test@gmail.com");
		//Css selector with indexes
		driver.findElement(By.cssSelector("input[type='text']:nth-child(3)")).clear();
		/* xpath with parent/child
		 * Syntax
		 * 1. //parenttag/Child[index]
		 * 
		 */
		driver.findElement(By.xpath("//form/input[3]")).sendKeys("9944767519");
		//css selector without tagname 
		driver.findElement(By.cssSelector(".reset-pwd-btn")).click();
		//Parent child using css selector
		System.out.println(driver.findElement(By.cssSelector("form p")).getText());
		Thread.sleep(1000);
		//css selector with regular expression
		System.out.println(driver.findElement(By.cssSelector("button[class*='go-to-login']")).getText());
		//xpath with regualr exprssion/ parent child tags
		driver.findElement(By.xpath("//div[contains (@class,'forgot-pwd-btn-conainer')]/button[1]")).click();
		
		// Css selector with Tagname#id with tagname
		driver.findElement(By.cssSelector("input#inputUsername")).sendKeys("Ranjith");
		//Css selector with regular exception *
		driver.findElement(By.cssSelector("input[type*='passwo']")).sendKeys("rahulshettyacademy");
		Thread.sleep(1000);
		//Css selector without tagname and with ID
		driver.findElement(By.cssSelector("#chkboxOne")).click();
		//xpath with contains keyword or regular expression
		driver.findElement(By.xpath("//button[contains(@class,'signInBtn')]")).click();
		
		
		
		
		
		
		
		
		
	}

}
