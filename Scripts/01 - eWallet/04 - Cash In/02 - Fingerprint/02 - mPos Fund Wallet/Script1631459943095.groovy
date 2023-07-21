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

WebUI.callTestCase(findTestCase('01 - eWallet/02 - Login/02 - Fingerprint/2 - Login Successfully - First Time - Fingerprint'), 
    [:], FailureHandling.CONTINUE_ON_FAILURE)

Mobile.tap(findTestObject('01 - eWallet/03 - Home/01 - Header/05 - recargar Button'), 10)

Mobile.tap(findTestObject('01 - eWallet/04 - CashIn/01 - Tarjeta de Credito o Debito'), 10)

Mobile.tap(findTestObject('01 - eWallet/04 - CashIn/08 - digit 5'), 10)

Mobile.tap(findTestObject('01 - eWallet/04 - CashIn/05 - digit 0'), 10)

Mobile.tap(findTestObject('01 - eWallet/04 - CashIn/05 - digit 0'), 10)

Mobile.delay(3, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.tap(findTestObject('01 - eWallet/04 - CashIn/09 - total Button'), 10)

Mobile.delay(3, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.tap(findTestObject('01 - eWallet/04 - CashIn/10 - confirmar Button'), 10)

Mobile.delay(20, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.tapAndHold(findTestObject('01 - eWallet/04 - CashIn/11 - firma'), 1, 10)

Mobile.delay(3, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.tap(findTestObject('01 - eWallet/04 - CashIn/12 - confirmar Button'), 10)

Mobile.delay(3, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.tap(findTestObject('01 - eWallet/04 - CashIn/13 - terminar Button'), 10)

Mobile.delay(3, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.callTestCase(findTestCase('01 - eWallet/0 - Common Steps/03 - Logout/Logout'), [:], FailureHandling.CONTINUE_ON_FAILURE)

