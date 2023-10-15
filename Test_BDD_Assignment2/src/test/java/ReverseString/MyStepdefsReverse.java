package ReverseString;

import StringUtilize.Reverse;
import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class MyStepdefsReverse {
    private final Reverse reverse = new Reverse();

    @Given("^I have a string \"([^\"]*)\"$")
    public void iHaveAString(String phrase) throws Throwable {
        phrase = "Hello";
        System.out.println(phrase);
        throw new PendingException();
    }

    @When("^I reverse the string \"([^\"]*)\"$")
    public void iReverseTheString(String phrase) throws Throwable {
        phrase = "hello";
        Reverse.Backwards(phrase);
        throw new PendingException();
    }


    @Then("^I get \"([^\"]*)\"$")
    public void iGet(String arg0) throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        throw new PendingException();
    }
}
