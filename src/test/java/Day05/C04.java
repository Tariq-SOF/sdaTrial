package Day05;

import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;
import java.util.List;

public class C04 {

//    Go to URL:  https://www.facebook.com/
//    Click on Create an Account button.
//    Then click on the radio buttons.

     static WebDriver driver;

     @BeforeClass
     public static void Attest(){
         driver = new ChromeDriver();
         driver.manage().window().maximize();
         driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
     }
     @Test
     public void test(){
         driver.get(" https://www.facebook.com/");
         driver.findElement(By.xpath("//*[starts-with(@id,'u_0_0_')]")).click();
         //Then click on the radio buttons.
        List<WebElement> radButtons=driver.findElements(By.xpath("//*[@class='_5k_2 _5dba']"));
//         driver.findElement(By.name("firstname")).click();
     }
}
