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
import mfa.*

WebUI.callTestCase(findTestCase('02 - Admin Portal/0 - Common Steps/01 - URL/Open Browser'), [:], FailureHandling.CONTINUE_ON_FAILURE)

WebUI.setText(findTestObject('02 - Admin Portal/01 - Login/username'), GlobalVariable.adminPortalUser)

WebUI.setText(findTestObject('02 - Admin Portal/01 - Login/password'), GlobalVariable.adminUserPassword)

WebUI.click(findTestObject('02 - Admin Portal/01 - Login/iniciarSesionButton'))

WebUI.setText(findTestObject('02 - Admin Portal/01 - Login/otc'), CustomKeywords.'mfa.readMFA.GetMFAToken'())

WebUI.click(findTestObject('02 - Admin Portal/01 - Login/continuarButton'))

WebUI.waitForPageLoad(30)

WebUI.verifyElementPresent(findTestObject('02 - Admin Portal/01 - Login/Go Link'), 30)

WebUI.verifyElementVisible(findTestObject('02 - Admin Portal/01 - Login/Go Link'))

