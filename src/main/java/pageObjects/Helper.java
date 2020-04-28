package pageObjects;

import java.io.IOException;
import java.util.Properties;

import static com.utils.fuctions.Fuctions.*;
import static com.utils.fuctions.Fuctions.actionsSelect;

public class Helper {
    public static void registerUser(Properties prop) throws Exception {
        FileReader fileReader = new FileReader("src/test/propertyFiles/ElementsPropertyFile/RegisterPage.properties");
        sendData(fileReader.getElement("firstName"), prop.getProperty("firstName"));
        sendData(fileReader.getElement("lastName"), prop.getProperty("lastName"));
        sendData(fileReader.getElement("phone"), prop.getProperty("phone"));
        sendData(fileReader.getElement("email"), prop.getProperty("email"));
        sendData(fileReader.getElement("addressLine1"), prop.getProperty("addressLine1"));
        sendData(fileReader.getElement("addressLine2"), prop.getProperty("addressLine2"));
        sendData(fileReader.getElement("city"), prop.getProperty("city"));
        sendData(fileReader.getElement("state"), prop.getProperty("state"));
        sendData(fileReader.getElement("postalCode"), prop.getProperty("postalCode"));
        sendData(fileReader.getElement("userName"), prop.getProperty("userName"));
        sendData(fileReader.getElement("password"), prop.getProperty("password"));
        sendData(fileReader.getElement("confirmPassword"), prop.getProperty("confirmPassword"));
        clickButton(fileReader.getElement("submit"));
    }

    public static void flightDetails(String numberOfPassengers) throws Exception {
        FileReader fileReader = new FileReader("src/test/propertyFiles/ElementsPropertyFile/FlightFinder.properties");
        clickRadioButton(fileReader.getElement("roundTrip"));
        actionsSelect(fileReader.getElement("passengers"), numberOfPassengers);
        actionsSelect(fileReader.getElement("departingFrom"), "Paris");
        actionsSelect(fileReader.getElement("departingMonth"), "6");
        actionsSelect(fileReader.getElement("departingDate"), "29");
        actionsSelect(fileReader.getElement("arrivingIn"), "London");
        actionsSelect(fileReader.getElement("returningMonth"), "6");
        actionsSelect(fileReader.getElement("returningDate"), "15");
        clickRadioButton(fileReader.getElement("businessClass"));
        actionsSelect(fileReader.getElement("airLine"), "Unified Airlines");
        clickButton(fileReader.getElement("continue"));
    }

    public static void departAndReturn() throws Exception {
        FileReader fileReader = new FileReader("src/test/propertyFiles/ElementsPropertyFile/SelectFlight.properties");
        clickRadioButton(fileReader.getElement("depart363"));
        clickRadioButton(fileReader.getElement("return633"));
        clickButton(fileReader.getElement("submit"));
    }

    public static void passengerData(String numberOfPassengers) throws Exception {
        FileReader fileReader = new FileReader("src/test/propertyFiles/ElementsPropertyFile/BookAFlight.properties");
        int count = Integer.parseInt(numberOfPassengers);
        Thread.sleep(5000);
        if (count == 1) {
            sendData(fileReader.getElement("firstName1"), "FirstName1");
            sendData(fileReader.getElement("lastName1"), "LastName1");
            actionsSelect(fileReader.getElement("meal1"), "HNML");
        } else if (count == 2) {
            sendData(fileReader.getElement("firstName1"), "FirstName1");
            sendData(fileReader.getElement("lastName1"), "LastName1");
            actionsSelect(fileReader.getElement("meal1"), "HNML");
            sendData(fileReader.getElement("firstName2"), "FirstName2");
            sendData(fileReader.getElement("lastName2"), "LastName2");
            actionsSelect(fileReader.getElement("meal2"), "HNML");
        } else if (count == 3) {
            sendData(fileReader.getElement("firstName1"), "FirstName1");
            sendData(fileReader.getElement("lastName1"), "LastName1");
            actionsSelect(fileReader.getElement("meal1"), "HNML");
            sendData(fileReader.getElement("firstName2"), "FirstName2");
            sendData(fileReader.getElement("lastName2"), "LastName2");
            actionsSelect(fileReader.getElement("meal2"), "HNML");
            sendData(fileReader.getElement("firstName3"), "FirstName3");
            sendData(fileReader.getElement("lastName3"), "LastName3");
            actionsSelect(fileReader.getElement("meal3"), "HNML");

        } else if (count == 4) {
            sendData(fileReader.getElement("firstName1"), "FirstName1");
            sendData(fileReader.getElement("lastName1"), "LastName1");
            actionsSelect(fileReader.getElement("meal1"), "HNML");
            sendData(fileReader.getElement("firstName2"), "FirstName2");
            sendData(fileReader.getElement("lastName2"), "LastName2");
            actionsSelect(fileReader.getElement("meal2"), "HNML");
            sendData(fileReader.getElement("firstName3"), "FirstName3");
            sendData(fileReader.getElement("lastName3"), "LastName3");
            actionsSelect(fileReader.getElement("meal3"), "HNML");
            sendData(fileReader.getElement("firstName4"), "FirstName4");
            sendData(fileReader.getElement("lastName4"), "LastName4");
            actionsSelect(fileReader.getElement("meal4"), "HNML");
        }
        actionsSelect(fileReader.getElement("creditCard"), "BA");
        sendData(fileReader.getElement("cardNumber"), "1234323454567678");
        actionsSelect(fileReader.getElement("expireMonth"), "03");
        actionsSelect(fileReader.getElement("expireYear"), "2021");
        sendData(fileReader.getElement("firstName"), "FirstName");
        sendData(fileReader.getElement("lastName"), "lastName");
        sendData(fileReader.getElement("middleName"), "middleName");
        clickButton(fileReader.getElement("submit"));
    }

    public static void logout() throws Exception {
        FileReader fileReader = new FileReader("src/test/propertyFiles/ElementsPropertyFile/FlightConformation.properties");
        clickButton(fileReader.getElement("logOut"));
    }
}
