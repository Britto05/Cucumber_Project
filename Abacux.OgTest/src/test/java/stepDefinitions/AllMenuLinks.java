package stepDefinitions;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.events.EventFiringWebDriver;
import org.testng.Assert;

import com.github.dockerjava.api.model.Driver;

import io.cucumber.java.en.Given;
import io.github.bonigarcia.wdm.WebDriverManager;
import pageObjects.AllMenuLinks_Page_Objects;
import webDriverManager.DriverManager;

public class AllMenuLinks {

	//Dash board Menu	
	@Given("Launch Browser to Check All Menu Links")
	public void launch_browser_to_check_all_menu_links() {
	}

	@Given("Shortchut Menu Link Verified")
	public void shortchut_menu_link_verified() {
	    AllMenuLinks_Page_Objects.ShortcutMenu.click();
	}
	@Given("Dashboard Menu Link Verified")
	public void dashboard_menu_link_verified() {
	   AllMenuLinks_Page_Objects.Dashboard.click();
	}
	
//CRM:
	@Given("CRM link Verified")
	public void crm_link_verified() {
	    AllMenuLinks_Page_Objects.CRM.click();
	    DriverManager.getDriver().navigate().back();
	    //AllMenuLinks_Page_Objects.PinmenuIcon.click();
	}
	
//PMS:
	@Given("PMS Link Verified")
	public void pms_link_verified() {
	   AllMenuLinks_Page_Objects.PMS.click();
	   DriverManager.getDriver().navigate().back();
	}
	
//Reminders:
	@Given("Reminders Link Verified")
	public void reminders_link_verified() {
	    AllMenuLinks_Page_Objects.Reminders.click();
	}
	@Given("RemindersDashboard Link verified")
	public void reminders_dashboard_link_verified() {
	  AllMenuLinks_Page_Objects.RemindersDashboard.click();
	}
	@Given("General Reminders Link Verified")
	public void general_reminders_link_verified() {
	    AllMenuLinks_Page_Objects.GeneralReminders.click();
	}

//Purchase Menu:
	
