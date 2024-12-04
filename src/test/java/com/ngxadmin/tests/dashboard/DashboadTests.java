package com.ngxadmin.tests.dashboard;

import com.ngxadmin.base.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;

public class DashboadTests extends BaseTest {

    private String pagePath = "/auth/login";

    @Test
    public void testDashboardHeaderIsDisplayed() {
        navigateToPage(pagePath);
        loginPage.logIntoApp("alozQA@gmail.com", "admin123", true);
        Assert.assertTrue(dashboardPage.isDashboardHeaderDisplayed(), "Dashboard header is not displayed!");
    }

}
