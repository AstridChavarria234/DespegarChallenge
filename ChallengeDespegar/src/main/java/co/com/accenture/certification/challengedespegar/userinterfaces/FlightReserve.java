package co.com.accenture.certification.challengedespegar.userinterfaces;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;

public class FlightReserve extends PageObject {
	
	public static final Target FLIGHT = Target.the("Select the option flight").locatedBy("(//*[@class='shifu-3-button-circle FLIGHTS '])[1]");
	public static final Target SOURCE_CITY = Target.the("Select  source city").locatedBy("//*[@class='input-tag sbox-main-focus sbox-bind-reference-flight-roundtrip-origin-input sbox-primary sbox-places-first places-inline']");
	public static final Target CHOOSE_SOURCE_CITY= Target.the("Select  new source city").locatedBy("//*[@class='item -active']");
	public static final Target DESTINATION_CITY = Target.the("Select destination city").locatedBy("//*[@class='input-tag sbox-main-focus sbox-bind-reference-flight-roundtrip-destination-input sbox-secondary sbox-places-second places-inline']");
	public static final Target CHOOSE_DESTINATION_CITY= Target.the("Select choose city").locatedBy("//*[@class='item-text']");
	public static final Target DEPARTURE_DATE = Target.the("Select the departure date").locatedBy("//*[@class='input-container sbox-bind-event-click-start-date']");
	public static final Target CHOOSE_DAY_DEPARTURE= Target.the("Select the departure day").locatedBy("(//div[4]/div/div[5]/div[2]/div[4]/span[1]/span[1])[contains(text(),'{0}')]");
	public static final Target RETURN_DATE = Target.the("Select the return date").locatedBy("//*[@class='input-container sbox-bind-event-click-end-date']");
	public static final Target CHOOSE_DAY_RETURN= Target.the("Select the return day").locatedBy("(//div[4]/div/div[5]/div[2]/div[4]/span[8]/span[1])[contains(text(),'{0}')]");
	public static final Target SEARCH= Target.the("Select search button").locatedBy("//*[@class='sbox-button -ml3-l -mt5-l']");
	public static final Target TITLE= Target.the("See title cheaper flight").locatedBy("//*[@class='sbox-title-container -mb5 -hide-in-modal']");
    public static final Target SELECT =Target.the("Select the flight").locatedBy("(//*[@class='-md eva-3-btn -primary'])[1]");
	public static final Target CONTINUE_WITHOUT_LUGGAGE = Target.the("Select CONTINUAR SIN EQUIPAJE button").locatedBy("//a[@class='eva-3-btn-ghost -lg btn-no ubp-button-continue']");
	
}
