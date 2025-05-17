package commonActions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ReUsable
{
    WebDriver driver;

    public ReUsable(WebDriver driver) {
        this.driver = driver;
    }

    public void doClick(By locator)
    {
        WebElement webElement= driver.findElement(locator);
        webElement.click();
    }
    public void doSendKeys(By locator, String text)
    {
        WebElement webElement= driver.findElement(locator);
        webElement.sendKeys(text);
    }
}
