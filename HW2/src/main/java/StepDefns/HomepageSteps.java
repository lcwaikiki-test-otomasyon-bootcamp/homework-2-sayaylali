package StepDefns;

import Pages.HomePage;
import Util.DriverFact;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;


import java.util.concurrent.TimeUnit;

public class HomepageSteps {
    DriverFact driverFact = new DriverFact();
    WebDriver driver = driverFact.getDriver();
    HomePage element = new HomePage(driver);
    @Given("Homepage opens")
    public void homepageOpens() {
        driver.get("https://www.sahibinden.com/");
        driver.manage().window().maximize();
        driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    }
    @When("Click Konut on Emlak List")
    public void clickKonutOnEmlakList() {
        element.konutClick();
    }

    @Then("Check Searchpage opens")
    public void checkSearchpageOpens() {

    }

    @When("Click Satilik combobox")
    public void clickSatilikCombobox() {
        element.satilikClick();
    }

    @When("Click Kiralik on combobox")
    public void clickKiralikOnCombobox() {
        element.kiralikClick();
    }


    @When("Write {string} on Max TL textbox")
    public void writeDortbinOnMaxTLTextbox(String maxRent ) {
        element._typeMaxRent(maxRent);
    }

    @When("Click Ara button")
    public void clickAraButton() {
        element.clickSearch();
    }

    @Then("Check Resultpage opens")
    public void checkResultpageOpens() {
    }

    @When("Click Il combobox")
    public void clickIlCombobox() {
        element.clickSaveSearch();
        element.clickIlCombo();

    }

    @When("Filter and select {string}")
    public void clickcityName(String cityName)
    {
        element.clickcityName(cityName);
    }

    @When("Click Filter Ara button")
    public void clickFilterAraButton() {
        element.clickFiltersearch();
    }

    @Then("Check Resultpage updated")
    public void checkResultpageUpdated() {
        driver.quit();
    }
}
