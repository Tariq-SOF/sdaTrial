package Homework.Day08;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.sql.Driver;
import java.time.Duration;
import java.util.List;

public class CH {
    static WebDriver driver;
    @BeforeClass
    public static void BeforeCH(){
        driver = new ChromeDriver();
        driver.get("https://clarusway.getlearnworlds.com/sda-test-registration-form");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.manage().window().maximize();
    }
    @AfterClass
    public static void AfterCH(){
//        driver.quit();
    }
    @Test
    public void test(){
//      driver.switchTo().frame(0);
//      driver.findElement(By.name("Name")).sendKeys("Tariq"+ Keys.ENTER);
//      driver.findElement(By.xpath("//*[@id=\"Name-li\"]/div[2]/div/span[2]/input")).sendKeys("Alshalahi"+ Keys.ENTER);
//      List<WebElement> list = driver.findElements(By.xpath("//*[@id=\"Radio-li\"]"));
//      list.get(0).click();
        Select select = new Select(driver.findElement(By.className("tempFrmWrapper dropdown small zfSelect2CustomCont")));
//        select.selectByValue();



    }

}
