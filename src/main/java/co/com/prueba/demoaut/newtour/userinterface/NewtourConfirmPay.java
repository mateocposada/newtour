package co.com.prueba.demoaut.newtour.userinterface;

import net.serenitybdd.screenplay.targets.Target;
import net.thucydides.core.pages.PageObject;

public class NewtourConfirmPay extends PageObject {

    public static final Target FIELD_FLIGHT_CONFIRMATION = Target.the("Image to confirmation of flight")
            .locatedBy("//img[@src='/images/masts/mast_confirmation.gif']");
}
