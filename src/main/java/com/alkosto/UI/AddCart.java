package com.alkosto.UI;

import net.serenitybdd.screenplay.targets.Target;

public class AddCart {
    public static Target BTN_ADD_CART = Target.the("add products")
            .locatedBy("//button[@class='button-primary js-add-to-cart js-enable-btn text-default']");
}
