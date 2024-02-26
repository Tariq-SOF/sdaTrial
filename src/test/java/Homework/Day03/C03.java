package Homework.Day03;

import org.junit.AfterClass;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.sql.Driver;
import java.time.Duration;

public class C03 {

//    Go to https://id.heroku.com/login.
//    Enter an e-mail address.
//    Enter a password.
//    Click on the Login button.
//    There was a problem with your login.
//    If text is visible, print "Registration Failed".
//    If the text is not visible, print "Registered".
//    Close all pages.


    static WebDriver driver;

    public static void test(){
        driver = new ChromeDriver();

        //    Go to https://id.heroku.com/login.

        driver.get("https://id.heroku.com/login");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

    }

    //    Close all pages.
    @AfterClass
    public static void guit(){
        driver.quit();
    }
    @Test
    public void test1(){

        //    Enter an e-mail address.
        driver.findElement(By.id("email")).sendKeys("test@gmail.com");

        //    Enter an password address.
        driver.findElement(By.id("password")).sendKeys("123");

        //    Click on the Login button.
        driver.findElement(By.name("commit")).click();

        //    There was a problem with your login.
//    If text is visible, print "Registration Failed".
//    If the text is not visible, print "Registered".
        WebElement alert = driver.findElement(By.xpath("//div[@class='alert alert-danger']"));

        System.out.println(driver.findElement(By.xpath("//div[@class='alert alert-danger']")).getText());
        if(alert.isDisplayed()){
            System.out.println("Registration Failed");
        }
        else {
            System.out.println("Registered");
        }



    }

}
