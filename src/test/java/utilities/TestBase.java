package utilities;

import org.junit.BeforeClass;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterClass;

import java.time.Duration;


public abstract class TestBase {
       protected static WebDriver driver;
    protected static Actions actions;
       @BeforeClass
        public   static  void setUp(){

            driver = new ChromeDriver();
            driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
            driver.manage().window().maximize();
            actions = new Actions(driver);

        }

        @AfterClass
        public static void teardowm(){
            driver.quit();
        }
    }

