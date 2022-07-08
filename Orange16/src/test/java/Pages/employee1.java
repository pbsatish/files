package  Pages;
//import MercuryDemoTours;


import Reporter_Example_Word.Reporter1;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.NoSuchFrameException;
import org.openqa.selenium.WebDriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import Reporter_Example_Word.ImageAttachmentInDocument1;


public class employee1
{
	
	
	//public  static 	String UserName, Password ;
	 WebDriver driver;
	
	 ImageAttachmentInDocument1 IA1;
	 
	 Reporter1 R1;

	
	public void  Employee2(WebDriver driver,Reporter1 R1 , ImageAttachmentInDocument1 IA2)throws Exception
	{  
		this.driver=driver;
		this.R1=R1;
		this.IA1=IA2;
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
	
	

public   void Employeedetails1(String EmployeeId,String street1,String street2,String city,String province,String zipcode,String telephone,String email1,String email2,String telephone1)throws Exception
{  
	

	try 
	{
		 findElement(By.linkText("PIM")).click();
	 	 findElement(By.id("menu_pim_viewEmployeeList")).click();
	 	
	 	 findElement(By.xpath("//input[@id='empsearch_id']")).clear();
	 	findElement(By.xpath("//input[@id='empsearch_id']")).sendKeys(EmployeeId);
	 	findElement(By.xpath("//a[contains(text(),'0273')]")).click();
	 	Thread.sleep(1000);
	 	findElement(By.xpath(" //a[contains(text(),'Contact Details')]")).click();
	 	
		findElement(By.xpath("//input[@id='btnSave']")).click();
		
		findElement(By.xpath("//input[@id='contact_street1']")).sendKeys(street1);
		
		Thread.sleep(1000);
		findElement(By.xpath("//input[@id='contact_street2']")).sendKeys(street2);
		
		findElement(By.xpath(" //input[@id='contact_city']")).sendKeys(city);
		Thread.sleep(1000);
		findElement(By.xpath("//input[@id='contact_province']")).sendKeys(province);
		
		findElement(By.xpath("//input[@id='contact_emp_zipcode']")).sendKeys(zipcode);
		
		Select dropdown = new Select(driver.findElement(By.xpath("//select[@id='contact_country']")));
		dropdown.selectByValue("IN");
		
		findElement(By.xpath("//input[@id='contact_emp_hm_telephone']")).sendKeys(telephone);
		
		findElement(By.xpath("//input[@id='contact_emp_work_email']")).sendKeys(email1);
		Thread.sleep(1000);
		findElement(By.xpath("//input[@id='contact_emp_oth_email']")).sendKeys(email2);
		Thread.sleep(1000);
		findElement(By.xpath("//input[@id='contact_emp_work_telephone']")).sendKeys(telephone1);
		findElement(By.xpath(" //input[@id='btnSave']")).click();
		Thread.sleep(1000);
		
		

	} 
	
	
	catch(NoSuchElementException e)
	{
		System.out.println("Error Message :"+e.getMessage());
		String str= R1.TakeScreenShotAuto(driver,e.getMessage(),"Fail");
		 IA1.PasteImage("Nationality Page - Scroll and verify the record details",str);
	}
	
 	catch(NoSuchFrameException  e)
	{
		System.out.println("Error Message :"+e.getMessage());
		String str= R1.TakeScreenShotAuto(driver,e.getMessage(),"Fail");
		 IA1.PasteImage(" Invalid ",str);
	}
	catch(Exception  e)
	{
		System.out.println("Error Message :"+e.getMessage());
		String str= R1.TakeScreenShotAuto(driver,e.getMessage(),"Fail");
		 IA1.PasteImage(" Invalid ",str);
		 
	}
}













		 
}
	


	
	