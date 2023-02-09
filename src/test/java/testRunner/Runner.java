package testRunner;
import org.junit.runner.RunWith;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
@RunWith(Cucumber.class)
@CucumberOptions(
   //path of feature file
   features = "C:/Users/Monika/eclipse-workspace/com.mavenproject/Features/Login.feature",
   //path of step definition file
   glue = {"stepDefinitions"},publish = true 
   )

public class Runner {
}