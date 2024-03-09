package Homework.Day06;

import com.github.javafaker.Faker;
import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class CH {

    static WebDriver driver;

    @BeforeClass
    public static void ch (){
        driver = new ChromeDriver();
        driver.get("https://thinking-tester-contact-list.herokuapp.com%22/");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(8));
        driver.manage().window().maximize();
    }
    @AfterClass
    public static void after(){
        //driver.quit();
    }
    public void testch(){
        WebElement email1 = driver.findElement(By.id("email"));
        email1.sendKeys("TA@SDA.COM");
        WebElement Pass = driver.findElement(By.id("password"));
        Pass.sendKeys("123456789");
        WebElement submet = driver.findElement(By.id("submit"));
        submet.click();


        WebElement ADD = driver.findElement(By.id("add-contact"));
        Assert.assertTrue(ADD.isDisplayed());
        ADD.click();

        //add-contact

    }
    @Test
    public void Faker(){


        Faker faker = new Faker();
        String first = faker.name().firstName();
        String last = faker.name().lastName();
        String email = faker.internet().emailAddress();
        String add1 = faker.address().streetAddress();
        String add2 = faker.address().streetAddress();

        WebElement name = driver.findElement(By.id("firstName"));name.sendKeys(first);
        WebElement sname = driver.findElement(By.id("lastName"));sname.sendKeys(last);

        WebElement brth = driver.findElement(By.id("birthdate"));brth.sendKeys("1998-9-4");

        WebElement emaill = driver.findElement(By.id("email"));emaill.sendKeys(email);
        WebElement numberphone = driver.findElement(By.id("phone"));numberphone.sendKeys("870860786");

        WebElement adr1 = driver.findElement(By.id("street1"));adr1.sendKeys(add1);
        WebElement adr2 = driver.findElement(By.id("street2"));adr2.sendKeys(add2);

        WebElement conf = driver.findElement(By.id("submit"));
        conf.click();

        Assert.assertTrue(conf.isSelected());



    }

}
