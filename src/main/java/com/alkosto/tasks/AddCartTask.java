package com.alkosto.tasks;

import com.alkosto.interactions.ContinueBuying;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;

import static com.alkosto.UI.AddCart.BTN_ADD_CART;
import static net.serenitybdd.screenplay.Tasks.instrumented;

public class AddCartTask implements Task {
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(BTN_ADD_CART),
                ContinueBuying.back()
        );
    }
    public static AddCartTask on(){
        return instrumented(AddCartTask.class);
    }
}
