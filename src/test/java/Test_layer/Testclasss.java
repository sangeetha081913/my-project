package Test_layer;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;
import Base_Page.Baseclass;

public class Testclasss extends Baseclass {
	@Test(dataProvider = "Credentials1")
	public void Testclasss(String email,String password)
	{
		try
		{
	driver.findElement(By.xpath("//*[@id=\"header\"]/div[2]/div/div/nav/div[1]/a")).click();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	driver.findElement(By.id("email")).sendKeys(email);
	driver.findElement(By.id("passwd")).sendKeys(password);
	driver.findElement(By.id("SubmitLogin")).click();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	driver.findElement(By.xpath("//*[@id=\"block_top_menu\"]/ul/li[2]/a")).click();
	driver.findElement(By.xpath("//*[@id=\"subcategories\"]/ul/li[3]/div[1]/a/img")).click();
	driver.findElement(By.xpath("//input[@value='2_1']")).click();
    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
    driver.findElement(By.xpath("//*[@id=\"center_column\"]/ul/li[3]")).click();
    driver.findElement(By.xpath("//*[@id=\"center_column\"]/ul/li[3]/div/div[2]/div[2]/a[1]")).click();
    driver.findElement(By.xpath("//*[@id=\"layer_cart\"]/div[1]/div[2]/div[4]/a")).click();
    driver.findElement(By.xpath("//i[@class='icon-plus']")).click();
    driver.findElement(By.xpath("//*[@id=\"center_column\"]/p[2]/a[1]")).click();
    driver.findElement(By.name("processAddress")).click();
    driver.findElement(By.id("cgv")).click();
    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
    driver.findElement(By.name("processCarrier")).click();
    driver.findElement(By.xpath("//*[@id=\"HOOK_PAYMENT\"]/div[1]/div/p/a")).click();
    driver.findElement(By.xpath("//*[@id=\"cart_navigation\"]/button")).click();
    Thread.sleep(4000);
	}
	catch(Exception e)
	{
	System.out.println(e);
	}
	}
}
