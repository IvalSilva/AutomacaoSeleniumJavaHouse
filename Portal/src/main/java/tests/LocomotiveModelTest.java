package tests;

import org.junit.Test;

import core.BasePage;
import pages.LocomotiveModelPage;
import pages.MenuPage;
import org.junit.FixMethodOrder;
import org.junit.runners.MethodSorters;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import core.DriverFactory;;
@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class LocomotiveModelTest extends BasePage{
	MenuPage menuPage = new MenuPage();
	LocomotiveModelPage locomotivemodelPage = new LocomotiveModelPage();
	DriverFactory jse = new DriverFactory();
	
	@Test
	public void test1_locomotivemodel() throws InterruptedException{
		menuPage.acessarTelaLocomotiveModel();
		
		locomotivemodelPage.setConsumoLowIdle("1000");;
		locomotivemodelPage.setConsumoIdle("2000");
		locomotivemodelPage.setConsumoDinamico("3000");
		locomotivemodelPage.setConsumoPonto1("100");
		locomotivemodelPage.setConsumoPonto2("200");
		locomotivemodelPage.setConsumoPonto3("300");
		locomotivemodelPage.setConsumoPonto4("400");
		locomotivemodelPage.setConsumoPonto5("500");
		locomotivemodelPage.setConsumoPonto6("600");
		locomotivemodelPage.setConsumoPonto7("700");
		locomotivemodelPage.setConsumoPonto8("800");

		locomotivemodelPage.setCodigo("10");
		locomotivemodelPage.setPeso("1000");
		locomotivemodelPage.setComprimento("2000");
		locomotivemodelPage.setPolosTaco("120");
		locomotivemodelPage.setDiametroRoda("90");
		locomotivemodelPage.setPotenciaLowIdle("1000");
		locomotivemodelPage.setPotenciaIdle("2000");
		locomotivemodelPage.setPotenciaDinamico("3000");
		locomotivemodelPage.setPotenciaPonto1("100");
		locomotivemodelPage.setPotenciaPonto2("200");
		locomotivemodelPage.setPotenciaPonto3("300");
		locomotivemodelPage.setPotenciaPonto4("400");
		locomotivemodelPage.setPotenciaPonto5("500");
		locomotivemodelPage.setPotenciaPonto6("600");
		locomotivemodelPage.setPotenciaPonto7("700");
		locomotivemodelPage.setPotenciaPonto8("800");
		
		jse.testescroll();

		//Thread.sleep(5000);
		locomotivemodelPage.save();
		
	}


}
