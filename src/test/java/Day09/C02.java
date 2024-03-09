package Day09;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import utilities.TestBase;

public class C02 extends TestBase {


    @Test
    public void test(){
        By droop = By.id("box6");
        driver.get("http://www.dhtmlgoodies.com/scripts/drag-drop-custom/demo-drag-drop-3.html");

        WebElement tomove = driver.findElement(droop);

        Actions actions = new Actions(driver);

//        actions.dragAndDrop(tomove,)



    }

}
