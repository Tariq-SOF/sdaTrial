package Homework.Day11;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Cookie;
import org.openqa.selenium.Keys;
import utilities.TestBase;
import java.util.Set;

import java.util.Set;

public class C01 extends TestBase {

//    Day:11/Hw:1
//    Go to URL: http://facebook.com
//    getCookies,
//    addCookie,
//    deleteCookieNamed,
//    deleteAllCookies.
//            FacebookFacebook
//    Log into Facebook
//    Log into Facebook to start sharing and connecting with your friends, family, and people you know.

    @Test
    public void test1 (){
        driver.get("http://facebook.com");

        //    getCookies,
        Set<Cookie> cookies = driver.manage().getCookies();
        System.out.println(cookies);

        int cookes = driver.manage().getCookies().size();
        System.out.println(cookes);
        //    addCookie,

        Cookie addCookie = new Cookie("newCookies", "theCookies");
        driver.manage().addCookie(addCookie);
        int cookess = driver.manage().getCookies().size();
        System.out.println(" number of Cokees : " + cookess);

        //deleteAllCookies.
        driver.manage().deleteCookie(addCookie);

        //    Log into Facebook
        driver.findElement(By.name("email")).sendKeys("Tariq" + Keys.ENTER);
        driver.findElement(By.name("pass")).sendKeys("12345678" + Keys.ENTER);
        driver.findElement(By.id("loginbutton")).click();



    }


}
