package stepdefs;

import core.Config;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.testng.Assert;
import org.testng.asserts.SoftAssert;
import pages.SignInPage.SignInPageAbstract;
import pages.SignInPage.SignInPageLogic;

public class RegistrationPageStepDefs {

    private SignInPageAbstract page;
    SoftAssert softAssert;

    public RegistrationPageStepDefs(Config config) {
        if (config.isWeb()) page = new SignInPageLogic();
        softAssert = new SoftAssert();
    }

        @Then("Sign In")
        public void click_on() throws InterruptedException {
        page.SignIn();


        }

    @And("Verify that the Sign In Page is opened")
    public void verifyThatTheSignInPageIsOpened() {
       Assert.assertTrue(page.SignInHeader.isDisplayed());
    }
}





