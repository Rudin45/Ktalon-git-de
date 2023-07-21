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

WebUI.callTestCase(findTestCase('01 - eWallet/02 - Login/01 - No Fingerprint/2 - Login Successfully - First Time'), [:], 
    FailureHandling.CONTINUE_ON_FAILURE)

Mobile.waitForElementPresent(findTestObject('01 - eWallet/03 - Home/01 - Header/066 - Nueva etiqueta Pagar Button'), 20)

Mobile.tap(findTestObject('01 - eWallet/03 - Home/01 - Header/066 - Nueva etiqueta Pagar Button'), 20)

Mobile.delay(2, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.waitForElementPresent(findTestObject('01 - eWallet/05 - CashOut/00 - Servicios/01 - recarga de saldo'), 20)

Mobile.tap(findTestObject('01 - eWallet/05 - CashOut/00 - Servicios/01 - recarga de saldo'), 20)

Mobile.delay(2, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.waitForElementPresent(findTestObject('01 - eWallet/05 - CashOut/01 - Topups/06 - atyt'), 10)

Mobile.tap(findTestObject('01 - eWallet/05 - CashOut/01 - Topups/06 - atyt'), 10)

Mobile.delay(3, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.tap(findTestObject('01 - eWallet/05 - CashOut/0 - Mobile Digits/5'), 2, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.tap(findTestObject('01 - eWallet/05 - CashOut/0 - Mobile Digits/5'), 2, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.delay(2, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.tap(findTestObject('01 - eWallet/05 - CashOut/0 - Mobile Digits/6'), 2, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.tap(findTestObject('01 - eWallet/05 - CashOut/0 - Mobile Digits/8'), 2, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.tap(findTestObject('01 - eWallet/05 - CashOut/0 - Mobile Digits/6'), 2, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.delay(2, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.tap(findTestObject('01 - eWallet/05 - CashOut/0 - Mobile Digits/9'), 2, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.tap(findTestObject('01 - eWallet/05 - CashOut/0 - Mobile Digits/0'), 2, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.delay(2, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.tap(findTestObject('01 - eWallet/05 - CashOut/0 - Mobile Digits/4'), 2, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.tap(findTestObject('01 - eWallet/05 - CashOut/0 - Mobile Digits/6'), 2, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.delay(2, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.tap(findTestObject('01 - eWallet/05 - CashOut/0 - Mobile Digits/0'), 2, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.tap(findTestObject('01 - eWallet/05 - CashOut/01 - Topups/18 - continuar Button'), 10)

Mobile.delay(3, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.tap(findTestObject('01 - eWallet/05 - CashOut/01 - Topups/19 - montoDropDown'), 10)

Mobile.tap(findTestObject('01 - eWallet/05 - CashOut/01 - Topups/20 - 500 amount'), 10)

Mobile.tap(findTestObject('01 - eWallet/05 - CashOut/01 - Topups/21 - continuar Button'), 10)

Mobile.delay(3, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.tap(findTestObject('01 - eWallet/05 - CashOut/01 - Topups/22 - continuar II'), 10)

Mobile.delay(3, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.callTestCase(findTestCase('01 - eWallet/0 - Common Steps/04 - Cashout/PIN'), [:], FailureHandling.CONTINUE_ON_FAILURE)

Mobile.tap(findTestObject('01 - eWallet/05 - CashOut/01 - Topups/24 - terminar Button'), 10)

Mobile.delay(3, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.callTestCase(findTestCase('01 - eWallet/0 - Common Steps/03 - Logout/Logout'), [:], FailureHandling.CONTINUE_ON_FAILURE)

