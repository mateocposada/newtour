package co.com.prueba.demoaut.newtour.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

import static co.com.prueba.demoaut.newtour.userinterface.NewtourHomePage.MENU_REGISTER;

public class NewtourSectionRegister implements Task {

    private RegisterAccountNewTour registerAccountNewTour;

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(MENU_REGISTER)
        );
    }

    public static NewtourSectionRegister newtourSectionRegister() { return Tasks.instrumented(NewtourSectionRegister.class); }


}