	@Given("Purchase Menu Link Verified")
	public void purchase_menu_link_verified() {
		AllMenuLinks_Page_Objects.Purchase.click();
	}
	@Given("Vendors Verified")
	public void vendors_verified() {
		AllMenuLinks_Page_Objects.Vendors.click();
		String VisibleText  =DriverManager.getDriver().findElement(By.cssSelector("body > div.page-container > div.page-content-wrapper > div.content > div > div.row.margin_top_heading > div.col-12.col-sm-8.align-items-center.justify-content-center.justify-content-sm-start.d-flex.mb-4.title_border > div > h2")).getText();
		Assert.assertTrue(VisibleText.contains("Vendors"));
	}
	@Given("Multi Vendor PO Verified")
	public void multi_vendor_po_verified() {
		AllMenuLinks_Page_Objects.MultiVendorPO.click();
		String VisibleText  =DriverManager.getDriver().findElement(By.cssSelector("body > div.page-container > div.page-content-wrapper > div.content > div > div.row.margin_top_heading > div.col-12.col-sm-8.align-items-center.justify-content-center.justify-content-sm-start.d-flex.mb-lg-4.title_border > div > h2")).getText();
		Assert.assertTrue(VisibleText.contains("Multi Vendor Purchase Order"));

	}
	@Given("Purchase Orders Verified")
	public void purchase_orders_verified() {
		AllMenuLinks_Page_Objects.PurchaseOrders.click();
		String VisibleText  =DriverManager.getDriver().findElement(By.cssSelector("body > div.page-container > div.page-content-wrapper > div.content > div > div.row.margin_top_heading > div.col-12.col-sm-8.align-items-center.justify-content-center.justify-content-sm-start.d-flex.mb-lg-4.title_border > div > h2")).getText();
		Assert.assertTrue(VisibleText.contains("Purchase Orders"));
	}
	@Given("Purchase Bill Verified")
	public void purchase_bill_verified() {
		AllMenuLinks_Page_Objects.PurchaseBill.click();
		String VisibleText  =DriverManager.getDriver().findElement(By.cssSelector("body > div.page-container > div.page-content-wrapper > div > div > div.row.margin_top_heading > div.col-12.col-sm-8.align-items-center.justify-content-center.justify-content-sm-start.d-flex.mb-4.title_border > div > div > h2")).getText();
		Assert.assertTrue(VisibleText.contains("Purchase Bills"));
	}
	@Given("Barcode Bills Verified")
	public void barcode_bills_verified() {
		AllMenuLinks_Page_Objects.BarcodeBills.click();
		String VisibleText  =DriverManager.getDriver().findElement(By.cssSelector("body > div.page-container > div.page-content-wrapper > div.content > div > div.row.margin_top_heading > div > div > h2")).getText();
		Assert.assertTrue(VisibleText.contains("Barcode (Bills)"));
	}
	@Given("Barcode Products Verified")
	public void barcode_products_verified() {
		AllMenuLinks_Page_Objects.BarcodeProducts.click();
		String VisibleText  =DriverManager.getDriver().findElement(By.cssSelector("body > div.page-container > div.page-content-wrapper > div.content > div > div.row.margin_top_heading > div > div > h2")).getText();
		Assert.assertTrue(VisibleText.contains("Barcode (Products)"));
	}
	@Given("Pay Bills Verified")
	public void pay_bills_verified() {
		AllMenuLinks_Page_Objects.PayBills.click(); 
		String VisibleText  =DriverManager.getDriver().findElement(By.cssSelector("body > div.page-container > div.page-content-wrapper > div.content > div > div.row.margin_top_heading > div.col-12.col-sm-8.align-items-center.justify-content-center.justify-content-sm-start.d-flex.mb-4.title_border > div > h2")).getText();
		Assert.assertTrue(VisibleText.contains("Pay Bills"));
	}
	@Given("Debit Notes Verified")
	public void debit_notes_verified() {
		AllMenuLinks_Page_Objects.DebitNotes.click();
		String VisibleText  =DriverManager.getDriver().findElement(By.cssSelector("#title_text")).getText();
		Assert.assertTrue(VisibleText.contains("Debit Notes"));
	}

