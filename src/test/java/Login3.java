import org.openqa.selenium.WebDriver;
import pageobjectmodel.AccountLogin;
import pageobjectmodel.MyAccountPage;
import pageobjectmodel.YouStore;

public class Login3 {
    public static void main(String[] args) throws InterruptedException {
        //1- Open the browser
        WebDriver driver = LaunchBrowser.openBrowser(AppLevelData.browserName);

        //2- Enter the url
        driver.get(AppLevelData.URL);

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

        //9- Close the browser
        driver.close();

    }
}
