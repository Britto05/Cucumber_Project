package stepDefinitions;

import java.awt.AWTException;
import java.awt.Robot;

import io.cucumber.java.en.Given;
import io.github.bonigarcia.wdm.WebDriverManager;
import pageObjects.AllMenuLinks_Page_Objects;
import pageObjects.ReportLinks_Page_Objects;
import webDriverManager.DriverManager;

public class AllReportLinks {
	

	@Given("Report Menu Link Verified")
	public void report_menu_link_verified() {
		AllMenuLinks_Page_Objects.DashboardMenu.click();
		AllMenuLinks_Page_Objects.Report.click();
	}
	//Account Reports

	@Given("Balance Sheet Link Verified")
	public void balance_sheet_link_verified() {
		ReportLinks_Page_Objects.Balance_Sheet.click();
		AllMenuLinks_Page_Objects.Report.click();
	}
	@Given("Profit and Loss Link Verified")
	public void profit_and_loss_link_verified() {
		ReportLinks_Page_Objects.ProfitAndLoss.click();
		AllMenuLinks_Page_Objects.Report.click();
	}
	@Given("Trial Balance Link Verified")
	public void trial_balance_link_verified() {
		ReportLinks_Page_Objects.Trial_Balance.click();
		AllMenuLinks_Page_Objects.Report.click();
		
	}
	@Given("Journal Report Link Verified")
	public void journal_report_link_verified() throws InterruptedException {
		ReportLinks_Page_Objects.Journal_Report.click();
		Thread.sleep(1500);
		DriverManager.getDriver().navigate().back();
		AllMenuLinks_Page_Objects.Report.click();
	}
	@Given("Daybook Link Verified")
	public void daybook_link_verified() {
		ReportLinks_Page_Objects.Daybook.click();
		AllMenuLinks_Page_Objects.Report.click();
	}
	@Given("Daybook Lite Link Verified")
	public void daybook_lite_link_verified() {
		ReportLinks_Page_Objects.DaybookLite.click();
		AllMenuLinks_Page_Objects.Report.click();
	}
	@Given("Customer Balance Link Verified")
	public void customer_balance_link_verified() {
		ReportLinks_Page_Objects.Customer_Balance.click();
		AllMenuLinks_Page_Objects.Report.click();
	}
	@Given("Account Receivables Link Verified")
	public void account_receivables_link_verified() {
	    ReportLinks_Page_Objects.AccountReceivables.click();
	    AllMenuLinks_Page_Objects.Report.click();
	}
	@Given("Account Receivables Aging Summary Report Link Verified")
	public void account_receivables_aging_summary_report_link_verified() {
	   ReportLinks_Page_Objects.ARAgingSummaryReport.click();
	   AllMenuLinks_Page_Objects.Report.click();
	}
	
	@Given("Account Receivables Aging Details Report Link Verified")
	public void account_receivables_aging_details_report_link_verified() {
	   ReportLinks_Page_Objects.AccountReceivablesAgingDetailsReport.click();
	   AllMenuLinks_Page_Objects.Report.click();
	}
	@Given("Vendor Balance Link Verified")
	public void vendor_balance_link_verified() {
		ReportLinks_Page_Objects.Vendor_Balance.click();
		AllMenuLinks_Page_Objects.Report.click();
	}
	@Given("Account Payable Link Verified")
	public void account_payable_link_verified() {
	   ReportLinks_Page_Objects.AccountPayables.click();
	   AllMenuLinks_Page_Objects.Report.click();
	}
	@Given("Account Payable Aging Summary Report Link Verified")
	public void account_payable_aging_summary_report_link_verified() {
	    ReportLinks_Page_Objects.APAgingSummaryReport.click();
	    AllMenuLinks_Page_Objects.Report.click();
	}
	@Given("Account Payables Aging Details Report Link Verified")
	public void account_payables_aging_details_report_link_verified() {
	   ReportLinks_Page_Objects.AccountPayablesAgingDetailsReport.click();
	   AllMenuLinks_Page_Objects.Report.click();
	}
	@Given("Customer Details Report Link Verified")
	public void customer_details_report_link_verified() {
		ReportLinks_Page_Objects.CustomerDetailsReport.click();
		AllMenuLinks_Page_Objects.Report.click();
	}
	@Given("Owner Equity Report Link Verified")
	public void owner_equity_report_link_verified() {
		ReportLinks_Page_Objects.Owner_Equity.click();
		AllMenuLinks_Page_Objects.Report.click();
	}