	//Sales Menu:
	@Given("Sales Menu Link Verified")
	public void sales_menu_link_verified() {
		AllMenuLinks_Page_Objects.Sales.click();

	}
	@Given("Customers Link Verified")
	public void customers_link_verified() {
		AllMenuLinks_Page_Objects.Customers.click();
		String VisibleText  =DriverManager.getDriver().findElement(By.cssSelector("body > div.page-container > div.page-content-wrapper > div.content > div > div.row.margin_top_heading > div.col-12.col-sm-8.align-items-center.justify-content-center.justify-content-sm-start.d-flex.mb-4.title_border > div > h2")).getText();
		Assert.assertTrue(VisibleText.contains("Customers"));
	}
	@Given("Estimates Link Verified")
	public void estimates_link_verified() {
		AllMenuLinks_Page_Objects.Estimates.click();
		String VisibleText  =DriverManager.getDriver().findElement(By.cssSelector("body > div.page-container > div.page-content-wrapper > div.content > div > div.row.margin_top_heading > div.col-12.col-sm-8.align-items-center.justify-content-center.justify-content-sm-start.d-flex.mb-4.title_border > div > h2")).getText();
		Assert.assertTrue(VisibleText.contains("Estimates"));
	}
	@Given("Sales Order Link Verified")
	public void sales_order_link_verified() {
		AllMenuLinks_Page_Objects.SalesOrder.click();
		String VisibleText  =DriverManager.getDriver().findElement(By.cssSelector("body > div.page-container > div.page-content-wrapper > div.content > div > div.row.margin_top_heading > div.col-12.col-sm-8.align-items-center.justify-content-center.justify-content-sm-start.d-flex.mb-4.title_border > div > h2")).getText();
		Assert.assertTrue(VisibleText.contains("Sales Orders"));
	}
	@Given("Sales Invoice Verified")
	public void sales_invoice_verified() {
		AllMenuLinks_Page_Objects.SalesInvoice.click(); 
		String VisibleText  =DriverManager.getDriver().findElement(By.cssSelector("body > div.page-container > div.page-content-wrapper > div.content > div > div.row.margin_top_heading > div.col-12.col-sm-8.align-items-center.justify-content-center.justify-content-sm-start.d-flex.mb-4.title_border > div > div > h2")).getText();
		Assert.assertTrue(VisibleText.contains("Sales Invoices"));
	}
	@Given("Sales Receipt Verified")
	public void sales_receipt_verified() {
		AllMenuLinks_Page_Objects.SalesReceipts.click(); 
		String VisibleText  =DriverManager.getDriver().findElement(By.cssSelector("body > div.page-container > div.page-content-wrapper > div.content > div > div.row.margin_top_heading > div.col-12.col-sm-8.align-items-center.justify-content-center.justify-content-sm-start.d-flex.mb-4.title_border > div > h2")).getText();
		Assert.assertTrue(VisibleText.contains("Sales Receipts"));
	}
	@Given("Credit Notes Verified")
	public void credit_notes_verified() {
		AllMenuLinks_Page_Objects.CreditNotes.click();
		String VisibleText  =DriverManager.getDriver().findElement(By.cssSelector("body > div.page-container > div.page-content-wrapper > div.content > div > div.row.margin_top_heading > div.col-12.col-sm-8.align-items-center.justify-content-center.justify-content-sm-start.d-flex.mb-4.title_border > div > h2")).getText();
		Assert.assertTrue(VisibleText.contains("Credit Notes"));
	}
	@Given("Agent Collections Verified")
	public void agent_collections_verified() {
		AllMenuLinks_Page_Objects.AgentCollections.click();
		String VisibleText  =DriverManager.getDriver().findElement(By.cssSelector("body > div.page-container > div.page-content-wrapper > div.content > div > div.row.margin_top_heading > div.col-12.col-sm-8.align-items-center.justify-content-center.justify-content-sm-start.d-flex.mb-4.title_border > div > h2")).getText();
		Assert.assertTrue(VisibleText.contains("Agent Collections"));
	}
	@Given("My Collections Verified")
	public void my_collections_verified() {
		AllMenuLinks_Page_Objects.MyCollections.click();
		String VisibleText  =DriverManager.getDriver().findElement(By.cssSelector("body > div.page-container > div.page-content-wrapper > div.content > div > div.row.margin_top_heading > div.col-12.col-sm-8.align-items-center.justify-content-center.justify-content-sm-start.d-flex.mb-4.title_border > div > h2")).getText();
		Assert.assertTrue(VisibleText.contains("My Collections"));
	}
	
	//Subscription:
	
	@Given("the Subscription Menu link verified")
	public void the_subscription_menu_link_verified() {
	   AllMenuLinks_Page_Objects.Subscription.click();
	}
	@Given("the Subscription Products link verified")
	public void the_subscription_products_link_verified() {
	    AllMenuLinks_Page_Objects.SubscriptionProducts.click();
	}
	@Given("the Subscriptions Link verified")
	public void the_subscriptions_link_verified() {
	    AllMenuLinks_Page_Objects.Subscriptions.click();
	}
	@Given("the Invoices Link verified")
	public void the_invoices_link_verified() {
		AllMenuLinks_Page_Objects.Invoices.click();
	}
	
	//Services:
	@Given("Services Menu Link Verified")
	public void services_menu_link_verified() {
		AllMenuLinks_Page_Objects.Services.click();

	}
	@Given("AMC and LMC Link Verified")
	public void amc_and_lmc_link_verified() {
		AllMenuLinks_Page_Objects.AMCLMC.click(); 
		String VisibleText  =DriverManager.getDriver().findElement(By.cssSelector("#title_section")).getText();
		Assert.assertTrue(VisibleText.contains("Amc Invoice"));
	}

