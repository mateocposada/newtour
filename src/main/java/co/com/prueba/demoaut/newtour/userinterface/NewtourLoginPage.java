package co.com.prueba.demoaut.newtour.userinterface;

import net.serenitybdd.screenplay.targets.Target;
import net.thucydides.core.pages.PageObject;

public class NewtourLoginPage extends PageObject {

    public static final Target FIELD_USERNAME = Target.the("Field to insert username")
            .locatedBy("//input[@name='userName']");

    public static final Target FIELD_PASSWORD = Target.the("Field to insert password")
            .locatedBy("//input[@name='password']");

    public static final Target BUTTON_SUBMIT  = Target.the("Button to login account")
            .locatedBy("//input[@type='image']");
}
