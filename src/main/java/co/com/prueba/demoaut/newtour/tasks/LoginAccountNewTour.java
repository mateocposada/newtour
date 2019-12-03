package co.com.prueba.demoaut.newtour.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

import static co.com.prueba.demoaut.newtour.userinterface.NewtourLoginPage.*;
public class LoginAccountNewTour implements Task {

    private LoginAccountNewTour registerAccountNewTour;

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Enter.theValue("mateocposada").into(FIELD_USERNAME),
                Enter.theValue("1234").into(FIELD_PASSWORD),
                Click.on(BUTTON_SUBMIT)
        );
    }

    public static LoginAccountNewTour loginAccountNewTour() { return Tasks.instrumented(LoginAccountNewTour.class); }


}
