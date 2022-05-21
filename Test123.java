package test;

import org.testng.annotations.Test;

import org.testng.annotations.BeforeMethod;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import pages.Appointment;
import utilities.ConstantValues;
import utilities.ExcelUtils;
import utilities.ScreenShot;
public class Test123 {
	WebDriver driver;
  @SuppressWarnings("deprecation")
@Test
  public void f() throws InterruptedException, IOException {
	  driver.manage().window().maximize();
	  driver.get("https://demo.smart-hospital.in/site/login");
	  Appointment app = new Appointment(driver);
	  app.doctor();
		 app.logbtn();
		 String url=driver.getCurrentUrl();
		 Assert.assertEquals("https://demo.smart-hospital.in/admin/admin/dashboard", url);
		 app.lagset();
		 driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		 app.lang();
		 app.billing();
		 String str=driver.getCurrentUrl();
		 Assert.assertEquals("https://demo.smart-hospital.in/admin/bill/dashboard",str);
		 app.pathlogy();
		 String pat=driver.getCurrentUrl();
		 Assert.assertEquals("https://demo.smart-hospital.in/admin/bill/pathology",pat);
		 app.adddetails();
		 driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		 app.addnew();
		 driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		 app.name("ramu");
		 app.year("99");
		 app.mon("03");
		 app.date("24");
		 app.save();
		 driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		 app.testnm("Appendicitis (Appendicitis)                                        ");
		 driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		 app.billbtn();
		 driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		 app.app();
		 String p1=driver.getCurrentUrl();
		 Assert.assertEquals("https://demo.smart-hospital.in/admin/appointment/index",p1);
		 app.addapp();
		 Thread.sleep(2000);	
		 for (int i=0; i<ExcelUtils.getRowNumber();i++) {
			 Thread.sleep(2000);	
			    app.addnew();
				app.name(ExcelUtils.readData(i, 0));
				Thread.sleep(2000);	
	    		app.year("98");
	    		app.mon("12");
	    		app.date("23");
	    		Thread.sleep(2000);	
		 app.save();
		 }
		 driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		 app.did("Reyan Jain (9011)");
		 app.shift("Evening");
		 app.appdt("19.04.2022 12:42 AM");
		 driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		 app.slot("05:35 PM - 06:35 PM");
		 app.status("Approved");
		 Thread.sleep(2000);	
		 app.appbtn();
		 Thread.sleep(2000);	
		 app.closeapp();
		 app.docwise();
		 String ps=driver.getCurrentUrl();
		 Assert.assertEquals("https://demo.smart-hospital.in/admin/onlineappointment/patientschedule",ps);
		 app.docsel("Reyan Jain (9011)");
		 app.date1("22.04.2022");
		 app.sechbtn();
		 driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		 app.imgbtn();
		 app.logoutbtn();
		 String lt=driver.getCurrentUrl();
		 Assert.assertEquals("https://demo.smart-hospital.in/site/login",lt);
//		 CaptureScreenShot.takeScreenshot("Smart_hospital_Dashboard");
		 
  }
  @BeforeMethod
  public void beforeMethod() throws IOException {
	  System.out.println("BeforeMethod");
	  System.setProperty("webdriver.chrome.driver","C:\\Drivers\\chromedriver.exe");
		driver = new ChromeDriver();
		ExcelUtils.setExcelFile(ConstantValues.filename, "Sheet1");
		
  }
  @AfterMethod
  public void afterMethod() {
	  System.out.println("AfterMethod");
  }

}