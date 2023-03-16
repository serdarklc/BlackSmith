package com.blackSmith.runners;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)

@CucumberOptions(
        plugin = {"html:target/failed-report.html"},
        features = "@target/rerun.txt",
        glue = "com/cloudMore/step_definitions"
)

public class FailedCukesRunner {

}
