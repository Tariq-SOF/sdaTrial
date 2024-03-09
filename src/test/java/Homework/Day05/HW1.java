package Homework.Day05;

import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;
import java.util.List;

public class HW1 {
//    Task 1:
//    Go to URL: https://demoqa.com/radio-button
//    Verify whether all 3 options given to the question can be selected.
//    When each option is selected, print the following texts on the console.

    static WebDriver driver;

    @BeforeClass
    public static void test(){
        driver= new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
    }
    @Test
    public void testcheek(){
        //    Go to URL: https://demoqa.com/radio-button
        driver.get("https://demoqa.com/radio-button");
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollTo(0,250)");

        //    Verify whether all 3 options given to the question can be selected.
        List<WebElement> buttons = driver.findElements(By.xpath("//input[@type='radio']"));

        for (WebElement button : buttons) {
            button.click();

            //When each option is selected, print the following texts on the console.
            String select = button.getAttribute("value");
            System.out.println("Selected radio button value: " + select);

        }


    }


}
