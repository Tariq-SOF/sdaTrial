package Homework.Day03;

import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HWCH {

    static WebDriver driver ;
@BeforeClass
//    @Test
    public static void test(){
         driver = new ChromeDriver();
        driver.get("https://automationexercise.com/");

    }

    @Test
public void ClickSignupLogin(){

    WebElement sigin = driver.findElement(By.linkText("Signup / Login"));
    sigin.click();
}



}




