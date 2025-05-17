import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import pageobjectmodel.AccountLogin;
import pageobjectmodel.MyAccountPage;
import pageobjectmodel.YouStore;

public class Login2 {
    public static void main(String[] args) throws InterruptedException {
        //1- Open the browser
        WebDriver driver = LaunchBrowser.openBrowser("Chrome");

        //2- Enter the url
        driver.get("https://janbaskdemo.com/");

        //3- Click on My Account icon
        YouStore ys = new YouStore(driver);
        ys.clickOnMyAccountIcon();

        //4- Click on login Link
        ys.clickOnLoginLink();

        //5- Enter correct email and password
        AccountLogin al = new AccountLogin(driver);
        al.enterCredentials("jason.roger@janbask.com", "test@1234");

        //7- Click on Login button
        al.clickOnLoginButton();

        //8- Validate login status
        MyAccountPage ma = new MyAccountPage(driver);
        ma.validateLoginStatus();

        //9- Close the browser
        driver.close();

    }
}
