package co.com.accenture.certification.challengedespegar.stepdefinitions;

import net.serenitybdd.screenplay.abilities.BrowseTheWeb;

import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;
import net.thucydides.core.annotations.Managed;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;
import org.openqa.selenium.WebDriver;

import co.com.accenture.certification.challengedespegar.questions.ValidateData;
import co.com.accenture.certification.challengedespegar.tasks.InsertFlightData;
import co.com.accenture.certification.challengedespegar.tasks.InsertTravelerData;
import co.com.accenture.certification.challengedespegar.tasks.Navigate;
import co.com.accenture.certification.challengedespegar.userinterfaces.OptionPage;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;

public class FlightReserveStepDefinition {

	@Managed(driver = "chrome")
	private WebDriver herBrowser;
	
  
	
	@Before
	public void setUp() {
		  OnStage.setTheStage(new OnlineCast());
	        OnStage.theActorCalled("Astrid").can(
	        BrowseTheWeb.with(herBrowser));

	 
	}
	
	@Given("^that Actor wants to look for a one way flight$")
	public void thatActorWantsToLookForAOneWayFlight() throws Exception {
	    
		theActorInTheSpotlight().wasAbleTo(Navigate.in(OptionPage.Despegar));
	 
	}


	@When("^Actor insert \"([^\"]*)\" , \"([^\"]*)\" , \"([^\"]*)\" and \"([^\"]*)\" of the flight$")
	public void actorInsertAndOfTheFlight(String originCity, String destinationCity, String departureDate, String returnDate) throws Exception {
	    
		theActorInTheSpotlight().attemptsTo(InsertFlightData.withTheInformation(originCity,destinationCity,departureDate,returnDate));
	}

	@When("^Actor insert your \"([^\"]*)\" , \"([^\"]*)\" , \"([^\"]*)\" , \"([^\"]*)\" , \"([^\"]*)\" , \"([^\"]*)\", \"([^\"]*)\", \"([^\"]*)\",\"([^\"]*)\"$")
	public void actorInsertYour(String name, String lastName, String identification, String department, String city, String adress, String day,String month,String year) throws Exception {
	   
		theActorInTheSpotlight().attemptsTo(InsertTravelerData.yourBasicInformation(name,lastName,identification,department,city,adress,day,month,year));
	}

	
	
	@Then("^Actor should see your \"([^\"]*)\" and \"([^\"]*)\" on screen$")
	public void actorShouldSeeYourAndOnScreen(String name, String lastName) throws Exception {
		
		theActorInTheSpotlight().should(seeThat(ValidateData.data(name, lastName)));
		
	}

	
}

