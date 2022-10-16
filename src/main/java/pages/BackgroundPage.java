package pages;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.Color;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;



public class BackgroundPage {

	WebDriver driver;
	
	public void BackgroundPage(WebDriver driver) {
		this.driver = driver;
	}

	//Web Elements
	@FindBy(how = How.XPATH, using = "//button[contains(text(),'Set SkyBlue Background')]")WebElement SKYBLUE_BUTTON_ELEMENT;
	@FindBy(how = How.XPATH, using = "//button[contains(text(),'Set White Background')]")WebElement WHITE_BUTTON_ELEMENT;
	@FindBy(how = How.XPATH, using = "//body")WebElement BACKGROUND_ELEMENT;
//	@FindBy(how = How.XPATH, using = "//body[@style='background-color: white;']")WebElement WHITE_BACKGROUND_ELEMENT;
	
	
	public void changeColorToSkyBlue() {
		SKYBLUE_BUTTON_ELEMENT.click();
		System.out.println("Clicked on SkyBlue Button");
	}

	public void changeColorToWhite() {
		WHITE_BUTTON_ELEMENT.click();
		System.out.println("Clicked on White Button");
	}
	
	public boolean SkyBlueButtonDisplayStatus() {
		return SKYBLUE_BUTTON_ELEMENT.isDisplayed();
	}
	
	public boolean WhiteButtonDisplayStatus() {
		return WHITE_BUTTON_ELEMENT.isDisplayed();
	}

	public boolean verifySkyBlueBackgroundColor() {
		String expectedColor = "#87CEEB";
		String backgroundColor = BACKGROUND_ELEMENT.getCssValue("background-color");
		String actualColor = Color.fromString(backgroundColor).asHex();
		//Assert.assertEquals("Background Colors don't match!!", expectedColor, actualColor);
		if (expectedColor.equalsIgnoreCase(actualColor)) {
			return true;
		}else {
			return false;
		}
	}
	public boolean verifyWhiteBackgroundColor() {
		String expectedColor = "#FFFFFF";
		String backgroundColor = BACKGROUND_ELEMENT.getCssValue("background-color");
		String actualColor = Color.fromString(backgroundColor).asHex();
		//Assert.assertEquals("Background Colors don't match!!", expectedColor, actualColor);
		if (expectedColor.equalsIgnoreCase(actualColor)) {
			return true;
		}else {
			return false;
		}
	}
	

}

