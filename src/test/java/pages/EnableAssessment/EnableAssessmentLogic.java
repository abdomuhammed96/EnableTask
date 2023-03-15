package pages.EnableAssessment;

import org.testng.Assert;

import java.util.Properties;

import static utils.PropertiesLoader.readPropertyFile;

public class EnableAssessmentLogic extends EnableAssessmentAbstract {

    Properties testData = readPropertyFile("Data/LoginCredentials.properties");

    public EnableAssessmentLogic() {
        super();
    }

    public void login()
    {
        userName.sendKeys(testData.getProperty("userName"));
        password.sendKeys(testData.getProperty("password"));
        clickOnElement(loginButton);

    }


    public  void addToCart()
    {
        clickOnElement(addToCartButton);
    }


    public void openShoppingCart()
    {
        clickOnElement(shoppingCartIcon);
    }


    public void checkout()
    {
        clickOnElement(checkoutButton);

        //enter user data
        writeInTextField(firstName,"Test");
        writeInTextField(lastName,"Test");
        writeInTextField(postalCode,"22");

        clickOnElement(continueButton);

        //finish
        clickOnElement(finishButton);

        //confirmationPage
        waitForVisibility(confirmationPageMessage);
        Assert.assertTrue(confirmationPageMessage.isDisplayed());

    }




}

