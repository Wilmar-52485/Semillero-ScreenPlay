package com.alkosto.UI;

import net.serenitybdd.screenplay.targets.Target;

public class ListProducts {
    public static Target LBL_PRODUCTS = Target.the("products list")
            .locatedBy("(//h3[@class='product__item__top__title'])");
}
