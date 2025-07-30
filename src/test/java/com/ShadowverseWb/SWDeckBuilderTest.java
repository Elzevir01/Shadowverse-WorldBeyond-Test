package com.ShadowverseWb;

import org.testng.annotations.Test;

import driver.DriverFactoryDirect;

import org.testng.annotations.Parameters;
import org.testng.annotations.BeforeTest;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterTest;

import java.net.MalformedURLException;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import io.qameta.allure.Description;
import io.qameta.allure.Epic;
import io.qameta.allure.Link;
import io.qameta.allure.Severity;
import io.qameta.allure.SeverityLevel;
import io.qameta.allure.Story;

import pageModel.SVBuilderClass;
import pageModel.SVEditDeck;
import pageModel.SVMain;

public class SWDeckBuilderTest {
	String url = "";
	WebDriver driver;
	DriverFactoryDirect dfd;
	
	SVBuilderClass svbc;
	SVEditDeck sved;
	SVMain svm;
	
	private static Logger Log = LogManager.getLogger(SWDeckBuilderTest.class);
	
			
  @Test(dataProvider = "dp")
  public void Test_1_ShadowversePortada() {
	  
  }

  
  
  @BeforeTest
	@Parameters({"browser", "nodeUrl"})
	public void SetUp(String browser, String nodeUrl) throws MalformedURLException {
		try {
			dfd = new DriverFactoryDirect();
			driver = dfd.setDriver(browser, nodeUrl);
			
			}catch(Exception exc){
				Log.error("Causa : "+exc.getCause());
				Log.error("Mensaje : "+exc.getMessage());
				exc.printStackTrace();
			}
	}
  @AfterTest
  public void TearDown(){
		try {
		driver.quit();
		}catch(Exception ex) {
			Log.error("Causa : "+ex.getCause());
			Log.error("Mensaje : "+ex.getMessage());
			ex.printStackTrace();
		}
	}

}
