package pkg;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class ReturnTheValues {

	public static void main(String[] args) throws Exception {
		WebDriver driver;
		System. setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"/Libs/chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://www.winnvw.com/schedule-car-maintenance-or-auto-repair-newark-ca");
		driver.manage().window().maximize();
	               
			// prints the total number of frames 
			driver.switchTo().frame(0); // Switching the Outer Frame    			         	                                                                                                          
			driver.switchTo().frame(0).getPageSource(); // Switching to innerframe
		    Thread.sleep(5000);                                                                                                     
		    driver.switchTo().frame(0).getPageSource(); // Switching to innerframe
		    driver.switchTo().frame(0).getPageSource(); // Switching to innerframe
		    driver.findElement(By.xpath("//*[@id=\"container-1048-innerCt\"]/div/h1")).click();
		    Thread.sleep(5000);
		    driver.findElement(By.xpath("//*[@id=\"combobox-1054\"]")).click();
		    Thread.sleep(5000);
		    
		    String[] top3 = new String[3];
			for(int i=0; i<=top3.length-1; i++) {
				top3[i]=driver.findElement(By.xpath("//ul[@class='x-list-plain']/li["+(i+1)+"]")).getText();
				System.out.println(top3[i]);
			}
		  		    
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
		    Thread.sleep(10000);		    
		    System.out.println(driver.findElement(By.xpath("//*[@id=\"container-1139-innerCt\"]/div/p[1]")).getText());
		    System.out.println(driver.findElement(By.xpath("//*[@id=\"container-1139-innerCt\"]/div/p[2]")).getText());
		    System.out.println(driver.findElement(By.xpath("//*[@id=\"container-1139-innerCt\"]/div/p[3]")).getText());
		    System.out.println(driver.findElement(By.xpath("//*[@id=\"container-1139-innerCt\"]/div/p[4]")).getText());
		    System.out.println(driver.findElement(By.xpath("//*[@id=\"container-1139-innerCt\"]/div/p[5]")).getText());
		    System.out.println(driver.findElement(By.xpath("//*[@id=\"container-1139-innerCt\"]/div/p[6]/span")).getText());
		    System.out.println(driver.findElement(By.xpath("//*[@id=\"container-1139-innerCt\"]/div/p[6]")).getText());	  	    
		System.out.println("====================COMPLETED================");
	}
}
