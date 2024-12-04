package com.ngxadmin.pages;

import org.openqa.selenium.By;

public class LeftMenu extends BasePage {

    private By authMenu = By.cssSelector("a[title='Auth']");
    private By loginLink = By.cssSelector("a[title='Login']");

    public void clickAuthMenu() {
        click(authMenu);
    }

    public void clickLoginLink() throws InterruptedException {
        clickAuthMenu();
        Thread.sleep(2000);
        click(loginLink);
    }
}
