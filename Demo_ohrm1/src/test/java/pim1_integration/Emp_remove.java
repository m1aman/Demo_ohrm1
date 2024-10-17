package pim1_integration;

import org.openqa.selenium.Keys;
import org.testng.annotations.Test;

import base_pkg1.Baseclass_chrome;
import base_pkg1.Ddtgeneric1;
import base_pkg1.Pomclass1;

public class Emp_remove extends Baseclass_chrome
{
	@Test
public void Empremove1(Pomclass1 pomg) throws InterruptedException
{
	//Pomclass1 pomg=new Pomclass1(driver); //Pomclass calling
	
	if(pomg.Success().isDisplayed())		//If Profile successfully created
	{
		Thread.sleep(2000);
		System.out.println("Emp added Successfully");
		String Empidd= Ddtgeneric1.ddt1("Orangehrm",7,1);
		Thread.sleep(2000);
		pomg.Elist().click();			//Click Employees list tab
		Thread.sleep(5000);
		pomg.Empidd().sendKeys(Empidd,Keys.BACK_SPACE,Keys.BACK_SPACE);
		pomg.Search().click();			//Search Employee
		pomg.Cboxx().click();
		Thread.sleep(5000);	
		pomg.Delete().click();		//Delete Employee
		pomg.Yesdlt().click();		
		if(pomg.Scsdlt().isDisplayed())		//Successfully deleted msg
		System.out.println("Emp deleted successfully");
	}
	else
	System.out.println("Not Successful");	//Not successfully added even
	
	Thread.sleep(2000);
}
}
