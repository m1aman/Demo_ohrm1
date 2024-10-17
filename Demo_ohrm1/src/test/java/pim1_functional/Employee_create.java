package pim1_functional;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.testng.annotations.Test;

import base_pkg1.Baseclass_chrome;
import base_pkg1.Ddtgeneric1;
import base_pkg1.Pomclass1;

public class Employee_create extends Baseclass_chrome
{
@Test(dependsOnMethods = "Emp_login.Emplogin1")
public void Empcreate1(Pomclass1 pomg, JavascriptExecutor js) throws InterruptedException
{
	//Pomclass1 pomg=new Pomclass1(driver); //Pomclass calling
	//JavascriptExecutor js=(JavascriptExecutor) driver;  //JSE calling
	
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
	
	System.out.println("Employee creation class done");
}
}
