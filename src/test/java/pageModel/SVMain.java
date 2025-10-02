package pageModel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class SVMain extends Base{

	///// ELEMENTOS WEB /////
	//idioma
	private String urlEsperada =  "https://shadowverse-wb.com/en/";
	private By menuIdioma = By.xpath("//select[@id='lang-selector']");
	private By idiomaIngles = By.xpath("//option[@value='en']");
	///armado de mazo
	private By deckPortal = By.xpath("//span[contains(text(), 'Deck Portal')]");
	private By deckBuilder = By.xpath("//span[contains(text(), 'Deck Builder')]");
	
	
	///// CONSTRUCTOR /////
	public SVMain(WebDriver driver) {
		super.driver = driver;
		PageFactory.initElements(driver, this);
	}
	public SVMain() {
		
	}
	
	///// METODOS /////
	
	// ir al menu de construccion de mazo
	public void deckBuilder() throws InterruptedException
	{
		cursorTo(deckPortal);
		//cursorToJS(deckPortal);
		Thread.sleep(2000);
		//esperarElemento(deckBuilder);
		findElemento(deckBuilder).click();
		
	}
	// si la url no esta en idioma ingles, cambia el idioma de la web
	public void idiomaIngles() {
		
			esperarElemento(menuIdioma);
			if( urlEsperada != driver.getCurrentUrl() ) {	
				findElemento(menuIdioma).click();
				findElemento(idiomaIngles).click();
				}
	}
	
}
