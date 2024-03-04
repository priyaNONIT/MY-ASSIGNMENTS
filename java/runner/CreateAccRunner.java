package runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;
@CucumberOptions(features={"src/main/java/feature"},
                    glue={"steps","hooks"},
                    monochrome=true,
                    publish=true,
                    tags="@smoke or @functional")
public class CreateAccRunner extends AbstractTestNGCucumberTests{

}
