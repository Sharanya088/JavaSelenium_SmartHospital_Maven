package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class Appointment {
	WebDriver driver;
	@FindBy(linkText="Doctor")
	WebElement Doc;
	@FindBy(className="btn")
	WebElement signin;
	@FindBy (xpath="//button[@data-id=\"languageSwitcher\"]")
	WebElement eng;
	@FindBy (xpath="//a//span[@class=\"flag-icon flag-icon-us\"]")
	WebElement select;
	@FindBy(linkText="Billing")
	WebElement Bill;
	@FindBy(xpath="//a//div//i[@class=\"fas fa-flask\"]")
	WebElement path;
	@FindBy(id="load1")
	WebElement addD;
	@FindBy(xpath="//a[@class=\"modalbtnpatient\"]")
	WebElement addnew;
	@FindBy(xpath="//div//input[@id=\"name\"]")
	WebElement name;
	@FindBy(xpath="//div//input[@id=\"age_year\"]")
	WebElement year;
	@FindBy(xpath="//div//input[@id=\"age_month\"]")
	WebElement mon;
	@FindBy(xpath="//div//input[@id=\"age_day\"]")
	WebElement date;
	@FindBy(xpath="//button[@id=\"formaddpabtn\"]")
	WebElement save;
	@FindBy(xpath="//select[@name=\"test_name_1\"]")
	WebElement tnm;
	@FindBy(xpath="//button[@id=\"billsave\"]")
	WebElement billbtn;
	@FindBy(linkText="Appointment")
	WebElement app;
	@FindBy(xpath="//section//div//div//div//div//div//a[@data-toggle=\"modal\"]")
	WebElement addapp;
	@FindBy(xpath="//div//select[@name=\"doctorid\"]")
	WebElement addid;
	@FindBy(xpath="//select[@id=\"doctorid\"]")
	WebElement did;
	@FindBy(xpath="//select[@name=\"global_shift\"]")
	WebElement shift;
	@FindBy(xpath="//input[@id=\"datetimepicker\"]")
	WebElement dt;
	@FindBy(xpath="//select[@id=\"slot\"]")
	WebElement slt;
	@FindBy(xpath="//div//select[@name=\"appointment_status\"]")
	WebElement sts;
	@FindBy(xpath="//button[@name=\"save\"]")
	WebElement btn;
	@FindBy(linkText="Staff Meeting")
	WebElement sbtn;
	@FindBy(xpath="//li[@class=\"treeview active\"]")
	WebElement dbtn;
	@FindBy(linkText=" Post New Message")
	WebElement pnw;
	@FindBy(xpath="//button[@class=\"close pt4\"]")
	WebElement cabtn;
	@FindBy(xpath="//a[@class=\"dropdown-toggle\"]")
	WebElement imgbtn;
	@FindBy(linkText="Logout")
	WebElement lgt;
	@FindBy (xpath="//div//a[@class=\"btn btn-primary btn-sm\"]")
	WebElement doc;
	@FindBy(xpath="//select[@id=\"doctor\"]")
	WebElement sedoc;
	@FindBy (xpath="//input[@name=\"date\"]")
	WebElement dt12;
	@FindBy (xpath="//button[@class=\"btn btn-primary btn-sm pull-right\"]")
	WebElement srch;
	@FindBy(xpath="//button[@class=\"close\"]")
	WebElement close;
	
	public Appointment(WebDriver driver) {
		
		// TODO Auto-generated constructor stub
		this.driver = driver;
		PageFactory.initElements(driver,this);	
	}
	public void doctor() {
	  Doc.click();
	}
		public void logbtn() {
			signin.click();
	}
		public void billing() {
			Bill.click();
		}
		public void pathlogy() {
			path.click();
		}
		public void adddetails() {
			addD.click();
		}
		public void addnew() {
			addnew.click();
		}
		public void name(String nm) {
			name.clear();
			name.sendKeys(nm);
		}
		public void year(String yy) {
			year.clear();
			year.sendKeys(yy);
		}
		public void mon(String mm) {
			mon.clear();
			mon.sendKeys(mm);
		}
		public void date(String dd) {
			date.clear();
			date.sendKeys(dd);
		}
		public void save() {
			save.click();
		}
		public void testnm(String tsnm) {
			Select s=new Select(tnm);
			s.selectByVisibleText(tsnm);
		}
		public void billbtn() {
			billbtn.click();
		}
		public void app() {
			app.click();
		}
		public void addapp() {
			addapp.click();
		}
		public void did(String id) {
			Select c=new Select(did);
			c.selectByVisibleText(id);
		}
		public void shift(String sid) {
			Select c=new Select(shift);
			c.selectByVisibleText(sid);
		}
		public void appdt(String dt1) {
			dt.clear();
			dt.sendKeys(dt1);
		}
		public void slot(String slt1) {
			Select d=new Select(slt);
			d.selectByVisibleText(slt1);
		}
		public void status(String sts1) {
			Select d=new Select(sts);
			d.selectByVisibleText(sts1);
		}
		public void appbtn() {
			
			btn.click();
		}
		public void closeapp() {
			cabtn.click();
		}
		public void imgbtn() {
			imgbtn.click();
		}
		public void logoutbtn() {
			lgt.click();
		}
		public void docwise() {
			doc.click();
		}
		public void docsel(String doc1) {
			Select d=new Select(sedoc);
			d.selectByVisibleText(doc1);
		}
		public void date1(String d12) {
			dt12.sendKeys(d12);
		}
		public void sechbtn() {
			srch.click();
		}
		public void lagset() {
			eng.click();
		}
		public void lang() {
			select.click();
		}
		public void closeup() {
			close.click();
		}
}