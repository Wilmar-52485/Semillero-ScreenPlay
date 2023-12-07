package com.alkosto.UI;

import net.serenitybdd.screenplay.targets.Target;

public class GoCart {
    public static Target BTN_GO_CART = Target.the("go cart")
            .locatedBy("//a[@class='button-primary cart-pop-up-warrantyFooter_cartRedirect js-warrantyRedirect-overlay js-sf-go-to-cart js-animateBeforeSend']");
}
