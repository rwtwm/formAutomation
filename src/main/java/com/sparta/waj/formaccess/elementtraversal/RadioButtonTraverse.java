package com.sparta.waj.formaccess.elementtraversal;

import org.openqa.selenium.WebElement;

import java.util.List;

public class RadioButtonTraverse
{
    List<WebElement> webElements;

    public RadioButtonTraverse(List<WebElement> webElements)
    {
        this.webElements = webElements;
    }

    public WebElement getTopButton()
    {
        return webElements.get(webElements.size()-1);
    }

    public WebElement getFirstButton()
    {
        return webElements.get(0);
    }

    public WebElement getNthButton(int i)
    {
        return webElements.get(i);
    }

    public String getButtonValue(WebElement element)
    {
        return element.getAttribute("value");
    }
}
