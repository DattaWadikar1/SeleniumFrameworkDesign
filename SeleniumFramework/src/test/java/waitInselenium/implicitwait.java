package waitInselenium;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.time.Duration;

public class implicitwait {

    WebDriver driver=new ChromeDriver();

 @BeforeTest
 public void waitTest(){



     driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
     driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));

 }

 @Test
    public void waitExplicit()
 {

     WebDriverWait wait =new WebDriverWait(driver,Duration.ofSeconds(10));
     wait.until(ExpectedConditions.visibilityOfElementLocated(By.name("username")));

 }

 @Test
 public void fluentwait(){
     Wait<WebDriver> wait=new FluentWait<>(driver)
             .withTimeout(Duration.ofSeconds(30)) // max time out to wait
             .pollingEvery(Duration.ofMillis(500)) //interval between each pool
             .ignoring(NoSuchElementException.class); // Exception to ignoe

     WebElement ele=wait.until(ExpectedConditions.visibilityOfElementLocated(By.name("username")));


 }

 @AfterTest
    public void dearDown(){
     driver.quit();
 }



}
