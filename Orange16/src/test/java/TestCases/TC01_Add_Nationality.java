package  TestCases;
import CommonUtil.*;
import Pages.*;

import Reporter_Example_Word.ImageAttachmentInDocument1;

import Reporter_Example_Word.Reporter1;
import Reporter_Example_Word.WordConvertPDF;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.concurrent.TimeUnit;

//import org.testng.Reporter;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.testng.Reporter;
import org.testng.annotations.*;

public class TC01_Add_Nationality
{
	
	WebDriver driver;
	@Test
	public void Test1() throws Exception {
		

		ImageAttachmentInDocument1 IA = new ImageAttachmentInDocument1();
		IA.CreateHeader("Test Case : TC013 Add Nationality");
		
		SimpleDateFormat sdfDate1 = new SimpleDateFormat("yyyy_MMM_dd_h_mm_ss_a");
		Date now1 = new Date();
		String strDate1 = sdfDate1.format(now1);
		
		String TestName="TC01_Add_Nationality_"+strDate1;
      // String TestName1="TC013";
			 
		
		Reporter1 R1= new Reporter1(driver, TestName );
		
		driver = TestBrowser.OpenChromeBrowser();
		
		
		
		 driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
	
		String TestURL = "https://opensource-demo.orangehrmlive.com/";
		
		
		
		 
		 Login l1= new Login();
		 l1.Login(driver, R1,IA);
		 l1.Login_Screen(TestURL, "Admin", "admin123");
	
		Nationality Nati = new Nationality();
		Nati.Nationality(driver, R1,IA);
		Nati.NationalityDetails("Test469");
		
		
		HomePage h1= new HomePage();
		h1.HomePage(driver, R1, IA);
		h1.Logout();

		
		driver.close();
	    String Filename=IA.WordOutput_File(TestName);
	    WordConvertPDF.main(Filename);
	
	}
	
	
	
	
	
	
	
	// Draws a red border around the found element. Does not set it back anyhow.
		public  WebElement findElement(By by) throws Exception {
			
		    WebElement elem = driver.findElement(by);
		    	    
		    // draw a border around the found element
		    if (driver instanceof JavascriptExecutor) {
		        ((JavascriptExecutor)driver).executeScript("arguments[0].style.border='3px solid red'", elem);
		        
		  //  TH3.HTMLScreenShot("Screen Shot","Click Here","Pass", HtmlOutputFileName,driver);
		        
		    }
		    return elem;
		}
		
	
	
	
	
	
	
	
	

}












