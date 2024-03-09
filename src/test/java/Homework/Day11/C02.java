package Homework.Day11;

import org.junit.Assert;
import org.junit.Test;
import utilities.TestBase;

import java.nio.file.FileSystems;
import java.nio.file.Files;

import java.nio.file.Paths;

public class C02  {
//    Day:11/HW:2
//    Create a File on Desktop
//    Verify that the file exists
    @Test
    public void test(){

        String userhome = System.getProperty("user.home");
        System.out.println("user.dir =" + userhome );
        String spretor = FileSystems.getDefault().getSeparator();
        String pathh = userhome + spretor + "Desktop" + spretor + "New Text Document.txt";
        System.out.println(" the path is = " + pathh);
       boolean isExset = Files.exists(Paths.get(pathh));
        Assert.assertTrue(isExset);

    }

}
