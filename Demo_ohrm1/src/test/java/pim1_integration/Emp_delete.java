package pim1_integration;

import org.openqa.selenium.Keys;
import org.testng.annotations.Test;

import base_pkg1.Ddtgeneric1;
import base_pkg1.Pomclass1;

public class Emp_delete 
{
@Test
public void Empdelete1(Pomclass1 pomg) throws InterruptedException
{
	if(!pomg.Norecords().isDisplayed())
	{
		Thread.sleep(2000);
		pomg.Cboxx().click();
		Thread.sleep(5000);	
		pomg.Delete().click();		//Delete Employee
		pomg.Yesdlt().click();		
		if(pomg.Scsdlt().isDisplayed())		//Successfully deleted msg
		System.out.println("Emp deleted successfully");
	}
	else
	System.out.println("Not records found");	//Not successfully added even
	
	Thread.sleep(2000);
	
	
}
}
