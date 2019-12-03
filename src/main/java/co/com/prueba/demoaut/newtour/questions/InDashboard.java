package co.com.prueba.demoaut.newtour.questions;

import static co.com.prueba.demoaut.newtour.userinterface.NewtourDashboard.IN_DASHBOARD_REGISTER;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.annotations.Subject;
import net.serenitybdd.screenplay.targets.Target;

@Subject("Element of create new account")
public class InDashboard implements Question<Boolean> {


    @Override
    public Boolean answeredBy(Actor actor) {
        return IN_DASHBOARD_REGISTER.resolveFor(actor).isVisible();
    }

    public static InDashboard name() {
        return new InDashboard();
    }
}
