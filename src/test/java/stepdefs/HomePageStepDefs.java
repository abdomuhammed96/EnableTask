package stepdefs;

import core.Config;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;
import org.testng.asserts.SoftAssert;
import pages.HomePage.HomePageAbstract;
import pages.HomePage.HomePageLogic;

public class HomePageStepDefs {

    private HomePageAbstract page;
    SoftAssert softAssert;

    public HomePageStepDefs(Config config) {
        if (config.isWeb()) page = new HomePageLogic();
        softAssert = new SoftAssert();
    }

    @When("User opens Jawwy TV website")
    public void userOpensJawwyTVWebsite() {
        // Just for making the scenario readable
    }

    @And("Changes country to be {string}")
    public void changesCountryToBe(String arg0) {
        page.changeCountry(arg0);

    }

    @Then("Verify Subscription Packages type")
    public void verifySubscriptionPackagesType() {
        page.verifySubscriptionPackages();
    }

    @And("Verify Subscription Packages Price for {string}")
    public void verifySubscriptionPackagesPriceFor(String arg0) {
       page.checkCountryPackagesPrices(arg0);
    }

    @And("Verify Subscription Packages Currency for {string}")
    public void verifySubscriptionPackagesCurrencyFor(String arg0) {
        page.checkCountryPackagesCurrency(arg0);

    }
}





