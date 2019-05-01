package com.sparta.waj.formaccess;

import org.openqa.selenium.WebDriver;

import java.util.Set;

public class WindowHandler
{
    private WebDriver driver;
    private String mainWindow;
    private Set<String> windowList;

    public WindowHandler(WebDriver driver)
    {
        this.driver = driver;
        mainWindow = getCurrentWindow();
    }

    public String getCurrentWindow()
    {
        return driver.getWindowHandle();
    }

    public void updateWindowList()
    {
        windowList = driver.getWindowHandles();
    }

    


}
