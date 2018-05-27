package browser;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.By;


public class checkboxes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.gecko.driver","C://Users//sandh//Documents/geckodriver.exe");

		WebDriver driver=new FirefoxDriver();
		
		/*driver.get("http://spicejet.com/");
		Select s= new Select(driver.findElement(By.id("ctl00_mainContent_ddl_Adult")));
		s.selectByValue("2");
		s.selectByIndex(6);
		s.selectByVisibleText("5 Adults");
		//driver.findElement(By.cssSelector("#ctl00_mainContent_ddl_originStation1_CTXT")).click();
		
	/*	driver.findElement(By.xpath("//a[@value='GOI']")).click();
		driver.findElement(By.xpath("(//a[@value='DEL'])[2]")).click();*/
		//isSelected()
		
		driver.get("https://ffai.loyaltyplus.aero/ailoyalty/register.jsf");
		
		//System.out.println(driver.findElement(By.xpath("//*[@id=\"register_form:profile:attachAdrFile\"]/div[2]/span")).isSelected());
		//driver.findElement(By.cssSelector("//*[@id=\\'register_form:register-focus_content\\']")).click();
				
		
		 
		 driver.findElement(By.xpath("//*[@id=\"register_form:profile:attachAdrFile\"]/div[2]/span")).click();
		 System.out.println(driver.findElement(By.xpath("/html/body/div[6]/div/div[2]/form/div[2]/div/table[7]/tbody/tr[1]/td[1]/div/div[2]/span")).isSelected());
		driver.findElement(By.xpath("/html/body/div[6]/div/div[2]/form/div[2]/div/table[7]/tbody/tr[1]/td[1]/div/div[2]/span")).click();
		//System.out.println(driver.findElement(By.id("ctl00_mainContent_chk_IndArm")).isSelected());
		//true  false

			}

}
