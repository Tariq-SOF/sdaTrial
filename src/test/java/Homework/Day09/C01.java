package Homework.Day09;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import utilities.TestBase;

public class C01 extends TestBase {

//    Go to URL: http://demo.guru99.com/test/drag_drop.html
//    Drag and drop the BANK button to the Account section in DEBIT SIDE
//    Drag and drop the SALES button to the Account section in CREDIT SIDE
//    Drag and drop the 5000 button to the Amount section in DEBIT SIDE
//    Drag and drop the second 5000 button to the Amount section in CREDIT SIDE
//    Verify the visibility of Perfect text.

    @Test
    public void test (){
        //    Go to URL: http://demo.guru99.com/test/drag_drop.html

        //    Drag and drop the BANK button to the Account section in DEBIT SIDE
        By ele = By.id("credit2");
        By but = By.id("bank");

        driver.get("http://demo.guru99.com/test/drag_drop.html");
        WebElement deop = driver.findElement(ele);
        WebElement driev = driver.findElement(but);

        actions
                .dragAndDrop(deop,driev).perform();






    }

}
