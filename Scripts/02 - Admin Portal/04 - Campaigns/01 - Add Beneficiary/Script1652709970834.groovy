import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testng.keyword.TestNGBuiltinKeywords as TestNGKW
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys

WebUI.callTestCase(findTestCase('02 - Admin Portal/01 - Login/02 - Login MFA'), [:], FailureHandling.CONTINUE_ON_FAILURE)

WebUI.click(findTestObject('02 - Admin Portal/01 - Login/Go Link'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.waitForPageLoad(0)

WebUI.verifyElementPresent(findTestObject('02 - Admin Portal/07 - Campaigns/01 - cashbackEngineLink'), 15)

WebUI.click(findTestObject('02 - Admin Portal/07 - Campaigns/01 - cashbackEngineLink'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.waitForPageLoad(30)

WebUI.click(findTestObject('02 - Admin Portal/07 - Campaigns/02 - createCashbackCampaignButton'))

WebUI.waitForPageLoad(30)

WebUI.click(findTestObject('02 - Admin Portal/07 - Campaigns/03 - addBeneficiaryButton'))

WebUI.scrollToElement(findTestObject('02 - Admin Portal/07 - Campaigns/04 - dragAndDropFile'), 10)

WebUI.uploadFileWithDragAndDrop(findTestObject('02 - Admin Portal/07 - Campaigns/04 - dragAndDropFile'), 'C:\\Users\\isaac\\Downloads\\100.csv')

