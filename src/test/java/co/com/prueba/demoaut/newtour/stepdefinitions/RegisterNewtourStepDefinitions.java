package co.com.prueba.demoaut.newtour.stepdefinitions;

import co.com.prueba.demoaut.newtour.exceptions.BadRegister;
import co.com.prueba.demoaut.newtour.tasks.NewtourSectionRegister;
import co.com.prueba.demoaut.newtour.tasks.RegisterAccountNewTour;
import co.com.prueba.demoaut.newtour.userinterface.NewtourHomePage;
import co.com.prueba.demoaut.newtour.questions.InDashboard;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.serenitybdd.screenplay.actions.Open;
import net.thucydides.core.annotations.Managed;
import org.openqa.selenium.WebDriver;

import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;

public class RegisterNewtourStepDefinitions {
    @Managed(driver = "chrome")
    private WebDriver hisDriver;
    private Actor USER = Actor.named("user");
    private NewtourHomePage newtourHomePage;

    @Before
    public void prepareStage(){
        USER.can(BrowseTheWeb.with(hisDriver));
    }

    @Given("^user wants to looking for flights$")
    public void userWantsToLookingForFlights() {
        USER.attemptsTo(Open.browserOn(newtourHomePage));
        USER.attemptsTo(NewtourSectionRegister.newtourSectionRegister());
    }


    @When("^user creates a new account$")
    public void userCreatesANewAccount() {
        USER.wasAbleTo(RegisterAccountNewTour.registerAccountNewTour());
    }

    @Then("^user should see the confirmation of registration$")
    public void userShouldSeeTheConfirmationOfRegistration() {
        USER.should(seeThat(InDashboard.name()).orComplainWith(BadRegister.class));
    }

}
