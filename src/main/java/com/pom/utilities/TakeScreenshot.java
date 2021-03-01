package com.pom.utilities;

import com.pom.base.Testbase;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.io.FileHandler;

import java.io.File;
import java.io.IOException;

public class TakeScreenshot extends Testbase {

    public static void  Take_screenshot(String Filename) throws IOException {
        File screen= ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
        FileHandler.copy(screen,new File("C:\\Users\\mustafa.mohammed\\IdeaProjects\\Maven_Project\\Screenshots/"+Filename+".jpg"));


    }
}
