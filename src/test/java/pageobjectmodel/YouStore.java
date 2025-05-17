package pageobjectmodel;

import commonActions.ReUsable;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class YouStore
{
    WebDriver driver;
    ReUsable reUsable;

    By myAccountIcon = By.xpath("//i[@class='fa fa-user']");
    By loginLink = By.xpath("//a[text()='Login']");
    public YouStore(WebDriver driver)
    {
        this.driver=driver;
        reUsable = new ReUsable(driver);
    }
    public void clickOnMyAccountIcon() throws InterruptedException {
        reUsable.doClick(myAccountIcon);
        Thread.sleep(2000);
    }
    public AccountLogin clickOnLoginLink()
    {
        reUsable.doClick(loginLink);
        return new AccountLogin(driver);
    }
}
