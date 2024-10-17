package pim1_integration;

import org.openqa.selenium.Keys;
import org.testng.annotations.Test;

import base_pkg1.Baseclass_chrome;
import base_pkg1.Pomclass1;

public class Emp_login extends Baseclass_chrome
{
	@Test
	public void EmpLogin1(Pomclass1 pomg)
	{
	//Pomclass1 pomg=new Pomclass1(driver); //Pom calling for login
	pomg.UN().sendKeys(UN);						 //Pom to @findby UN() and enter UN(basecontant)
	pomg.PS().sendKeys(PS+Keys.ENTER);
	
	System.out.println("Login class done");
	}
}