	//Products:
	@Given("Products Menu Link Verified")
	public void products_menu_link_verified() throws InterruptedException {
		AllMenuLinks_Page_Objects.ProductsMenu.click(); 
		Thread.sleep(1500);

	}
	@Given("Products Link Verified")
	public void products_link_verified() throws InterruptedException {
		AllMenuLinks_Page_Objects.Products.click();
		//String VisibleText  =DriverManager.getDriver().findElement(By.cssSelector("body > div.page-container > div.page-content-wrapper > div.content > div.container-fluid.px-3 > div.row.margin_top_heading > div.col-12.col-sm-8.align-items-center.justify-content-center.justify-content-sm-start.d-flex.mb-4.title_border > div > h2")).getText();
		//Assert.assertTrue(VisibleText.contains("Products"));
		Thread.sleep(1500);
	}

	@Given("the Make Orders Link verified")
	public void the_make_orders_link_verified() {
	    AllMenuLinks_Page_Objects.MakeOrders.click();
	    DriverManager.getDriver().navigate().back();
	}
	@Given("the Operation Template link verified")
	public void the_operation_template_link_verified() {
	   AllMenuLinks_Page_Objects.OperationTemplate.click();
	}

	//Expenses:
	@Given("Expense Bill Menu Link Verified")
	public void expense_bill_menu_link_verified() {
		AllMenuLinks_Page_Objects.Expenses.click();  

	}
	@Given("Expense Bill Link Verified")
	public void expense_bill_link_verified() {
		AllMenuLinks_Page_Objects.ExpenseBill.click();
		String VisibleText  =DriverManager.getDriver().findElement(By.cssSelector("body > div.page-container > div.page-content-wrapper > div.content > div.container-fluid.px-3 > div.row.margin_top_heading > div.col-12.col-sm-8.align-items-center.justify-content-center.justify-content-sm-start.d-flex.mb-4.title_border > div > h2")).getText();
		Assert.assertTrue(VisibleText.contains("Expense Bills"));
	}
	@Given("Expense Payments Link Verified")
	public void expense_payments_link_verified() {
		AllMenuLinks_Page_Objects.ExpensePayments.click();
		String VisibleText  =DriverManager.getDriver().findElement(By.cssSelector("body > div.page-container > div.page-content-wrapper > div.content > div > div.row.margin_top_heading > div.col-12.col-sm-8.align-items-center.justify-content-center.justify-content-sm-start.d-flex.mb-4.title_border > div > h2")).getText();
		Assert.assertTrue(VisibleText.contains("Pay Expenses"));
	}
	
	@Given("the Recurring Expense Link verified")
	public void the_recurring_expense_link_verified() {
	    AllMenuLinks_Page_Objects.RecurringExpense.click();
	}
	
//Jobs:
	
	@Given("the Jobs menu link verified")
	public void the_jobs_menu_link_verified() {
	    AllMenuLinks_Page_Objects.JobsMenu.click();
	}
	
	@Given("Projects link verified")
	public void projects_link_verified() throws InterruptedException {
	    AllMenuLinks_Page_Objects.Projects.click();
	    //DriverManager.getDriver().navigate().back();
	    Thread.sleep(5000);
	}
	
	@Given("the Service Jobs link verified")
	public void the_service_jobs_link_verified() {
		AllMenuLinks_Page_Objects.SJ.click();
	    AllMenuLinks_Page_Objects.ServiceJobs.click();
	}

	//Delivery Challan:	
	@Given("Delivery Challan link Verified")
	public void delivery_challan_link_verified() {
		AllMenuLinks_Page_Objects.DeliveryChallan.click();
		String VisibleText  =DriverManager.getDriver().findElement(By.cssSelector("body > div.page-container > div.page-content-wrapper > div.content > div > div.row.margin_top_heading > div.col-12.col-sm-8.align-items-center.justify-content-center.justify-content-sm-start.d-flex.title_border > div.ml-3 > div > h2 > h2")).getText();
		Assert.assertTrue(VisibleText.contains("Delivery Challan"));
	}

