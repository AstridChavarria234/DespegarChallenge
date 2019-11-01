package co.com.accenture.certification.challengedespegar.tasks;

import co.com.accenture.certification.challengedespegar.userinterfaces.OptionPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Open;

import static net.serenitybdd.screenplay.Tasks.instrumented;

public class Navigate  implements Task {

	private final OptionPage optionPage;

    public Navigate(OptionPage optionPage) {
        this.optionPage = optionPage;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Open.url(optionPage.url()));
        
    }
    
     public static Navigate in(OptionPage optionPage) {
            return instrumented(Navigate.class, optionPage);
        }
	
	

}
