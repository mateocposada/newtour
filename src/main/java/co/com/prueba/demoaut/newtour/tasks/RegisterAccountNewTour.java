package co.com.prueba.demoaut.newtour.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

import static co.com.prueba.demoaut.newtour.userinterface.NewtourRegisterPage.*;
public class RegisterAccountNewTour implements Task {

    private RegisterAccountNewTour registerAccountNewTour;

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Enter.theValue("Mateo").into(FIELD_FIRSTDAME),
                Enter.theValue("Cardona").into(FIELD_LASTNAME),
                Enter.theValue("12345678911").into(FIELD_PHONE),
                Enter.theValue("mateocposada").into(FIELD_USERNAME),
                Enter.theValue("Medellín").into(FIELD_ADDRESS),
                Enter.theValue("Medellín").into(FIELD_CITY),
                Enter.theValue("Antioquia").into(FIELD_STATE),
                Enter.theValue("222222").into(FIELD_POSTALCODE),
                Enter.theValue("matteo@gmail.com").into(FIELD_EMAIL),
                Enter.theValue("12345").into(FIELD_PASSWORD),
                Enter.theValue("12345").into(FIELD_CONFIRM_PASSWORD),
                Click.on(BUTTON_SUBMIT)
        );
    }

    public static RegisterAccountNewTour registerAccountNewTour() { return Tasks.instrumented(RegisterAccountNewTour.class); }


}
