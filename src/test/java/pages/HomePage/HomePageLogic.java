package pages.HomePage;

import org.testng.Assert;

import java.util.Properties;

import static utils.PropertiesLoader.readPropertyFile;

public class HomePageLogic extends HomePageAbstract {

    Properties testData = readPropertyFile("Data/CountriesPackagesPrices.properties");

    public HomePageLogic() {
        super();
    }

    public void verifySubscriptionPackages()
    {

        //for lite package
        waitForVisibility(litePackage);
        Assert.assertEquals(litePackage.getText(),"LITE");
        Assert.assertTrue(litePackage.isDisplayed());

        //for classic plan
        waitForVisibility(classicPackage);
        Assert.assertEquals(classicPackage.getText(),"CLASSIC");
        Assert.assertTrue(classicPackage.isDisplayed());

        //for premium plan
        waitForVisibility(premiumPackage);
        Assert.assertEquals(premiumPackage.getText(),"PREMIUM");
        Assert.assertTrue(premiumPackage.isDisplayed());

    }


    public  void changeCountry(String country)
    {
        waitForVisibility(countryName);
        clickOnElement(countryName);

        switch (country) {
            case "UAE":
                waitForVisibility(UAE);
                clickOnElement(UAE);
                break;
            case "Algeria":
                waitForVisibility(Algeria);
                clickOnElement(Algeria);
                break;
            case "Jordan":
                waitForVisibility(Jordan);
                clickOnElement(Jordan);
                break;
            default:

        }
    }


    public void checkCountryPackagesCurrency(String country)
    {
        switch (country) {
            case "UAE":
                waitForVisibility(UAEPackageCurrency);
                Assert.assertEquals(UAEPackageCurrency.getText().split("/")[0], testData.getProperty("UAEPackagesCurrency"));
                break;
            case "Algeria":
                waitForVisibility(AlgeriaPackageCurrency);
                Assert.assertEquals(AlgeriaPackageCurrency.getText().split("/")[0], testData.getProperty("AlgeriaPackagesCurrency"));
                break;
            case "Jordan":
                waitForVisibility(JordanPackageCurrency);
                Assert.assertEquals(JordanPackageCurrency.getText().split("/")[0], testData.getProperty("JordanPackagesCurrency"));
                break;
            default:
        }
    }


    public void checkCountryPackagesPrices(String country)
    {
        switch (country) {
            case "UAE":
                Assert.assertEquals(UAEClassicPackageCurrency.getText().toString(), testData.getProperty("UAEClassicPackagePrice"));
                Assert.assertEquals(UAELitePackageCurrency.getText().toString(), testData.getProperty("UAELitePackagePrice"));
                Assert.assertEquals(UAEPremiumPackageCurrency.getText().toString(), testData.getProperty("UAEPremiumPackagePrice"));
                break;
            case "Algeria":
                Assert.assertEquals(AlgeriaClassicPackagePrice.getText().toString(), testData.getProperty("AlgeriaClassicPackagePrice"));
                Assert.assertEquals(AlgeriaLitePackagePrice.getText().toString(), testData.getProperty("AlgeriaLitePackagePrice"));
                Assert.assertEquals(AlgeriaPremiumPackagePrice.getText().toString(), testData.getProperty("AlgeriaPremiumPackagePrice"));
                break;
            case "Jordan":
                Assert.assertEquals(JordanClassicPackagePrice.getText().toString(), testData.getProperty("JordanClassicPackagePrice"));
                Assert.assertEquals(JordanLitePackagePrice.getText().toString(), testData.getProperty("JordanLitePackagePrice"));
                Assert.assertEquals(JordanPremiumPackagePrice.getText().toString(), testData.getProperty("JordanPremiumPackagePrice"));
                break;
            default:
        }

    }




}

