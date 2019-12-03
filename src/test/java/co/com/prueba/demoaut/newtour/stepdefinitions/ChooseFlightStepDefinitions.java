package co.com.prueba.demoaut.newtour.stepdefinitions;

import co.com.prueba.demoaut.newtour.tasks.ChooseFlightNewTour;
import co.com.prueba.demoaut.newtour.userinterface.NewtourHomePage;
import cucumber.api.java.Before;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;
import net.thucydides.core.annotations.Managed;
import org.openqa.selenium.WebDriver;

public class ChooseFlightStepDefinitions {
    @Managed(driver = "chrome")
    private WebDriver hisDriver;
    private Actor USER = Actor.named("user");
    private NewtourHomePage newtourHomePage;
    private WebDriver.Navigation navigation;

    @Before
    public void setTheStage() {
        OnStage.setTheStage(new OnlineCast());
    }


    @When("^user choose a flight$")
    public void userChooseAFlight() throws Exception {
        System.out.println("Inició choose flight");
        USER.wasAbleTo(ChooseFlightNewTour.chooseFlightNewTour());
    }


    @Then("^user should see the chosen flight$")
    public void userShouldSeeTheChosenFlight() throws Exception {
    }
}
