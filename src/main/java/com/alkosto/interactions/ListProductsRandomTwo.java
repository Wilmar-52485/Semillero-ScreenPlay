package com.alkosto.interactions;

import net.serenitybdd.core.pages.WebElementFacade;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.Performable;

import java.util.List;
import java.util.Random;

import static com.alkosto.UI.ListProducts.LBL_PRODUCTS;
import static net.serenitybdd.screenplay.Tasks.instrumented;

public class ListProductsRandomTwo implements Interaction {

    @Override
    public <T extends Actor> void performAs(T actor) {
        List<WebElementFacade> listSongs = LBL_PRODUCTS.resolveAllFor(actor);
        Random random = new Random();
        int indexRandom = random.nextInt(listSongs.size());
        actor.remember("products2", listSongs.get(indexRandom).getText());
        listSongs.get(indexRandom).click();
    }

    public static Performable clickTwo() {
        return instrumented(ListProductsRandomTwo.class);
    }
}
