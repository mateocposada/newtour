package co.com.prueba.demoaut.newtour.userinterface;

import net.serenitybdd.screenplay.targets.Target;
import net.thucydides.core.pages.PageObject;

public class NewtourHomePage extends PageObject {
    public static final Target MENU_REGISTER = Target.the("element to register at menu")
            .locatedBy("//td[@width='77']/a[@href]");

    public static final Target MENU_LOGIN = Target.the("element to register at menu")
            .locatedBy("//td[@width='67']/a[@href]");
}