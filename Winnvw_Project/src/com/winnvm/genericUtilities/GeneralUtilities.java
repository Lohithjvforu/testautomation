package com.winnvm.genericUtilities;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GeneralUtilities {

	WebDriver driver;
	 private Properties CONFIG = null;
	 private String configFileName = System.getProperty("user.dir")+"\\src\\com\\winnvm\\testdata\\Config.properties";
	 
	 
	public GeneralUtilities(WebDriver driver) throws IOException{
		this.driver = driver;
		CONFIG = new Properties();
	  	FileInputStream fsconf = new FileInputStream(configFileName);
	  	CONFIG.load(fsconf);
		//androidUtilities = new AndroidUtilities(driver);
	}
	
	public void LaunchURL() throws Exception {
		driver.get(CONFIG.getProperty("AppURL"));
		driver.manage().window().maximize();
		Thread.sleep(5000);
	}
	
	/**
	   Returns true if aText is non-null and has visible content.
	   This is a test which is often performed, and should probably
	   be placed in a general utility class.
	  */
	  public boolean textHasContent(String aText){
	    String EMPTY_STRING = "";
	    return (aText != null) && (!aText.trim().equals(EMPTY_STRING));
	  }
	
	
}
