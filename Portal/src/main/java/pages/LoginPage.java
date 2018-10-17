package pages;

import static core.DriverFactory.getDriver;

import org.openqa.selenium.By;

import core.BasePage;
import core.DriverFactory;


public class LoginPage extends BasePage{
	
	public void acessarTelaInicial(){
		//DriverFactory.getDriver().get("http://eot.alta-rt.com/Home/Login?ReturnUrl=%2f");
		//DriverFactory.getDriver().get("file:///C:/Users/ivald/Dropbox/01-Ival/Udemy/Automa%C3%A7%C3%A3oSelenium/Portal/locomotive/Locomotive%20Model%20-%20New%20-%20(ART)%20ALTA%20Rail%20Technology.htm");
		DriverFactory.getDriver().get("file:///C:/Users/ivald/Dropbox/01-Ival/Udemy/Automa%C3%A7%C3%A3oSelenium/Portal/PortalART%20-%20HTML/2-Locomotive%20-%20New%20-%20(ART)%20ALTA%20Rail%20Technology.html");
	}
	

//	public void setEmail(String email) {
//		escrever("UserName", email);
//	}
//	
//	public void setSenha(String senha) {
//		escrever("Password", senha);
//	}
//	
//	public void entrar(){
//		clicarBotaoPorTexto("Login In");
//	}
//	
//	public void logar(String email, String senha) {
//		setEmail(email);
//		setSenha(senha);
//		entrar();
//	}

}