	//SALES REPORTS	
	@Given("Sales Invoice Link Verified")
	public void sales_invoice_link_verified() {
		ReportLinks_Page_Objects.SalesInvoiceReport.click();
		AllMenuLinks_Page_Objects.Report.click();
	}
	@Given("Sales Invoice - Cancelled Link Verified")
	public void sales_invoice_cancelled_link_verified() {
		ReportLinks_Page_Objects.SalesInvoiceCancelled.click();
		AllMenuLinks_Page_Objects.Report.click();
	}
	@Given("Sales Invoice - Details Link Verified")
	public void sales_invoice_details_link_verified() {
		ReportLinks_Page_Objects.SalesInvoiceDetails.click();
		AllMenuLinks_Page_Objects.Report.click();
	}
	@Given("Estimate Bills Link Verified")
	public void estimate_bills_link_verified() {
		ReportLinks_Page_Objects.EstimateBills.click();
		AllMenuLinks_Page_Objects.Report.click();
	}
	@Given("Sales Invoice Overdue Link Verified")
	public void sales_invoice_overdue_link_verified() {
		ReportLinks_Page_Objects.SalesInvoiceOverdue.click();
		AllMenuLinks_Page_Objects.Report.click();
	}
	@Given("Sales Invoice Report - Referral Link Verified")
	public void sales_invoice_report_referral_link_verified() {
		ReportLinks_Page_Objects.SalesInvoiceReportReferral.click();
		AllMenuLinks_Page_Objects.Report.click();
	}
	@Given("Sales Invoice Report - SalesPerson Link Verified")
	public void sales_invoice_report_sales_person_link_verified() {
		ReportLinks_Page_Objects.SalesInvoiceReportSalesPerson.click();
		AllMenuLinks_Page_Objects.Report.click();
	}
	@Given("Sales Quantity Report - SalesPerson link verified")
	public void sales_quantity_report_sales_person_link_verified() {
		ReportLinks_Page_Objects.SalesQuantityReportSalesPerson.click();
		AllMenuLinks_Page_Objects.Report.click();
	}
	@Given("Reward Points Link Verified")
	public void reward_points_link_verified() {
		ReportLinks_Page_Objects.RewardPoints.click();
		AllMenuLinks_Page_Objects.Report.click();
	}
	@Given("Agent Collections Link Verified")
	public void agent_collections_link_verified() {
		ReportLinks_Page_Objects.AgentCollections.click();
		AllMenuLinks_Page_Objects.Report.click();
	}
	@Given("Sales Orders Link Verified")
	public void sales_orders_link_verified() {
		ReportLinks_Page_Objects.SalesOrders.click();
		AllMenuLinks_Page_Objects.Report.click();
	}
	@Given("Credit Note Report Link Verified")
	public void credit_note_report_link_verified() {
		ReportLinks_Page_Objects.CreditNoteReport.click();
		AllMenuLinks_Page_Objects.Report.click();
	}
	@Given("Estimate to Sales Order Comparision Link Verified")
	public void estimate_to_sales_order_comparision_link_verified() {
		ReportLinks_Page_Objects.EstimatetoSalesOrderComparison.click();
		AllMenuLinks_Page_Objects.Report.click();
	}
	@Given("Sales Order to Sales Invoice Comparision Link Verified")
	public void sales_order_to_sales_invoice_comparision_link_verified() {
		ReportLinks_Page_Objects.SalesOrdertoSalesInvoiceComparison.click();
		AllMenuLinks_Page_Objects.Report.click();
	}
	@Given("Amc Lmc Report Link Verified")
	public void amc_lmc_report_link_verified() throws InterruptedException {
		ReportLinks_Page_Objects.AmcLmcReport.click();
		Thread.sleep(1000);
		AllMenuLinks_Page_Objects.Report.click();
		Thread.sleep(3000);
	}
	@Given("Coupon Based Sales Report Verified")
	public void coupon_based_sales_report_verified() {
		ReportLinks_Page_Objects.CouponBasedSalesReport.click();
		AllMenuLinks_Page_Objects.Report.click();
	}
	@Given("Sales Receipt - Sales Person Report Link Verified")
	public void sales_receipt_sales_person_report_link_verified() {
		ReportLinks_Page_Objects.SalesReceiptSalesPersonReport.click();
		AllMenuLinks_Page_Objects.Report.click();
	}
	@Given("Sales Receipt - Cheque Bounce Report Link Verified")
	public void sales_receipt_cheque_bounce_report_link_verified() {
	   ReportLinks_Page_Objects.SalesReceiptChequeBounceReport.click();
	   AllMenuLinks_Page_Objects.Report.click();
	}
	@Given("Sales Invoice Warranty Report Link Verified")
	public void sales_invoice_warranty_report_link_verified() {
		ReportLinks_Page_Objects.SalesInvoiceWarrantyReport.click();
		AllMenuLinks_Page_Objects.Report.click();
	}
	@Given("Sales Invoice Extended Warranty Report Link Verified")
	public void sales_invoice_extended_warranty_report_link_verified() {
		ReportLinks_Page_Objects.SalesInvoiceExtendedWarrantyReport.click();
		AllMenuLinks_Page_Objects.Report.click();
	}


