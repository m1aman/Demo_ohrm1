package base_pkg1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Pomclass1
{
	//1 private @Findby
	@FindBy(name="username")
	private WebElement UN;
	@FindBy(name="password")
	private WebElement PS;
	@FindBy(xpath="//span[text()='PIM']")
	private WebElement PIM;
	@FindBy(xpath="//a[text()='Add Employee']")
	private WebElement Addemp;
	
	@FindBy(name="firstName")
	private WebElement Fname;
	@FindBy(name="middleName")
	private WebElement Mname;
	@FindBy(name="lastName")
	private WebElement Lname;
	@FindBy(xpath="//label[text()='Employee Id']/../following-sibling::div[1]/input")
	private WebElement Empid;
	@FindBy(xpath="//input[@type='checkbox']")
	private WebElement Cbox;
	
	
	@FindBy(xpath="//label[text()='Username']/../..//following-sibling::div[2]/input")
	private WebElement Uname;
	@FindBy(xpath="(//input[@type='password'])[1]")
	private WebElement Pword1;
	@FindBy(xpath="(//input[@type='password'])[2]")
	private WebElement Pword2;
	@FindBy(xpath="//button[text()=' Save ']")
	private WebElement Save;
	@FindBy(xpath="//p[text()='Successfully Saved']")
	private WebElement Success;
	
	@FindBy(xpath="//a[text()='Employee List']")
	private WebElement Elist;
	@FindBy(xpath="//label[text()='Employee Id']/../following-sibling::div/input")
	private WebElement Empidd;
	@FindBy(xpath="//button[text()=' Search ']")
	private WebElement Search;
	@FindBy(xpath="//div[text()='11115']/../..//i")
	private WebElement Cboxx;
	@FindBy(xpath="//div[text()='11115']/../..//i[@class='oxd-icon bi-trash']")
	private WebElement Delete;
	@FindBy(xpath="//button[text()=' Yes, Delete ']")
	private WebElement Yesdlt;
	@FindBy(xpath="//p[text()='Successfully Deleted']")
	private WebElement Scsdlt;
	@FindBy(xpath="//p[text()='No Records Found']")
	private WebElement Norecords;
	
	
	
	//2 public POMclass constructor
	public Pomclass1(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	//3 public Getter webelement()
	public WebElement UN()
	{
		return UN;
	}
	public WebElement PS()
	{
		return PS;
	}
	public WebElement PIM()
	{
		return PIM;
	}
	public WebElement Addemp()
	{
		return Addemp;
	}
	
	public WebElement Fname()
	{
		return Fname;
	}
	public WebElement Mname()
	{
		return Mname;
	}
	public WebElement Lname()
	{
		return Lname;
	}
	
	public WebElement Empid()
	{
		return Empid;
	}	
	public WebElement Cbox()
	{
		return Cbox;
	}
	
	public WebElement Uname()
	{
		return Uname;
	}
	public WebElement Pword1()
	{
		return Pword1;
	}
	public WebElement Pword2()
	{
		return Pword2;
	}
	public WebElement Save()
	{
		return Save;
	}
	public WebElement Success()
	{
		return Success;
	}
	public WebElement Elist()
	{
		return Elist;
	}
	public WebElement Empidd()
	{
		return Empidd;
	}
	public WebElement Search()
	{
		return Search;
	}
	public WebElement Cboxx()
	{
		return Cboxx;
	}
	public WebElement Delete()
	{
		return Delete;
	}
	public WebElement Yesdlt()
	{
		return Yesdlt;
	}
	public WebElement Scsdlt()
	{
		return Scsdlt;
	}
	public WebElement Norecords()
	{
		return Norecords;
	}
	
	
	
}

