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

Mobile.waitForElementPresent(findTestObject('01 - eWallet/03 - Home/01 - Header/066 - Nueva etiqueta Pagar Button'), 20)

Mobile.tap(findTestObject('01 - eWallet/03 - Home/01 - Header/066 - Nueva etiqueta Pagar Button'), 20)

Mobile.delay(2, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.waitForElementPresent(findTestObject('01 - eWallet/05 - CashOut/03 - B2B/03 - Grupo Modelo Section'), 20)

Mobile.tap(findTestObject('01 - eWallet/05 - CashOut/03 - B2B/03 - Grupo Modelo Section'), 20)

Mobile.delay(2, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.waitForElementPresent(findTestObject('01 - eWallet/05 - CashOut/03 - B2B/522 - POC Selected'), 10)

Mobile.tap(findTestObject('01 - eWallet/05 - CashOut/03 - B2B/522 - POC Selected'), 10)

Mobile.delay(3, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.waitForElementPresent(findTestObject('01 - eWallet/05 - CashOut/03 - B2B/99 - Numero de pedido'), 10)

Mobile.tap(findTestObject('01 - eWallet/05 - CashOut/03 - B2B/99 - Numero de pedido'), 10)

Mobile.delay(3, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.waitForElementPresent(findTestObject('01 - eWallet/05 - CashOut/03 - B2B/08 - Continuar Button'), 10)

Mobile.tap(findTestObject('01 - eWallet/05 - CashOut/03 - B2B/08 - Continuar Button'), 10)

Mobile.delay(3, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.waitForElementPresent(findTestObject('01 - eWallet/05 - CashOut/03 - B2B/09 - Continuar Button'), 10)

Mobile.tap(findTestObject('01 - eWallet/05 - CashOut/03 - B2B/09 - Continuar Button'), 10)

Mobile.delay(3, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.waitForElementPresent(findTestObject('01 - eWallet/05 - CashOut/03 - B2B/10 - Confirmar Button'), 10)

Mobile.tap(findTestObject('01 - eWallet/05 - CashOut/03 - B2B/10 - Confirmar Button'), 10)

Mobile.delay(3, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.callTestCase(findTestCase('01 - eWallet/0 - Common Steps/04 - Cashout/PIN'), [:], FailureHandling.CONTINUE_ON_FAILURE)

Mobile.waitForElementPresent(findTestObject('01 - eWallet/05 - CashOut/03 - B2B/11 - Terminar Button'), 10)

Mobile.tap(findTestObject('01 - eWallet/05 - CashOut/03 - B2B/11 - Terminar Button'), 10)

Mobile.delay(3, FailureHandling.CONTINUE_ON_FAILURE)

