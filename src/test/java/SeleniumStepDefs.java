import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.*;

import static org.junit.Assert.assertEquals;

public class SeleniumStepDefs {

    protected WebDriver driver;

    @Before
    public void someBackground() {

        System.setProperty("webdriver.chrome.driver", "C:/Selenium/chromedriver.exe");
        driver = new ChromeDriver();
        driver.get("https://www.marshu.com/articles/calculate-addition-calculator-add-two-numbers.php");

    }

    @After
    public void somethingAfter() {

        System.out.println("After");
    }

    @Given("I have first number")
    public void iHaveFirstNumber() {

        WebElement textBox = driver.findElement(By.name("n01"));
        textBox.click();
        textBox.sendKeys("40");


    }

    @Given("I have second number")
    public void iHaveSecondNumber() {
        WebElement textBox2 = driver.findElement(By.name("n02"));
        textBox2.click();
        textBox2.sendKeys("20");

    }

    @When("I add the two numbers")
    public void iAddTheTwoNumbers() {

        WebElement button = driver.findElement(By.xpath("/html/body/table/tbody/tr/td[1]/table[2]/tbody/tr[1]/td[2]/table/tbody/tr/td/table/tbody/tr/td/table/tbody/tr/td/form/p[4]/input"));
        button.click();

    }


    @Then("I get the result")
    public void iGetTheResult() {

        WebElement textBox3 = driver.findElement(By.name("answer"));
        int actual = Integer.parseInt(textBox3.getAttribute("value"));
        assertEquals(60, actual);
        driver.quit();

    }

}