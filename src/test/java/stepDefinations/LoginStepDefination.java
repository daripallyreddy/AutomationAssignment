package stepDefinations;

import com.utils.fuctions.TestBase;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.cucumber.junit.Cucumber;
import org.junit.runner.RunWith;
import pageObjects.FileReader;
import pageObjects.Helper;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import static com.utils.fuctions.Fuctions.*;

@RunWith(Cucumber.class)
public class LoginStepDefination extends TestBase {

    Properties prop = new Properties();
    FileInputStream fis;
    String numberOfPassengers = "2";

    @When("^Navigate the site \"([^\"]*)\"$")
    public void navigate_the_site_something(String URL) throws Throwable {
        System.out.println(URL);
        driver.get(URL);
    }


    @Then("^Click on the \"([^\"]*)\" for registering the user$")
    public void click_on_the_something_for_registering_the_user(String element) throws Throwable {
        FileReader fileReader = new FileReader("src/test/propertyFiles/ElementsPropertyFile/HomePage.properties");
        fileReader.getElement(element.toLowerCase()).click();
    }

    @Given("Intiate ChromeDriver")
    public void intiateChromeDriver() {
        driver();
    }

    @Then("^Register the User with all required data$")
    public void register_the_user_with_all_required_data() throws Throwable {
        fis = new FileInputStream("src/test/propertyFiles/RegisterUser/ContactInformation.properties");
        prop.load(fis);
        Helper.registerUser(prop);
    }

    @Then("^enter the flight details$")
    public void enter_the_flight_details() throws Throwable {
        Helper.flightDetails(numberOfPassengers);
    }

    @Then("select the Flight")
    public void selectTheFlight() throws Exception {
        Helper.departAndReturn();
    }

    @Then("Give Passengers Info")
    public void givePassengersInfo() throws Exception {
        Helper.passengerData(numberOfPassengers);
    }

    @Then("Take ScreenShot")
    public void takeScreenShot() throws IOException {
        captureScreenShot();
    }

    @Then("LogOut of the Application")
    public void logoutOfTheApplication() throws Exception {
        Helper.logout();
    }

    @Then("close the browser")
    public void closeTheBrowser() {
        driver.close();
    }
}
