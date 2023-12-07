package com.alkosto.stepDefinitions;

import com.alkosto.questions.ValidateProductsCart;
import com.alkosto.tasks.*;
import io.cucumber.java.Before;
import io.cucumber.java.en.*;
import io.github.bonigarcia.wdm.WebDriverManager;
import net.serenitybdd.screenplay.actors.OnlineCast;
import org.hamcrest.Matchers;

import java.util.regex.Matcher;

import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.actors.OnStage.*;
public class ProductSelectionStepDefinitions {
    @Before
    public void setUp(){
        WebDriverManager.chromedriver().setup();
        setTheStage(new OnlineCast());
    }
    @Given("the user enters the page")
    public void theUserEntersThePage() {
        theActorCalled("User").wasAbleTo(
                OpenBrowserTask.open()
        );
    }
    @When("you select two products from the menu")
    public void youSelectTwoProductsFromTheMenu() {
        theActorInTheSpotlight().attemptsTo(
                SearchProductsTask.search(),
                ListProductsTask.select(),
                AddCartTask.on(),
                SearchProductsTwoTask.searchTwo(),
                ListProductsTwoTask.selectTwo(),
                AddCartTwoTask.on()
        );
    }
    @Then("Then the user will be able to validate that the products are in the shopping cart")
    public void thenTheUserWillBeAbleToValidateThatTheProductsAreInTheShoppingCart() {
        theActorInTheSpotlight().should(
                seeThat(
                        ValidateProductsCart.validate(),
                        Matchers.equalTo(true)
                )
        );
    }
}