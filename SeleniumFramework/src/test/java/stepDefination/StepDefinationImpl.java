package stepDefination;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;

public class StepDefinationImpl {
    private String testPalindrome;
    private boolean isPalindrome;

    @Given("I entered string {string}")
    public void i_entered_string(String toTest) {

        testPalindrome = toTest;

    }

    @When("I test it for Palindrome")
    public void i_test_it_for_palindrome() {
        isPalindrome = testPalindrome.equalsIgnoreCase(new StringBuilder(testPalindrome).reverse().toString());
    }

    @Then("the result should be {string}")
    public void the_result_should_be(String result) {

        boolean expectedResult = Boolean.parseBoolean(result);
        if (expectedResult) {
            Assert.assertTrue(isPalindrome);
        } else {
            Assert.assertFalse(isPalindrome);
        }
    }

    @Given("Login to application")
    public void loginToApplication() {
        System.out.println("Login to application - username and password");
    }

}
