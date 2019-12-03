package co.com.prueba.demoaut.newtour.userinterface;

import net.serenitybdd.screenplay.targets.Target;
import net.thucydides.core.pages.PageObject;

public class NewtourPriceFlight extends PageObject {
    public static final Target FIELD_USERNAME = Target.the("Field to insert username")
            .locatedBy("//input[@name='userName']");
}
