package Homework.Day07;

import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.sql.Driver;
import java.time.Duration;

public class C03 {
//    Task 3:
//    navigate to https://chercher.tech/practice/explicit-wait-sample-selenium-webdriver
//    click on "Click me, to Open an alert after 5 seconds" button
//    click on accept alert
//    click on "Change Text to Selenium Webdriver"
//    verify "Selenium Webdriver" message is displayed
//   click on "Display button after 10 seconds" button
//7. verify the button is displayed
//8. click on "Enable button after 10 seconds" button
//9. verify the button is enabled
//10. click on "Check Checkbox after 10 seconds" button
//11. verify the check box is checked

    static WebDriver driver;
    @BeforeClass
    public static void beforwait(){
        driver = new ChromeDriver();
        //    navigate to https://chercher.tech/practice/explicit-wait-sample-selenium-webdriver
        driver.get(" https://chercher.tech/practice/explicit-wait-sample-selenium-webdriver");
        driver.manage().window().maximize();
    }
    @AfterClass
    public static void after(){
//        driver.quit();
    }
    @Test
    public void forwait(){
        //    click on "Click me, to Open an alert after 5 seconds" button
        driver.findElement(By.xpath("//button[contains(text(),'Click me, to Open an alert after 5 seconds')]")).click();
        //click on alert after 5 seconds
        WebDriverWait waitAlert  = new WebDriverWait(driver, Duration.ofSeconds(5));
        waitAlert.until(ExpectedConditions.alertIsPresent());
        //    click on accept alert
        driver.switchTo().alert().accept();
        //    click on "Change Text to Selenium Webdriver"
        driver.findElement(By.xpath("//button[contains(text(),'Change Text to Selenium Webdriver')]")).click();
        //    verify "Selenium Webdriver" message is displayed
        WebDriverWait waitText = new WebDriverWait(driver, Duration.ofSeconds(10));
        WebElement seleniumText = waitText.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"h2\"]")));
        Assert.assertTrue(seleniumText.isDisplayed());
        //   click on "Display button after 10 seconds" button
        driver.findElement(By.xpath("//button[contains(text(),'Display button after 10 seconds')]")).click();
        //7. verify the button is displayed
        WebDriverWait waittext2 = new WebDriverWait(driver, Duration.ofSeconds(10));
        WebElement waitassert = waittext2.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"hidden\"]")));
        Assert.assertTrue(waitassert.isDisplayed());
        //8. click on "Enable button after 10 seconds" button
        driver.findElement(By.xpath("//button[contains(text(),'Enable button after 10 seconds')]")).click();
        //9. verify the button is enabled
        WebDriverWait waitButton = new WebDriverWait(driver, Duration.ofSeconds(10));
        WebElement buttonElement = waitButton.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[contains(text(),'Button')]")));
        Assert.assertTrue(buttonElement.isEnabled());
        //10. click on "Check Checkbox after 10 seconds" button
        driver.findElement(By.xpath("//button[contains(text(),'Check Checkbox after 10 seconds')]")).click();
        //11. verify the check box is checked
        WebDriverWait waitToChekBox = new WebDriverWait(driver,Duration.ofSeconds(10));
        WebElement ChekPox = waitToChekBox.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"ch\"]")));
        Assert.assertTrue(ChekPox.isEnabled());
























//        Wait<WebDriver> wait = new FluentWait<>(driver)
//                .withTimeout(Duration.ofSeconds(10));
//        //    click on "Click me, to Open an alert after 5 seconds" button
//        driver.findElement(By.xpath("//*[@id=\"alert\"]").
//        //    click on accept alert
//        driver.switchTo().alert().accept();
//        //    click on "Change Text to Selenium Webdriver"
//        WebElement tovrity = driver.findElement(By.id("populate-text"));
//                tovrity.click();
//        System.out.println(tovrity);
//        //    verify "Selenium Webdriver" message is displayed
//        Assert.assertTrue(tovrity.isDisplayed());
//        //   click on "Display button after 10 seconds" button












    }
}
