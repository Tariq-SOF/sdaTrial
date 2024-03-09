package Homework.Day07;

import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class C02 {
    static WebDriver driver;

    @BeforeClass
    public static void setup(){
        driver = new ChromeDriver();
        driver.get("https://the-internet.herokuapp.com/basic_auth");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
    }
    @AfterClass
    public static void tearDown(){
        //driver.quit();
    }

    @Test
    public void signIn() throws InterruptedException {
        driver.get("https://admin:admin@the-internet.herokuapp.com/basic_auth");
        Thread.sleep(3000);
        WebElement toassert = driver.findElement(By.xpath("(//p[contains(text(),'Congratulations! You must have the proper credenti')])"));
        Assert.assertTrue(toassert.isDisplayed());

    }
}
