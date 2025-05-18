package pageobjectmodel;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;

public class MyAccountPage
{
    WebDriver driver;

    public MyAccountPage(WebDriver driver) {
        this.driver = driver;
    }

    public  void validateLoginStatus()
    {
        String pageTitle=driver.getTitle();
        Assert.assertEquals(pageTitle,"My Account" );
    }
}