	//Banking:	
	@Given("Banking Menu Link Verified")
	public void banking_menu_link_verified() {
		AllMenuLinks_Page_Objects.BankingMenu.click();

	}
	@Given("Bank and Cash Link Verified")
	public void bank_and_cash_link_verified() {
		AllMenuLinks_Page_Objects.BankandCash.click();
		String VisibleText  =DriverManager.getDriver().findElement(By.cssSelector("body > div.page-container > div.page-content-wrapper > div > div > div.row.margin_top_heading > div.col-12.col-sm-8.align-items-center.justify-content-center.justify-content-sm-start.d-flex.mb-4.title_border > div > h2")).getText();
		Assert.assertTrue(VisibleText.contains("Bank & Cash"));
	}
	@Given("TransferContra Link Verified")
	public void transfer_contra_link_verified() {
		AllMenuLinks_Page_Objects.TransferContra.click();
		String VisibleText  =DriverManager.getDriver().findElement(By.cssSelector("body > div.page-container > div.page-content-wrapper > div.content > div > div.row.margin_top_heading > div.col-12.col-sm-8.align-items-center.justify-content-center.justify-content-sm-start.d-flex.mb-4.title_border > div > h2")).getText();
		Assert.assertTrue(VisibleText.contains("Transfer(Contra)"));
	}
	@Given("Owner Equity Link Verified")
	public void owner_equity_link_verified() {
		AllMenuLinks_Page_Objects.OwnerEquity.click();
		String VisibleText  =DriverManager.getDriver().findElement(By.cssSelector("body > div.page-container > div.page-content-wrapper > div.content > div > div.row.margin_top_heading > div.col-12.col-sm-8.align-items-center.justify-content-center.justify-content-sm-start.d-flex.mb-4.title_border > div > h2")).getText();
		Assert.assertTrue(VisibleText.contains("Owner Equity"));
	}

	//Accounts	
	@Given("Accounts Menu Link Verified")
	public void accounts_menu_link_verified() {
		AllMenuLinks_Page_Objects.Accounts.click();

	}
	@Given("Chart of Accounts Link Verified")
	public void chart_of_accounts_link_verified() throws InterruptedException {
		AllMenuLinks_Page_Objects.ChartofAccounts.click();
		String VisibleText  =DriverManager.getDriver().findElement(By.cssSelector("body > div.page-container > div.page-content-wrapper > div.content > div > div.row.margin_top_heading > div.col-12.col-sm-8.align-items-center.justify-content-center.justify-content-sm-start.d-flex.mb-4.title_border > div > h2")).getText();
		Assert.assertTrue(VisibleText.contains("Chart of Accounts"));

	}
	@Given("Account Journals Link Verified")
	public void account_journals_link_verified() {
		AllMenuLinks_Page_Objects.AccountJournals.click();
		String VisibleText  =DriverManager.getDriver().findElement(By.cssSelector("body > div.page-container > div.page-content-wrapper > div.content > div > div.row.report_top_margin > div > div > h2")).getText();
		Assert.assertTrue(VisibleText.contains("Account Journal"));
	}

