package com.techprimers.testing;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;


@RunWith(Cucumber.class)
@CucumberOptions(features="src/test/resources",
        plugin = {"json:Reports/json_reports.json",
        "junit:Reports/junit_reports.xml"},
monochrome = true)


public class RunCukes {



}
