package com.sparta.waj.formaccess;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

public class ToolsQAForm
{
    private WebDriver driver;

    private final String PAGE_URL = "https://www.toolsqa.com/automation-practice-form";
    private final By halfLink = By.partialLinkText("Partial Link Test");
    private final By fullLink = By.linkText("Link Test");
    private final By expButtons = By.name("exp");
    private final By sexButtons = By.name("sex");
    private final By continentsSelect = By.id("continentsSelect");




    public ToolsQAForm(WebDriver driver)
    {
        this.driver = driver;
    }

    public void goToPage()
    {
        driver.navigate().to(PAGE_URL);
    }

    /**
     * Gets the link target of the half link.
     * @return
     */
    public String getHalfLinkTarget()
    {
        return driver.findElement(halfLink).getAttribute("href");
    }

    public List<WebElement> getExperience()
    {
        return driver.findElements(expButtons);
    }

    public Select getContinents() {return new Select(driver.findElement(By.id("continents")));}

    public void selectAndReturnText(Select select, int index)
    {
        
    }






}
