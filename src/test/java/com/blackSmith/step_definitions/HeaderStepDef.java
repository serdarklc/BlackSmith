package com.blackSmith.step_definitions;

import com.blackSmith.pages.Header;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import lombok.extern.log4j.Log4j;
import org.junit.Assert;

@Log4j
public class HeaderStepDef {

    private Header header = new Header();

    @When("Users should click the link")
    public void users_should_click_the_link() {
        log.info("Navigating to homepage");
        header.getHomePage();
    }

    @Then("Users should reach home page")
    public void users_should_reach_home_page() {
        log.info("Comparing between current page title and actual title");
        Assert.assertEquals("BSA Developer Test", header.pageTitle());
    }

    @Then("Users should see the company logo")
    public void users_should_see_the_company_logo() {
        log.info("Verifying that Company Logo is display or not");
        Assert.assertTrue(header.isDisplayLogo());
    }

    @Then("Users should be redirected home page")
    public void usersShouldBeRedirectedHomePage() {
        log.info("Comparing between current page title and actual title");
        Assert.assertEquals("BSA Developer Test", header.pageTitle());
    }

    @Then("Users should see the features orderly such as SERVICES+, EXPERIENCE, COMPANY, CAREERS {string}")
    public void usersShouldSeeTheFeaturesOrderlySuchAsSERVICESEXPERIENCECOMPANYCAREERS(String modules) {
        log.info("Checking nav-menus order");
        Assert.assertEquals(modules, header.navigateToModule(modules));
    }

    @Then("Users should click the company logo")
    public void usersShouldClickTheCompanyLogo() {
        log.info("Clicking the Company Logo");
        header.clickLogo();
    }
}
