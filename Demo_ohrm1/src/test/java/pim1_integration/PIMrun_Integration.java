package pim1_integration;

import org.openqa.selenium.JavascriptExecutor;
import org.testng.annotations.Test;

import PIM1_system.Employee_create;
import base_pkg1.Baseclass_chrome;
import base_pkg1.Pomclass1;

public class PIMrun_Integration extends Baseclass_chrome
{
@Test
public void PIMsystem1() throws InterruptedException
{
	Pomclass1 pomg=new Pomclass1(driver); //Pomclass calling
	JavascriptExecutor js=(JavascriptExecutor) driver;  //JSE calling
	
	new Employee_create().Empcreate1(pomg,js);		//Employee add
	
	new Emp_check().Empcheck1(pomg);		//Employee remove
}
}