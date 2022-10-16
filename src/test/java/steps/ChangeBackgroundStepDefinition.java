package steps;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import junit.framework.Assert;
import pages.BackgroundPage;
import util.BrowserFactory;

public class ChangeBackgroundStepDefinition {

	static WebDriver driver;
	BackgroundPage backgroundPage;

	public void ChangeBackgroundStepDefinition(WebDriver driver) {
		this.driver = driver;
	}

	@Before
	public void setUp() {
		driver = BrowserFactory.driverInit();
		backgroundPage = PageFactory.initElements(driver, BackgroundPage.class);
	}

	@Given("^User is on the Background color testing page$")
	public void user_is_on_the_Background_color_testing_page() {
		driver = BrowserFactory.getUrl();
	}

	

	@Given("^Set SkyBlue Background Button Exists$")
	public void set_SkyBlue_Background_Button_Exists() {
		
		Assert.assertTrue("SkyBlue Button Does Not Exist!!!", backgroundPage.SkyBlueButtonDisplayStatus());
	}

	@When("^User clicks on the SkyBlue Button$")
	public void user_clicks_on_the_SkyBlue_Button() {
		
		backgroundPage.changeColorToSkyBlue();
	}

	@Then("^The background color will change to SkyBlue$")
	public void the_background_color_will_change_to_SkyBlue() {
		Assert.assertTrue("Backgroud colors don't match!!", backgroundPage.verifySkyBlueBackgroundColor());
	}

	@Given("^Set SkyWhite Background button exists$")
	public void set_SkyWhite_Background_button_exists() {
		Assert.assertTrue("White Button Does Not Exist!!", backgroundPage.WhiteButtonDisplayStatus());
	}

	@When("^User clicks on the SkyWhite button$")
	public void user_clicks_on_the_SkyWhite_button() {
		backgroundPage.changeColorToWhite();
	}

	@Then("^The background color will change to SkyWhite$")
	public void the_background_color_will_change_to_SkyWhite() {
		Assert.assertTrue("Backgroud colors don't match!!", backgroundPage.verifyWhiteBackgroundColor());
	}
	
	
	@After
	public void tearDown() {
		driver.close();
		driver.quit();
	}
}
