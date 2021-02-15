package mondayseleindiacty;


import java.io.File;
import java.io.IOException;
import java.util.List;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.appium.java_client.functions.ExpectedCondition;


public class SeleIndiActy1 {
	
		
		public static void main (String[] args) throws InterruptedException, IOException {
			
			File file = new File("./src/main/resources/chromedriver.exe");
			String filePath = file.getAbsolutePath();
			System.out.println(filePath);
			System.setProperty("webdriver.chrome.driver", filePath);
			ChromeOptions chromeOptions = new ChromeOptions();
			chromeOptions.addArguments("start-maximized");
			WebDriver driver =  new ChromeDriver(chromeOptions);
			//navigate to the site
			driver.navigate().to(" http://demo.guru99.com/test/newtours/register.php");
			//Print Australia
	        Select drpCountry = new Select(driver.findElement(By.xpath("//select[@name='country']")));
	        drpCountry.selectByValue("AUSTRALIA");
	        System.out.println(drpCountry);
	        Thread.sleep(2000);
	    
	        driver.findElement(By.xpath("//input[@name='firstName']")).sendKeys("Viveka");
	        System.out.println(driver.findElement(By.xpath("//input[@name='firstName']")).getText());
	        Thread.sleep(2000); 
	        driver.findElement(By.xpath("//input[@name='lastName']")).sendKeys("varthini");
	        System.out.println(driver.findElement(By.xpath("//input[@name='lastName']")).getText());
	        Thread.sleep(2000); 
	        driver.findElement(By.xpath("//input[@name='phone']")).sendKeys("8737821982");
	        
	        System.out.println(driver.findElement(By.xpath("//input[@name='phone']")).getText());
	        Thread.sleep(2000);
	        driver.findElement(By.xpath("//input[@name='userName']")).sendKeys("vive99@gmail.com");
	        
	        System.out.println(driver.findElement(By.xpath("//input[@name='userName']")).getText());
	        Thread.sleep(2000);
	        driver.findElement(By.xpath("//input[@name='address1']")).sendKeys("2,Abc street");
	        
	        System.out.println(driver.findElement(By.xpath("//input[@name='address1']")).getText());
	        Thread.sleep(2000);
	        driver.findElement(By.xpath("//input[@name='city']")).sendKeys("cbe");
	        
	        System.out.println(driver.findElement(By.xpath("//input[@name='city']")).getText());
	        Thread.sleep(2000);
	        driver.findElement(By.xpath("//input[@name='state']")).sendKeys("Tamil nadu");
	        
	        System.out.println(driver.findElement(By.xpath("//input[@name='state']")).getText());
	        Thread.sleep(2000);
	        driver.findElement(By.xpath("//input[@name='postalCode']")).sendKeys("641014");
	        
	        System.out.println(driver.findElement(By.xpath("//input[@name='state']")).getText());
	        Thread.sleep(2000);
	        driver.findElement(By.xpath("//input[@id='email']")).sendKeys("vivekavarthini");
	        
	        System.out.println(driver.findElement(By.xpath("//input[@id='email']")).getText());
	        Thread.sleep(2000);
	        driver.findElement(By.xpath("//input[@name='password']")).sendKeys("vive5793");
	        
	        System.out.println(driver.findElement(By.xpath("//input[@name='password']")).getText());
	        Thread.sleep(2000);
	        driver.findElement(By.xpath("//input[@name='confirmPassword']")).sendKeys("qwerty@2132");
	        
	        System.out.println(driver.findElement(By.xpath("//input[@name='confirmPassword']")).getText());
	        Thread.sleep(2000);
	        
	        driver.findElement(By.xpath("//input[@name='submit']")).click();
	        
	        //Screenshot for successfull registration
	        
	        TakesScreenshot ts =((TakesScreenshot)driver);
			File SrcFile=ts.getScreenshotAs(OutputType.FILE);
			File DestFile=new File("./target/SSregister/RegistrationSuccessful.png");
			FileUtils.copyFile(SrcFile, DestFile);
	        Thread.sleep(2000);
	        driver.quit();
		}
}