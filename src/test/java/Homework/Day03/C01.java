package Homework.Day03;


import org.junit.BeforeClass;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class C01 {
        /*
Create the driver with BeforeClass and make it static inside the class.
Go to http://www.google.com
Type "Green Mile" in the search box and print the number of results.
Type "Premonition" in the search box and print the number of results.
Type "The Curious Case of Benjamin Button" in the search box and print the number of results.
Close with AfterClass.
 */
    static WebDriver driver;
    By searchBox= By.name("q");
    By results= By.id("result-stats");


  @BeforeClass


}
