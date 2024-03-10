package Homework.Day11;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import utilities.TestBase;
import java.nio.file.FileSystems;
import java.nio.file.Files;
import java.nio.file.Path;

public class C03 extends TestBase {
//    Day:11/HW:3 ------> Will be done on weekend

//    Go to URL: https://opensource-demo.orangehrmlive.com/
//    Login page valid credentials.
//    Click PIM on the left side bar
//    Click Configuration and select Data Import
//    Download sample CSV file.
//    Verify if the file downloaded successfully.

    @Test
    public void tess (){
        //    Go to URL: https://opensource-demo.orangehrmlive.com/
        driver.get("https://opensource-demo.orangehrmlive.com/");

        //    Login page valid credentials.
        driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div/div[1]/div/div[2]/div[2]/form/div[1]/div/div[2]/input")).sendKeys("Admin"+Keys.ENTER);
        driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div/div[1]/div/div[2]/div[2]/form/div[2]/div/div[2]/input")).sendKeys("admin123"+Keys.ENTER);

        //    Click PIM on the left side bar
        driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[1]/aside/nav/div[2]/ul/li[2]/a/span")).click();

        //    Click Configuration and select Data Import
        driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[1]/header/div[2]/nav/ul/li[1]")).click();

        driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[1]/header/div[2]/nav/ul/li[1]/ul/li[3]/a")).click();

        //    Download sample CSV filee.

        String userhome = System.getProperty("user.home");
        String Sepr = FileSystems.getDefault().getSeparator();
        String Uplud = userhome + Sepr + "Downloads" + Sepr + "CV Tariq M ..pdf" ;

        System.out.println("path = " + Uplud);
        System.out.println("path = " + Uplud);

        WebElement uploadButton = driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/form/div[1]/div/div/div/div[2]/div"));
        uploadButton.sendKeys(Uplud);

        // Check if file exists
        boolean isUp = Files.exists(Path.of(Uplud));
        // Assert that file if  it's downloaded successfully
        Assert.assertTrue(isUp);
        System.out.println("isUp = " + isUp);


    }
}
