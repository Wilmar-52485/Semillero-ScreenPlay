package com.alkosto.questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;

import static com.alkosto.UI.ValidateProduccts.LBL_VALIDATE_PRODUCTS;
import static com.alkosto.UI.ValidateProduccts.LBL_VALIDATE_PRODUCTS_TWO;

public class ValidateProductsCart implements Question {
    @Override
    public Object answeredBy(Actor actor) {
        String product1 = actor.recall("products1");
        String product2 = LBL_VALIDATE_PRODUCTS.resolveFor(actor).getText();
        String product3 = actor.recall("products2");
        String product4 = LBL_VALIDATE_PRODUCTS_TWO.resolveFor(actor).getText();
        return product1.equals(product2) && product3.equals(product4);
    }

    public static Question validate(){
        return new ValidateProductsCart();
    }
}
