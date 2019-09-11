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

WebUI.navigateToUrl('https://editor.foleon.com/get-started')

WebUI.setText(findTestObject('Page_Login  Foleon/input_Email address_sc-ifAKCX kYzkVD'), 'juliapinchuk@mailinator.com')

WebUI.setText(findTestObject('Page_Login  Foleon/input_Password_sc-ifAKCX kYzkVD'), 'password123')

WebUI.click(findTestObject('Page_Login  Foleon/button_Log in'))

WebUI.click(findTestObject('Page_Get started - Foleon/img'))

WebUI.click(findTestObject('Page_Get started - Foleon/button_Get started'))

WebUI.click(findTestObject('Page_Get started - Foleon/div_Closing pages_item'))

WebUI.click(findTestObject('Page_Get started - Foleon/button_Create Page'))

WebUI.click(findTestObject('Page_Cover - Start from scratch/div_view_dayBlocks'))

WebUI.click(findTestObject('Page_Cover - Start from scratch/li_covers'))

WebUI.waitForElementPresent(findTestObject('Object Repository/Page_Cover - Start from scratch/div_cover_portrait'), 10)

WebUI.dragAndDropToObject(findTestObject('Object Repository/Page_Cover - Start from scratch/div_cover_portrait'), findTestObject(
		'Object Repository/Page_Cover - Start from scratch/div_dragndrop_area'))

CustomKeywords.'dnd.DragAndDropHelper.dragAndDrop'(findTestObject('Object Repository/Page_Cover - Start from scratch/div_Cover portrait'),
	findTestObject('Object Repository/Page_Cover - Start from scratch/div_Drag  DropDrag and drop content here to startSTART'))

WebUI.click(findTestObject('Object Repository/Page_Cover - Start from scratch/button_PREVIEW'))

//WebUI.closeBrowser()



