package co.com.accenture.certification.challengedespegar.questions;


import co.com.accenture.certification.challengedespegar.userinterfaces.TravelerValidation;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;

public class ValidateData  implements Question<Boolean>  {
	
	
	private String name; 
	private String lastName; 

	public ValidateData(String name, String lastName) {
		this.name= name; 
		this.lastName = lastName; 
	}


	@Override
	public Boolean answeredBy(Actor actor) {
	
		String val_name=Text.of(TravelerValidation.VALIDATION_NAME).viewedBy(actor).asString(); 
		String val_lastName= Text.of(TravelerValidation.VALIDATION_LASTNAME).viewedBy(actor).asString();
		
		return(val_name.equalsIgnoreCase(name) && val_lastName.equalsIgnoreCase(lastName)); 

	}
	
	
	 public static  ValidateData data(String name,String lastName){
	        return new ValidateData(name,lastName);

}
	 
}
