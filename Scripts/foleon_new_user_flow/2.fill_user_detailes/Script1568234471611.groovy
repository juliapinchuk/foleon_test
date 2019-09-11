import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys

WebUI.openBrowser('')

String name = CustomKeywords.'utils.Registration.GenerateName'('Julia')
String email = CustomKeywords.'utils.Registration.GetMail'(name)
String password = CustomKeywords.'utils.Registration.GetPassword'()
CustomKeywords.'utils.Registration.Register'(email, password)

WebUI.navigateToUrl('https://editor.foleon.com/get-started')
WebUI.waitForPageLoad(10)

WebUI.setText(findTestObject('Page_Get started - Foleon/input_First name_firstName'), 'Julia')


WebUI.setText(findTestObject('Page_Get started - Foleon/input_Last name_lastName'), 'Pinchuk')

WebUI.setText(findTestObject('Page_Get started - Foleon/input_Company name_companyName'), 'JP')

WebUI.setText(findTestObject('Page_Get started - Foleon/input_Business phone number_phoneNumber'), '333222111')

WebUI.click(findTestObject('Page_Get started - Foleon/span_Other'))

WebUI.click(findTestObject('Page_Get started - Foleon/span_I dont currently present content'))

WebUI.click(findTestObject('Page_Get started - Foleon/div_tabindex0'))
WebUI.waitForElementPresent(findTestObject('Page_Get started - Foleon/span_student'), 10)
WebUI.click(findTestObject('Page_Get started - Foleon/span_student'))

WebUI.click(findTestObject('Page_Get started - Foleon/button_Continue'))

WebUI.closeBrowser()

