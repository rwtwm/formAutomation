package com.sparta.waj.formaccess;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DriverCreation
{
    private static WebDriver driver;

    /**
     * Sets up a single driver for use across the project.
     * Broadly useless now, but potentially useful in further projects.
     * @return Chromedriver - driver.
     */
    public static WebDriver getDriver()
    {
        if (driver == null)
        {
            WebDriverManager.chromedriver().setup();
            driver = new ChromeDriver();
        }

        return driver;
    }

}
