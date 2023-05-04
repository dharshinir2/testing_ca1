import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ca_q1 {
	 WebDriver driver;
	  @BeforeTest
	  public void beforeTest() {
	 driver=new FirefoxDriver();
	  }
	 

	  @Test
	  public void Test() throws InterruptedException {
	 String url="https://www.amazon.in/";
	 driver.get(url);
	 driver.manage().window().maximize();
	 Thread.sleep(5000);
	 driver.findElement(By.xpath("//*[@id=\"twotabsearchtextbox\"]")).sendKeys("Phones",Keys.ENTER);
	
	 
	 driver.findElement(By.xpath("/html/body/div[1]/div[2]/div[1]/div[1]/div/span[1]/div[1]/div[3]/div/div/div/div/div/div/div/div[1]/div/div[2]/div/span/a/div/img")).click();
	 Thread.sleep(700);
	 driver.findElement(By.xpath("//*[@id=\"add-to-cart-button\"]")).click();
	 driver.findElement(By.xpath("/html/body/div[1]/div[2]/div/div[1]/div[2]/div/div[3]/div/div[1]/span/span/a")).click();
	 driver.findElement(By.xpath("//*[@id=\"a-autoid-0-announce\"]")).click();
	 driver.findElement(By.xpath("//*[@id=\"quantity_2\"]")).click();
	 driver.findElement(By.xpath("/html/body/div[1]/div[2]/div[3]/div[5]/div/div[2]/div[1]/div/form/div[2]/div[3]/div[4]/div/div[2]/div[1]/span[2]/span/input")).click();
	 driver.navigate().to("https://www.amazon.in/dp/B09LM98LRT/ref=redir_mobile_desktop?_encoding=UTF8&aaxitk=b64f891a4fd6ae0703bbcb946aabe933&content-id=amzn1.sym.df4bf09f-d6a1-4ca3-98bc-ee2a82b34bf9%3Aamzn1.sym.df4bf09f-d6a1-4ca3-98bc-ee2a82b34bf9&hsa_cr_id=5574300390202&pd_rd_plhdr=t&pd_rd_r=5bafbc7a-2309-413e-b634-b7425bde9fa0&pd_rd_w=j7zzL&pd_rd_wg=KH7Ag&qid=1683189619&ref_=sbx_be_s_sparkle_lsi4d_asin_0_img&sr=1-1-e0fa1fdd-d857-4087-adda-5bd576b25987");
	 Thread.sleep(5000);
	 driver.findElement(By.xpath("//*[@id=\"add-to-cart-button\"]")).click();
	 Thread.sleep(4000);
	 driver.findElement(By.xpath("/html/body/div[1]/div[2]/div/div[1]/div[2]/div/div[3]/div/div[1]/form/span/span/span/input")).click();  
	 Thread.sleep(4000);
	 driver.findElement(By.xpath("//*[@id=\"ap_email\"]")).sendKeys("9363161145",Keys.ENTER);
	 Thread.sleep(2000);
	 driver.findElement(By.xpath("//*[@id=\"ap_password\"]")).sendKeys("Dharsh@2003",Keys.ENTER);
	 Thread.sleep(2000);
	 WebElement total=driver.findElement(By.xpath("/html/body/div[5]/div[1]/div/div[2]/div/div/div[2]/div/div[1]/div/div[2]/div/div[1]/div/table/tbody/tr[4]/td[2]"));
	  }
	 
	  @AfterTest
	  public void afterTest() {
	 driver.quit();
	  }

}
