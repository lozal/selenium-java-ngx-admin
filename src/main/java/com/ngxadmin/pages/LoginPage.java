package com.ngxadmin.pages;

import org.openqa.selenium.By;

public class LoginPage extends BasePage {

    private By emailField = By.name("email");
    private By passwordField = By.name("password");
    private By rememberMeCheckbox = By.cssSelector(".text");
    private By loginButton = By.tagName("button");
    private By loginEmailErrorMessage = By.xpath("//p[normalize-space()='Email should be the real one!']");

    public void setEmail(String email) {
        explicitWaitUntilVisible(emailField);
        set(emailField, email);
    }

    public void setPassword(String password) {
        explicitWaitUntilVisible(passwordField);
        set(passwordField, password);
    }

    public void clickRememberMe() {
        explicitWaitUntilVisible(rememberMeCheckbox);
        click(rememberMeCheckbox);
    }

    public DashboardPage clickLoginButton() {
        explicitWaitUntilVisible(loginButton);
        click(loginButton);
        return new DashboardPage();
    }

    public DashboardPage logIntoApp(String email, String password, Boolean rememberMe) {
        setEmail(email);
        setPassword(password);
        if (rememberMe) {
            clickRememberMe();
        }
        return clickLoginButton();
    }

    public String getLoginEmailErrorMessage() {
        return find(loginEmailErrorMessage).getText();
    }
}
