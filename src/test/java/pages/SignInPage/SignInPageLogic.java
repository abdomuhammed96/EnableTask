package pages.SignInPage;

import java.util.Properties;

import static utils.PropertiesLoader.readPropertyFile;

public class SignInPageLogic extends SignInPageAbstract {

    Properties testData = readPropertyFile("Data/SignInData.properties");

    public SignInPageLogic() {
        super();
    }


    @Override
    public void SignIn() throws InterruptedException {
        writeInTextField(Email, testData.getProperty("Email"));
        writeInTextField(Password, testData.getProperty("Password"));
        clickOnElement(SignInBtn);
    }


}

