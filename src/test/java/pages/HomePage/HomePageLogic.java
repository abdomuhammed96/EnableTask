package pages.HomePage;

import java.util.Properties;

import static utils.PropertiesLoader.readPropertyFile;

public class HomePageLogic extends HomePageAbstract {

    Properties testData = readPropertyFile("Data/SignInData.properties");

    public HomePageLogic() {
        super();
    }



}

