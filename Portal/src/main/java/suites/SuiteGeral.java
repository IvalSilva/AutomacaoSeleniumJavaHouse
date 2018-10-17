package suites;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

import core.DriverFactory;
import pages.LoginPage;
import tests.LocomotiveModelTest;
import tests.LocomotiveTest;




@RunWith(Suite.class)
@SuiteClasses({
	//LocomotiveModelTest.class,
	LocomotiveTest.class
})
public class SuiteGeral {
	private static LoginPage page = new LoginPage();
	
	@BeforeClass
	public static void inicializa(){
		page.acessarTelaInicial();
		
//		page.setEmail("ival@ival.com");
//		page.setSenha("1234");
//		page.entrar();
	}
	
	@AfterClass
	public static void finaliza(){
		//DriverFactory.killDriver();
	}
}
