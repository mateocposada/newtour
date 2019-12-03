package co.com.prueba.demoaut.newtour.userinterface;

import net.serenitybdd.screenplay.targets.Target;
import net.thucydides.core.pages.PageObject;
import org.apache.tools.ant.taskdefs.Tar;

public class NewtourFlightPage extends PageObject {

    public static final Target MENU_LEFT_FLIGHT = Target.the("element to flight at left menu")
            .locatedBy("//td[@width='80' and @height='19']/a[text()='Flights']");

    public static final Target BUTTON_CONTINUE = Target.the("")
            .locatedBy("//input[@src='/images/forms/continue.gif']");

    public static final Target CHECK_OUT = Target.the("")
            .locatedBy("//tr/td[@class='frame_action_xrows']/input[@value='Blue Skies Airlines$360$270$5:03']");

    public static final Target CHECK_IN = Target.the("")
            .locatedBy("//tr/td[@class='frame_action_xrows']/input[@value='Blue Skies Airlines$630$270$12:23']");

    public static final Target BUTTON_CONFIRM = Target.the("")
            .locatedBy("//input[@src='/images/forms/continue.gif']");
}
