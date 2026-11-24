package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

public class Login_Page {

    WebDriver driver;

    public Login_Page(WebDriver driver){
        this.driver = driver;
    }

    By username = By.name("email");
    By password = By.name("password");
    By loginBtn = By.cssSelector("button[type='submit']");
    By homeOption = By.cssSelector("a[href='/']");
    By productsOption = By.cssSelector("a[href='/products']");
    By cartOption = By.cssSelector("a[href='/view_cart']");



    public void enterUserName(String email){
        driver.findElement(username).sendKeys(email);
    }

    public void enterPassword(String passwordValue){
        driver.findElement(password).sendKeys(passwordValue);
    }

    public void clickLoginButton(){
        driver.findElement(loginBtn).click();
    }

    public void userNavigateOnHomepage(){
    String homePageTitle = driver.getTitle();
    Assert.assertEquals(homePageTitle, "Automation Exercise - Signup / Login");
    }

    public void isHomeOptionDisplayed(){
        boolean home = driver.findElement(homeOption).isDisplayed();
        Assert.assertTrue(home, "Home");
    }

    public void isProductsOptionDisplayed(){
        boolean products = driver.findElement(productsOption).isDisplayed();
        Assert.assertTrue(products, " Products");
    }

    public void isCartOptionDisplayed(){
        boolean cart = driver.findElement(cartOption).isDisplayed();
        Assert.assertTrue(cart,"cart");
    }
}
