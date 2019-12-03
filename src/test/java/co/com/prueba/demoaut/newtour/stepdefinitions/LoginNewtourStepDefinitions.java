package co.com.prueba.demoaut.newtour.stepdefinitions;

import co.com.prueba.demoaut.newtour.exceptions.BadLogin;
import co.com.prueba.demoaut.newtour.exceptions.BadRegister;
import co.com.prueba.demoaut.newtour.questions.InDashboard;
import co.com.prueba.demoaut.newtour.questions.InDashboardLogin;
import co.com.prueba.demoaut.newtour.tasks.LoginAccountNewTour;
import co.com.prueba.demoaut.newtour.tasks.NewtourSectionLogin;
import co.com.prueba.demoaut.newtour.tasks.NewtourSectionRegister;
import co.com.prueba.demoaut.newtour.tasks.RegisterAccountNewTour;
import co.com.prueba.demoaut.newtour.userinterface.NewtourHomePage;
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


public class LoginNewtourStepDefinitions {
    @Managed(driver = "chrome")
    private WebDriver hisDriver;
    private Actor USER = Actor.named("user");
    private NewtourHomePage newtourHomePage;

    @Before
    public void prepareStage(){
        USER.can(BrowseTheWeb.with(hisDriver));
    }

    @Given("^user wants to looking for flight$")
    public void userWantsToLookingForFlight() {
        USER.attemptsTo(Open.browserOn(newtourHomePage));
        USER.attemptsTo(NewtourSectionLogin.newtourSectionLogin());
    }

    @When("^user make login$")
    public void userMakeLogin() throws Exception {
        USER.wasAbleTo(LoginAccountNewTour.loginAccountNewTour());
    }


    @Then("^user should see the dashboard$")
    public void userShouldSeeTheDashboard() throws Exception {
        USER.should(seeThat(InDashboardLogin.name()).orComplainWith(BadLogin.class));
        System.out.println("Terminó login");
    }
}
