package stepdefs;

import core.Config;
import io.cucumber.java.en.Then;
import org.testng.asserts.SoftAssert;
import pages.AddProduct.AddProductPageAbstract;
import pages.AddProduct.AddProductPageLogic;

public class AddProductStepDefs {
    private AddProductPageAbstract page;
    SoftAssert softAssert;

    public AddProductStepDefs(Config config) {
        if (config.isWeb()) page = new AddProductPageLogic();
        softAssert = new SoftAssert();
    }

    @Then("Add Product")
    public void add_product() throws InterruptedException {
        page.addProduct();

    }



}

