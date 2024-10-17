package base_pkg1;
import java.io.File;
import java.io.IOException;
import java.util.Date;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.io.FileHandler;

public class Sshot_generic1 
{
	static String path="C:\\Users\\PC\\Desktop\\Sshot_selnm\\";
	static String format= ".jpeg";
	
	public static void ssgeneric(WebDriver driver) throws IOException
	{
		Date d= new Date();
		String d2 = d.toString();
		String date=d2.replace(":", ".");
		
			TakesScreenshot t=(TakesScreenshot)driver;
			File img = t.getScreenshotAs(OutputType.FILE);
			File target = new File(path+date+format);
			FileHandler.copy(img, target);

	}
}