	@Given("Manual Journal Link Verified")
	public void manual_journal_link_verified() {
		AllMenuLinks_Page_Objects.ManualJournals.click();
		String VisibleText  =DriverManager.getDriver().findElement(By.cssSelector("body > div.page-container > div.page-content-wrapper > div.content > div > div.row.report_top_margin > div.col-12.col-sm-8.align-items-center.justify-content-center.justify-content-sm-start.d-flex.title_border > div > h2")).getText();
		Assert.assertTrue(VisibleText.contains("Manual Journal"));
	}
	//Stocks:	
	@Given("Stocks Menu Link Verified")
	public void stocks_menu_link_verified() {
		AllMenuLinks_Page_Objects.Stocks.click();

	}
	@Given("Stock Transfer Link Verified")
	public void stock_transfer_link_verified() {
		AllMenuLinks_Page_Objects.StockTransfer.click();
		String VisibleText  =DriverManager.getDriver().findElement(By.cssSelector("body > div.page-container > div.page-content-wrapper > div.content > div > div.row.margin_top_heading > div.col-12.col-sm-8.align-items-center.justify-content-center.justify-content-sm-start.d-flex.mb-4.title_border > div > h2")).getText();
		Assert.assertTrue(VisibleText.contains("Stock Transfer"));
	}
	@Given("Opening Stock Link Verified")
	public void opening_stock_link_verified() {
		AllMenuLinks_Page_Objects.OpeningStock.click();
		String VisibleText  =DriverManager.getDriver().findElement(By.cssSelector("body > div.page-container > div.page-content-wrapper > div.content > div > div.row.margin_top_heading > div > div > h2")).getText();
		Assert.assertTrue(VisibleText.contains("Opening Stock"));
	}
	
//TimeSheets:
	@Given("Timesheet link verified")
	public void timesheet_link_verified() {
	    AllMenuLinks_Page_Objects.Timesheets.click();
	}
	
//Reports	
	@Given("Report Link Verified")
	public void report_link_verified() {
		AllMenuLinks_Page_Objects.Report.click();
		String VisibleText  =DriverManager.getDriver().findElement(By.cssSelector("body > div.page-container > div.page-content-wrapper > div.content > div > div.row.margin_top_heading > div > div > h2")).getText();
		Assert.assertTrue(VisibleText.contains("Reports"));
	}

	//Employee	
	@Given("Employee Menu Link Verified")
	public void employee_menu_link_verified() throws InterruptedException {
		AllMenuLinks_Page_Objects.EmployeeMenu.click();
		Thread.sleep(1000);
		Thread.sleep(2000);

	}
	@Given("Employee link verified")
	public void employee_link_verified() throws InterruptedException {
		AllMenuLinks_Page_Objects.Employee.click();
		Thread.sleep(3000);
		//String VisibleText  =DriverManager.getDriver().findElement(By.cssSelector("body > div.page-container > div.page-content-wrapper > div.content > div > div.row.margin_top_heading > div.col-12.col-sm-8.align-items-center.justify-content-center.justify-content-sm-start.d-flex.mb-4.title_border > div > h2")).getText();
		//Assert.assertTrue(VisibleText.contains("Employees"));
	    //WebElement emp =DriverManager.getDriver().findElement(By.linkText("Labour Wages"));
	  //JavascriptExecutor jse = (JavascriptExecutor)DriverManager.getDriver();
	  //jse.executeScript("argument[0].scrollIntoView", emp);
		WebElement sideMenu = DriverManager.getDriver().findElement(By.id("mainMenu"));
		scrollToElement(DriverManager.getDriver(), sideMenu);
	}
	

	private void scrollToElement(WebDriver driver, WebElement sideMenu) {
		// TODO Auto-generated method stub
		JavascriptExecutor jsExecutor = (JavascriptExecutor) driver;
		jsExecutor.executeScript("arguments[0].scrollIntoView(true);", sideMenu);
	}

