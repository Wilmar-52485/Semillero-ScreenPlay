package com.alkosto.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;

import static com.alkosto.UI.AddCart.BTN_ADD_CART;
import static com.alkosto.UI.GoCart.BTN_GO_CART;
import static net.serenitybdd.screenplay.Tasks.instrumented;

public class AddCartTwoTask implements Task {
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(BTN_ADD_CART),
                Click.on(BTN_GO_CART)
        );
    }
    public static AddCartTwoTask on(){
        return instrumented(AddCartTwoTask.class);
    }
}
