package com.winnvm.pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.winnvm.genericUtilities.GeneralUtilities;
public class ImInAHurry {

	
	
	
	WebDriver driver;
	GeneralUtilities generalUtilities;
	By Iframe = By.tagName("iframe");
	By IminaHurryImage = By.xpath("//*[@id='container-1048-innerCt']/div/h1");
	By Combo = By.xpath("//*[@id='combobox-1054']");
                               	 //*[@id="boundlist-1066-listEl"]/ul/li[1]
	By Availability1 = By.xpath("//*[@id='boundlist-1068-listEl']/ul/li[1]");
	By Availability2 = By.xpath("//*[@id='boundlist-1068-listEl']/ul/li[2]");
	By Availability3 = By.xpath("//*[@id='boundlist-1068-listEl']/ul/li[3]");
	By OKBookIT = By.xpath("//*[@id='inHurryButtonBtn-btnIconEl']");
	By FirtsName = By.xpath("//*[@id='RBFirstName']");
	By LastName = By.xpath("//*[@id='RBLastName']");
	By Email = By.xpath("//*[@id='RBEmail']");
	By MobileNumber = By.xpath("//*[@id='RBPhoneNumber']");
	By EmailCheckBox = By.xpath("//*[@id='checkboxfield-1126-inputEl']");
	By BookIT = By.xpath("//*[@id='wizardbutton-next-stepInnerEl']");
	By AppointmentTimings = By.xpath("//*[@id='container-1139-innerCt']/div/p[2]");
	By Advisor = By.xpath("//*[@id='container-1139-innerCt']/div/p[3]");
	By Vehicle = By.xpath("//*[@id='container-1139-innerCt']/div/p[4]");
	By Transportaion = By.xpath("//*[@id='container-1139-innerCt']/div/p[5]");
	By ConfirmationCode = By.xpath("//*[@id='container-1139-innerCt']/div/p[6]");
	
	public ImInAHurry(WebDriver driver){
		this.driver = driver;
		//androidUtilities = new AndroidUtilities(driver);
	}
	
	public void mousemoveOverOnImInAHurry() throws Exception{
		driver.switchTo().frame(0); 
		driver.switchTo().frame(0).getPageSource();
		driver.switchTo().frame(0).getPageSource();
		driver.switchTo().frame(0).getPageSource();
		//System.out.println(driver.findElement(IminaHurryImage).getText());
		driver.findElement(IminaHurryImage).click();
		

		    
	}
	
	
	public void clickOnAppointment() {
		driver.findElement(Combo).click();
	}
	
	public String[] getTop3Appointment() {
		String[] top3 = new String[3];
		System.out.println(driver.findElement(By.xpath("//ul[@class='x-list-plain']/li[3]")).getText());
		for(int i=0; i<=top3.length-1; i++) {
			//System.out.println("//ul[@class='x-list-plain']/li["+(i+1)+"]");
			top3[i]=driver.findElement(By.xpath("//ul[@class='x-list-plain']/li["+(i+1)+"]")).getText();
			//System.out.println(top3[i]);
		}
		return top3;
	}
	
	public void selectTheAppointmentDateFromDropDown() {
		driver.findElement(Availability1).click();
	}
	
	public void OKBookIT() {
		driver.findElement(OKBookIT).click();
	}
	
	public void EnterFname(String fname) {
		driver.findElement(FirtsName).sendKeys(fname);
	}
	
	public void EnterLname(String lname) {
		driver.findElement(LastName).sendKeys(lname);
	}
	
	public void EnterEmail(String email) {
		driver.findElement(Email).sendKeys(email);
	}
	public void EnterMobileNumber(String mobileNumber) {
		driver.findElement(MobileNumber).sendKeys(mobileNumber);
	}
	public void EnterFNameLNameEmailMobile(String Fname, String Lname, String email, String mobileNumber){
		EnterFname(Fname);
		EnterLname(Lname);
		EnterEmail(email);
		EnterMobileNumber(mobileNumber);
	}
	
	public void checkEmail() {
		driver.findElement(EmailCheckBox).click();
	}
	
	public void BookIT() {
		driver.findElement(BookIT).click();
	}
	
	public void verifyAppointmentConfermation() {
		
		System.out.println("=============>>"+driver.findElement(AppointmentTimings).getText());
		System.out.println("=============>>"+driver.findElement(Advisor).getText());
		System.out.println("=============>>"+driver.findElement(Vehicle).getText());
		System.out.println("=============>>"+driver.findElement(Transportaion).getText());
		System.out.println("=============>>"+driver.findElement(ConfirmationCode).getText());
		
		/*generalUtilities.textHasContent(driver.findElement(AppointmentTimings).getText());
		generalUtilities.textHasContent(driver.findElement(Advisor).getText());
		generalUtilities.textHasContent(driver.findElement(Vehicle).getText());
		generalUtilities.textHasContent(driver.findElement(Transportaion).getText());
		generalUtilities.textHasContent(driver.findElement(ConfirmationCode).getText());*/
	}
}