	//Products Reports:	
	@Given("Inventory Valuation Summary Link Verified")
	public void inventory_valuation_summary_link_verified() throws InterruptedException {
		ReportLinks_Page_Objects.InventoryValuationSummary.click();
		AllMenuLinks_Page_Objects.Report.click();
	}
	@Given("Stock Report Link Verified")
	public void stock_report_link_verified() {
		ReportLinks_Page_Objects.StockReport.click();
		AllMenuLinks_Page_Objects.Report.click();
	}
	@Given("Stock Report details view Link Verified")
	public void stock_report_details_view_link_verified() {
		ReportLinks_Page_Objects.StockReportdetailsview.click();
		AllMenuLinks_Page_Objects.Report.click();
	}
	@Given("Stock History Report Link Verified")
	public void stock_history_report_link_verified() {
		ReportLinks_Page_Objects.StockHistoryReport.click();
		AllMenuLinks_Page_Objects.Report.click();
	}
	@Given("Stock Transfer Report Link Verified")
	public void stock_transfer_report_link_verified() {
		ReportLinks_Page_Objects.StockTransferReport.click();
		AllMenuLinks_Page_Objects.Report.click();
	}
	@Given("Global Search Link Verified")
	public void global_search_link_verified() {
		ReportLinks_Page_Objects.GlobalSearch.click();
		AllMenuLinks_Page_Objects.Report.click();
	}
	@Given("Less Stock Notifications Link Verified")
	public void less_stock_notifications_link_verified() {
		ReportLinks_Page_Objects.LessStockNotifications.click();
		AllMenuLinks_Page_Objects.Report.click();
	}
	@Given("Minimum Purchase Requirement Report Verified")
	public void minimum_purchase_requirement_report_verified() {
		ReportLinks_Page_Objects.MinimumPurchaseRequirementReport.click();
		AllMenuLinks_Page_Objects.Report.click();
	}
	@Given("Sales Summary Link Verified")
	public void sales_summary_link_verified() {
		ReportLinks_Page_Objects.SalesSummary.click();
		AllMenuLinks_Page_Objects.Report.click();
	}
	@Given("Product Based Stock Link Verified")
	public void product_based_stock_link_verified() {
		ReportLinks_Page_Objects.ProductBasedStock.click();
		AllMenuLinks_Page_Objects.Report.click();
	}
	@Given("Stock Checking Link Verified")
	public void stock_checking_link_verified() {
		ReportLinks_Page_Objects.StockChecking.click();
		AllMenuLinks_Page_Objects.Report.click();
	}
	@Given("Stock Check Report Link Verified")
	public void stock_check_report_link_verified() {
		ReportLinks_Page_Objects.StockCheckReport.click();
		AllMenuLinks_Page_Objects.Report.click();
	}
	@Given("HSN\\/SAC Summary Link Verified")
	public void hsn_sac_summary_link_verified() {
		ReportLinks_Page_Objects.HSNSACSummary.click();
		AllMenuLinks_Page_Objects.Report.click();
	}
	@Given("Product Based On Sale Type Report Verified")
	public void product_based_on_sale_type_report_verified() {
		ReportLinks_Page_Objects.ProductBasedOnSaleTypeReport.click();
		AllMenuLinks_Page_Objects.Report.click();
	}
	@Given("Product Batch Based Report Link Verified")
	public void product_batch_based_report_link_verified() {
	    ReportLinks_Page_Objects.ProductBatchBasedReport.click();
	    AllMenuLinks_Page_Objects.Report.click();
	}

