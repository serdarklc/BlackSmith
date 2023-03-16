package com.blackSmith.step_definitions;

import com.blackSmith.pages.Header;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;


public class HeaderStepDef {

    private Header header = new Header();

    @When("Users should click the link")
    public void users_should_click_the_link() {
        header.getHomePage();
    }

    @Then("Users should reach home page")
    public void users_should_reach_home_page() {
        Assert.assertEquals("BSA Developer Test", header.pageTitle());
    }

    @Then("Users should see the company logo")
    public void users_should_see_the_company_logo() {
        Assert.assertTrue(header.isDisplayLogo());
    }

    @Then("Users should be redirected home page")
    public void usersShouldBeRedirectedHomePage() {
        Assert.assertEquals("BSA Developer Test", header.pageTitle());
    }


    @Then("Users should see the features orderly such as SERVICES+, EXPERIENCE, COMPANY, CAREERS {string}")
    public void usersShouldSeeTheFeaturesOrderlySuchAsSERVICESEXPERIENCECOMPANYCAREERS(String modules) {
        Assert.assertEquals(modules,header.navigateToModule(modules));
    }

    @Then("Users should click the company logo")
    public void usersShouldClickTheCompanyLogo() {
        header.clickLogo();
    }
}
