package Homework.Day03;

import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class C04 {


//    Navigate to https://testpages.herokuapp.com/styled/index.html
//    Click on Simple Calculator under Micro Apps.
//    Type any number in the first input.
//    Type any number in the second input.
//    Click on Calculate.
//    Get the result.
//    Print the result.

    static WebDriver driver;

    @BeforeClass
    public static void HW4(){
        driver = new ChromeDriver();

        //    Navigate to https://testpages.herokuapp.com/styled/index.html
        driver.get("https://testpages.herokuapp.com/styled/index.html");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.manage().window().maximize();
    }
    @Test
    public void test(){

        //    Click on Simple Calculator under Micro Apps.
        driver.findElement(By.id("calculatetest")).click();

        //    Type any number in the first input.
        driver.findElement(By.id("number1")).click();
        driver.findElement(By.id("number1")).sendKeys("3"+ Keys.ENTER);

        //    Type any number in the second input.
        driver.findElement(By.id("number2")).click();
        driver.findElement(By.id("number2")).sendKeys("4"+ Keys.ENTER);

        //    Click on Calculate.
        driver.findElement(By.id("calculate")).click();

        //    Get the result.
        //    Print the result.
        System.out.println("the answer is: "+ driver.findElement(By.id("answer")).getText());










    }
}
