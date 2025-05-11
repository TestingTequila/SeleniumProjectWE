import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Registration {
    public static void main(String[] args) {
        //1. Open the browser
        WebDriver driver = LaunchBrowser.openBrowser("Edge");
        driver.manage().window().maximize();

        //2. Enter the url
        driver.get("https://janbaskdemo.com/");

        //3. Click on My Account Icon
        WebElement myAccountIcon = driver.findElement(By.xpath("//i[@class='fa fa-user']"));
        myAccountIcon.click();

        //4. Click on Registration Link
        WebElement registrationLink= driver.findElement(By.xpath("//a[text()='Register']"));
        registrationLink.click();

        //5. Fill the Registration form
        WebElement firstNameTextBox=driver.findElement(By.id("input-firstname"));
        firstNameTextBox.sendKeys("Justin");

        WebElement lastNameTextBox= driver.findElement(By.name("lastname"));
        lastNameTextBox.sendKeys("Murray");

        WebElement emailIdTextBox= driver.findElement(By.id("input-email"));
        emailIdTextBox.sendKeys("justin.murray@janbask.com");

        WebElement telephoneTextBox= driver.findElement(By.name("telephone"));
        telephoneTextBox.sendKeys("7567575");

        WebElement countryDdl=driver.findElement(By.id("input-country"));
        Select country = new Select(countryDdl);
        country.selectByValue("99");
//        country.selectByVisibleText("India");
//        country.selectByIndex(3);
//          List<WebElement> countries=country.getOptions();
//          for(WebElement c : countries)
//          {
//              String nation=c.getText();
//              if(nation.equals("Brazil"))
//              {
//                  c.click();
//                  break;
//              }
//          }


        WebElement passwordTextBox= driver.findElement(By.id("input-password"));
        passwordTextBox.sendKeys("test@1234");

        WebElement confirmPasswordTextBox= driver.findElement(By.id("input-confirm"));
        confirmPasswordTextBox.sendKeys("test@1234");

        WebElement yesRadioButton=driver.findElement(By.name("newsletter"));
        yesRadioButton.click();

        WebElement subscriptionDdl=driver.findElement(By.name("subscription"));
        Select subscription = new Select(subscriptionDdl);
        subscription.selectByVisibleText("Monthly");

        //6. Click on Privacy Policy Checkbox
        WebElement privacyPolicyCheckbox=driver.findElement(By.name("agree"));
        privacyPolicyCheckbox.click();

        //7. Click on Continue button
        WebElement continueButton=driver.findElement(By.id("submitbtn"));
        continueButton.click();

        //8. Validate Registration status
        String pageTitle =driver.getTitle();
        if(pageTitle.equals("Your Account Has Been Created!"))
        {
            System.out.println("Registration is successful");
        }
        else
        {
            System.out.println("User already Registered, please use other email...");
        }
        //9. Close the browser
        driver.close();
    }
}
