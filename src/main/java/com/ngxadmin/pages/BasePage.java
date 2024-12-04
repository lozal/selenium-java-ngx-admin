package com.ngxadmin.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.time.Duration;

public class BasePage {

    public static WebDriver driver;
    private WebDriverWait wait;

    public void setDriver(WebDriver driver) {
        BasePage.driver = driver;
    }

    private WebDriverWait explicitWait() {
        WebDriverWait w = new WebDriverWait(driver, Duration.ofSeconds(30));
        return w;
    }


    public void explicitWaitUntilVisible(By locator) {
        wait = explicitWait();
        wait.until(ExpectedConditions.visibilityOfElementLocated(locator));
    }

    protected WebElement find(By locator) {
        return driver.findElement(locator);
    }

    protected void click(By locator) {
        find(locator).click();
    }

    protected void set(By locator, String text) {
        find(locator).clear();
        find(locator).sendKeys(text);
    }

}
