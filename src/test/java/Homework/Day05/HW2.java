package Day05;

import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class HW2 {

//            * breakout task: (in a separate class)
//            * navigate to this url https://www.saucedemo.com/v1/inventory.html
//            * add the first item you find to your cart
//     * open your cart*
//            * assert that the item name is correct inside the cart\

    static WebDriver driver;

    @BeforeClass

    public static void test(){
        driver= new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
    }

    @Test
    public void test2(){
        driver.get("https://www.saucedemo.com/v1/inventory.html");


    }

}
