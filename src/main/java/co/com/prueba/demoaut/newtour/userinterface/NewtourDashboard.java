package co.com.prueba.demoaut.newtour.userinterface;

import net.serenitybdd.screenplay.targets.Target;
import net.thucydides.core.pages.PageObject;

public class NewtourDashboard extends PageObject {

    public static final Target IN_DASHBOARD_REGISTER = Target.the("element to register successfully")
            .locatedBy("//img[@src='/images/masts/mast_register.gif']");

    public static final Target IN_DASHBOARD_LOGIN = Target.the("element to register successfully")
            .locatedBy("//img[@src='/images/masts/mast_flightfinder.gif']");
}
