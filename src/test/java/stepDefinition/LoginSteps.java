package stepDefinition;

import base.Config;
import base.TestData;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageObject.LoginPage;

public class LoginSteps extends Config {

    LoginPage loginpage=new LoginPage(driver);
    @Given("user is in TalentTEK Homepage")
    public void userIsInTalentTEKHomepage() {
        loginpage.validateHomePage();
    }

    @And("user enter valid email address")
    public void userEnterValidEmailAddress() {
        loginpage.enterUsername(TestData.username);
    }

    @And("User enters valid password")
    public void userEntersValidPassword() {
        loginpage.enterPassword(TestData.password);
    }

    @When("user click on login button")
    public void userClickOnLoginButton() {
        loginpage.clickLoginButton();
    }

    @Then("user should be successfully able to login")
    public void userShouldBeSuccessfullyAbleToLogin() {
        loginpage.loginSuccess();
    }

    @And("User enters invalid password")
    public void userEntersInvalidPassword() {
        loginpage.enterPassword(TestData.invalidPassword);
    }

    @Then("user should see {string}")
    public void userShouldSee(String errorMessage) {
        loginpage.invalidCredentials(errorMessage);
    }

    @And("user enter invalid email address")
    public void userEnterInvalidEmailAddress() {
        loginpage.enterUsername(TestData.invalidUsername);
    }
}
