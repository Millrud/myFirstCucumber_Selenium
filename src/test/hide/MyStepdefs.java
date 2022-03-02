import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.cucumber.java.After;
import io.cucumber.java.Before;


import static org.junit.Assert.assertEquals;

public class MyStepdefs {

    private Calculator calc;

    @Before
    public void someBackground() {
        calc = new Calculator();

    }
    @After
    public void somethingAfter (){
        System.out.println("After");
    }
    @Given("I have first number {double}")
    public void iHaveFirstNumber(double firstNumber) {

        calc.addFirstNumber(firstNumber);

    }

    @Given("I have second number {double}")
    public void iHaveSecondNumber(double secondNumber) {
        calc.addSecondNumber(secondNumber);
    }

    @When("I add the two numbers")
    public void iAddTheTwoNumbers() {
        calc.add();
    }

    @When("I subtract the two numbers")
    public void iSubtractTheTwoNumbers() {
        calc.sub();
    }

    @When("I multiply the two numbers")
    public void iMultiplyTheTwoNumbers() {
        calc.mult();
    }

    @Then("I get the result {double}")
    public void iGetTheResult(double expected) {
        double actual = calc.getResult();
        System.out.println(expected);
        assertEquals(expected, actual, 0.001);
    }


    @When("I divide the two numbers")
    public void iDivideTheTwoNumbers() {
        calc.divide();

    }

    @And("I have third number")
    public void iHaveThirdNumber(double third) {
        calc.addThirdNumber(third);
    }

    @When("I add the three numbers")
    public void iAddTheThreeNumbers() {
        calc.addThreeNumbers();
    }

    @Given("my name is {string}")
    public void myNameIs(String name) {
        System.out.println("This is my name: " + name);
    }

    @When("I ask to print my name")
    public void iAskToPrintMyName() {

    }

    @Then("{string} is printed")
    public void isPrinted(String name) {
        System.out.println("Your name was: " + name);
    }


}