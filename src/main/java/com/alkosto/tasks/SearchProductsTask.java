package com.alkosto.tasks;


import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import org.openqa.selenium.Keys;

import static com.alkosto.UI.HomePage.INPUT_SEARCH;
import static net.serenitybdd.screenplay.Tasks.instrumented;

public class SearchProductsTask implements Task {
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(INPUT_SEARCH),
                Enter.theValue("tv").into(INPUT_SEARCH).thenHit(Keys.ENTER)
        );
    }
    public static SearchProductsTask search(){
        return instrumented(SearchProductsTask.class);
    }
}
