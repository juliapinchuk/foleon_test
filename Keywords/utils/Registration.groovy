package utils

import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject

import com.kms.katalon.core.annotation.Keyword
import com.kms.katalon.core.checkpoint.Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling
import com.kms.katalon.core.testcase.TestCase
import com.kms.katalon.core.testdata.TestData
import com.kms.katalon.core.testobject.TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI

import internal.GlobalVariable

public class Registration {

	@Keyword
	def static void Register (String username, String password) {
		WebUI.navigateToUrl('https://editor.foleon.com/create-account')
		WebUI.setText(findTestObject('Foleon_registration/input_email'), username)
		WebUI.setText(findTestObject('Foleon_registration/input_password'), password)
		WebUI.click(findTestObject('Foleon_registration/button_create_account'))
		WebUI.waitForPageLoad(10)
		WebUI.waitForElementPresent(findTestObject('Page_Get started - Foleon/input_First name_firstName'), 10)
	}

	@Keyword
	def static void Login (String username, String password){
		WebUI.navigateToUrl('https://app.foleon.com/login')
		WebUI.setText(findTestObject('Foleon_login/input_email'), username)
		WebUI.setText(findTestObject('Foleon_login/input_password'), password)
		WebUI.click(findTestObject('Foleon_login/button_login'))
		WebUI.delay(1)
		WebUI.waitForPageLoad(10)
	}

	@Keyword
	def static String GenerateName(String prefix) {
		int randNumber = (int)(Math.random() * 100000);
		return prefix + randNumber;
	}

	@Keyword
	def static String GetMail(String name) {
		return name + "@mailinator.com";
	}

	@Keyword
	def static String GetPassword() {
		return "password123";
	}

	@Keyword
	def static void Verification (String username){
		WebUI.navigateToUrl('https://www.mailinator.com/')
		WebUI.waitForPageLoad(10)
		WebUI.setText(findTestObject('Object Repository/Mailinator/input_Mailinator_inboxfield'), username)
		WebUI.click(findTestObject('Object Repository/Mailinator/button_GO'))
		WebUI.waitForElementVisible(findTestObject('Object Repository/Mailinator/td_Foleon'), 10)
		WebUI.click(findTestObject('Object Repository/Mailinator/td_Foleon'))
		WebUI.waitForElementVisible(findTestObject('Object Repository/Mailinator/a_Verify my account'), 10)
		String url = WebUI.getAttribute(findTestObject('Object Repository/Mailinator/a_Verify my account'), 'href');
		WebUI.navigateToUrl(url, FailureHandling.STOP_ON_FAILURE)
		WebUI.waitForPageLoad(10)
	}
}

