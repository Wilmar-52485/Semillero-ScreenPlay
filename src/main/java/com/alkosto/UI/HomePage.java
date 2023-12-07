package com.alkosto.UI;

import net.serenitybdd.screenplay.targets.Target;

public class HomePage {
    public static Target INPUT_SEARCH = Target.the("explorer").
            locatedBy("//input[@id='js-site-search-input']");
}
