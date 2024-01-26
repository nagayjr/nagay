////package definitions;
////
////import cucumber.api.java.en.And;
////import cucumber.api.java.en.Given;
////import cucumber.api.java.en.Then;
////import org.openqa.selenium.*;
////import org.openqa.selenium.chrome.ChromeDriver;
////
////import java.util.List;
////
////import static org.assertj.core.api.Assertions.assertThat;
////import static support.TestContext.driver;
////import static support.TestContext.getDriver;
////
////public class CustomStepdefs {
//    @Given("client open web page")
//    public void clientOpenWebPage() throws InterruptedException {
//        getDriver().navigate().to("https://google.com");
//        Thread.sleep(2000);
//        WebElement searchBar = getDriver().findElement(By.xpath("//textarea[@name='q']"));
//        searchBar.sendKeys("Portnov");
//        searchBar.sendKeys(Keys.RETURN);
//        Thread.sleep(1000);
//        getDriver().navigate().back();
//        Thread.sleep(1000);
//        getDriver().navigate().forward();
//        Thread.sleep(1000);
//        getDriver().navigate().refresh();
//        Thread.sleep(1000);
//    }
//
//
//    @Given("client open portnov web page")
//    public void clientOpenPortnovWebPage() {
//        getDriver().get("https://portnov.com");
//    }
//
//    @Then("client set browser size to mobile")
//    public void clientSetBrowserSizeToMobile() {
//        getDriver().manage().window().setSize(new Dimension(980, 600));
//        WebElement headerBar = getDriver().findElement(By.xpath("//div[@id='header-bar-desktop']"));
//        boolean headerBarDisplayed = headerBar.isDisplayed();
//        assertThat(headerBarDisplayed).isFalse();
//    }
//
//    @Given("client open test url for the form")
//    public void clientOpenTestUrlForTheForm() {
//        getDriver().get("https://testautomationpractice.blogspot.com/2018/09/automation-form.html");
//    }
//
//    @And("I type {string} into all input fields")
//    public void iTypeIntoAllInputFields(String inputString) {
//        List<WebElement> webElementList = getDriver().findElements(By.xpath("//input[@type='text']"));
//        for (WebElement we : webElementList) {
//            we.sendKeys(inputString);
//        }
//    }
//
//    @Then("I search for the element")
//    public void iSearchForTheElement() {
//        WebElement we = getDriver().findElement(By.id("name"));
//        WebElement we2 = getDriver().findElement(By.cssSelector("#name"));
//        WebElement iframe = getDriver().findElement(By.tagName("iframe"));
//    }
//
//    @Given("client open url for the form")
//    public void clientOpenUrlForTheForm() {
//        System.setProperty("webdriver.chrome.driver", "path/to/chromedriver.exe");
//
//        import org.openqa.selenium.WebDriver;
//        import org.openqa.selenium.chrome.ChromeDriver;
//        import io.cucumber.java.en.Given;
//
//        public class MyStepDefinitions {
//            private WebDriver driver;
//        }
//driver
//
//    @Then("I search for the element")
//        public void iSearchForTheElement() {
//            WebElement we = (WebElement) new ChromeDriver();
//            getDriver().get("http://quote-stage.portnov.com");
//            System.setProperty("webdriver.chrome.driver", "path/to/chromedriver");
//            ChromeDriver chromedriver = new ChromeDriver();
//            ChromeDriver.get("http://quote-stage.portnov.com");
//
//            WebDriver driver = null;
//            WebElement elementById = driver.findElement(By.id("someId"));
//            WebElement elementByClassName = driver.findElement(By.className("someClassName"));
//            WebElement elementByName = driver.findElement(By.name("someName"));
//            WebElement elementByXPath = driver.findElement(By.xpath("//xpath/to/some/element"));
//        }
//
//}
//
//
//
//
//