	//PURCHASE REPORTS:	
	@Given("Purchase Order Link Verified")
	public void purchase_order_link_verified() {
		ReportLinks_Page_Objects.PurchaseOrder.click();
		AllMenuLinks_Page_Objects.Report.click();
	}
	@Given("Purchase Invoice Link Verified")
	public void purchase_invoice_link_verified() {
		ReportLinks_Page_Objects.PurchaseInvoice.click();
		AllMenuLinks_Page_Objects.Report.click();
	}
	@Given("Purchase Overdue Link Verified")
	public void purchase_overdue_link_verified() {
		ReportLinks_Page_Objects.PurchaseOverdue.click();
		AllMenuLinks_Page_Objects.Report.click();
	}
	@Given("Purchase Order Details Report Link Verified")
	public void purchase_order_details_report_link_verified() {
		ReportLinks_Page_Objects.PurchaseOrderDetails.click();
		AllMenuLinks_Page_Objects.Report.click();
	}
	@Given("Purchase Invoice Details Report Link Verified")
	public void purchase_invoice_details_report_link_verified() {
		ReportLinks_Page_Objects.PurchaseInvoiceDetails.click();
		AllMenuLinks_Page_Objects.Report.click();
	}
	@Given("Debit Note Report Link Verified")
	public void debit_note_report_link_verified() {
		ReportLinks_Page_Objects.DebitNoteReport.click();
		AllMenuLinks_Page_Objects.Report.click();
	}
	@Given("Pay Bill - Cheque Bounce Report Link Verified")
	public void pay_bill_cheque_bounce_report_link_verified() {
	   ReportLinks_Page_Objects.PayBillChequeBounceReport.click();
	   AllMenuLinks_Page_Objects.Report.click();
	}

	//GSTR REPORTS:	
	@Given("GSTR1 SalesInvoice Link Verified")
	public void gstr1_sales_invoice_link_verified() throws InterruptedException {
		Thread.sleep(5000);
		ReportLinks_Page_Objects.GSTR1SalesInvoice.click();
		AllMenuLinks_Page_Objects.Report.click();
	}
	@Given("GSTR2 PurchaseInvoice Link Verified")
	public void gstr2_purchase_invoice_link_verified() {
		ReportLinks_Page_Objects.GSTR2PurchaseInvoice.click();
		AllMenuLinks_Page_Objects.Report.click();
	}
	@Given("GSTR3B Link Verified")
	public void gstr3b_link_verified() {
		ReportLinks_Page_Objects.GSTR3B.click();
		AllMenuLinks_Page_Objects.Report.click();
	}

	//PURCHASE & SALES HISTORY:

	@Given("Sales and Purchase Comparison Link Verified")
	public void sales_and_purchase_comparison_link_verified() {
		ReportLinks_Page_Objects.SalesPurchaseComparison.click();
		AllMenuLinks_Page_Objects.Report.click();
	}
	@Given("Purchase and Sales Month Based Link Verified")
	public void purchase_and_sales_month_based_link_verified() {
		ReportLinks_Page_Objects.PurchaseSalesMonthBased.click();
		AllMenuLinks_Page_Objects.Report.click();
	}
	@Given("Date Based Purchase and Sales Link Verified")
	public void date_based_purchase_and_sales_link_verified() {
		ReportLinks_Page_Objects.DateBasedPurchaseSales.click();
		AllMenuLinks_Page_Objects.Report.click();
	}

	//EXPENSE REPORTS:

	@Given("Expense Payment Report Link Verified")
	public void expense_payment_report_link_verified() {
		ReportLinks_Page_Objects.ExpenseReport.click();
		AllMenuLinks_Page_Objects.Report.click();
	}
	@Given("Indirect Expense Account Summary Link Verified")
	public void indirect_expense_account_summary_link_verified() {
		ReportLinks_Page_Objects.ExpenseSummary.click();
		AllMenuLinks_Page_Objects.Report.click();
	}

	//AUDIT LOGS:

	@Given("Sales Receipts Logs Link Verified")
	public void sales_receipts_logs_link_verified() {
		ReportLinks_Page_Objects.SalesReceiptsLogs.click();
		AllMenuLinks_Page_Objects.Report.click();
	}
	@Given("Activity Logs & Audit Trail Link Verified")
	public void activity_logs_audit_trail_link_verified() {
	    ReportLinks_Page_Objects.ActivityLogsAuditTrail.click();
	    AllMenuLinks_Page_Objects.Report.click();
	}

	//MESSAGES:	
	@Given("Message History Link Verified")
	public void message_history_link_verified() {
		ReportLinks_Page_Objects.MessageHistory.click();
		AllMenuLinks_Page_Objects.Report.click();
	}

	//EMPLOYEE REPORT:

	@Given("Employee Profile Link Verified")
	public void employee_profile_link_verified() {
		ReportLinks_Page_Objects.EmployeeProfile.click();
		AllMenuLinks_Page_Objects.Report.click();
	}
	@Given("Employee Salary Report Link Verified")
	public void employee_salary_report_link_verified() {
		ReportLinks_Page_Objects.EmployeeSalaryReport.click();
		AllMenuLinks_Page_Objects.Report.click();
	}

	//PARTIES REPORT:

