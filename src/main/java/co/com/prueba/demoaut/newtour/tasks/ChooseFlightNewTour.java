package co.com.prueba.demoaut.newtour.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;

import static co.com.prueba.demoaut.newtour.userinterface.NewtourFlightPage.*;

public class ChooseFlightNewTour implements Task {
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(MENU_LEFT_FLIGHT),
                Click.on(BUTTON_CONTINUE),
                Click.on(CHECK_OUT),
                Click.on(CHECK_IN),
                Click.on(BUTTON_CONFIRM)
        );
    }

    public static ChooseFlightNewTour chooseFlightNewTour() { return Tasks.instrumented(ChooseFlightNewTour.class); }
}
