package Learning;

//import org.openqa.selenium.By;
//import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.*;

public class Guru {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

/*		//Setting system property for chromedriver
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\test\\Desktop\\Ranjith\\Personal\\Selenium\\chromedriver\\chromedriver.exe");
		//Invoke browser
		WebDriver driver = new ChromeDriver();
*/
/*		//Setting property for firefox browser
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\test\\Desktop\\Ranjith\\Personal\\Selenium\\geckodriver\\geckodriver.exe");
		//Invoke browser
		WebDriver driver = new FirefoxDriver();
*/
		//Setting property for MSEdge browser
		System.setProperty("webdriver.edge.driver", "C:\\Users\\test\\Desktop\\Ranjith\\Personal\\Selenium\\edgedriver\\msedgedriver.exe");
		//Invoke browser
		WebDriver driver = new EdgeDriver();
		
		//Open URL
		driver.get("https://www.demo.guru99.com/V4/");
		//Enter Username
		driver.findElement(By.name("uid")).sendKeys("mngr398421");
		//Enter Password
		driver.findElement(By.name("password")).sendKeys("hajEpun");
		//Clicking Reset Button
		driver.findElement(By.name("btnReset")).click();
		
/*		//Enter Username
		driver.findElement(By.name("uid")).sendKeys("mngr398421");
		//Enter Password
		driver.findElement(By.name("password")).sendKeys("hajEpun");
		//Clicking Login Button
		driver.findElement(By.name("btnLogin")).click();
		//driver.close();
		driver.quit();
*/		
	
	}

}
