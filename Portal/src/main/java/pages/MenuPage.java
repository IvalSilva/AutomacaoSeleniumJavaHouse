package pages;

import core.BasePage;

public class MenuPage extends BasePage{

	public void acessarTelaLocomotiveModel(){
		clicarLink("Rolling Stock");
		clicarLink("Locomotive Model");
	}
	
	public void acessarTelaLocomotive() {
		clicarLink("Rolling Stock");
		clicarLink("Locomotive");
	}

	public void acessarTelaWagonModel() {
		clicarLink("Rolling Stock");
		clicarLink("Wagon Model");
	}
	
	public void acessarTelaWagon() {
		clicarLink("Rolling Stock");
		clicarLink("Wagon");
	}


}
