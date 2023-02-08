package pages.HomePage;

public class HomePageLogic extends HomePageAbstract {

    public HomePageLogic() {
        super();
    }


    @Override
    public void clickOnElementOnHomePage(String arg0) {
        switch (arg0) {
            case "Open SignIn Page":
                clickOnElement(SignInButton);
                break;


            default:
        }
    }


}
