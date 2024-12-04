package utilities;

import com.ngxadmin.pages.BasePage;
import org.openqa.selenium.WebDriver;

public class Utility {

    public static WebDriver driver;

    public static void setUtilityDriver() {
        driver = BasePage.driver;
    }

}
