package Homework.Day06;

import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.time.Duration;
import java.util.List;

public class C01 {

//    Hw:1
//    Go to URL: https://the-internet.herokuapp.com/dropdown
//    Select Option 1 using index .
//    Select Option 2 by value.
//    Select Option 1 value by visible text.
//    Print all dropdown value.
//    Verify the dropdown has Option 2 text.
//    Print first selected option.
//    Find the size of the dropdown, Print "Expected Is Not Equal Actual" if there are not 3 elements in the dropdown.

    static WebDriver driver;
    @BeforeClass
    public static void Hw (){
        driver = new ChromeDriver();

        //Go to URL: https://the-internet.herokuapp.com/dropdown
        driver.get("https://the-internet.herokuapp.com/dropdown");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(8));

    }
    @AfterClass
    public static void after(){
        //driver.quit();
    }
    @Test
    public void drop (){
        WebElement element = driver.findElement(By.id("dropdown"));
        Select select = new Select(element);

        //    Select Option 1 using index .
        select.selectByIndex(1);

        //    Select Option 2 by value.
        select.selectByValue("1");

        //    Select Option 1 value by visible text.
        select.selectByVisibleText("Option 1");
        //    Print all dropdown value.
        List <WebElement> value = select.getOptions();
        System.out.println(value);

        //   Verify the dropdown has Option 2 text.
        boolean isOption = false;
        List<WebElement> options = select.getOptions();
        for (WebElement option : options) {
            if (option.getText().equals("Option 2")) {
                isOption = true;
                break;
            }
        }
        Assert.assertTrue(isOption);

        //    Print first selected option.
        System.out.println(select.getFirstSelectedOption().getText());

//    Find the size of the dropdown, Print "Expected Is Not Equal Actual" if there are not 3 elements in the dropdown.
        List<WebElement> optionss = select.getOptions();
        if (options.size() != 3) {
            System.out.println("Expected Is Not Equal Actual");
        }


    }

}
