package com.sparta.waj.formaccess;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ToolsQAForm
{
    private WebDriver driver;

    private final String PAGE_URL = "https://www.toolsqa.com/automation-practice-form";
    private final By halfLink = By.partialLinkText("Partial Link Test");
    private final By fullLink = By.linkText("Link Test");



    public ToolsQAForm(WebDriver driver)
    {
        this.driver = driver;
    }

    public void goToPage()
    {
        driver.navigate().to(PAGE_URL);
    }

    public String getHalfLinkTarget()
    {
        return driver.findElement(halfLink).getAttribute("href");
    }




}
