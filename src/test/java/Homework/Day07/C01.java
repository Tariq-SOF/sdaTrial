package Homework.Day07;

import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class C01 {
    static WebDriver driver;

    @BeforeClass
    public static void setup(){
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
        driver.get("https://the-internet.herokuapp.com/javascript_alerts");

    }
    @AfterClass
    public static void tearDown(){
//        driver.quit();
    }
    @Test
    public void task(){
       driver.findElement(By.xpath("//button[@onclick='jsAlert()']")).click();
        Alert alert = driver.switchTo().alert() ;
        alert.accept();
    }
    @Test
    public void task1(){
        driver.findElement(By.xpath("//button[@onclick='jsConfirm()']")).click();
        Alert alert = driver.switchTo().alert() ;
        alert.accept();
    }
    @Test
    public void task2(){
        driver.findElement(By.xpath("//button[@onclick='jsPrompt()']")).click();
        Alert alert = driver.switchTo().alert() ;

        alert.sendKeys("\"Offer abdullah a tea\")");
        alert.accept();
        WebElement toassert = driver.findElement(By.id("result"));
        Assert.assertTrue(toassert.isDisplayed());


    }
}
