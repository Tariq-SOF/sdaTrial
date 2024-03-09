package Day11;

import org.junit.Test;
import org.openqa.selenium.By;
import utilities.TestBase;

public class C05 extends TestBase {

//    Go to URL: https://the-internet.herokuapp.com/upload
//    Find the path of the file that you want to upload.
//    Click on Upload button.
//    Verify the upload message.


    @Test
    public  void test(){

        String userdir = System.getProperty("userdir");
        String sepret = System.getProperty("");
        //    Go to URL: https://the-internet.herokuapp.com/upload
        driver.get("https://the-internet.herokuapp.com/upload");
        //    Find the path of the file that you want to upload.
        driver.findElement(By.id("file-submit")).click();


    }

}
