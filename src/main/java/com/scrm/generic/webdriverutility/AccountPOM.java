package com.scrm.generic.webdriverutility;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AccountPOM 
{
	private WebDriver driver;

	public AccountPOM(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this); // Important for @FindBy annotations
	}

	@FindBy(id = "grouptab_0")
	private WebElement sales;

	@FindBy(linkText = "Accounts")
	private WebElement AccountLinktext;

	@FindBy(xpath = "//div[contains(text(),\"Create Account\")]")
	private WebElement createAccount;

	@FindBy(xpath = "//div[contains(text(),\"View Accounts\")]")
	private WebElement viewAccounts;

	@FindBy(xpath = "//div[contains(text(),\"Import Accounts\")]")
	private WebElement importAccount;

	@FindBy(id = "name")
	private WebElement accountHolderName;
	
	@FindBy(id = "phone_office")
	private WebElement officePhone;
	
	@FindBy(id = "website")
	private WebElement website;
	
	@FindBy(id = "phone_fax")
	private WebElement fax;
	
	@FindBy(id = "Accounts0emailAddress0")
	private WebElement AccountsHolderemailAddress;
	
	
	@FindBy(id = "Accounts0emailAddressPrimaryFlag")
	private WebElement AccountHolderPromaryAddress;
	
	@FindBy(id = "Accounts0emailAddressOptOutFlag0")
	private WebElement AccountsemailAddressOptOutFlag;
	
	@FindBy(id = "Accounts0emailAddressInvalidFlag0")
	private WebElement AccountsemailAddressInvalidFlag;
	
	@FindBy(id = "billing_address_street")
	private WebElement billingAddressAstreet;
	
	@FindBy(id = "shipping_address_street")
	private WebElement shippingAddressStreet;
	
	@FindBy(id = "billing_address_city")
	private WebElement billingAddressCity;
	
	@FindBy(id = "shipping_address_city")
	private WebElement shippingAddressCity;
	
	@FindBy(id = "billing_address_state")
	private WebElement billingAddressState;
	
	@FindBy(id = "shipping_address_state")
	private WebElement shippingAddressState;
	
	@FindBy(id = "billing_address_postalcode")
	private WebElement billingAddressPostalcode;
	
	@FindBy(id = "shipping_address_postalcode")
	private WebElement shippingAddressPostalcode;
	
	@FindBy(id = "billing_address_country")
	private WebElement billingAddressCountry;
	
	@FindBy(id = "shipping_address_country")
	private WebElement shippingAddressCountry;
	
	@FindBy(id = "shipping_checkbox")
	private WebElement shippingCheckbox;
	
	@FindBy(id = "description")
	private WebElement description;
	
	@FindBy(id = "account_type")
	private WebElement accountType;
	
	@FindBy(id = "industry")
	private WebElement industry;
	
	@FindBy(id = "annual_revenue")
	private WebElement annual_revenue;
	
	@FindBy(id = "employees")
	private WebElement employees;
	
	@FindBy(id = "parent_name")
	private WebElement parentName;
	
	@FindBy(id = "campaign_name")
	private WebElement campaignName;
	
	@FindBy(xpath  = "(//input[@title=\"Save\"])[2]")
	private WebElement saveButton;
	
	@FindBy(id = "CANCEL")
	private WebElement cancelButton;

	public WebDriver getDriver() {
		return driver;
	}

	public WebElement getSales() {
		return sales;
	}

	public WebElement getAccountLinktext() {
		return AccountLinktext;
	}

	public WebElement getCreateAccount() {
		return createAccount;
	}

	public WebElement getViewAccounts() {
		return viewAccounts;
	}

	public WebElement getImportAccount() {
		return importAccount;
	}

	public WebElement getAccountHolderName() {
		return accountHolderName;
	}

	public WebElement getOfficePhone() {
		return officePhone;
	}

	public WebElement getWebsite() {
		return website;
	}

	public WebElement getFax() {
		return fax;
	}

	public WebElement getAccountsHolderemailAddress() {
		return AccountsHolderemailAddress;
	}

	public WebElement getAccountHolderPromaryAddress() {
		return AccountHolderPromaryAddress;
	}

	public WebElement getAccountsemailAddressOptOutFlag() {
		return AccountsemailAddressOptOutFlag;
	}

	public WebElement getAccountsemailAddressInvalidFlag() {
		return AccountsemailAddressInvalidFlag;
	}

	public WebElement getBillingAddressAstreet() {
		return billingAddressAstreet;
	}

	public WebElement getShippingAddressStreet() {
		return shippingAddressStreet;
	}

	public WebElement getBillingAddressCity() {
		return billingAddressCity;
	}

	public WebElement getShippingAddressCity() {
		return shippingAddressCity;
	}

	public WebElement getBillingAddressState() {
		return billingAddressState;
	}

	public WebElement getShippingAddressState() {
		return shippingAddressState;
	}

	public WebElement getBillingAddressPostalcode() {
		return billingAddressPostalcode;
	}

	public WebElement getShippingAddressPostalcode() {
		return shippingAddressPostalcode;
	}

	public WebElement getBillingAddressCountry() {
		return billingAddressCountry;
	}

	public WebElement getShippingAddressCountry() {
		return shippingAddressCountry;
	}

	public WebElement getShippingCheckbox() {
		return shippingCheckbox;
	}

	public WebElement getDescription() {
		return description;
	}

	public WebElement getAccountType() {
		return accountType;
	}

	public WebElement getIndustry() {
		return industry;
	}

	public WebElement getAnnual_revenue() {
		return annual_revenue;
	}

	public WebElement getEmployees() {
		return employees;
	}

	public WebElement getParentName() {
		return parentName;
	}

	public WebElement getCampaignName() {
		return campaignName;
	}

	public WebElement getSaveButton() {
		return saveButton;
	}

	public WebElement getCancelButton() {
		return cancelButton;
	}
	
	
	
	
}
