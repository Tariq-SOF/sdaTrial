package Homework.Day03;


import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.Keys;

import java.sql.Driver;
import java.time.Duration;

public class C01 {
        /*
Create the driver with BeforeClass and make it static inside the class.
Go to http://www.google.com
Type "Green Mile" in the search box and print the number of results.
Type "Premonition" in the search box and print the number of results.
Type "The Curious Case of Benjamin Button" in the search box and print the number of results.
Close with AfterClass.
 */
    static WebDriver driver;
    By searchBox= By.name("q");
    By results= By.id("result-stats");

    @BeforeClass
    public static void SDV(){
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.manage().window().maximize();
        driver.get("http://www.googel.com");
    }

    @Test
    public void test1(){
        driver.findElement(By.className("gLFyf")).sendKeys("Green Mile"+ Keys.ENTER);
        System.out.println(driver.findElement(By.id("result-stats")).getText());
    }
    @Test
    public void test2(){
        driver.findElement(By.name("q")).sendKeys("Premonition"+Keys.ENTER);
        System.out.println(driver.findElement(By.id("result-stats")).getText());
    }
    @Test
    public void test3(){
        driver.findElement(By.className("gLFyf")).sendKeys("The Curious Case of Benjamin Button"+Keys.ENTER);
        System.out.println(driver.findElement(By.id("result-stats")).getText());
    }
    @AfterClass
    public static void end(){
        driver.quit();
    }



}
