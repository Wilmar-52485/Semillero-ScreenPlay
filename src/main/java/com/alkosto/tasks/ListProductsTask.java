package com.alkosto.tasks;

import com.alkosto.interactions.ListProductsRandom;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;

import static net.serenitybdd.screenplay.Tasks.instrumented;

public class ListProductsTask implements Task {
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                ListProductsRandom.click()
        );
    }
    public static ListProductsTask select(){
        return instrumented(ListProductsTask.class);
    }
}
