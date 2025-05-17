import org.openqa.selenium.WebDriver;
import pageobjectwithpagefactory.AccountLogin;
import pageobjectwithpagefactory.MyAccountPage;
import pageobjectwithpagefactory.YouStore;

public class LoginWithPageFactory {
    public static void main(String[] args) throws InterruptedException {
        //1- Open the browser
        WebDriver driver = LaunchBrowser.openBrowser("Edge");

        //2- Enter the url
        driver.get("https://janbaskdemo.com/");

        //3- Click on My Account icon
        YouStore ys = new YouStore(driver);
        ys.clickOnMyAccountIcon();

        //4- Click on login Link
        AccountLogin al =ys.clickOnLoginLink();

        //5- Enter correct email and password
        al.enterCredentials("jason.roger@janbask.com", "test@1234");

        //7- Click on Login button
        MyAccountPage ma = al.clickOnLoginButton();

        //8- Validate login status
        ma.validateLoginStatus();

        //9- Close the browser
        driver.close();

    }
}
