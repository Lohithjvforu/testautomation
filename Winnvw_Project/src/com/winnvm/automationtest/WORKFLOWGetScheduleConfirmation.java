package com.winnvm.automationtest;

import java.io.FileInputStream;
import java.util.Properties;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import com.winnvm.genericUtilities.GeneralUtilities;
import com.winnvm.pageobjects.ImInAHurry;


public class WORKFLOWGetScheduleConfirmation {

	WebDriver driver;
    GeneralUtilities generalUtilities ;
    ImInAHurry imInAHurry;
	private Properties TestData = null;
    private String TestDataFileName = System.getProperty("user.dir")+"\\src\\com\\winnvm\\testdata\\TestData.properties";
	
	 @BeforeMethod
	 public void setUp() throws Exception {
		 
		 
		 TestData = new Properties();
		 FileInputStream fsconf = new FileInputStream(TestDataFileName);
		 TestData.load(fsconf);
		 System. setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"/Libs/chromedriver.exe");
		 driver = new ChromeDriver();
		 generalUtilities = new GeneralUtilities(driver);
		 generalUtilities.LaunchURL();
	 }
	 
	 @Test
	 public void Test_ImInAHurry() throws Exception{
		 imInAHurry = new ImInAHurry(driver);
		 
		 imInAHurry.mousemoveOverOnImInAHurry();
		 imInAHurry.clickOnAppointment();
		 imInAHurry.getTop3Appointment();
		 imInAHurry.selectTheAppointmentDateFromDropDown();
		 imInAHurry.OKBookIT();
		 Thread.sleep(10000);
		 imInAHurry.EnterFNameLNameEmailMobile(TestData.getProperty("Firstname"), TestData.getProperty("Lastname"), TestData.getProperty("Emailid"), TestData.getProperty("Mobilenumber"));
		 imInAHurry.checkEmail();
		 imInAHurry.BookIT();
		 Thread.sleep(10000);
		 imInAHurry.verifyAppointmentConfermation();
		 
	 }
}
