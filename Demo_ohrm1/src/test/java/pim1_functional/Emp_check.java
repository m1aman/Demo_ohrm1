package pim1_functional;

import org.openqa.selenium.Keys;
import org.testng.annotations.Test;
import base_pkg1.Ddtgeneric1;
import base_pkg1.Pomclass1;

public class Emp_check 
{
@Test
public void Empcheck1(Pomclass1 pomg) throws InterruptedException
{
	Thread.sleep(2000);
	pomg.PIM().click();  	//click PIM Module in LHN in Homepage
	Thread.sleep(2000);
	
		String Empidd= Ddtgeneric1.ddt1("Orangehrm",7,1);
		Thread.sleep(2000);
		pomg.Elist().click();			//Click Employees list tab
		Thread.sleep(5000);
		pomg.Empidd().sendKeys(Empidd,Keys.BACK_SPACE,Keys.BACK_SPACE);
		pomg.Search().click();			//Search Employee
		
		//Comment for Github push
}
}


