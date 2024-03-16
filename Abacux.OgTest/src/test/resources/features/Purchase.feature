Feature: To check the Add, Edit, Delete options

  Scenario: Check the Add Vendors Functions
    Given Login Page Verified to Check the Vendor Add Function
    Given the Purchase Verified 
    Given the Vendors Verified to check the Add Vendor option
    And Click the New Vendor option
    Given Vendor Type Business has been Selected
    Given Company name has been entered
    Given Salutation has been selected
    Given Frist Name has been Entered
    Given Last Name has been Entered
    Given Nick Name has been Entered
    Given company name exists in the display name
    Given company name exists in the Billing name
    Given Conatact Number has been Entered
    Given Whatsapp number entered same as contact number
    Given Vendor Email has been entered
    Given opeing balance has been entered
    Given As of Date has been Selected
    Given Terms has beed selected 
    Given Account Type has been verified its a Account Payable
    Given Tax Details are Entered
    Given Address Details are Entered
    Given Bank Details are Entered
    Given Remarks Entered
    Given Other Details are Entered
    Given Details are Saved

Scenario: Check the Vendor Action Menu
    Given the Action Button Verified
    Given the Edit option Verified
    Given the Delete option verified
    Given the View option verified
   
  Scenario: Check the Multi Vendor Purchase Orders
   Given the Multi Vendor PO Link Verified
   Given the new MPO Clicked
   Given the Product Selected
   Given the Party Selected
   Given the QTY Selected
   Given the Rete Selected
   Given the Tax Selected
   Given the Tax Type Selected
   Given the Discount Selected
       