package co.com.prueba.demoaut.newtour.userinterface;

import net.serenitybdd.screenplay.targets.Target;
import net.thucydides.core.pages.PageObject;

public class NewtourConfirmData extends PageObject {

    public static final Target FIELD_FIRSTNAME_DATA = Target.the("Field to insert username")
            .locatedBy("//input[@name='passFirst0']");

    public static final Target FIELD_LAST_DATA = Target.the("Field to insert last name")
            .locatedBy("//input[@name='passLast0']");

    public static final Target FIELD_NUMCREDIT_DATA = Target.the("Field to insert number de credit")
            .locatedBy("//input[@name='creditnumber']");
}
