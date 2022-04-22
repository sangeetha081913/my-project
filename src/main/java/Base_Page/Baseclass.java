package Base_Page;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
public class Baseclass {
	public WebDriver driver;
	Excelsheet obj= new Excelsheet ("D:\\product.xlsx");
	@BeforeMethod
	public void setup() {

	System.setProperty("webdriver.chrome.driver","C:\\java app\\chromedriver_win32\\chromedriver.exe");
	driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://automationpractice.com/index.php");
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	
	}
	@DataProvider(name ="Credentials1")
	public Object[][] getExcelData() {
	//Totals rows count
	int rows=obj.getRowCount("type");
	//Total Columns
	int column=obj.getColumnCount("type");
	int actRows=rows-1;
	Object[][] data= new Object[actRows][column];
	for(int i=0;i<actRows;i++) {
	for(int j=0; j<column;j++) {
	data[i][j]=obj.getCellData("type",j,i+2);
	}
	}
	return data;

	}
}  
