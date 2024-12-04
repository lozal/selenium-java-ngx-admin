package com.ngxadmin.pages;

import org.openqa.selenium.By;

public class DashboardPage extends BasePage {

    private By dashboardHeader = By.xpath("//div[normalize-space()='Light']");

    public boolean isDashboardHeaderDisplayed() {
        explicitWaitUntilVisible(dashboardHeader);
        return find(dashboardHeader).isDisplayed();
    }

}
