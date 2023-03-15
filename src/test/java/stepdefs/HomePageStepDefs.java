package stepdefs;

import core.Config;
import io.cucumber.java.en.And;
import io.cucumber.java.en.When;
import org.testng.asserts.SoftAssert;
import pages.EnableAssessment.EnableAssessmentAbstract;
import pages.EnableAssessment.EnableAssessmentLogic;

public class HomePageStepDefs {

    private EnableAssessmentAbstract page;
    SoftAssert softAssert;

    public HomePageStepDefs(Config config) {
        if (config.isWeb()) page = new EnableAssessmentLogic();
        softAssert = new SoftAssert();
    }

    @When("user logins")
    public void login() {
        page.login();
    }

    @And("Adds a product to shopping cart")
    public void addsAProductToShoppingCart() {
        page.addToCart();
    }


    @And("opens the shopping cart")
    public void opensTheShoppingCart() {
        page.openShoppingCart();
        page.checkout();
    }
}





