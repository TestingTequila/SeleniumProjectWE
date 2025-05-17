package pageobjectmodel;

import commonActions.ReUsable;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class AccountLogin {
    WebDriver driver;
    ReUsable reUsable;
    By emailTextBox = By.xpath("//input[@id='input-email']");
    By passwordTextBox = By.xpath("//input[@name='password']");
    By loginButton = By.xpath("//input[@type='submit']");

    public AccountLogin(WebDriver driver) {
        this.driver = driver;
        reUsable = new ReUsable(driver);
    }

    public void enterCredentials(String email, String password) {
        reUsable.doSendKeys(emailTextBox, email);
        reUsable.doSendKeys(passwordTextBox, password);
    }

    public MyAccountPage clickOnLoginButton() {
        reUsable.doClick(loginButton);
        return new MyAccountPage(driver);
    }
}
