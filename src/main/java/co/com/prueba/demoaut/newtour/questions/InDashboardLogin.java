package co.com.prueba.demoaut.newtour.questions;

import static co.com.prueba.demoaut.newtour.userinterface.NewtourDashboard.IN_DASHBOARD_LOGIN;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.annotations.Subject;
import net.serenitybdd.screenplay.targets.Target;

@Subject("Element of login account created")
public class InDashboardLogin implements Question<Boolean> {


    @Override
    public Boolean answeredBy(Actor actor) {
        return IN_DASHBOARD_LOGIN.resolveFor(actor).isVisible();
    }

    public static InDashboardLogin name() {
        return new InDashboardLogin();
    }
}
