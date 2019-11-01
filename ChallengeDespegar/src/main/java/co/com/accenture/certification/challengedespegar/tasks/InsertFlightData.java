package co.com.accenture.certification.challengedespegar.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.waits.WaitUntil;

import  static net.serenitybdd.screenplay.Tasks.instrumented;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;

import co.com.accenture.certification.challengedespegar.interactions.Scroll;
import co.com.accenture.certification.challengedespegar.interactions.WaitSeconds;
import co.com.accenture.certification.challengedespegar.userinterfaces.FlightReserve;


public class InsertFlightData implements Task{
	
	private String originCity;
	private String destinationCity;
	private String departureDate;
	private String returnDate;
	
	 
	
	
	
	public InsertFlightData(String originCity, String destinationCity, String departureDate, String returnDate) {
		this.originCity = originCity;
		this.destinationCity = destinationCity;
		this.departureDate = departureDate;
		this.returnDate = returnDate;
	}

	
	
	
	@Override
	public <T extends Actor> void performAs(T actor) {
		

	
		actor.attemptsTo(Click.on(FlightReserve.FLIGHT),Click.on(FlightReserve.SOURCE_CITY),
				Enter.theValue(originCity).into(FlightReserve.SOURCE_CITY),
				Click.on(FlightReserve.CHOOSE_SOURCE_CITY), Click.on(FlightReserve.DESTINATION_CITY),
				Enter.theValue(destinationCity).into(FlightReserve.DESTINATION_CITY),
				Click.on(FlightReserve.CHOOSE_DESTINATION_CITY),
				Click.on(FlightReserve.DEPARTURE_DATE),
				Click.on(FlightReserve.CHOOSE_DAY_DEPARTURE.of(departureDate)),
                Click.on(FlightReserve.CHOOSE_DAY_RETURN.of(returnDate)),
				Click.on(FlightReserve.SEARCH));
		
		   WaitUntil.the(FlightReserve.TITLE, isVisible());
		        actor.attemptsTo( WaitSeconds.inThePage(5),Scroll.to(FlightReserve.SELECT),
		        	            Click.on(FlightReserve.SELECT),WaitSeconds.inThePage(20),
		        	            Scroll.to(FlightReserve.CONTINUE_WITHOUT_LUGGAGE),Click.on(FlightReserve.CONTINUE_WITHOUT_LUGGAGE));
	}

	public static  InsertFlightData withTheInformation(String originCity, String destinationCity, String departureDate, String returnDate){
        return instrumented( InsertFlightData.class,originCity, destinationCity,  departureDate,  returnDate);
    }
}