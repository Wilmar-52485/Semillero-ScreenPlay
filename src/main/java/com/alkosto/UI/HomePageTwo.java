package com.alkosto.UI;

import net.serenitybdd.screenplay.targets.Target;

public class HomePageTwo {
    public static Target INPUT_SEARCH_TWO = Target.the("explorer two")
            .locatedBy("//input[@class='form-control js-site-search-input-algolia']");
}
