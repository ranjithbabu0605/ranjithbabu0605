package Learning;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;

public class Locators2 {
	
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		String name = Messages.getString("Login.userName"); //$NON-NLS-1$
		//Setting system property for chromedriver
		//System.setProperty("webdriver.chrome.driver", "C:\\Users\\test\\Desktop\\Ranjith\\Personal\\Selenium\\chromedriver\\chromedriver.exe");
		//Invoke browser
		//WebDriver driver = new ChromeDriver();
		
		//Setting property for firefox browser
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\test\\Desktop\\Ranjith\\Personal\\Selenium\\geckodriver\\geckodriver.exe"); //$NON-NLS-1$ //$NON-NLS-2$
		//Invoke browser
		WebDriver driver = new FirefoxDriver();
		//Implicit wait for 5 seconds (waits a maximum of 5 seconds for each steps
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		//Open URL
		//String password = getPassword(driver);
		String password = Messages.getString("Login.password") ; //$NON-NLS-1$
		driver.get("https://rahulshettyacademy.com/locatorspractice"); //$NON-NLS-1$
		//Enter Username by locator 'ID'
		driver.findElement(By.id("inputUsername")).sendKeys(name); //$NON-NLS-1$
		//Enter Password by locator 'name'
		driver.findElement(By.name("inputPassword")).sendKeys(password); //$NON-NLS-1$
		//Clicking Reset Button by locator 'className'
		driver.findElement(By.className("signInBtn")).click(); //$NON-NLS-1$
		Thread.sleep(1000);
		System.out.println(driver.findElement(By.tagName("p")).getText()); //$NON-NLS-1$
		Assert.assertEquals(driver.findElement(By.tagName("p")).getText(), "You are successfully logged in."); //$NON-NLS-1$ //$NON-NLS-2$
		Assert.assertEquals(driver.findElement(By.cssSelector("div[class='login-container'] h2")).getText(), "Hello "+name+","); //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$
		System.out.println(driver.findElement(By.cssSelector("div[class='login-container'] h2")).getText()); //$NON-NLS-1$
		
		/* X patch examples with text details
		 * Sytax
		 * 1. //tagname[text()='Value']---example button[text()='LOG OUT']
		 * 2. //*[text()='Value'] --- searches for text value in any tag
		 */
		//driver.findElement(By.xpath("//*[text()='Log Out']")).click();
		//driver.close();
		
				
		

	}

	public static String getPassword(WebDriver driver) throws InterruptedException
	{
		//Homepage
		driver.get("https://rahulshettyacademy.com/locatorspractice"); //$NON-NLS-1$
		//Clicking forgot password
		driver.findElement(By.linkText("Forgot your password?")).click(); //$NON-NLS-1$
		//Clicking Reset button
		Thread.sleep(1000);
		driver.findElement(By.cssSelector(".reset-pwd-btn")).click(); //$NON-NLS-1$
		//Get the text message
		String passwordText = driver.findElement(By.cssSelector("form p")).getText(); //$NON-NLS-1$
		//Please use temporary password 'rahulshettyacademy' to Login.
		//0th Index "Please use temporary password "
		//1st Index "rahulshettyacademy"
		//2nd Index " to Login."
		//String[] passwordArray = passwordText.split("'");
		/*System.out.println(passwordArray.length);
		
		for(int i=0; i<passwordArray.length; i++)
		{
				System.out.println(passwordArray[i]);
		}
		*/

		String password = passwordText.split("'")[1]; //$NON-NLS-1$
		return password;
				
		
	}
	
	
}

