package stepdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import pages.MedunnaHomePage;
import utilities.Driver;

public class MedunnaSignInStepDefs {
    MedunnaHomePage medunnaHomePage=new MedunnaHomePage();
    @Given("go to {string}")
    public void go_to(String url) {
        Driver.getDriver().get(url);
    }
    @When("click on user icon")
    public void click_on_user_icon() {
medunnaHomePage.userIcon.click();
    }
    @When("click on sign in option")
    public void click_on_sign_in_option() {

    }
    @When("enter username")
    public void enter_username() {

    }
    @When("enter password")
    public void enter_password() {

    }
    @When("click on sign in submit button")
    public void click_on_sign_in_submit_button() {

    }
}
