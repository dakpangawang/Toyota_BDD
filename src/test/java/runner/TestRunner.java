package runner;

import org.junit.runner.RunWith;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions( tags = "@smoke",
                  features = {"src/test/java/features/"},
                  glue = {"toyota.bdd.base","stepdef"},
                  monochrome = false,
                  dryRun = false,
                  plugin = {"pretty","html:target/report.html", "json:target/report_jason.json", "junit:target/report.xml"})
public class TestRunner {

}
