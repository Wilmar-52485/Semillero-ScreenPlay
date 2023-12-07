package com.alkosto.tasks;

import com.alkosto.interactions.ListProductsRandomTwo;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;

import static net.serenitybdd.screenplay.Tasks.instrumented;

public class ListProductsTwoTask implements Task {

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                ListProductsRandomTwo.clickTwo()
        );
    }
    public static ListProductsTwoTask selectTwo(){
        return instrumented(ListProductsTwoTask.class);
    }
}
