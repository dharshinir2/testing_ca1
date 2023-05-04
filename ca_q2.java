import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ca_q2 {
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
	 driver.findElement(By.xpath("//*[@id=\"twotabsearchtextbox\"]")).sendKeys("Rings",Keys.ENTER);
	 Thread.sleep(10000);
	 
	 WebElement name=driver.findElement(By.xpath("/html/body/div[1]/div[2]/div[1]/div[1]/div/span[1]/div[1]/div[1]/div/div/div[1]/div[1]/div/div[2]/div/a/span/span[2]"));
	 String tname=name.getText();
	 System.out.println("First product "+tname);
	 WebElement name2=driver.findElement(By.xpath("/html/body/div[1]/div[2]/div[1]/div[1]/div/span[1]/div[1]/div[3]/div/div/div/div/div/div/div[2]/div[1]/h2"));
	 WebElement name3=driver.findElement(By.xpath("/html/body/div[1]/div[2]/div[1]/div[1]/div/span[1]/div[1]/div[4]/div/div/div/div/div/div/div[2]/div[1]/h2"));
	 WebElement name4=driver.findElement(By.xpath("/html/body/div[1]/div[2]/div[1]/div[1]/div/span[1]/div[1]/div[5]/div/div/div/div/div/div/div[2]/div[1]/h2"));
	 WebElement name5=driver.findElement(By.xpath("/html/body/div[1]/div[2]/div[1]/div[1]/div/span[1]/div[1]/div[6]/div/div/div/div/div/div/div[2]/div[1]/h2"));
	 String tname2=name2.getText();
	 String tname3=name3.getText();
	 String tname4=name4.getText();
	 String tname5=name5.getText();
	 System.out.println(tname2);
	 System.out.println(tname3);
	 System.out.println(tname4);
	 System.out.println(tname5);
	 driver.findElement(By.xpath("/html/body/div[1]/div[2]/span/div/h1/div/div[2]/div/div/form/span/span/span/span/span[2]")).click();
	 Thread.sleep(1000);
	 driver.findElement(By.xpath("//*[@id=\"s-result-sort-select_1\"]")).click();
	 Thread.sleep(5000);
	 WebElement lp=driver.findElement(By.xpath("/html/body/div[1]/div[2]/div[1]/div[1]/div/span[1]/div[1]/div[3]/div/div/div/div/div[2]/div[2]/div[1]/a/span/span[2]/span[2]"));
	 String tlp=lp.getText();
	 System.out.println("Low to high -> first product price"+tlp);
	 }
	 @AfterTest
	 public void afterTest() {
	 driver.quit();
	 }
	}

