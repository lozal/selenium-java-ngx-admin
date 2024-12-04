package com.ngxadmin.base;

import com.ngxadmin.pages.BasePage;
import com.ngxadmin.pages.DashboardPage;
import com.ngxadmin.pages.LeftMenu;
import com.ngxadmin.pages.LoginPage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;

import static utilities.Utility.setUtilityDriver;

public class BaseTest {
    protected WebDriver driver;
    protected BasePage basePage;
    protected LoginPage loginPage;
    protected DashboardPage dashboardPage;
    protected LeftMenu leftMenu;
    public String appUrl = "http://localhost:4200";

    @BeforeClass
    public void setUp()
    {
        driver = new ChromeDriver();
        driver.manage().window().maximize();
    }

    @BeforeMethod
    public void loadApp() {
        driver.get(appUrl);
        basePage = new BasePage();
        basePage.setDriver(driver);
        setUtilityDriver();
        loginPage = new LoginPage();
        dashboardPage = new DashboardPage();
        leftMenu = new LeftMenu();
    }

    @AfterClass
    public void tearDown() {
        driver.quit();
    }

    public void navigateToPage(String pagePath) {
        driver.get(appUrl + pagePath);
    }

}
