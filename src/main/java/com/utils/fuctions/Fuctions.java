package com.utils.fuctions;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import pageObjects.FileReader;

import java.io.File;
import java.io.IOException;

public class Fuctions extends TestBase {

    public static String sendData(WebElement webElement, String data) {
        try {
            highlightElement(webElement);
            webElement.sendKeys(data);
        } catch (Throwable t) {
            return "Failed - Element not found " + webElement;
        }
        return "pass";
    }

    public static String sendData(String webElement, String data) {
        try {
            FileReader fileReader = new FileReader();
            WebElement element = fileReader.getElement(webElement);
            highlightElement(element);
            element.sendKeys(data);
        } catch (Throwable t) {
            return "Failed - Element not found " + webElement;
        }
        return "pass";
    }


    public static String clickRadioButton(WebElement webElement) {
        try {
            highlightElement(webElement);
            webElement.click();
        } catch (Throwable t) {
            return "Failed - Element not found " + webElement;
        }
        return "Pass";
    }

    public static void expliciteWait(WebElement webElement) throws Exception {
        try {
            WebDriverWait wait = new WebDriverWait(driver, 30);
            wait.until(ExpectedConditions.visibilityOf(webElement));
        } catch (Throwable e) {
            e.printStackTrace();
        }
    }

    public static void highlightElement(WebElement webElement) {
        try {
            JavascriptExecutor js = (JavascriptExecutor) driver;
            js.executeScript("arguments[0].style.border='5px solid red'", webElement);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void captureScreenShot() throws IOException {
        TakesScreenshot scrShot =((TakesScreenshot)driver);
        File SrcFile=scrShot.getScreenshotAs(OutputType.FILE);
        FileUtils.copyFile(SrcFile,new File("ScreenShots\\screenshot.jpg"));
    }


    public static String actionsSelect(WebElement webElement, String testData) {
        try {

            highlightElement(webElement);

            Select select = new Select(webElement);
            select.selectByValue(testData);
        } catch (Exception e) {
            return "Failed - Element not found " + webElement;
        }
        return "Pass";
    }

    public static String clickButton(WebElement webElement) {
        try {
            highlightElement(webElement);
            webElement.click();
        } catch (Throwable t) {
            t.printStackTrace();
            return "Failed - Element not found " + webElement;
        }
        return "Pass";
    }

}
