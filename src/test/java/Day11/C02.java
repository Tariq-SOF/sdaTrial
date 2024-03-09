package Day11;

import org.junit.Test;
import org.openqa.selenium.JavascriptExecutor;
import utilities.TestBase;

public class C02 extends TestBase {

    @Test
    public void test() {
        driver.get("https://www.google.com");

        JavascriptExecutor js = (JavascriptExecutor)driver;
        js.executeScript("alert('Hi Js good');");
    }
}
