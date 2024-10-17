package base_pkg1;

import org.testng.annotations.DataProvider;

public class Data_provider 
{
@DataProvider(name="login") //Login page data to be stored here
public Object[][] data1()
{
	return new Object[][]
	{
		{"Admin","Admin123"},
		{"abc", "123"},
		{"def","456"}
	};
}
}
