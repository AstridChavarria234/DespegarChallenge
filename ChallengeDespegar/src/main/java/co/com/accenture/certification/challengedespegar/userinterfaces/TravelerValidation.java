package co.com.accenture.certification.challengedespegar.userinterfaces;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;

public class TravelerValidation extends PageObject  {
	
	
	
	public static final Target VALIDATION_NAME = Target.the("select validation name").locatedBy("//div/ul/li/div/div[1]/span[contains(text(),'Astrid')]");
	public static final Target VALIDATION_LASTNAME = Target.the("select validation lastname").locatedBy("//div/ul/li/div/div[2]/span[contains(text(),'Chavarria')]");
	
}
