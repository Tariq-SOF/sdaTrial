package Homework.Day05;

import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
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

        // navigate to this url https://www.saucedemo.com/v1/inventory.html
        driver.get("https://www.saucedemo.com/v1/inventory.html");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
    }

    @Test
    public void toadditem(){
        //add the first item you find to your cart
        driver.findElement(By.xpath("//*[@id=\"inventory_container\"]/div/div[1]/div[3]/button")).click();

    }
    @Test
    public void toopencart(){
        //open your cart
        driver.findElement(By.xpath("//*[@id=\"shopping_cart_container\"]/a")).click();
    }
    @Test
    public void assertitem(){
        //assert that the item name is correct inside the cart
        WebElement name = driver.findElement(By.xpath("//*[@id=\"inventory_container\"]/div/div[1]/div[3]/button"));
        name.getText();
        WebElement toassert = driver.findElement(By.linkText("Sauce Labs Backpack"));
        toassert.getText();
        Assert.assertEquals( "Item name is not correct in the cart",name,toassert);



    }

}
