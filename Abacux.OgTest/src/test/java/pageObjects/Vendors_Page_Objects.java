package pageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Vendors_Page_Objects {

	private static Vendors_Page_Objects VendorsInstance;
	private Vendors_Page_Objects() {
	}
	public static Vendors_Page_Objects getInstance() {
		if(VendorsInstance==null) {
			VendorsInstance= new Vendors_Page_Objects();
		}
		return VendorsInstance;
		
	}
		@FindBy(id = "addmodal")
		public static WebElement AddNewVendor;
		
		@FindBy(id = "business")
		public static WebElement business;
		
		@FindBy(id = "individual")
		public static WebElement individual;
		
		@FindBy(id = "vendor_bill_name")
		public static WebElement CompanyName;
		
		@FindBy(id = "select2-salutation-container")
		public static WebElement SalutationDropDown;
		
		@FindBy(xpath = "//*[@id=\"smallModalPopuptarget3\"]/span/span/span[1]/input")
		public static WebElement SalutaionInput;
		
		@FindBy(id = "vendorname_add")
		public static WebElement FirstName;
		
		@FindBy(id = "last_name")
		public static WebElement LastName;
		
		@FindBy(id = "nick_name")
		public static WebElement nick_name;
		
		@FindBy(xpath = "//*[@id=\"vendoradd_form\"]/div[3]/div/div[2]/div[2]/div/span/span[1]/span")
		public static WebElement DisplaynameDropdown;
		
		@FindBy(xpath = "/html/body/span/span/span[1]/input")
		public static WebElement DisplaynameInputField;
		
		@FindBy(xpath = "//*[@id=\"vendoradd_form\"]/div[3]/div/div[2]/div[3]/div[1]/span/span[1]/span")
		public static WebElement BillingName;
		
		@FindBy(xpath = "/html/body/span/span/span[1]/input")
		public static WebElement BillingNameInputField;
		
		@FindBy(id = "vendor_contact_no_one")
		public static WebElement PrimaryMobileNo;
		
		@FindBy(id = "whatsapp")
		public static WebElement whatsappNoInputfield;
		
		@FindBy(id = "number_check")
		public static WebElement WhatsappnumberCheckbox;
		
		@FindBy(id = "vendor_gmail")
		public static WebElement vendor_gmail;
		
		@FindBy(id = "opening_balance")
		public static WebElement opening_balance;
		
		@FindBy(id = "datepicker-component2")
		public static WebElement AsofDatePicker;
		
		@FindBy(id = "select2-term_select-container")
		public static WebElement Terms;
		
		@FindBy(xpath = "//*[@id=\"smallModalPopuptarget3\"]/span/span/span[1]/input")
		public static WebElement TermsInputField;
		
		@FindBy(id = "select2-vendor_parentaccount_id-container")
		public static WebElement Account;
		
//Tax Details	
		@FindBy(xpath = "//*[@id=\"VendorTaxDetailsTab\"]/div[2]/div[1]/div[1]/div/span/span[1]/span")
		public static WebElement GstTreatment;
		
		@FindBy(xpath = "//*[@id=\"vendoradd_form\"]/div[4]/span/span/span[1]/input")
		public static WebElement GstInputField;
		
		@FindBy(id = "pan_number")
		public static WebElement pan_number;
		
		@FindBy(id = "gstin_no")
		public static WebElement gstin_no;
		
		@FindBy(xpath = "//*[@id=\"VendorTaxDetailsTab\"]/div[2]/div[1]/div[4]/div/span/span[1]/span")
		public static WebElement SourceOfSupply;
		
		@FindBy(xpath = "//*[@id=\"vendoradd_form\"]/div[4]/span/span/span[1]/input")
		public static WebElement SoSInputField;
		
		@FindBy(xpath = "/html/body/div[5]/div/div/div/div/div/div/div[3]/div/form/div[4]/div/div[1]/div[2]/div[1]/div[5]/div/div/span")
		public static WebElement GSTValidate;
		
//Address:		
		@FindBy(xpath = "/html/body/div[5]/div/div/div/div/div/div/div[3]/div/form/div[4]/ul/li[2]")
		public static WebElement AddressTab;
		
		@FindBy(id = "vendor_attention")
		public static WebElement vendor_attention;
		
		@FindBy(xpath = "//*[@id=\"VendorAddressTab\"]/div/div[1]/div[1]/div[3]/div/span/span[1]/span")
		public static WebElement Country;
		
		@FindBy(xpath = "//*[@id=\"vendoradd_form\"]/div[4]/span/span/span[1]/input")
		public static WebElement CountryInput;
		
		@FindBy(id = "vendor_address")
		public static WebElement Address;
		
		@FindBy(xpath = "//*[@id=\"VendorAddressTab\"]/div/div[1]/div[1]/div[5]/div/span/span[1]/span")
		public static WebElement State;
		
		@FindBy(xpath = "/html/body/div[5]/div/div/div/div/div/div/div[3]/div/form/div[4]/span/span/span[1]/input")
		public static WebElement StateInput;
		
		@FindBy(xpath = "/html/body/div/div/div/div/div/div[3]/div/form/div[4]/div[2]/div[3]/div/div[1]/div[1]/div[6]/div/span/span[1]/span")
		public static WebElement City;
		
		@FindBy(xpath = "//*[@id=\"vendoradd_form\"]/div[4]/span/span/span[1]/input")
		public static WebElement CityInput;
		
		@FindBy(id = "vendor_town")
		public static WebElement Town;
		
		@FindBy(id = "vendor_zipcode")
		public static WebElement vendor_zipcode;
		
		@FindBy(id = "vendor_phone")
		public static WebElement vendor_phone;
		
		@FindBy(id = "vendor_fax")
		public static WebElement vendor_fax;
		
		@FindBy(xpath = "/html/body/div[5]/div/div/div/div/div/div/div[3]/div/form/div[4]/div/div[3]/div/div[1]/div[2]/div[10]")
		public static WebElement SameAsBillingAddress;
		
//Bank Details:		
		@FindBy(xpath = "/html/body/div[5]/div/div/div/div/div/div/div[3]/div/form/div[4]/ul/li[3]/a")
		public static WebElement BankDetailsTab;
		
		@FindBy(id = "beneficiary_name1")
		public static WebElement beneficiary_name;
		
		@FindBy(id = "beneficiary_name2")
		public static WebElement beneficiary_name2;
		
		@FindBy(id = "bank_name1")
		public static WebElement bank_name;
		
		@FindBy(id = "bank_name2")
		public static WebElement bank_name2;
		
		@FindBy(id = "account_number1")
		public static WebElement account_number;
		
		@FindBy(id = "account_number2")
		public static WebElement account_number2;
		
		@FindBy(id = "reenter_account_number1")
		public static WebElement reenter_account_number;
		
		@FindBy(id = "reenter_account_number2")
		public static WebElement reenter_account_number2;
		
		@FindBy(id = "ifsc1")
		public static WebElement ifsc;
		
		@FindBy(id = "ifsc2")
		public static WebElement ifsc2;
		
		@FindBy(id = "add_new_bank_details")
		public static WebElement AddBank;
		
//Remarks:		
		@FindBy(xpath = "/html/body/div[5]/div/div/div/div/div/div/div[3]/div/form/div[4]/ul/li[4]/a")
		public static WebElement RemarksTab;
		
		@FindBy(id = "remarks")
		public static WebElement remarks;
		
//Others Details:	
		@FindBy(xpath = "/html/body/div[5]/div/div/div/div/div/div/div[3]/div/form/div[4]/ul/li[5]/a")
		public static WebElement OtherDetailsTab;
		
		@FindBy(id = "facebook_url")
		public static WebElement facebook_url;
		
		@FindBy(id = "twitter_url")
		public static WebElement twitter_url;
		
		@FindBy(xpath = "/html/body/div[5]/div/div/div/div/div/div/div[3]/div/form/div[4]/div/div[2]/div/div[3]/div/input")
		public static WebElement location_url;
		
		@FindBy(id = "vendors_submit")
		public static WebElement vendors_submit;
		
//Vendors Action Menu:
		@FindBy(xpath = "/html/body/div[2]/div[5]/div[1]/div/div[2]/div[4]/div/div[1]/div/table/tbody/tr[1]/td[9]/div/ul/li/div/a/i")
		public static WebElement ActionBtn;
		
		@FindBy(id = "editid1")
		public static WebElement VendorEdit;
		
		@FindBy(xpath = "/html/body/ul/li[2]/a[2]/button")
		public static WebElement VendorDelete;
		
		@FindBy(xpath = "/html/body/ul/li[3]/a/button")
		public static WebElement VendorView;
		
		
		
		

	}