	@Given("Employee Salaries Link Verified")
	public void employee_salaries_link_verified() throws InterruptedException {
		AllMenuLinks_Page_Objects.EmployeeSalaries.click();
		//String VisibleText  =DriverManager.getDriver().findElement(By.cssSelector("body > div.page-container > div.page-content-wrapper > div.content > div.container-fluid.px-3.emp-salary-cont > div.row.margin_top_heading > div.col-12.col-sm-8.align-items-center.justify-content-center.justify-content-sm-start.d-flex.mb-4.title_border > div > h2")).getText();
		//Assert.assertTrue(VisibleText.contains("Employee Salary"));
		
	}
	@Given("Employee Shift Link Verified")
	public void employee_shift_link_verified() throws InterruptedException {
		AllMenuLinks_Page_Objects.EmployeeShift.click();
		//String VisibleText  =DriverManager.getDriver().findElement(By.cssSelector("body > div.page-container > div.page-content-wrapper > div.content > div > div.row.margin_top_heading > div.col-12.col-sm-8.align-items-center.justify-content-center.justify-content-sm-start.d-flex.mb-4.title_border > div > h2")).getText();
		//Assert.assertTrue(VisibleText.contains("Shift"));
		Thread.sleep(2500);
		JavascriptExecutor js = (JavascriptExecutor) DriverManager.getDriver();
		js.executeScript("window.scrollBy(0,500)","");
		Thread.sleep(200);
	}
	@Given("Labour Wages Link Verified")
	public void labour_wages_link_verified() throws InterruptedException {
		JavascriptExecutor js = (JavascriptExecutor) DriverManager.getDriver();
		js.executeScript("window.scrollBy(0,450)");
		Thread.sleep(200);
		AllMenuLinks_Page_Objects.LabourWages.click();
		String VisibleText  =DriverManager.getDriver().findElement(By.cssSelector("body > div.page-container > div.page-content-wrapper > div.content > div.container-fluid.px-3 > div.row.margin_top_heading > div.col-12.col-sm-8.align-items-center.justify-content-center.justify-content-sm-start.d-flex.mb-4.title_border > div > h2")).getText();
		Assert.assertTrue(VisibleText.contains("Labour Wages"));
		Thread.sleep(1500);
	}
	@Given("Employees Manual Journal Link Verified")
	public void employees_manual_journal_link_verified() throws InterruptedException {
		JavascriptExecutor js = (JavascriptExecutor) DriverManager.getDriver();
		js.executeScript("window.scrollBy(0,450)", "");
		Thread.sleep(200);
	   AllMenuLinks_Page_Objects.EmpManualJournal.click();
	}

	//TCS TDS	
	@Given("TCS TDS Menu Link Verified")
	public void tcs_tds_menu_link_verified() throws InterruptedException {
		JavascriptExecutor js = (JavascriptExecutor) DriverManager.getDriver();
		js.executeScript("window.scrollBy(0,450)", "");
		Thread.sleep(200);
		AllMenuLinks_Page_Objects.TCSTDS.click();  

	}
	@Given("TDS Payment Link Verified")
	public void tds_payment_link_verified() throws InterruptedException {
		JavascriptExecutor js = (JavascriptExecutor) DriverManager.getDriver();
		js.executeScript("window.scrollBy(0,450)", "");
		Thread.sleep(200);
		AllMenuLinks_Page_Objects.TDSPayment.click();
		String VisibleText  =DriverManager.getDriver().findElement(By.cssSelector("#title_text")).getText();
		Assert.assertTrue(VisibleText.contains("TDS Payment"));
	}
	@Given("TCS Payment Link Verified")
	public void tcs_payment_link_verified() throws InterruptedException {
		JavascriptExecutor js = (JavascriptExecutor) DriverManager.getDriver();
		js.executeScript("window.scrollBy(0,450)", "");
		Thread.sleep(200);
		AllMenuLinks_Page_Objects.TCSPayment.click();
		String VisibleText  =DriverManager.getDriver().findElement(By.cssSelector("#title_text")).getText();
		Assert.assertTrue(VisibleText.contains("TCS Payment"));
	}

	//GSTR Filing	
	@Given("GSTR Filling Link Verified")
	public void gstr_filling_link_verified() throws InterruptedException {
		JavascriptExecutor js = (JavascriptExecutor) DriverManager.getDriver();
		js.executeScript("window.scrollBy(0,450)", "");
		Thread.sleep(200);
		AllMenuLinks_Page_Objects.GSTRFilling.click();
		String VisibleText  =DriverManager.getDriver().findElement(By.cssSelector("body > div.page-container > div.page-content-wrapper > div.content > div > div.row.margin_top_heading.px-3 > div > div > h2")).getText();
		Assert.assertTrue(VisibleText.contains("GSTR Filling"));
	}
	@Given("Settings Link Verified")
	public void settings_link_verified() throws InterruptedException {
		JavascriptExecutor js = (JavascriptExecutor) DriverManager.getDriver();
		js.executeScript("window.scrollBy(0,450)", "");
		Thread.sleep(200);
		AllMenuLinks_Page_Objects.Settings.click();

	}



}
