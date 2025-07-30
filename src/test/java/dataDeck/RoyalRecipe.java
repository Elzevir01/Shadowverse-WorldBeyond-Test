package dataDeck;
import org.openqa.selenium.By;
import org.testng.annotations.DataProvider;

public class RoyalRecipe {
	
	///// WEB ELEMENT CARTA/////

	private By flashstepQuickblader = By.xpath("//img[contains(@src, 'e4a7d55811134c73a9cf4306980446e9')]");
	//x3
	private By darkSide = By.xpath("//img[contains(@src, 'f812b323077c4a2ebf84f98b87f52a57')]");
	//x1
	private By ignominiousSamurai = By.xpath("//img[contains(@src, 'bd65882bd9704d269e912955a5a284e2')]");
	//x3
	private By luminousLancetrooper = By.xpath("//img[contains(@src, '61e4bd16c6e74b36863f313753a68b1a')]");
	//x3
	private By shinobiSquirrel = By.xpath("//img[contains(@src, '50960beaafdf48c2b764defc43788e44')]");
	//x3
	private By primPrincesssPicnic = By.xpath("//img[contains(@src, 'd7ffc61d646d4b6d82a6f605f2b4a2cc')]");
	//x3
	private By houndofWar = By.xpath("//img[contains(@src, '634be33edebd4c30a7a56d109dbfd6bb')]");
	//x3
	private By valseSilentSniper = By.xpath("//img[contains(@src, 'ec692b0343064eb6a908948de2be96d2')]");
	//x3
	private By kagemitsuEnduringWarrior = By.xpath("//img[contains(@src, 'e365e21e47fe4bae9654fbd7a21652b3')]");
	//x3
	private By zirconiaIroncrownWard = By.xpath("//img[contains(@src, '06710770b51e4726bd7ef60fb66cd95a')]");
	//x3
	private By albertLevinStormsaber = By.xpath("//img[contains(@src, '68a78f203d0448ba9b2c26a512123d67')]");
	//x3
	private By gildariaAnathemaofPeace = By.xpath("//img[contains(@src, 'd776553d53f0478fad46fef89cd7c3dc')]");
	//x3
	private By odinTwilitFate = By.xpath("//img[contains(@src, 'e22c9edc63d344298977be638da6c39e')]");
	//x3
	private By raveningTentacles = By.xpath("0eb43b7fe6424bc784ad7f9cf9f563b4')]");
	//x2
	private By centaurCenturion = By.xpath("//img[contains(@src, '127bcdd8a890477ea5de197061de5dd0')]");
	//x1
	
	
	//// DATA PROVIDER DEL MAZO ////
	@DataProvider(name = "deckCards")
	public Object[][] cardData() {
		return new Object[][] {
				//// --WEB ELEMENT, NUMERO DE REPETICION, NOMBRE DE CARTA-- ////
				{ flashstepQuickblader, 3,"Flashstep Quickblader" },
				{ darkSide, 1,"Dark Side" },
				{ ignominiousSamurai, 3,"Ignominious Samurai" },
				{ luminousLancetrooper, 3,"Luminous Lancetrooper" },
				{ shinobiSquirrel, 3,"Shinobi Squirrel" },
				{ primPrincesssPicnic, 3,"Prim, Princess's Picnic" },
				{ houndofWar, 3,"Hound of War" },
				{ valseSilentSniper, 3,"Valse, Silent Sniper" },
				{ kagemitsuEnduringWarrior, 3,"Kagemitsu, Enduring Warrior" },
				{ zirconiaIroncrownWard, 3,"Zirconia, Ironcrown Ward" },
				{ albertLevinStormsaber, 3,"Albert, Levin Stormsaber" },
				{ gildariaAnathemaofPeace, 3,"Gildaria, Anathema of Peace" },
				{ odinTwilitFate, 3,"Odin, Twilit Fate" },
				{ raveningTentacles, 2,"Ravening Tentacles" },
				{ centaurCenturion, 1,"Centaur Centurion" }
			};

	}
	
	
}
