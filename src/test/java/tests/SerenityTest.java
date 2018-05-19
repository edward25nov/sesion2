package tests;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.*;

import app.WebDriverCreator;
import net.serenitybdd.core.Serenity;
import net.serenitybdd.junit.runners.SerenityRunner;
import net.thucydides.core.annotations.Managed;
import net.thucydides.core.annotations.Steps;
import net.thucydides.core.annotations.Title;

@RunWith(SerenityRunner.class)
public class SerenityTest {

	@Managed(driver = "chrome")
	WebDriver driver;
	
	@Steps
	steps.LoginSteps pasos;
	
	
	@Test
	@Title("LOGIN PAGE")
	public void _loginTest() 
	{ //  ChromeOptions p = new ChromeOptions();
		//p.addArguments("");
		pasos.gotoLogin();
		pasos.setusername();
		pasos.setpass1();
		pasos.setpass2();
		pasos.submit();
	}
	
}
