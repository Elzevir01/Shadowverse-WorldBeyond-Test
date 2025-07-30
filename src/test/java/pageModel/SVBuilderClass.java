package pageModel;

import org.openqa.selenium.By;

public class SVBuilderClass extends Base{
///// WEB ELEMENT /////
	private By deckRoyal = By.xpath("//a[@class='royal 2']");
	private By startBuilding = By.xpath("//a[@href='/en/deck/build_edit/']");
	private By deckRoyalCheck = By.xpath("//a[@class='royal 2 active']");
	
///// METODOS /////

//si royal class no esta seleccionado lo hace y navega hacia la web de construccion del mazo
public void selectRoyalandGo() {
	
	if(checkElement(deckRoyal)) {
	findElemento(deckRoyal).click();
	}
	findElemento(startBuilding).click();
}

}
