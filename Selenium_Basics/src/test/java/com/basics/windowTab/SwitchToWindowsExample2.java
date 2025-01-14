package com.basics.windowTab;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import java.util.ArrayList;

public class SwitchToWindowsExample2 {
    WebDriver driver;

    @BeforeSuite
    public void openBrowser(){
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
    }
    @Test(priority = 0)
    public void openURL() throws InterruptedException {
        driver.get("https://www.tutorialspoint.com/selenium/practice/selenium_automation_practice.php");
        Thread.sleep(2000);
    }
    @Test(priority = 1)
    public void switchingTabs() throws InterruptedException {
        ArrayList<String> windows = new ArrayList<>(driver.getWindowHandles());
        windows.add(driver.getWindowHandle());

        driver.switchTo().newWindow(WindowType.WINDOW);
        windows.add(driver.getWindowHandle());
        driver.navigate().to("https://www.selenium.dev/documentation/");
        Thread.sleep(3000);


        driver.switchTo().window(windows.get(0));
        driver.close();
        Thread.sleep(3000);
        driver.switchTo().window(windows.get(1));
        Thread.sleep(3000);
    }
    
    @AfterSuite
    public void closeBrowser(){
        driver.quit();
    }
}
