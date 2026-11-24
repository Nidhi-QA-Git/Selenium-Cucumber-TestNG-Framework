package stepDefinition;

import Pages.Login_Page;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import Base.BaseClass;
import org.openqa.selenium.WebDriver;

public class Login_Steps {

    WebDriver driver;
    Login_Page loginPage;

    @Given("user is on login page")
    public void userIsOnLoginPage() {
        driver = BaseClass.driver;
        loginPage = new Login_Page(driver);
    }

    @When("user enters valid email and password")
    public void userEntersValidEmailAndPassword() {
        loginPage.enterUserName("Tester");
        loginPage.enterPassword("Test123@");
    }

    @When("user clicks on login button")
    public void userClicksOnLoginButton() {
        loginPage.clickLoginButton();
    }

    @Then("user should be logged in successfully")
    public void userShouldBeLoggedInSuccessfully() {
        loginPage.userNavigateOnHomepage();
    }

    @Then("user able to see home option")
    public void userAbleToSeeHomeOption() {
        loginPage.isHomeOptionDisplayed();
    }


    @Then("user able to see products option")
    public void userAbleToSeeProductsOption() {
        loginPage.isProductsOptionDisplayed();
    }


    @Then("user able to see cart option")
    public void userAbleToSeeCartOption() {
        loginPage.isCartOptionDisplayed();
    }




}
