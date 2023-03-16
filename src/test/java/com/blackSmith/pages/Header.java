package com.blackSmith.pages;

import com.blackSmith.utilities.ConfigurationReader;
import com.blackSmith.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Header extends BasePage {

    @FindBy(xpath = "//img [@alt = 'Company Logo']")
    private WebElement logo;

    public void getHomePage(){
        Driver.getDriver().get(ConfigurationReader.get("url"));
    }

    public String pageTitle(){
        return Driver.getDriver().getTitle();
    }

    public boolean isDisplayLogo() {
        if (logo.isDisplayed()) {
            return true;
        }
        return false;
    }

    public void clickLogo(){
        logo.click();
    }

    public String navigateToModule(String moduleName){
        WebElement menuLocator = Driver.getDriver().findElement(By.xpath("(//span[text()='"+moduleName+"'])[1]"));

        String menuName = menuLocator.getAttribute("innerHTML");

        return menuName;
    }

}
