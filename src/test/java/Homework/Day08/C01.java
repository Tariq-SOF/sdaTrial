package Homework.Day08;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;
import java.util.List;

public class C01 {
    //    Go to URL: http://demo.guru99.com/test/guru99home/
//    Find the number of iframes on the page.
//    Link to the third iframe (JMeter Made Easy) (https://www.guru99.com/live selenium project.html) click here.
//    Exit the iframe and return to the main page.

    static WebDriver driver;
        @BeforeClass
    public static void test1 (){
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.manage().window().maximize();
    }
    @AfterClass
    public static void afatertest(){
//        driver.quit();
    }
        @Test
    public void test(){
            driver.get("http://demo.guru99.com/test/guru99home/");
            //    Find the number of iframes on the page.
            List <WebElement> contsof = driver.findElements(By.tagName("iframes"));
            //    Link to the third iframe (JMeter Made Easy) (https://www.guru99.com/live selenium project.html) click here.
            driver.switchTo().frame("a077aa5e");
            driver.findElement(By.xpath("/html/body/a/img")).click();
            //    Exit the iframe and return to the main page.
            String handle = driver.getWindowHandle();
            driver.switchTo().window(handle);
            driver.switchTo().defaultContent();








        }
}
