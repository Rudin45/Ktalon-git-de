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

WebUI.verifyElementText(findTestObject('02 - Admin Portal/02 - General/A - Client Transactions'), 'CLIENT TRANSACTIONS')

WebUI.click(findTestObject('02 - Admin Portal/02 - General/A - Client Transactions'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.waitForPageLoad(30)

WebUI.click(findTestObject('02 - Admin Portal/02 - General/Search/00 - FilterButton'))

WebUI.waitForPageLoad(30)

WebUI.click(findTestObject('02 - Admin Portal/02 - General/Search/01 - typeTrnx'))

WebUI.click(findTestObject('02 - Admin Portal/02 - General/Search/01 - 02 - Fund Wallet'))

WebUI.setText(findTestObject('02 - Admin Portal/02 - General/Search/03 - nameClient'), GlobalVariable.e2eSDname)

WebUI.waitForPageLoad(30)

WebUI.click(findTestObject('02 - Admin Portal/02 - General/Search/07 - Apply Filter'))

String typeValue = WebUI.getText(findTestObject('02 - Admin Portal/03 - Client Transactions/01 - Transaction Type Value'))

WebUI.verifyMatch(typeValue, 'Fund Wallet / Wallet Deposit', false, FailureHandling.CONTINUE_ON_FAILURE)

String payMethod = WebUI.getText(findTestObject('02 - Admin Portal/03 - Client Transactions/02 - Payment Type Value'))

WebUI.verifyMatch(payMethod, 'Cash', false, FailureHandling.CONTINUE_ON_FAILURE)

String name = WebUI.getText(findTestObject('02 - Admin Portal/03 - Client Transactions/03 - Name of Client Value'))

WebUI.verifyMatch(name, GlobalVariable.e2eSDname, false, FailureHandling.CONTINUE_ON_FAILURE)

String amountValue = WebUI.getText(findTestObject('02 - Admin Portal/03 - Client Transactions/07 - Amount Value'))

WebUI.verifyMatch(amountValue.substring(0, 3), GlobalVariable.e2eSDvalue, false, FailureHandling.CONTINUE_ON_FAILURE)

String statusValue = WebUI.getText(findTestObject('02 - Admin Portal/03 - Client Transactions/06 - Transaction Status Value'))

WebUI.verifyMatch(statusValue, 'Paid', false, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.closeBrowser()

