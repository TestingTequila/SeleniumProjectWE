package pageobjectwithpagefactory;

import org.openqa.selenium.WebDriver;

public class MyAccountPage
{
    WebDriver driver;

    public MyAccountPage(WebDriver driver) {
        this.driver = driver;
    }

    public  void validateLoginStatus()
    {
        String pageTitle=driver.getTitle();
        if(pageTitle.equals("My Account"))
        {
            System.out.println("Login is successful");
        }
        else
        {
            System.out.println("Login Failed...Please check your credentials....");
        }
    }
}