	@Given("Parties Profiles Link Verified")
	public void parties_profiles_link_verified() throws AWTException {
		//AllMenuLinks_Page_Objects.Report.click();
		ReportLinks_Page_Objects.PartiesProfiles.click();
		AllMenuLinks_Page_Objects.Report.click();
		//Robot robot = new Robot();	
	}

	//ATTENDANCE REPORT:

	@Given("Daily Attendance Link Verified")
	public void daily_attendance_link_verified() {
		ReportLinks_Page_Objects.DailyAttendance.click();
		AllMenuLinks_Page_Objects.Report.click();
	}
	@Given("Monthly Attendance Link Verified")
	public void monthly_attendance_link_verified() {
		ReportLinks_Page_Objects.MonthlyAttendance.click();
		AllMenuLinks_Page_Objects.Report.click();
	}
	@Given("Periodic Attendance Link Verified")
	public void periodic_attendance_link_verified() {
		ReportLinks_Page_Objects.PeriodicAttendance.click();
		AllMenuLinks_Page_Objects.Report.click();
	}
	@Given("Daily In-Out Details Link Verified")
	public void daily_in_out_details_link_verified() {
	   ReportLinks_Page_Objects.DailyIn_OutDetails.click();
	   AllMenuLinks_Page_Objects.Report.click();
	}

	//SUMMARY REPORTS:

	@Given("Expense Payable Report Link Verified")
	public void expense_payable_report_link_verified() {
		ReportLinks_Page_Objects.ExpensePayable.click();
		AllMenuLinks_Page_Objects.Report.click();
	}

	@Given("Cost of Sales Report Link Verified")
	public void cost_of_sales_report_link_verified() {
		ReportLinks_Page_Objects.CostofSales.click();
		AllMenuLinks_Page_Objects.Report.click();
	}
	@Given("Inventory Assets Link Verified")
	public void inventory_assets_link_verified() {
		ReportLinks_Page_Objects.InventoryAssets.click();
		AllMenuLinks_Page_Objects.Report.click();
	}
	@Given("Input Tax Link Verified")
	public void input_tax_link_verified() {
		ReportLinks_Page_Objects.InputTax.click();
		AllMenuLinks_Page_Objects.Report.click();
	}
	@Given("Output Tax Link Verified")
	public void output_tax_link_verified() {
		ReportLinks_Page_Objects.OutputTax.click();
		AllMenuLinks_Page_Objects.Report.click();
	}
	@Given("Tax paid Expense Link Verified")
	public void tax_paid_expense_link_verified() {
		ReportLinks_Page_Objects.TaxpaidExpense.click();
		AllMenuLinks_Page_Objects.Report.click();
	}
	@Given("TDS Payable Report Link Verified")
	public void tds_payable_report_link_verified() {
		ReportLinks_Page_Objects.TDSPayableReport.click();
		AllMenuLinks_Page_Objects.Report.click();
	}

	@Given("TCS Payable Report Link Verified")
	public void tcs_payable_report_link_verified() {
		ReportLinks_Page_Objects.TCSPayableReport.click();
		AllMenuLinks_Page_Objects.Report.click();
	}

	//TDS/TCS LEDGER	
	@Given("TDS Report Link Verified")
	public void tds_report_link_verified() {
		ReportLinks_Page_Objects.TDSReports.click();
		AllMenuLinks_Page_Objects.Report.click();
	}

	//BULK UPDATE
	@Given("Bulk Price Update Link Verified")
	public void bulk_price_update_link_verified() {
		ReportLinks_Page_Objects.BulkPriceUpdate.click();
		AllMenuLinks_Page_Objects.Report.click();
	}

	//TIMESHEETS
	@Given("Timesheet Link Verified")
	public void timesheet_link_verified() {
		ReportLinks_Page_Objects.TimesheetReport.click();
	    AllMenuLinks_Page_Objects.Report.click();
	}
	//PROJECT REPORTS
	@Given("Bank and Cash Reports Link Verified")
	public void bank_and_cash_reports_link_verified() {
		ReportLinks_Page_Objects.BankandCashReports.click();
		AllMenuLinks_Page_Objects.Report.click();
	}
	@Given("Projects Reports Link Verified")
	public void projects_reports_link_verified() {
		ReportLinks_Page_Objects.ProjectsReports.click();
		AllMenuLinks_Page_Objects.Report.click();
	}

	//Service Job Report
	@Given("Service Jobs Reports Link Verified")
	public void service_jobs_reports_link_verified() {
	   ReportLinks_Page_Objects.ServiceJobsReports.click();
	   AllMenuLinks_Page_Objects.Report.click();
	}
}
