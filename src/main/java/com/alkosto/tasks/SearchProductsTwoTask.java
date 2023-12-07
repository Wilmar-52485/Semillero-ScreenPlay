package com.alkosto.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import org.openqa.selenium.Keys;

import static com.alkosto.UI.HomePageTwo.INPUT_SEARCH_TWO;
import static net.serenitybdd.screenplay.Tasks.instrumented;

public class SearchProductsTwoTask implements Task {
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(INPUT_SEARCH_TWO),
                Enter.theValue("tv").into(INPUT_SEARCH_TWO).thenHit(Keys.ENTER)
        );
    }
    public static SearchProductsTwoTask searchTwo(){
        return instrumented(SearchProductsTwoTask.class);
    }
}
