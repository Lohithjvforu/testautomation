package pkg;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class TestWinnvm {

	private WebDriver driver;
	
	
	@Test
	public void setUp() throws Exception {
		System. setProperty("webdriver.chrome.driver", "C:\\Users\\LO356669\\eclipse-workspace\\Winnvw_Project\\Libs\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://www.winnvw.com/schedule-car-maintenance-or-auto-repair-newark-ca");
		driver.manage().window().maximize();
		
		 int size = driver.findElements(By.tagName("iframe")).size();
		 System.out.println("1 Total Frames --" + size);
	               
			// prints the total number of frames 
			driver.switchTo().frame(0); // Switching the Outer Frame    		
		   

			//Printing the text in outer frame
			size = driver.findElements(By.tagName("iframe")).size();
		    // prints the total number of frames inside outer frame           
	                                                                                                          
		    System.out.println("2 Total Frames --" + size);
		    System.out.println(driver.switchTo().frame(0).getPageSource()); // Switching to innerframe
		    Thread.sleep(5000);
		  //Printing the text in outer frame
			size = driver.findElements(By.tagName("iframe")).size();
		    // prints the total number of frames inside outer frame           
	                                                                                                          
		    System.out.println("3 Total Frames --" + size);
		    System.out.println(driver.switchTo().frame(0).getPageSource()); // Switching to innerframe
		    Thread.sleep(5000);
		    driver.findElement(By.xpath("/html/head/title")).isDisplayed();
		    System.out.println("===========>>>>>>>>>"+driver.findElement(By.xpath("/html/head/script[1]")).getAttribute("src"));
		    System.out.println(driver.findElement(By.xpath("//*[@id=\"mainbody\"]/script")).isDisplayed());
		   // System.out.println(driver.getTitle());
		    
		    size = driver.findElements(By.tagName("iframe")).size();
		    // prints the total number of frames inside outer frame           
	                                                                                                          
		    System.out.println("4 Total Frames --" + size);
		    System.out.println(driver.switchTo().frame(0).getPageSource()); // Switching to innerframe
		    Thread.sleep(5000);
		    System.out.println("===========>>>>33>>>>>"+driver.findElement(By.xpath("/html/head/script[1]")).getAttribute("src"));
		    System.out.println("===========>>>>33>>>>>"+driver.findElement(By.xpath("//*[@id=\"container-1048-innerCt\"]/div/h1")).getText());
		    driver.findElement(By.xpath("//*[@id=\"container-1048-innerCt\"]/div/h1")).click();
		    Thread.sleep(5000);
		    driver.findElement(By.xpath("//*[@id=\"combobox-1054\"]")).click();
		    Thread.sleep(5000);
		    System.out.println(driver.findElement(By.xpath("//*[@id=\"boundlist-1068-listEl\"]/ul/li[1]")).getText());
		    System.out.println(driver.findElement(By.xpath("//*[@id=\"boundlist-1068-listEl\"]/ul/li[2]")).getText());
		    System.out.println(driver.findElement(By.xpath("//*[@id=\"boundlist-1068-listEl\"]/ul/li[3]")).getText());
		    driver.findElement(By.xpath("//*[@id=\"boundlist-1068-listEl\"]/ul/li[1]")).click();
		    Thread.sleep(5000);
		    driver.findElement(By.xpath("//*[@id=\"inHurryButtonBtn-btnIconEl\"]")).click();
		    Thread.sleep(15000);
		    driver.findElement(By.xpath("//*[@id=\"RBFirstName\"]")).sendKeys("TestFname");
		    driver.findElement(By.xpath("//*[@id=\"RBLastName\"]")).sendKeys("TestFname");
		    driver.findElement(By.xpath("//*[@id=\"RBEmail\"]")).sendKeys("TestFname@gmail.com");
		    driver.findElement(By.xpath("//*[@id=\"RBPhoneNumber\"]")).sendKeys("(989) 990-0087");
		    driver.findElement(By.xpath("//*[@id=\"checkboxfield-1126-inputEl\"]")).click();
		    driver.findElement(By.xpath(" //*[@id=\"wizardbutton-next-stepInnerEl\"]")).click();
		    Thread.sleep(15000);
		    
		    
		    
		    System.out.println(driver.findElement(By.xpath("//*[@id=\"container-1139-innerCt\"]/div/p[1]")).getText());
		    System.out.println(driver.findElement(By.xpath("//*[@id=\"container-1139-innerCt\"]/div/p[2]")).getText());
		    System.out.println(driver.findElement(By.xpath("//*[@id=\"container-1139-innerCt\"]/div/p[3]")).getText());
		    System.out.println(driver.findElement(By.xpath("//*[@id=\"container-1139-innerCt\"]/div/p[4]")).getText());
		    System.out.println(driver.findElement(By.xpath("//*[@id=\"container-1139-innerCt\"]/div/p[5]")).getText());
		    System.out.println(driver.findElement(By.xpath("//*[@id=\"container-1139-innerCt\"]/div/p[6]/span")).getText());
		    System.out.println(driver.findElement(By.xpath("//*[@id=\"container-1139-innerCt\"]/div/p[6]")).getText());
		  
		  
		  
		  
		  
		  
		  
		  
		  
		  
		    
		    
	}
	
	
	
}
