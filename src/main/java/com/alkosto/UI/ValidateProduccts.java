package com.alkosto.UI;

import net.serenitybdd.screenplay.targets.Target;

public class ValidateProduccts {
    public static Target LBL_VALIDATE_PRODUCTS = Target.the("validate products")
            .locatedBy("(//SPAN[@class='item__name'])[2]");
    public static Target LBL_VALIDATE_PRODUCTS_TWO = Target.the("validate products")
            .locatedBy("(//SPAN[@class='item__name'])[1]");
}
