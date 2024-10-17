package PIM1_system;

import org.openqa.selenium.JavascriptExecutor;
import org.testng.annotations.Test;
import base_pkg1.Baseclass_chrome;
import base_pkg1.Pomclass1;

public class PIMrunner_System extends Baseclass_chrome
{
@Test
public void PIMsystem1() throws InterruptedException
{
	Pomclass1 pomg=new Pomclass1(driver); //Pomclass calling in runner
	JavascriptExecutor js=(JavascriptExecutor) driver;  //JSE calling in runner
	
	new Emp_login().EmpLogin1(pomg); 	//Ohrm Login
	
	new Employee_create().Empcreate1(pomg,js);		//Employee add
	
	new Emp_remove().Empremove1(pomg);		//Employee remove
}
}
