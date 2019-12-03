package co.com.prueba.demoaut.newtour.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;

import static co.com.prueba.demoaut.newtour.userinterface.NewtourHomePage.MENU_LOGIN;

public class NewtourSectionLogin implements Task {

    private RegisterAccountNewTour registerAccountNewTour;

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(MENU_LOGIN)
        );
    }

    public static NewtourSectionLogin newtourSectionLogin() { return Tasks.instrumented(NewtourSectionLogin.class); }


}
