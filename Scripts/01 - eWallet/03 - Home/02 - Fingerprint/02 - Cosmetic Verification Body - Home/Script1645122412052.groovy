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

Mobile.verifyElementVisible(findTestObject('01 - eWallet/03 - Home/02 - Body/01 - ocultar'), 10)

Mobile.verifyElementText(findTestObject('01 - eWallet/03 - Home/02 - Body/01 - ocultar'), 'Ocultar')

Mobile.tap(findTestObject('01 - eWallet/03 - Home/02 - Body/01 - ocultar'), 10)

Mobile.verifyElementVisible(findTestObject('01 - eWallet/03 - Home/02 - Body/04 - mostrar'), 10)

Mobile.verifyElementText(findTestObject('01 - eWallet/03 - Home/02 - Body/04 - mostrar'), 'Mostrar')

Mobile.tap(findTestObject('01 - eWallet/03 - Home/02 - Body/04 - mostrar'), 10)

Mobile.scrollToText('Operaciones frecuentes', FailureHandling.CONTINUE_ON_FAILURE)

Mobile.verifyElementVisible(findTestObject('01 - eWallet/03 - Home/02 - Body/03 - laQuiero'), 10)

Mobile.scrollToText('Ver más', FailureHandling.CONTINUE_ON_FAILURE)

Mobile.verifyElementVisible(findTestObject('01 - eWallet/03 - Home/02 - Body/02 - verMas'), 10)

Mobile.verifyElementText(findTestObject('01 - eWallet/03 - Home/02 - Body/02 - verMas'), 'Ver más')

Mobile.tap(findTestObject('01 - eWallet/03 - Home/02 - Body/02 - verMas'), 10)

Mobile.delay(2, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.verifyElementVisible(findTestObject('01 - eWallet/03 - Home/02 - Body/05 - resumen'), 10)

Mobile.delay(5, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.callTestCase(findTestCase('01 - eWallet/0 - Common Steps/03 - Logout/Logout'), [:], FailureHandling.CONTINUE_ON_FAILURE)

