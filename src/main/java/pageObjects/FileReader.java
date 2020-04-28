package pageObjects;

import com.utils.fuctions.TestBase;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.List;
import java.util.Properties;

public class FileReader extends TestBase {
    Properties prop = new Properties();
    FileInputStream fis;


    public FileReader(String propertyFilePath) throws IOException {
        fis=new FileInputStream(propertyFilePath);
        prop.load(fis);
    }

    public FileReader() {

    }

    public WebElement getElement(String elementName) throws Exception {
        String locator=prop.getProperty(elementName);
        String[] split = locator.split(":");
        String locatorType = split[0];
        String locatorValue = split[1];
        if (locatorType.toLowerCase().equals("id"))
            return driver.findElement(By.id(locatorValue));
        else if (locatorType.toLowerCase().equals("name"))
            return driver.findElement(By.name(locatorValue));
        else if ((locatorType.toLowerCase().equals("classname")) || (locatorType.toLowerCase().equals("class")))
            return driver.findElement(By.className(locatorValue));
        else if ((locatorType.toLowerCase().equals("tagname")) || (locatorType.toLowerCase().equals("tag")))
            return driver.findElement(By.tagName(locatorValue));
        else if ((locatorType.toLowerCase().equals("linktext")) || (locatorType.toLowerCase().equals("link")))
            return driver.findElement(By.linkText(locatorValue));
        else if (locatorType.toLowerCase().equals("partiallinktext"))
            return driver.findElement(By.partialLinkText(locatorValue));
        else if ((locatorType.toLowerCase().equals("cssselector")) || (locatorType.toLowerCase().equals("css")))
            return driver.findElement(By.cssSelector(locatorValue));
        else if (locatorType.toLowerCase().equals("xpath"))
            return driver.findElement(By.xpath(locatorValue));
        else
            throw new Exception("Unknown locator type '" + locatorType + "'");
    }

    public int getElements(String elementName) throws Exception {
        String locator=prop.getProperty(elementName);
        String[] split = locator.split(":");
        String locatorType = split[0];
        String locatorValue = split[1];
        if (locatorType.toLowerCase().equals("id"))
            return driver.findElements(By.id(locatorValue)).size();
        else if (locatorType.toLowerCase().equals("name"))
            return driver.findElements(By.name(locatorValue)).size();
        else if ((locatorType.toLowerCase().equals("classname")) || (locatorType.toLowerCase().equals("class")))
            return driver.findElements(By.className(locatorValue)).size();
        else if ((locatorType.toLowerCase().equals("tagname")) || (locatorType.toLowerCase().equals("tag")))
            return driver.findElements(By.tagName(locatorValue)).size();
        else if ((locatorType.toLowerCase().equals("linktext")) || (locatorType.toLowerCase().equals("link")))
            return driver.findElements(By.linkText(locatorValue)).size();
        else if (locatorType.toLowerCase().equals("partiallinktext"))
            return driver.findElements(By.partialLinkText(locatorValue)).size();
        else if ((locatorType.toLowerCase().equals("cssselector")) || (locatorType.toLowerCase().equals("css")))
            return driver.findElements(By.cssSelector(locatorValue)).size();
        else if (locatorType.toLowerCase().equals("xpath"))
            return driver.findElements(By.xpath(locatorValue)).size();
        else
            throw new Exception("Unknown locator type '" + locatorType + "'");
    }


}
