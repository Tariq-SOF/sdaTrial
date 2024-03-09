package Homework.Day05;


import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class CH {

    static WebDriver driver;

    @BeforeClass

    public static void chaleng(){
        driver = new ChromeDriver();
        driver.get("https://webdriveruniversity.com/To-Do-List/index.html");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

    }


    @Test
    public void tess1(){

        WebElement add = driver.findElement(By.tagName("input"));add.sendKeys("Go my Hu" + Keys.ENTER);
        Assert.assertTrue( add.isDisplayed());

    }

    @Test
    public void test2(){
      WebElement delete =  driver.findElement(By.xpath("//*[@id=\"container\"]/ul/li[2]/span/i"));
              delete.click();
              Assert.assertTrue(delete.isDisplayed());


    }
    @Test
    public void test3(){

       WebElement todolist=  driver.findElement(By.xpath("//*[@id=\"container\"]/ul/li[1]"));
        todolist.click();
        Assert.assertTrue(todolist.isDisplayed());


    }
}
