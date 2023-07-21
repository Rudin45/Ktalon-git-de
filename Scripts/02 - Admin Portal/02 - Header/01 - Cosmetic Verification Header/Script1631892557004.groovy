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

WebUI.verifyElementPresent(findTestObject('02 - Admin Portal/02 - General/A - Client Transactions'), 15)

WebUI.verifyElementText(findTestObject('02 - Admin Portal/02 - General/A - Client Transactions'), 'Client Transactions')

WebUI.click(findTestObject('02 - Admin Portal/02 - General/A - Client Transactions'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.waitForPageLoad(30)

WebUI.verifyElementPresent(findTestObject('02 - Admin Portal/03 - Client Transactions/01 - Transaction Type'), 30)

WebUI.verifyElementVisible(findTestObject('02 - Admin Portal/03 - Client Transactions/01 - Transaction Type'))

WebUI.verifyElementText(findTestObject('02 - Admin Portal/03 - Client Transactions/01 - Transaction Type'), 'Transaction Type')

WebUI.verifyElementPresent(findTestObject('02 - Admin Portal/02 - General/B - Client Management'), 15)

WebUI.verifyElementText(findTestObject('02 - Admin Portal/02 - General/B - Client Management'), 'Client Management')

WebUI.click(findTestObject('02 - Admin Portal/02 - General/B - Client Management'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.waitForPageLoad(30)

WebUI.verifyElementPresent(findTestObject('02 - Admin Portal/04 - Client Management/01 - Name of Client'), 30)

WebUI.verifyElementVisible(findTestObject('02 - Admin Portal/04 - Client Management/01 - Name of Client'))

WebUI.verifyElementText(findTestObject('02 - Admin Portal/04 - Client Management/01 - Name of Client'), 'Name of Client')

WebUI.verifyElementPresent(findTestObject('02 - Admin Portal/02 - General/C - Fund Management'), 15)

WebUI.verifyElementText(findTestObject('02 - Admin Portal/02 - General/C - Fund Management'), 'Fund Management')

WebUI.click(findTestObject('02 - Admin Portal/02 - General/C - Fund Management'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.waitForPageLoad(30)

WebUI.verifyElementPresent(findTestObject('02 - Admin Portal/05 - Fund Management/01 - Transaction Type'), 30)

WebUI.verifyElementVisible(findTestObject('02 - Admin Portal/05 - Fund Management/01 - Transaction Type'))

WebUI.verifyElementText(findTestObject('02 - Admin Portal/05 - Fund Management/01 - Transaction Type'), 'Transaction Type')

WebUI.verifyElementPresent(findTestObject('02 - Admin Portal/02 - General/D - Reconciliation'), 15)

WebUI.verifyElementText(findTestObject('02 - Admin Portal/02 - General/D - Reconciliation'), 'Reconciliation')

WebUI.click(findTestObject('02 - Admin Portal/02 - General/D - Reconciliation'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.waitForPageLoad(30)

WebUI.switchToFrame(findTestObject('02 - Admin Portal/06 - Reconciliation/iFrame'), 30)

WebUI.verifyElementPresent(findTestObject('02 - Admin Portal/06 - Reconciliation/Sign In Button'), 30)

WebUI.verifyElementVisible(findTestObject('02 - Admin Portal/06 - Reconciliation/Sign In Button'))

WebUI.verifyElementText(findTestObject('02 - Admin Portal/06 - Reconciliation/Sign In Button'), 'Sign-In')

WebUI.switchToDefaultContent()

WebUI.closeBrowser()

