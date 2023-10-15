package StringUtility;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class StepDefinitions {
    private final StringUtility stringUtility = new StringUtility();
    private String phrase;
    private String actualAnswer;

    @Given("I have a string {string}")
    public void iHaveAString(String phrase) {
        this.phrase = phrase;
    }

    @When("I reverse the string")
    public void iReverseTheString() {
        actualAnswer = stringUtility.reverse(phrase);
    }

    @When("I capitalize the string")
    public void iCapitalizeTheString() {
        actualAnswer = stringUtility.capitalize(phrase);
    }

    @When("I lowercase the string")
    public void iLowercaseTheString() {
        actualAnswer = stringUtility.lowercase(phrase);
    }

    @Then("I get {string}")
    public void iGet(String expectedAnswer) {
        assertEquals(expectedAnswer, actualAnswer);
    }


}
