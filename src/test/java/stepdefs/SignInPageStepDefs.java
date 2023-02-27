package stepdefs;

import core.Config;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.asserts.SoftAssert;
import pages.SignInPage.SignInPageAbstract;
import pages.SignInPage.SignInPageLogic;

public class SignInPageStepDefs {

    private SignInPageAbstract page;
    SoftAssert softAssert;

    public SignInPageStepDefs(Config config) {
        if (config.isWeb()) page = new SignInPageLogic();
        softAssert = new SoftAssert();
    }

        @Then("Sign In")
        public void click_on() throws InterruptedException {
        page.SignIn();
        }

    @Then("check home page is displayed")
    public void checkHomePageIsDisplayed() {

    }

    @When("Open Add Product Page")
    public void openAddProductPage() {
        page.HoverOverElement(page.profileIcon);
        page.clickOnElement(page.addProdctIcon);
    }



}





