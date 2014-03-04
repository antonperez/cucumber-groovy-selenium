package cucumber.steps.support

import org.openqa.selenium.WebDriver
import org.openqa.selenium.firefox.FirefoxDriver


class TestEnvironment {
    WebDriver driver

    TestEnvironment() {}

    WebDriver loadEnvironment() {
        readCommandLineArguments()
        loadConfiguration()
        return loadSelenium()
    }

    private void readCommandLineArguments() {
        // read from command line
    }

    private void loadConfiguration() {
        // load config file
    }

    @SuppressWarnings("GrMethodMayBeStatic")
    private WebDriver loadSelenium() {
        return new FirefoxDriver()
    }
}
