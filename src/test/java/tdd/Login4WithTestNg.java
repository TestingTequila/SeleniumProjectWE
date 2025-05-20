package tdd;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pageobjectmodel.AccountLogin;
import pageobjectmodel.MyAccountPage;
import pageobjectmodel.YouStore;

public class Login4WithTestNg {
    WebDriver driver;
    @BeforeMethod
    public  void openBrowserAndEnterUrl()
    {
        //1- Open the browser
        driver = LaunchBrowser.openBrowser(AppLevelData.browserName);

        //2- Enter the url
        driver.get(AppLevelData.URL);
    }
    @Test(priority = 2)
    public  void login() throws InterruptedException {
           //3- Click on My Account icon
           YouStore ys = new YouStore(driver);
           ys.clickOnMyAccountIcon();

           //4- Click on login Link
           AccountLogin al =ys.clickOnLoginLink();

           //5- Enter correct email and password
           al.enterCredentials(TestData.EMAIL_ID, TestData.PASSWORD);

           //7- Click on Login button
           MyAccountPage ma = al.clickOnLoginButton();

           //8- Validate login status
           ma.validateLoginStatus();
       }

    @Test(priority = 3)
    public  void login2() throws InterruptedException {
        //3- Click on My Account icon
        YouStore ys = new YouStore(driver);
        ys.clickOnMyAccountIcon();

        //4- Click on login Link
        AccountLogin al =ys.clickOnLoginLink();

        //5- Enter correct email and password
        al.enterCredentials(TestData.EMAIL_ID, TestData.PASSWORD);

        //7- Click on Login button
        MyAccountPage ma = al.clickOnLoginButton();

        //8- Validate login status
        ma.validateLoginStatus();
    }

    @Test(priority = 1, enabled = false)
    public  void login3() throws InterruptedException {
        //3- Click on My Account icon
        YouStore ys = new YouStore(driver);
        ys.clickOnMyAccountIcon();

        //4- Click on login Link
        AccountLogin al =ys.clickOnLoginLink();

        //5- Enter correct email and password
        al.enterCredentials(TestData.EMAIL_ID, TestData.PASSWORD);

        //7- Click on Login button
        MyAccountPage ma = al.clickOnLoginButton();

        //8- Validate login status
        ma.validateLoginStatus();
    }


        @AfterMethod
        public void closeBrowser()
        {
            //9- Close the browser
            driver.close();
        }


    }
