package base_pkg1;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.ITestListener;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Baseclass_chrome implements Bconstant1
{

public WebDriver driver;
Pomclass1 pomg=new Pomclass1(driver); //Pomclass calling
JavascriptExecutor js=(JavascriptExecutor) driver;  //JSE calling

@BeforeMethod
public void Openapp()
{
WebDriverManager.chromedriver().setup();		//Chrome Browser initialization
driver=new ChromeDriver();						//Chrome Browser open
driver.manage().window().maximize();
driver.manage().timeouts().implicitlyWait(time, TimeUnit.SECONDS);
WebDriverWait ew= new WebDriverWait(driver, 15);

driver.get(url);		//Open Ohrm
Pomclass1 pomg=new Pomclass1(driver); //Pomclass calling
JavascriptExecutor js=(JavascriptExecutor) driver;  //JSE calling
pomg.UN().sendKeys(UN);								//POM to @findby UN() and enter UN(basecontant)
pomg.PS().sendKeys(PS+Keys.ENTER);

}

@AfterMethod
public void Closeapp(ITestResult result) throws InterruptedException
{
	
	if(result.FAILURE==result.FAILURE)
	{
		//base_pkg1.Sshot_generic1;
	}
	
	Thread.sleep(5000);
	driver.close();
}

}
