package mondayseleindiacty;

import java.io.File;

import org.openqa.selenium.By;
import org.openqa.selenium.NoAlertPresentException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class SeleIndiActy4 {
	public static void main(String[] args)throws Exception {
		//Exception handling
		try {
		File file = new File("./src/main/resources/chromedriver.exe");
		String filePath = file.getAbsolutePath();
		System.out.println(filePath);
		System.setProperty("webdriver.chrome.driver", filePath);
		ChromeOptions chromeOptions = new ChromeOptions();
		chromeOptions.addArguments("start-maximized");
		WebDriver driver =  new ChromeDriver(chromeOptions);
		driver.navigate().to("https://cosmocode.io/automation-practice-webtable/");
		}
		catch(Exception e) {
			System.out.println("Navigation Unsuccessful");
		}
		//WebDriver Exception
		WebDriver driver = new InternetExplorerDriver();
		driver.get("https://cosmocode.io/automation-practice-webtable/");
		driver.close();
		driver.quit();
		//No AlertPresrentException
		try{
			driver.switchTo().alert().accept();
			}
			catch (NoAlertPresentException E){
			E.printStackTrace();
			}
		
		
		
		
	}

}
