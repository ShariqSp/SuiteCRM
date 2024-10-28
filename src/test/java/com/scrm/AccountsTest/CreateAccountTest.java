package com.scrm.AccountsTest;

import static org.testng.Assert.fail;

import java.io.IOException;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import org.testng.asserts.Assertion;

import com.aventstack.extentreports.util.Assert;
import com.google.errorprone.annotations.ThreadSafe;
import com.scrm.BaseTest.baseClass;
import com.scrm.generic.javautility.javaUtility;
import com.scrm.generic.webdriverutility.AccountPOM;
import com.scrm.generic.webdriverutility.loginPOM;


@Listeners(com.scrm.BaseTest.listenerIMplementation.class) 
public class CreateAccountTest extends baseClass {


	@Test
	public void testCreateAcountTest() throws InterruptedException, IOException
	{
		String randomName=javaUtility.randomNames(1).get(0)+"",
				randomEmail=javaUtility.randomStrings("@gmail.com", 1).get(0),
				randomMobile="javaUtility.randomNUmber(1).get(0)+";
		AccountPOM ap = new AccountPOM(driver);
		Actions act = new Actions(driver);
		act.moveToElement(ap.getSales()).perform();
		act.moveToElement(ap.getAccountLinktext()).click().perform();
		ap.getCreateAccount().click();
		ap.getAccountHolderName().sendKeys(randomName);
		ap.getOfficePhone().sendKeys(randomMobile);
		ap.getWebsite().sendKeys("www.shariqsp.com");
		ap.getFax().sendKeys("NA");
		ap.getAccountsHolderemailAddress().sendKeys(randomEmail);
		ap.getAccountHolderPromaryAddress().click();
		ap.getAccountsemailAddressOptOutFlag().click();
		ap.getAccountsemailAddressInvalidFlag().click();
		ap.getBillingAddressAstreet().sendKeys("abcd");
		ap.getBillingAddressCity().sendKeys("bengaluru");
		ap.getBillingAddressState().sendKeys("karnatak");
		ap.getBillingAddressPostalcode().sendKeys("560001");
		ap.getBillingAddressCountry().sendKeys("india");
		ap.getShippingCheckbox().click();
		ap.getDescription().sendKeys("nothing");
		selectFromDropDownByText(ap.getAccountType(), "Analyst");
		selectFromDropDownByText(ap.getIndustry(), "Banking");
		ap.getAnnual_revenue().sendKeys("1000000");
		ap.getEmployees().sendKeys("nothing");
		ap.getParentName().sendKeys("nothing");
		ap.getCampaignName().sendKeys("nothing");
		ap.getSaveButton().click();
		ap.getViewAccounts().click();

		List<WebElement> names = driver.findElements(By.xpath("//td[@field=\"name\"]"));
		boolean flag=false;
		for(WebElement i : names)
			if(i.getText().equals(randomName+"op")) {
				flag=true;
				break;
			}

		if(!flag) {
			org.testng.Assert.fail();
			
		}

	}
}
