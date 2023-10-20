package classprojectorangehrm;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class Orangehrm {
@Test
public void LoadPage() throws InterruptedException {
//System.setProperty("webdriver.chrome.driver","C:\\Users\\mgakh\\OneDrive\\Desktop\\Testing\\Automation testing\\Selenium\\chromedriver_win32\\chromedriver.exe");
//WebDriver driver= new ChromeDriver();
	System.setProperty("webdriver.gecko.driver","C:\\Users\\ssree\\Downloads\\geckodriver-v0.26.0-win32\\geckodriver.exe");
	WebDriver driver=new FirefoxDriver();
driver.get("http://localhost/orangehrm/orangehrm-5.5/web/index.php/auth/login");
Thread.sleep(2000);
driver.manage().window().maximize();
driver.findElement(By.xpath("/html/body/div/div[1]/div/div[1]/div/div[2]/div[2]/form/div[1]/div/div[2]/input")).sendKeys("admin");
driver.findElement(By.xpath("/html/body/div/div[1]/div/div[1]/div/div[2]/div[2]/form/div[2]/div/div[2]/input")).sendKeys("Sreedevi123!@#");
driver.findElement(By.xpath("/html/body/div/div[1]/div/div[1]/div/div[2]/div[2]/form/div[3]/button")).click();
driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
driver.findElement(By.xpath("/html/body/div/div[1]/div[1]/aside/nav/div[2]/ul/li[2]/a")).click();
new WebDriverWait(driver,50).until(ExpectedConditions.visibilityOf(driver.findElement(By.linkText("Add Employee")))).click();
driver.findElement(By.name("firstName")).sendKeys("Sree");
driver.findElement(By.name("middleName")).sendKeys("Devi");
driver.findElement(By.name("lastName")).sendKeys("A");
Thread.sleep(2000);
driver.findElement(By.xpath("/html/body/div/div[1]/div[2]/div[2]/div/div/form/div[2]/button[2]")).click();
driver.findElement(By.xpath("/html/body/div/div[1]/div[2]/div[2]/div/div/div/div[2]/div[1]/form/div[2]/div[2]/div[1]/div/div[2]/input")).sendKeys("20/1168/2007");
driver.findElement(By.xpath("/html/body/div/div[1]/div[2]/div[2]/div/div/div/div[2]/div[1]/form/div[2]/div[2]/div[2]/div/div[2]/div/div/input")).sendKeys("2027-05-14");
//driver.findElement(By.xpath("/html/body/div/div[1]/div[2]/div[2]/div/div/div/div[2]/div[1]/form/div[3]/div[1]/div[1]/div/div[2]/div/div/div[1]")).sendKeys("Indian");
//driver.findElement(By.xpath("/html/body/div/div[1]/div[2]/div[2]/div/div/div/div[2]/div[1]/form/div[3]/div[1]/div[2]/div/div[2]/div/div/div[1]")).sendKeys("Married");
driver.findElement(By.xpath("/html/body/div/div[1]/div[2]/div[2]/div/div/div/div[2]/div[1]/form/div[3]/div[2]/div[1]/div/div[2]/div/div/input")).sendKeys("1988-02-02");
//driver.findElement(By.xpath("/html/body/div/div[1]/div[2]/div[2]/div/div/div/div[2]/div[1]/form/div[3]/div[2]/div[2]/div/div[2]/div[2]/div[2]/div/label/span")).sendKeys("");
driver.findElement(By.xpath("/html/body/div/div[1]/div[2]/div[2]/div/div/div/div[2]/div[1]/form/div[4]/button")).click();

//driver.close();
}

}
