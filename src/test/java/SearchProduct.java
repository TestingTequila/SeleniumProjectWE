import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SearchProduct
{
    public static void main(String[] args) {
        //1. Open the browser
        WebDriver driver =new ChromeDriver();
        driver.manage().window().maximize();

        //2. Enter the url
        driver.get("https://janbaskdemo.com/");

        //3. Enter the product in search box
        WebElement searchBox =driver.findElement(By.xpath("//input[@name='search']"));
        searchBox.sendKeys("mechanical");

        //4. Click on search Icon
        WebElement searchIcon =driver.findElement(By.xpath("//i[@class='fa fa-search']"));
        searchIcon.click();

        //5. Click on the first searched product
        WebElement product =driver.findElement(By.xpath("//div[@class='product-block product-thumb']//img[2]"));
        product.click();

        //6. Click on Add to Cart
        WebElement addToCartButton= driver.findElement(By.xpath("//button[@id='button-cart']"));
        addToCartButton.click();

        //7. Click on cart
        WebElement cart=driver.findElement(By.xpath("//span[@id='cart-total']"));
        cart.click();

        //8. Close the browser
        driver.close();
    }
}
