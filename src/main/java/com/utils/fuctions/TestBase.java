package com.utils.fuctions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class TestBase {
    public static WebDriver driver;

    public static void driver() {
        System.setProperty("webdriver.chrome.driver", ".\\webdriver\\chromedriver.exe");
        try {
            System.out.println("driver started");
            ChromeOptions options = new ChromeOptions();
            options.addArguments("--disable-notifications");
            driver = new ChromeDriver(options);
            System.out.println("Driver is initiated");
            driver.manage().window().maximize();
        } catch (Exception e) {
            System.out.println("exception");
            e.printStackTrace();
        }
    }

}
