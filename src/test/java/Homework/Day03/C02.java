package Homework.Day03;

import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class C02 {

     /*
    Navigate to website  https://testpages.herokuapp.com/styled/index.html
Under the Examples
Click on Locators - Find By Playground Test Page
Print the URL
Navigate back
Print the URL
Click on WebDriver Example Page
Print the URL
Enter value 🡪 20 and Enter to "Enter Some Numbers inputBox"
And then verify 'two, zero' message is displayed on page
Close driver.
        */

    static WebDriver driver;
    @BeforeClass

    public static void setUp(){
        driver = new ChromeDriver();
        driver.manage().window();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.get("https://testpages.herokuapp.com/styled/index.html");


    }
    @Test
    public void Test(){
        driver.get("https://testpages.herokuapp.com/styled/index.html");
        driver.findElement(By.partialLinkText("Locators - Find")).click();
        String url= driver.getCurrentUrl();
        System.out.println("the ur is :"+ url);
        driver.navigate().back();
        String url1= driver.getCurrentUrl();
        System.out.println("the ur is :"+ url1);
        driver.findElement(By.id("webdriverexamplepage")).click();
        String url2 = driver.getCurrentUrl();
        System.out.println("the url is:" + url2);
        driver.findElement(By.xpath("//input[@name]")).sendKeys("20" + Keys.ENTER);
        boolean isMassageDispalyed = driver.findElement(By.id("massage")).isDisplayed();
        Assert.assertTrue(isMassageDispalyed);


        
    }

}
