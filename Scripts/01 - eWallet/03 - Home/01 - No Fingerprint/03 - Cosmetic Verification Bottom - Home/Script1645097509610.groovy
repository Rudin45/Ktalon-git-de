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

WebUI.callTestCase(findTestCase('01 - eWallet/02 - Login/01 - No Fingerprint/2 - Login Successfully - First Time'), [:], FailureHandling.CONTINUE_ON_FAILURE)

Mobile.verifyElementVisible(findTestObject('01 - eWallet/03 - Home/03 - Bottom Menu/1 - inicio'), 10)

Mobile.verifyElementText(findTestObject('01 - eWallet/03 - Home/03 - Bottom Menu/1 - inicio'), 'Inicio')

Mobile.verifyElementVisible(findTestObject('01 - eWallet/03 - Home/03 - Bottom Menu/2 - pagar'), 10)

Mobile.verifyElementText(findTestObject('01 - eWallet/03 - Home/03 - Bottom Menu/2 - pagar'), 'Pagar')

Mobile.verifyElementVisible(findTestObject('01 - eWallet/03 - Home/03 - Bottom Menu/3 - cobrar'), 10)

Mobile.verifyElementText(findTestObject('01 - eWallet/03 - Home/03 - Bottom Menu/3 - cobrar'), 'Cobrar')

Mobile.verifyElementVisible(findTestObject('01 - eWallet/03 - Home/03 - Bottom Menu/4 - resumen'), 10)

Mobile.verifyElementText(findTestObject('01 - eWallet/03 - Home/03 - Bottom Menu/4 - resumen'), 'Resumen')

Mobile.verifyElementVisible(findTestObject('01 - eWallet/03 - Home/03 - Bottom Menu/5 - perfil'), 10)

Mobile.verifyElementText(findTestObject('01 - eWallet/03 - Home/03 - Bottom Menu/5 - perfil'), 'Perfil')

WebUI.callTestCase(findTestCase('01 - eWallet/0 - Common Steps/03 - Logout/Logout'), [:], FailureHandling.CONTINUE_ON_FAILURE)

