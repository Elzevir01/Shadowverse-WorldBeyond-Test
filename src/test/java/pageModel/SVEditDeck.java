package pageModel;

import org.openqa.selenium.By;

public class SVEditDeck extends Base{
	///// WEB ELEMENTS /////
	
	// un total de 40 cartas
	////span[contains(text(), '40')] 
	private By cantidad = By.xpath("//div[@class='deck-total-count-anim pc ok']//div//p//span[@class=\"cur-count\" and text()=\"40\"][1]");
	private By saveDeck = By.xpath("//p[text()='Save Deck']");
	
	///// METODOS /////
	public void saveDeck() {
		//si el mazo contiene 40 cartas entonces click sobre el boton save temporarily
		if(checkElement(cantidad)) {
			findElemento(saveDeck).click();
		}
	}
}
