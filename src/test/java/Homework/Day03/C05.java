package Homework.Day03;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;
import java.util.Stack;

public class C05 {

//    Go to URL: https://www.linkedin.com/
//    Locate the "Email or phone", "password", "Sign in" button using absolute xpath and relative xpath.

    static WebDriver driver;

    public static void HW5(){
        driver = new ChromeDriver();
        driver.get("https://www.linkedin.com/ ");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.manage().window().maximize();
    }
    @Test
    public void test(){
        //Absolute  path
        driver.findElement(By.xpath("/html/body/main/section[1]/div/div/form/div[1]/div[1]/div/div/input")).sendKeys("2@x.cm");

        //Relative path
        driver.findElement(By.xpath("//*[@id='session_password']")).sendKeys("123");

        //Relative path
        driver.findElement(By.xpath("//button[@data-id='sign-in-form__submit-btn']")).click();

        //Relative path
//        Thread.sleep(400);

    }
}
