package co.com.prueba.demoaut.newtour.userinterface;

import net.serenitybdd.screenplay.targets.Target;
import net.thucydides.core.pages.PageObject;

public class NewtourRegisterPage extends PageObject {

    public static final Target FIELD_FIRSTDAME = Target.the("Field to insert firstname")
            .locatedBy("//input[@name='firstName']");

    public static final Target FIELD_LASTNAME = Target.the("Field to insert last name")
            .locatedBy("//input[@name='lastName']");

    public static final Target FIELD_PHONE = Target.the("Field to insert phone")
            .locatedBy("//input[@name='phone']");

    public static final Target FIELD_USERNAME = Target.the("Field to insert user")
            .locatedBy("//input[@name='userName']");

    public static final Target FIELD_ADDRESS = Target.the("Field to insert address")
            .locatedBy("//input[@name='address1']");

    public static final Target FIELD_CITY = Target.the("Field to insert city")
            .locatedBy("//input[@name='city']");

    public static final Target FIELD_STATE = Target.the("Field to insert state")
            .locatedBy("//input[@name='city']");

    public static final Target FIELD_POSTALCODE = Target.the("Field to insert code postal")
            .locatedBy("//input[@name='postalCode']");

    public static final Target FIELD_EMAIL = Target.the("Field to insert email")
            .locatedBy("//input[@name='email']");

    public static final Target FIELD_PASSWORD  = Target.the("Field to insert password")
            .locatedBy("//input[@name='password']");

    public static final Target FIELD_CONFIRM_PASSWORD  = Target.the("Field to insert confirm password")
            .locatedBy("//input[@name='confirmPassword']");

    public static final Target BUTTON_SUBMIT  = Target.the("Button to create account")
            .locatedBy("//input[@type='image']");
}
