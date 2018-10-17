package tests;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;
import org.openqa.selenium.support.ui.Sleeper;

import core.BaseTest;
import pages.LocomotivePage;
import pages.MenuPage;


@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class LocomotiveTest extends BaseTest{
	MenuPage menuPage = new MenuPage();
	LocomotivePage locomotivepage = new LocomotivePage();
	
	@Test
	public void test1_locomotive_NEW() {
		menuPage.acessarTelaLocomotive();
		//locomotivepage.clicarBotaoNewLocomotive();
		locomotivepage.setNumero("2024");
		locomotivepage.selecionarCombo("CodigoModeloLocomotiva", "40"); 
		locomotivepage.save();

	}

	@Test
	public void test2_locomotive_DUPLICATE() {
		
	}

}
