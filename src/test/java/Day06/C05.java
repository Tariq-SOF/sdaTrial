package Day06;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class C05 {
//    https://demoqa.com/select-menu
//    Get all the options of the dropdown
//    Options size
//    Print all test
//    Verify the dropdown has option "Black"
//    Print FirstSelectedOptionTest
//    Select option "Yellow"

    static WebDriver driver;

    @BeforeClass
    public static void befor (){
        driver = new ChromeDriver();
        driver.get("https://demoqa.com/select-menu");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(8));
        driver.manage().window().maximize();
    }

    @AfterClass
    public static void aftertest(){
        driver.quit();
    }

    @Test
    public void testdrob(){

    }
}
