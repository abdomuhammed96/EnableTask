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

    @When("User opens Kader website")
    public void userOpensKaderWebsite() {
        //Just to make the scenario more readable
    }

    @Then("Verify that the homepage is opened")
    public void verifyThatTheHomepageIsOpened() {
        page.waitForVisibility(page.homePageHeaderline);
        Assert.assertTrue(page.homePageHeaderline.isDisplayed());
    }


    @And("clicks on looking for a work button")
    public void clicksOnLookingForAWorkButton() {
        page.waitForVisibility(page.lookingForWorkButton);
        page.clickOnElement(page.lookingForWorkButton);
    }

    @Then("Verify that the user can normally explore the looking for a work page")
    public void verifyThatTheUserCanNormallyExploreTheLookingForAWorkPage() {
        page.waitForVisibility(page.lookingForWorkPageHeaderline);
        Assert.assertTrue(page.lookingForWorkPageHeaderline.isDisplayed());
        page.ScrollDown();
    }
}





