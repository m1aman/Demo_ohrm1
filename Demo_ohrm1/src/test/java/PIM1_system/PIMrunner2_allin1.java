package PIM1_system;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.testng.annotations.Test;

import base_pkg1.Baseclass_chrome;
import base_pkg1.Ddtgeneric1;
import base_pkg1.Pomclass1;

//Runner class,DDT class,POM class,Base class, Base constant
public class PIMrunner2_allin1 extends Baseclass_chrome
{

@Test
public void Ohrm_login() throws InterruptedException
{
	Pomclass1 pomg=new Pomclass1(driver); //Pomclass calling
	JavascriptExecutor js=(JavascriptExecutor) driver;  //JSE calling
	
	
	//String UN=Ohrm_ddtgeneric.ddt1("Orangehrm",1,1);	//DDT use to fetch UN from Excel
	pomg.UN().sendKeys(UN);								//POM to @findby UN() and enter UN(basecontant)
	//String PS=Ohrm_ddtgeneric.ddt1("Orangehrm",2,1);
	pomg.PS().sendKeys(PS+Keys.ENTER);
	
	Thread.sleep(2000);
	pomg.PIM().click();  	//click PIM Module in LHN in Homepage
	Thread.sleep(2000);
	pomg.Addemp().click();	//click Add Employee button in THN
	
	String Fname=Ddtgeneric1.ddt1("Orangehrm",4,1); //fetch Fname from Excel
	pomg.Fname().sendKeys(Fname);
	String Mname=Ddtgeneric1.ddt1("Orangehrm",5,1);
	pomg.Mname().sendKeys(Mname);
	String Lname=Ddtgeneric1.ddt1("Orangehrm",6,1);
	pomg.Lname().sendKeys(Lname);	//altway Empid also
	
	String Empid= Ddtgeneric1.ddt1("Orangehrm",7,1); //more fields
	pomg.Empid().sendKeys(Keys.CONTROL+"a",Keys.DELETE);
	pomg.Empid().sendKeys(Empid,Keys.BACK_SPACE, Keys.BACK_SPACE);
	Thread.sleep(2000);
	js.executeScript("arguments[0].click();",pomg.Cbox());
	
	Thread.sleep(4000);									//more fields
	String Uname=Ddtgeneric1.ddt1("Orangehrm",8,1);
	//System.out.println(Uname);
	pomg.Uname().sendKeys(Uname);
	
	js.executeScript("arguments[0].scrollIntoView();",pomg.Pword1());	//more fields
	String Pword1=Ddtgeneric1.ddt1("Orangehrm",9,1);
	pomg.Pword1().sendKeys(Pword1);
	String Pword2=Ddtgeneric1.ddt1("Orangehrm",10,1);
	pomg.Pword2().sendKeys(Pword2);	
	pomg.Save().click();
	
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
