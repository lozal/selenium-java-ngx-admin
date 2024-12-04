package com.ngxadmin.tests.login;

import com.ngxadmin.base.BaseTest;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

public class LoginTests extends BaseTest {

    private String pagePath = "/auth/login";
    private String email = "alozQA@gmail.com";
    private String password = "admin123";
    private Boolean rememberMe = true;

    @Test
    public void testLogin() {
        navigateToPage(pagePath);
        loginPage.logIntoApp(email, password, rememberMe);
        Assert.assertTrue(dashboardPage.isDashboardHeaderDisplayed());
        }

    @Test
    public void testLoginEmailErrorMessage() {
        navigateToPage(pagePath);
        loginPage.setEmail("alozQA@");
        loginPage.setPassword(password);
        Assert.assertTrue(loginPage.getLoginEmailErrorMessage().contains("Email should be the real one!"));
    }
}
